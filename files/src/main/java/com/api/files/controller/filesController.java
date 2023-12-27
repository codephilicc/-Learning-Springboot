package com.api.files.controller;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.api.files.services.filesService;

@RestController
public class filesController {

	@Autowired
	private filesService filesService;
	
//	public List<File> getFile(){
//		
//	}
	
}
