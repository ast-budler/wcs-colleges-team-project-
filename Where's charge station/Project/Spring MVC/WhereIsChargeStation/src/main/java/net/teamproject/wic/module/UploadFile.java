package net.teamproject.wic.module;

import java.io.File;

import org.springframework.web.multipart.MultipartFile;

public class UploadFile {
	public static boolean uploadFile(MultipartFile file) {
		final String path = "C://upload/";
		String fileName = GetIdByTime.getIdByTime();
		
		try {
			file.transferTo(new File(path + fileName));
			return true;
		}catch (Exception e) {
			System.out.println("예외 발생");
			return false;
		}
	}
}