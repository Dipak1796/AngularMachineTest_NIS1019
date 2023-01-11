package com.nissan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.dao.ISalesVisitDAO;
import com.nissan.model.SalesVisit;

@Service
public class SalesVisitService implements ISalesVisitService {

	@Autowired
	ISalesVisitDAO visitorDAO;
	
	@Override
	public List<SalesVisit> getAllVisitors() {
		
		return visitorDAO.findAll();
	}

	@Override
	public SalesVisit getByVisitId(Integer vId) {
		
		return visitorDAO.findById(vId).get();
	}

	@Override
	public SalesVisit addSalesVisit(SalesVisit visitor) {
		
		return visitorDAO.save(visitor);
	}

	@Override
	public SalesVisit updateSalesVisit(SalesVisit visitor) {
		
		return visitorDAO.save(visitor);
	}

}
