package com.jsoft.ems.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 * @author Nasruddin khan 
 *
1:28:37 AM
 */
@Entity
@Table(name = "WORK_REMARK")
public class WorkRemark extends BaseBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "WORK_ID", nullable = false)
	private Integer workId;
	@Column(name = "WORK_DATE")
	private String workDate;
	@Column(name = "SPEND_HOURS")
	private double spendHours;
	@Column(name = "WORK_DESCRIPTION")
	private String WorkDescription;
	@Column(name = "EMP_ID")
    private Long empID;
    @ManyToOne(optional = false)
	@JoinColumn (name = "COURSE_ID")
	private CourseMaster courseMaster;
	/**
	 * @return the workId
	 */
	public Integer getWorkId() {
		return workId;
	}

	/**
	 * @param workId
	 *            the workId to set
	 */
	public void setWorkId(Integer workId) {
		this.workId = workId;
	}

	/**
	 * @return the workDate
	 */
	public String getWorkDate() {
		return workDate;
	}

	/**
	 * @param workDate
	 *            the workDate to set
	 */
	public void setWorkDate(String workDate) {
		this.workDate = workDate;
	}

	/**
	 * @return the spendHours
	 */
	public double getSpendHours() {
		return spendHours;
	}

	/**
	 * @param spendHours the spendHours to set
	 */
	public void setSpendHours(double spendHours) {
		this.spendHours = spendHours;
	}
	/**
	 * @return the workDescription
	 */
	public String getWorkDescription() {
		return WorkDescription;
	}

	/**
	 * @param workDescription the workDescription to set
	 */
	public void setWorkDescription(String workDescription) {
		WorkDescription = workDescription;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */

	/**
	 * @return the empID
	 */
	public Long getEmpID() {
		return empID;
	}
	/**
	 * @param empID the empID to set
	 */
	public void setEmpID(Long empID) {
		this.empID = empID;
	}
	/**
	 * @return the courseMaster
	 */
	public CourseMaster getCourseMaster() {
		return courseMaster;
	}
	/**
	 * @param courseMaster the courseMaster to set
	 */
	public void setCourseMaster(CourseMaster courseMaster) {
		this.courseMaster = courseMaster;
	}
}
