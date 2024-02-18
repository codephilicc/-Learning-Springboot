package com.api.filesPick.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class filesController {

	private static final String FILES_DIRECTORY = "./src\\main\\resources\\files";

	@GetMapping("/files")
	public ResponseEntity<List<String>> getFiles() {
		List<String> fileNames;
		try {
			fileNames = getFileNamesInDirectory();
			return new ResponseEntity<List<String>>(fileNames, HttpStatus.OK);

		} catch (IOException e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@GetMapping("/file/{filename}")
	public ResponseEntity<String> getFileContent(@PathVariable String filename) {

		try {
			String fileContent = readFileContent(filename);
			return new ResponseEntity<>(fileContent, HttpStatus.OK);
		} catch (IOException e) {
			if (e.getClass().getSimpleName().equals("NoSuchFileException")) {
				return new ResponseEntity<>("File not found", HttpStatus.NOT_FOUND);
			} else {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

	}

	private List<String> getFileNamesInDirectory() throws IOException {
		return Files.list(Paths.get(FILES_DIRECTORY)).filter(Files::isRegularFile).map(Path::getFileName)
				.map(Path::toString).toList();
	}

	private String readFileContent(String filename) throws IOException {
		Path filePath = Paths.get(FILES_DIRECTORY, filename);
		byte[] fileBytes = Files.readAllBytes(filePath);
		return new String(fileBytes);
	}

}
