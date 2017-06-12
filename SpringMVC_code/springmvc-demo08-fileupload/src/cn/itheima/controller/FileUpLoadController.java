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
	 * MultipartFile:是用于接收文件的一个接口
	 * 
	 * @param file
	 * @return
	 */
	@RequestMapping(value = "upload", method = RequestMethod.POST)
	public String upload(MultipartFile file) {
		// 如果有上传的文件名,说明配置成功
		System.out.println("文件名:" + file.getOriginalFilename());
		File destFile = new File("D:/dir/" + file.getOriginalFilename());
		try {
			// 将文件写入指定的文件路径
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
	 * MultipartFile:是用于接收文件的一个接口
	 * 
	 * @param file
	 * @return
	 */
	@RequestMapping(value = "mul-upload", method = RequestMethod.POST)
	public String mulupload(MultipartFile[] files) {
		// 如果有上传的文件名,说明配置成功
		for (MultipartFile file : files) {
			System.out.println("文件名:" + file.getOriginalFilename());
			//如文件名不为空,将文件保存到本地
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
