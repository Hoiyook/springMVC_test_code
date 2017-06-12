package cn.itheima.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

@Controller

public class FileUpLoadController {
	/**
	 * MultipartFile:�����ڽ����ļ���һ���ӿ�
	 * 
	 * @param file
	 * @return
	 */
	@RequestMapping(value = "upload", method = RequestMethod.POST)
	public String upload(MultipartFile file) {
		// ������ϴ����ļ���,˵�����óɹ�
		System.out.println("�ļ���:" + file.getOriginalFilename());
		File destFile = new File("D:/dir/" + file.getOriginalFilename());
		try {
			// ���ļ�д��ָ�����ļ�·��
			file.transferTo(destFile);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "/fileupload.jsp";
	}

	/**
	 * MultipartFile:�����ڽ����ļ���һ���ӿ�
	 * 
	 * @param file
	 * @return
	 */
	@RequestMapping(value = "mul-upload", method = RequestMethod.POST)
	public String mulupload(MultipartFile[] files) {
		// ������ϴ����ļ���,˵�����óɹ�
		for (MultipartFile file : files) {
			System.out.println("�ļ���:" + file.getOriginalFilename());
			//���ļ�����Ϊ��,���ļ����浽����
			if (!"".equals(file.getOriginalFilename())) {
				File descFile=new File("D:/dir/"+file.getOriginalFilename());
				try {
					file.transferTo(descFile);
				} catch (IllegalStateException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return "/fileupload.jsp";
	}
}
