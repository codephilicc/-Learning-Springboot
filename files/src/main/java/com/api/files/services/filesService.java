package com.api.files.services;

import java.util.ArrayList;
import java.util.List;

import com.api.files.entities.files;

public class filesService {

	private static List<files> list = new ArrayList<files>();

	static {
		list.add(new files(1, "story files"));
		list.add(new files(2, "prisoner files"));
		list.add(new files(3, "Dc files"));

	}

}
