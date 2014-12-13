package com.qiheng.download;

import java.io.InputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class FileDownload extends ActionSupport {

	public InputStream getDownloadFile() {
		return ServletActionContext.getServletContext().getResourceAsStream(
				"jquery-2.1.1.js");
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return SUCCESS;
	}

}
