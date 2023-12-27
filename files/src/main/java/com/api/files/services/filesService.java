package com.api.files.services;

import java.io.File;

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
