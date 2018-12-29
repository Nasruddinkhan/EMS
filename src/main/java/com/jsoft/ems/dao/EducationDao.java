package com.jsoft.ems.dao;

import java.util.List;

import com.jsoft.ems.model.EMSCode;
import com.jsoft.ems.model.EducationBean;

public interface EducationDao {
	List<EMSCode> getCourseType();

	List<EMSCode> getcourseTitleList();
	public int saveEducationData(EducationBean bean);
	public List<EducationBean> getEducationList(Long empId);
}
