package com.jsoft.ems.dao;

import java.util.List;

import com.jsoft.ems.model.CourseMaster;
import com.jsoft.ems.model.EmpInOutTime;
import com.jsoft.ems.model.WorkRemark;

public interface LoginInOutDao {
	List<EmpInOutTime> getTimeDetails(Long empId);
	EmpInOutTime checkLoginDetails(Long empId, String curDate);
	void saveInTimeDetails(EmpInOutTime empInOutTime);
	void saveWorkRemark(WorkRemark workRemark);
	List<WorkRemark> getRemarkList(Long empId);
	public List<CourseMaster> getCourseList();
	WorkRemark getWorkRemark(Long workId);
}
