package cn.itheima.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.net.URLDecoder;

@Controller
public class FileDownloadController {
	
	//1.��ȡ�ļ��б�,���ظ�ҳ��
	@RequestMapping(value="filelist")
	public String getFileList(HttpServletRequest request){
		//1.��ȡ�ļ��б�
		File dir=new File("D:/dir");
		if(dir.isDirectory()){
			//���dirĿ¼�µ������ļ���
			String[] list = dir.list();
			request.setAttribute("filenames", list);
		}
		
		return "filelist.jsp";
	}
	
	/**
	 * �����ļ�������ָ�����ļ�
	 * @param filename
	 */
	@RequestMapping(value="download")
	public void download(String filename,HttpServletResponse response){
		try {
		//��filename����
		String decodeFileName = URLDecoder.decode(filename, "UTF-8");
		
		System.out.println(decodeFileName+"--");
		
		//��������������������ʽ,�Ը������
		//ע��,�����ַ�Ҫ��ɢΪISO-8859-1,������ſ��Խ���
		response.addHeader("content-Disposition", "attachment;filename="+new String(decodeFileName.getBytes(),"ISO-8859-1"));
		
		//1.ͨ���ļ�����ȡ�ļ�
		File file=new File("D:/dir/"+decodeFileName);
		//2.���ļ�ת�����ֽ�����
		byte[] array = FileUtils.readFileToByteArray(file);
			//3.���ֽ�����д����Ӧ�������
			response.getOutputStream().write(array);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
	}

}
