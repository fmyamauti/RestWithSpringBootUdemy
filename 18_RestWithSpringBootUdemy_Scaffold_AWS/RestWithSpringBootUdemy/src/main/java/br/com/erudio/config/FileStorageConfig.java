package br.com.erudio.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "file")
public class FileStorageConfig {

	private String uploadDir;

	public synchronized String getUploadDir() {
		return uploadDir;
	}

	public synchronized void setUploadDir(String uploadDir) {
		this.uploadDir = uploadDir;
	}
	
	
}
