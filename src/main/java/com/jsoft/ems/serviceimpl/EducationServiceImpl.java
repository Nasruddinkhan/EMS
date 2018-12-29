package com.jsoft.ems.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsoft.ems.dao.EducationDao;
import com.jsoft.ems.model.EMSCode;
import com.jsoft.ems.model.EducationBean;
import com.jsoft.ems.service.EducationService;
@Service("educationService")
@Transactional
public class EducationServiceImpl implements EducationService {
@Autowired
private EducationDao educationDao;
	@Override
	public List<EMSCode> getCourseType() {
		// TODO Auto-generated method stub
		return educationDao.getCourseType();
	}
	@Override
	public List<EMSCode> getcourseTitleList() {
		// TODO Auto-generated method stub
		return educationDao.getcourseTitleList();
	}
	@Override
	public int saveEducationData(EducationBean bean) {
		
		return educationDao.saveEducationData(bean);
	}
	@Override
	public List<EducationBean> getEducationList(Long empId) {
		return educationDao.getEducationList(empId);
	}
  
}
