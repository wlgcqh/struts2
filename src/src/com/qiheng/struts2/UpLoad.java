package com.qiheng.struts2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class UpLoad extends ActionSupport {

	private String username;

	private List<File> file;

	private List<String> fileFileName;

	private List<String> fileContentType;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	

	public List<File> getFile() {
		return file;
	}

	public void setFile(List<File> file) {
		this.file = file;
	}

	public List<String> getFileFileName() {
		return fileFileName;
	}

	public void setFileFileName(List<String> fileFileName) {
		this.fileFileName = fileFileName;
	}

	public List<String> getFileContentType() {
		return fileContentType;
	}

	public void setFileContentType(List<String> fileContentType) {
		this.fileContentType = fileContentType;
	}

	@Override
	public String execute() throws Exception {
		
		System.out.println(file.size());
		for(int i=0;i<file.size();i++){

		InputStream in = new FileInputStream(file.get(i));
		
		String path = ServletActionContext.getRequest().getRealPath("/upload");
		
		File destFile = new File(path,fileFileName.get(i));
		
		OutputStream out = new FileOutputStream(destFile);
		
		byte[] buffer = new byte[1024];
		
		int length = 0;
		
		while((length=in.read(buffer))!=-1){
			
			out.write(buffer, 0, length);
		}
		
		in.close();
		out.close();
		
		}
		return SUCCESS;
	}

}
