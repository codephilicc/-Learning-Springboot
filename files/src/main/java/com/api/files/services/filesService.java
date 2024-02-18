package com.api.files.services;

import java.io.File;

<<<<<<< HEAD
import org.springframework.stereotype.Service;
=======

import com.api.files.entities.files;
>>>>>>> 76478aa07d3da6ea7e7ed406a4d705765e31fc90

@Service
public class filesService {
	
	public static void main(String[] args) {
		
		String path = ":/file";

		File fObject = new File(path);

		if (fObject.exists() && fObject.isDirectory()) {
			File a[] = fObject.listFiles();
			for (File f : a) {
				System.out.println(f);
			}

		}

	}

}
