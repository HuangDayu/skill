package com.skill.aligenie.response;

public class AliGenieResponseExtensions {

	private String extension1;
	private String extension2;

	public void setExtension1(String extension1) {
		this.extension1 = extension1;
	}

	public String getExtension1() {
		return extension1;
	}

	public void setExtension2(String extension2) {
		this.extension2 = extension2;
	}

	public String getExtension2() {
		return extension2;
	}

	private String parentId;// 主设备硬件id（场景控A1的ID）

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

}