package com.jsoft.ems.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="education_details")
public class EducationBean extends BaseBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5125420749873935506L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "EDU_ID", nullable=false)
	private Integer educationId;
	@Column(name="COURSE_TYPE")
	private String courseType;
	@Column(name="COURSE_TITTLE")
	private String courseTitle;
	@Column(name="SUBJECT")
	private String subject;
	@Column(name="INSTITUTE")
	private String institute;

	@Column(name="EMP_ID")
	private Long emp_id;
	@Column(name="PERCENTAGE")
	private Double percentage;
	@Column(name="FROM_DATE")
	private Date fromDate;
	@Column(name="TO_DATE")
	private Date toDate;
	
	public Integer getEducationId() {
		return educationId;
	}
	public void setEducationId(Integer educationId) {
		this.educationId = educationId;
	}
	public String getCourseType() {
		return courseType;
	}
	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}
	public String getCourseTitle() {
		return courseTitle;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getInstitute() {
		return institute;
	}
	public void setInstitute(String institute) {
		this.institute = institute;
	}
	public Long getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(Long emp_id) {
		this.emp_id = emp_id;
	}
	public Double getPercentage() {
		return percentage;
	}
	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	} 
	
}
