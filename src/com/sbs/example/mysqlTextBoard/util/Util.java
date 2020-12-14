package com.sbs.example.mysqlTextBoard.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Util {

	public static void mkdirs(String path) {
		File dir = new File(path);

		if (dir.exists() == false) {
			dir.mkdirs();
		}
	}

	public static void fileWriter(String filePath, String body) {
		File file = new File(filePath);

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			bw.write(body);
			bw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void rmdir(File dirToBeDel) {
		File[] allContents = dirToBeDel.listFiles();
		if (allContents != null) {
			for (File file : allContents) {
				if (file.isDirectory()) {
					rmdir(file);
				} else {
					file.delete();
				}
			}
		}
		dirToBeDel.delete();
	}

	public static String getFileContent(String filePath) {
		String rs = null;
		try {
			// 바이트 단위로 파일읽기
			FileInputStream fileStream = null; // 파일 스트림

			fileStream = new FileInputStream(filePath);// 파일 스트림 생성
			// 버퍼 선언
			byte[] readBuffer = new byte[fileStream.available()];
			while (fileStream.read(readBuffer) != -1) {
			}

			rs = new String(readBuffer);

			fileStream.close(); // 스트림 닫기
		} catch (Exception e) {
			e.getStackTrace();
		}

		return rs;
	}

	public static void copy(File oriFile, File copyFile) {
		try {

			FileInputStream fis = new FileInputStream(oriFile); // 읽을파일
			FileOutputStream fos = new FileOutputStream(copyFile); // 복사할파일

			int fileByte = 0;
			// fis.read()가 -1 이면 파일을 다 읽은것
			while ((fileByte = fis.read()) != -1) {
				fos.write(fileByte);
			}
			// 자원사용종료
			fis.close();
			fos.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
