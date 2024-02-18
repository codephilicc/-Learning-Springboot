package com.learn.rest.fileprocessing.controllers;

import java.awt.PageAttributes.MediaType;
import java.io.File;
import java.io.IOException;
import java.net.http.HttpHeaders;
import java.nio.file.Files;
import java.security.PublicKey;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileController {

	@Value("${uploadDir}")
	private String UPLOAD_DIR;

	@PostMapping("/upload")
	public boolean upload(@RequestParam("file") MultipartFile file) throws IllegalStateException, IOException {
		file.transferTo(new File(UPLOAD_DIR + file.getOriginalFilename()));
		return true;
	}

	@GetMapping("/download/{fileName}")
	public ResponseEntity<byte[]> download(@PathVariable("fileName")  String fileName) throws IOException{
		byte[] fileData = Files.readAllBytes(new File(UPLOAD_DIR+fileName).toPath());
		
		org.springframework.http.HttpHeaders headers = new org.springframework.http.HttpHeaders();
		headers.setContentType(org.springframework.http.MediaType.IMAGE_JPEG);
		
		
		return new ResponseEntity<byte[]>(fileData,headers,HttpStatus.OK); 
		
		
	}
	

}
