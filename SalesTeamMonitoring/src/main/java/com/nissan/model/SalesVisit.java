package com.nissan.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tblsalesvisit")
public class SalesVisit {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer visitId;
	private String custName;
	private String contactPerson;
	private String contactNo;
	private String interestProduct;
	private String visitSubject;
	private String decription;
	private LocalDate visitDatetime;
	private Boolean isDisable;
	private Boolean isDelete;
	private Integer eId;
	@JoinColumn(name="eId",insertable=false,updatable=false)
	@ManyToOne
	private Employee employee;
	
	
	public Integer getVisitId() {
		return visitId;
	}
	public void setVisitId(Integer visitId) {
		this.visitId = visitId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getInterestProduct() {
		return interestProduct;
	}
	public void setInterestProduct(String interestProduct) {
		this.interestProduct = interestProduct;
	}
	public String getVisitSubject() {
		return visitSubject;
	}
	public void setVisitSubject(String visitSubject) {
		this.visitSubject = visitSubject;
	}
	public String getDecription() {
		return decription;
	}
	public void setDecription(String decription) {
		this.decription = decription;
	}
	public LocalDate getVisitDatetime() {
		return visitDatetime;
	}
	public void setVisitDatetime(LocalDate visitDatetime) {
		this.visitDatetime = visitDatetime;
	}
	public Boolean getIsDisable() {
		return isDisable;
	}
	public void setIsDisable(Boolean isDisable) {
		this.isDisable = isDisable;
	}
	public Boolean getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(Boolean isDelete) {
		this.isDelete = isDelete;
	}
	public Integer geteId() {
		return eId;
	}
	public void seteId(Integer eId) {
		this.eId = eId;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	

}
