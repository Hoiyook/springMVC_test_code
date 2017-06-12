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
	
	//1.读取文件列表,返回给页面
	@RequestMapping(value="filelist")
	public String getFileList(HttpServletRequest request){
		//1.读取文件列表
		File dir=new File("D:/dir");
		if(dir.isDirectory()){
			//获得dir目录下的所以文件名
			String[] list = dir.list();
			request.setAttribute("filenames", list);
		}
		
		return "filelist.jsp";
	}
	
	/**
	 * 根据文件名下载指定的文件
	 * @param filename
	 */
	@RequestMapping(value="download")
	public void download(String filename,HttpServletResponse response){
		try {
		//将filename解码
		String decodeFileName = URLDecoder.decode(filename, "UTF-8");
		
		System.out.println(decodeFileName+"--");
		
		//必须设置输出流的输出格式,以附件输出
		//注意,中文字符要打散为ISO-8859-1,浏览器才可以解释
		response.addHeader("content-Disposition", "attachment;filename="+new String(decodeFileName.getBytes(),"ISO-8859-1"));
		
		//1.通过文件名读取文件
		File file=new File("D:/dir/"+decodeFileName);
		//2.将文件转成流字节数组
		byte[] array = FileUtils.readFileToByteArray(file);
			//3.将字节数组写入响应的输出流
			response.getOutputStream().write(array);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
	}

}
