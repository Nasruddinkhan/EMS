package com.jsoft.ems.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jsoft.ems.bean.UploadForm;
import com.jsoft.ems.dao.CommonDao;
import com.jsoft.ems.service.CommonService;

/**
 * @author Nasruddin khan 
 *
1:32:41 AM
 */
@Service("commonService")
@Transactional
public class CommonServiceImpl implements CommonService{
@Autowired
CommonDao commonDao;
	@Override
	public int updateProfilePhoto(UploadForm form) {
		// TODO Auto-generated method stub
		return commonDao.updateProfilePhoto(form);
	}

}
