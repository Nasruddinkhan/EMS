package com.jsoft.ems.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jsoft.ems.dao.LoginInOutDao;
import com.jsoft.ems.model.CourseMaster;
import com.jsoft.ems.model.EmpInOutTime;
import com.jsoft.ems.model.WorkRemark;
import com.jsoft.ems.service.LoginInOutService;
import com.jsoft.ems.util.CommonUtils;

/**
 * @author Nasruddin khan 
 *
1:32:51 AM
 */
@Service("loginInOutService")
@Transactional
public class LoginInOutServiceImpl implements LoginInOutService {
	@Autowired
	LoginInOutDao loginInOutDao;
	@Override
	public List<EmpInOutTime> getTimeDetails(Long empId) {
		// TODO Auto-generated method stub
		return loginInOutDao.getTimeDetails(empId);
	}
	@Override
	public void checkLoginDetails(Long empId) {
		// TODO Auto-generated method stub
		EmpInOutTime checkLogin =  loginInOutDao.checkLoginDetails(empId, CommonUtils.getCurDate());
		if(checkLogin!=null) {
			System.out.println("LoginInOutServiceImpl.checkLoginDetails() checkLogin ["+checkLogin+"]");
		}else {
			EmpInOutTime  empInOutTime = new EmpInOutTime();
			empInOutTime.setDate(CommonUtils.getCurDate());
			empInOutTime.setDay(CommonUtils.getDay());
			empInOutTime.setEmpID(empId);
			empInOutTime.setInTime(CommonUtils.getTime());
			empInOutTime.setLoginTime(CommonUtils.getCurrentDateTime().toString());
			empInOutTime.setLateMark(CommonUtils.getLoginHoursOnly()>=11?"Late-Comming":"In-Time");
			empInOutTime.setLoginCtr(0);
			empInOutTime.setLogoutCtr(0);
			empInOutTime.setStatus("info");
			loginInOutDao.saveInTimeDetails(empInOutTime);
		}
	}
	@Override
	public void checkLogOutDetails(Long empId) {
		// TODO Auto-generated method stub
		EmpInOutTime checkLogout =  loginInOutDao.checkLoginDetails(empId, CommonUtils.getCurDate());
		if(checkLogout!=null) {
			System.out.println("LoginInOutServiceImpl.checkLoginDetails() checkLogin ["+checkLogout+"]");
			String toTimeStamp = CommonUtils.getCurrentDateTime().toString();
			String logOutTime = CommonUtils.getTime();
			checkLogout.setLogOutTime(toTimeStamp);
			String workingHours = CommonUtils.diffrentTwoTimeStamp(checkLogout.getLoginTime(), toTimeStamp);
			checkLogout.setHours(workingHours);
			String []hr = workingHours.split(":");
			int workingHr =Integer.parseInt(hr[0]);
			checkLogout.setRemark(workingHr>=9?"Working hours complete":"Working hours In-Complete");
			checkLogout.setStatus(workingHr<9?"warning":"success");
			checkLogout.setOutTime(logOutTime);
			loginInOutDao.saveInTimeDetails(checkLogout);
		}
	}
	@Override
	public void saveWorkRemark(WorkRemark workRemark) {
		// TODO Auto-generated method stub
		loginInOutDao.saveWorkRemark(workRemark);
	}
	/* (non-Javadoc)
	 * @see com.jsoft.ems.service.LoginInOutService#getRemarkList(java.lang.Long)
	 */
	@Override
	public List<WorkRemark> getRemarkList(Long empId) {
		return loginInOutDao.getRemarkList(empId);
	}
	/* (non-Javadoc)
	 * @see com.jsoft.ems.service.LoginInOutService#getCourseList()
	 */
	@Override
	public List<CourseMaster> getCourseList() {
		// TODO Auto-generated method stub
		return loginInOutDao.getCourseList();
	}
	/* (non-Javadoc)
	 * @see com.jsoft.ems.service.LoginInOutService#getWorkRemark(java.lang.Long)
	 */
	@Override
	public WorkRemark getWorkRemark(Long workId) {
		// TODO Auto-generated method stub
		return loginInOutDao.getWorkRemark(workId);
	}

}
