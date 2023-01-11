package com.nissan.service;

import java.util.List;

import com.nissan.model.SalesVisit;

public interface ISalesVisitService {
	
	//get All visitors
	public List<SalesVisit> getAllVisitors();
	
	//get By Id
	public SalesVisit getByVisitId(Integer vId);
	
	//add Sales Visit
	public SalesVisit addSalesVisit(SalesVisit visitor);
	
	//update Sales Visit
	public SalesVisit updateSalesVisit(SalesVisit visitor);

}
