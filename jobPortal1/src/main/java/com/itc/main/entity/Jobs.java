package com.itc.main.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="jobDetails")
public class Jobs {
	@Id
	int jobId;
	String jobName;
	String descrip;
	long salary;
	String location;
	String url;
	public Jobs() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Jobs(int jobId, String jobName, String desc, long salary, String location) {
		super();
		this.jobId = jobId;
		this.jobName = jobName;
		this.descrip = descrip;
		this.salary = salary;
		this.location = location;
		this.url=url;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public String getDescrip() {
		return descrip;
	}
	public void setDescrip(String descrip) {
		descrip = descrip;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	

}
