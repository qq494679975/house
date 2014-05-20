package com.softxm.hs.model;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

import org.apache.struts2.StrutsStatics;

import com.opensymphony.xwork2.ActionContext;
import com.softxm.hs.Utils.PrimaryKey;


public class FileUpModel {
	private List<File> attach = new ArrayList<File>(3);
	private List<String> attachFileName = new ArrayList<String>(3);
	private List<String> attachContentType = new ArrayList<String>(3);
	private List<String> attachNewName;

	
	
	public static void deleteAttach(String attachurl) {
		ServletContext servletContext = (ServletContext) ActionContext
				.getContext().get(StrutsStatics.SERVLET_CONTEXT);
		String filedir = servletContext.getRealPath("/file");
		String fullpath =filedir+"/"+attachurl;
		File file = new File(fullpath);
		if(file.isFile()){
			file.delete();
		}
	}

	public void uploadFile() {
		if (attach != null) {
			attachNewName = new ArrayList<String>(attach.size());
			ServletContext servletContext = (ServletContext) ActionContext
					.getContext().get(StrutsStatics.SERVLET_CONTEXT);
			String filedir = servletContext.getRealPath("/file");
			for (int i = 0; i < attach.size(); i++) {
				File file = attach.get(i);
				String oldfilename = attachFileName.get(i);
				String extendname = oldfilename.substring(oldfilename
						.lastIndexOf("."));
				String newfilename = PrimaryKey.getKey() + extendname;
				attachNewName.add(newfilename);
				String filefullpath = filedir + "/" + newfilename;
				InputStream input = null;
				OutputStream output = null;
				int size = 1024 * 10;
				byte[] b = new byte[size];
				int len = -1;
				try {
					input = new BufferedInputStream(new FileInputStream(file));
					output = new BufferedOutputStream(new FileOutputStream(
							filefullpath));
					while ((len = input.read(b)) != -1) {
						output.write(b, 0, len);
						output.flush();
					}
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					if (output != null) {
						try {
							output.close();
						} catch (IOException e) {

						}
					}
					if (input != null) {
						try {
							input.close();
						} catch (IOException e) {

						}
					}
				}
			}
		}
	}

	public List<File> getAttach() {
		return attach;
	}

	public void setAttach(List<File> attach) {
		this.attach = attach;
	}

	public List<String> getAttachFileName() {
		return attachFileName;
	}

	public void setAttachFileName(List<String> attachFileName) {
		this.attachFileName = attachFileName;
	}

	public List<String> getAttachContentType() {
		return attachContentType;
	}

	public void setAttachContentType(List<String> attachContentType) {
		this.attachContentType = attachContentType;
	}

	public List<String> getAttachNewFileName() {
		return attachNewName;
	}
}
