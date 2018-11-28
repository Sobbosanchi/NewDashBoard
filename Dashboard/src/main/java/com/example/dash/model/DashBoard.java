package com.example.dash.model;

import org.springframework.data.annotation.Id;

public class DashBoard {

	@Id
	private Long customerId;
	
	private String custName;
	private String lob;
	private String valueStream;
	private int esaId;
	private String esaName;
	private String projectName;
	
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getLob() {
		return lob;
	}
	public void setLob(String lob) {
		this.lob = lob;
	}
	public String getValueStream() {
		return valueStream;
	}
	public void setValueStream(String valueStream) {
		this.valueStream = valueStream;
	}
	public int getEsaId() {
		return esaId;
	}
	public void setEsaId(int esaId) {
		this.esaId = esaId;
	}
	public String getEsaName() {
		return esaName;
	}
	public void setEsaName(String esaName) {
		this.esaName = esaName;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	
}
