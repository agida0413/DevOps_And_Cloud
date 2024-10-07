package com.sist.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import com.sist.service.ImageUploadService;

@Controller

public class S3Controller {
	
	

	private final ImageUploadService s3imImageUploadService;
	
	public S3Controller(ImageUploadService s3ImageUploadService) {
		// TODO Auto-generated constructor stub

		this.s3imImageUploadService=s3ImageUploadService;
	}
	@PostMapping("/s3/upload")
	public ResponseEntity<?> s3Upload(@RequestPart(value = "image", required = false) MultipartFile image){
	  String profileImage = s3imImageUploadService.upload(image);
	  return ResponseEntity.ok(profileImage);
	}
}
