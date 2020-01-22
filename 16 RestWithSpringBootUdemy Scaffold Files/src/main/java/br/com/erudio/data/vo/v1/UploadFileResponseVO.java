package br.com.erudio.data.vo.v1;

import java.io.Serializable;
import java.util.Date;

import org.springframework.hateoas.RepresentationModel;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.github.dozermapper.core.Mapping;

 
public class UploadFileResponseVO implements Serializable {
 
	private static final long serialVersionUID = 1L; 
	  
	private String fileName;	 
	private String fileDownloadUri;
	private String fileType;
	private long size;
	
	public UploadFileResponseVO() {
		
	}
	
	public UploadFileResponseVO(String fileName, String fileDownloadUri, String fileType, long size) {
		this.fileName = fileName;
		this.fileDownloadUri = fileDownloadUri;
		this.fileType = fileType;
		this.size = size;
	}

	public synchronized String getFileName() {
		return fileName;
	}
	public synchronized void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public synchronized String getFileDownloadUri() {
		return fileDownloadUri;
	}
	public synchronized void setFileDownloadUri(String fileDownloadUri) {
		this.fileDownloadUri = fileDownloadUri;
	}
	public synchronized String getFileType() {
		return fileType;
	}
	public synchronized void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public synchronized long getSize() {
		return size;
	}
	public synchronized void setSize(long size) {
		this.size = size;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fileDownloadUri == null) ? 0 : fileDownloadUri.hashCode());
		result = prime * result + ((fileName == null) ? 0 : fileName.hashCode());
		result = prime * result + ((fileType == null) ? 0 : fileType.hashCode());
		result = prime * result + (int) (size ^ (size >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UploadFileResponseVO other = (UploadFileResponseVO) obj;
		if (fileDownloadUri == null) {
			if (other.fileDownloadUri != null)
				return false;
		} else if (!fileDownloadUri.equals(other.fileDownloadUri))
			return false;
		if (fileName == null) {
			if (other.fileName != null)
				return false;
		} else if (!fileName.equals(other.fileName))
			return false;
		if (fileType == null) {
			if (other.fileType != null)
				return false;
		} else if (!fileType.equals(other.fileType))
			return false;
		if (size != other.size)
			return false;
		return true;
	}
	 
	 	
}
