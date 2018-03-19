package com.spring.intg.domain;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.transaction.annotation.Transactional;


@Transactional(timeout = 120000)
@Entity
@Table(name = "ORDERTABLE")
public class PO {
	
	@Id
	Long ORDER_NO;
	
	/*@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATED_DATE_TIME")
	private Date createdDateTime;*/
	
	@Column(name = "ORDER_TYPE")
	String ORDER_TYPE;
	
	@Column(name = "DEPT")
	Long DEPT;
	
	@Column(name = "BUYER")
	Long BUYER;
	
	@Column(name = "SUPPLIER")
	Long SUPPLIER;
	
	@Column(name = "SUPP_ADD_SEQ_NO")
	Long SUPP_ADD_SEQ_NO;
	
	@Column(name = "PROMOTION")
	Long PROMOTION;
	
	@Column(name = "QC_IND")
	String QC_IND;
	
	@Column(name = "LTR_OF_CREDIT")
	String LTR_OF_CREDIT;
	
	@Column(name = "WRITTEN_DATE")
	Date WRITTEN_DATE;
	
	@Column(name = "NOT_BEFORE_DATE")
	Date NOT_BEFORE_DATE;
	
	@Column(name = "NOT_AFTER_DATE")
	Date NOT_AFTER_DATE;
	
	@Column(name = "OTB_EOW_DATE")
	Date OTB_EOW_DATE;
	
	@Column(name = "CLOSE_DATE")
	Date CLOSE_DATE;
	
	@Column(name = "TERMS")
	String TERMS;
	
	@Column(name = "FREIGHT_TERMS")
	String FREIGHT_TERMS;
	
	@Column(name = "ORIG_IND")
	Long ORIG_IND;
	
	@Column(name = "CUST_ORDER")
	String CUST_ORDER;
	
	@Column(name = "STATUS")
	String STATUS;
	
	
	
	public Long getORDER_NO() {
		return ORDER_NO;
	}
	public void setORDER_NO(Long oRDER_NO) {
		ORDER_NO = oRDER_NO;
	}
	public String getORDER_TYPE() {
		return ORDER_TYPE;
	}
	public void setORDER_TYPE(String oRDER_TYPE) {
		ORDER_TYPE = oRDER_TYPE;
	}
	public Long getDEPT() {
		return DEPT;
	}
	public void setDEPT(Long dEPT) {
		DEPT = dEPT;
	}
	public Long getBUYER() {
		return BUYER;
	}
	public void setBUYER(Long bUYER) {
		BUYER = bUYER;
	}
	public Long getSUPPLIER() {
		return SUPPLIER;
	}
	public void setSUPPLIER(Long sUPPLIER) {
		SUPPLIER = sUPPLIER;
	}
	public Long getSUPP_ADD_SEQ_NO() {
		return SUPP_ADD_SEQ_NO;
	}
	public void setSUPP_ADD_SEQ_NO(Long sUPP_ADD_SEQ_NO) {
		SUPP_ADD_SEQ_NO = sUPP_ADD_SEQ_NO;
	}
	public Long getPROMOTION() {
		return PROMOTION;
	}
	public void setPROMOTION(Long pROMOTION) {
		PROMOTION = pROMOTION;
	}
	public String getQC_IND() {
		return QC_IND;
	}
	public void setQC_IND(String qC_IND) {
		QC_IND = qC_IND;
	}
	public String getLTR_OF_CREDIT() {
		return LTR_OF_CREDIT;
	}
	public void setLTR_OF_CREDIT(String lTR_OF_CREDIT) {
		LTR_OF_CREDIT = lTR_OF_CREDIT;
	}
	public Date getWRITTEN_DATE() {
		return WRITTEN_DATE;
	}
	public void setWRITTEN_DATE(Date wRITTEN_DATE) {
		WRITTEN_DATE = wRITTEN_DATE;
	}
	public Date getNOT_BEFORE_DATE() {
		return NOT_BEFORE_DATE;
	}
	public void setNOT_BEFORE_DATE(Date nOT_BEFORE_DATE) {
		NOT_BEFORE_DATE = nOT_BEFORE_DATE;
	}
	public Date getNOT_AFTER_DATE() {
		return NOT_AFTER_DATE;
	}
	public void setNOT_AFTER_DATE(Date nOT_AFTER_DATE) {
		NOT_AFTER_DATE = nOT_AFTER_DATE;
	}
	public Date getOTB_EOW_DATE() {
		return OTB_EOW_DATE;
	}
	public void setOTB_EOW_DATE(Date oTB_EOW_DATE) {
		OTB_EOW_DATE = oTB_EOW_DATE;
	}
	public Date getCLOSE_DATE() {
		return CLOSE_DATE;
	}
	public void setCLOSE_DATE(Date cLOSE_DATE) {
		CLOSE_DATE = cLOSE_DATE;
	}
	public String getTERMS() {
		return TERMS;
	}
	public void setTERMS(String tERMS) {
		TERMS = tERMS;
	}
	public String getFREIGHT_TERMS() {
		return FREIGHT_TERMS;
	}
	public void setFREIGHT_TERMS(String fREIGHT_TERMS) {
		FREIGHT_TERMS = fREIGHT_TERMS;
	}
	public Long getORIG_IND() {
		return ORIG_IND;
	}
	public void setORIG_IND(Long oRIG_IND) {
		ORIG_IND = oRIG_IND;
	}
	public String getCUST_ORDER() {
		return CUST_ORDER;
	}
	public void setCUST_ORDER(String cUST_ORDER) {
		CUST_ORDER = cUST_ORDER;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
}
