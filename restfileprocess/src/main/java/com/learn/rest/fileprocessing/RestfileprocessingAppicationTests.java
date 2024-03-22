package com.learn.rest.fileprocessing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

public class RestfileprocessingAppicationTests {

	private static final String FILE_UPLOAD_URL = "http://localhost:8080/upload";
	@Autowired
	RestTemplate restTemplate;
	
	void testUpload() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.MULTIPART_FORM_DATA);

		MultiValueMap<String, Object> body = new LinkedMultiValueMap<>();
		body.add("file", new ClassPathResource("Sukuna-1-1.jpg"));
		
		
		HttpEntity<MultiValueMap<String, Object>> httpEntity = new HttpEntity<>(body,headers);
		
		ResponseEntity<Boolean> response = restTemplate.postForEntity(FILE_UPLOAD_URL, httpEntity, Boolean.class);
		
		System.out.println(response);
		
	}

}
