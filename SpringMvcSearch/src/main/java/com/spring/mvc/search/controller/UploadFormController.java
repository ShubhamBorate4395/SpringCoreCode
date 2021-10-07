package com.spring.mvc.search.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class UploadFormController {
	@RequestMapping("/fileupload")
	public String showUpload() {

		return "fileUpload";

	}

	@RequestMapping(value = "/uploadimage", method = RequestMethod.POST)
	public String fileUpload(@RequestParam("profile") CommonsMultipartFile file, HttpSession session,Model model) {

		System.out.println("File Upload handler!!");
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getSize());
		System.out.println(file.getStorageDescription());
		System.out.println(file.getContentType());

		/* for taking uploaded data */
		byte[] data = file.getBytes();

		/* we have to save the data to the server local eclipse path where this uploded*/
		
		String path = session.getServletContext().getRealPath("/") + File.separator + "WEB-INF" + File.separator
				+ "resources" + File.separator + "image" + File.separator + file.getOriginalFilename();

		System.out.println(path);

		/*file writing*/
		try {
			FileOutputStream fos = new FileOutputStream(path);
			fos.write(data);
			fos.close();
			System.out.println("Files Uploaded!!");
			
			model.addAttribute("msg", "files uploaded successfully!!");
			model.addAttribute("filename", file.getOriginalFilename());
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("Files Uploading Error!!");
			model.addAttribute("msg", "files uploading problem,checks it out!!");
		}

		return "filesuccess";

	}
}
