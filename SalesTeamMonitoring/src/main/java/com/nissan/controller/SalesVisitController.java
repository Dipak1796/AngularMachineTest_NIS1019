package com.nissan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.SalesVisit;
import com.nissan.service.ISalesVisitService;

@CrossOrigin
@RestController
@RequestMapping("api/")
public class SalesVisitController {
	
	@Autowired
	ISalesVisitService visitorService;
	
	@GetMapping("visitors")
	public List<SalesVisit> getAllVisitors(){
		return visitorService.getAllVisitors();
	}
	
	@GetMapping("visitors/{_vId}")
	public SalesVisit getByVisitId(@PathVariable Integer _vId) {
		return visitorService.getByVisitId(_vId);
	}
	
	@PostMapping("visitors")
	public SalesVisit addVisitor(@RequestBody SalesVisit visitor) {
		return visitorService.addSalesVisit(visitor);
	}
	
	@PutMapping("visitors")
	public SalesVisit editVisitor(@RequestBody SalesVisit visitor) {
		return visitorService.updateSalesVisit(visitor);
	}

}
