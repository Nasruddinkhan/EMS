package com.jsoft.ems.service;

import java.util.List;

import com.jsoft.ems.model.CourseMaster;
import com.jsoft.ems.model.EmpInOutTime;
import com.jsoft.ems.model.WorkRemark;

/**
 * @author Nasruddin khan 
 *
1:32:26 AM
 */
public interface LoginInOutService {
List<EmpInOutTime> getTimeDetails( Long empId);
void checkLoginDetails(Long empId);
void checkLogOutDetails(Long empId);
void saveWorkRemark(WorkRemark workRemark);
List<WorkRemark> getRemarkList(Long empId);
List<CourseMaster> getCourseList();
WorkRemark getWorkRemark(Long workId);
}
