package com.spring.intg.targetdomain;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



@XmlType
public class POXml {
	
	Long ORDER_NO;	
	String ORDER_TYPE;	
	Long DEPT;	
	Long BUYER;	
	Long SUPPLIER;
	Long SUPP_ADD_SEQ_NO;		
	Long PROMOTION;	
	String QC_IND;	
	String LTR_OF_CREDIT;	
	Date WRITTEN_DATE;	
	Date NOT_BEFORE_DATE;	
	Date NOT_AFTER_DATE;
	Date OTB_EOW_DATE;
	Date CLOSE_DATE;	
	String TERMS;	
	String FREIGHT_TERMS;
	Long ORIG_IND;	
	String CUST_ORDER;	
	String STATUS;	
		
	
	@XmlElement(name = "ORDER_NO")
	public Long getORDER_NO() {
		return ORDER_NO;
	}

	public void setORDER_NO(Long oRDER_NO) {
		ORDER_NO = oRDER_NO;
	}

	@XmlElement(name = "ORDER_TYPE")
	public String getORDER_TYPE() {
		return ORDER_TYPE;
	}

	public void setORDER_TYPE(String oRDER_TYPE) {
		ORDER_TYPE = oRDER_TYPE;
	}

	@XmlElement(name = "DEPT")
	public Long getDEPT() {
		return DEPT;
	}

	public void setDEPT(Long dEPT) {
		DEPT = dEPT;
	}

	@XmlElement(name = "BUYER")
	public Long getBUYER() {
		return BUYER;
	}

	public void setBUYER(Long bUYER) {
		BUYER = bUYER;
	}

	@XmlElement(name = "SUPPLIER")
	public Long getSUPPLIER() {
		return SUPPLIER;
	}

	public void setSUPPLIER(Long sUPPLIER) {
		SUPPLIER = sUPPLIER;
	}

	@XmlElement(name = "SUPP_ADD_SEQ_NO")
	public Long getSUPP_ADD_SEQ_NO() {
		return SUPP_ADD_SEQ_NO;
	}

	public void setSUPP_ADD_SEQ_NO(Long sUPP_ADD_SEQ_NO) {
		SUPP_ADD_SEQ_NO = sUPP_ADD_SEQ_NO;
	}

	@XmlElement(name = "PROMOTION")
	public Long getPROMOTION() {
		return PROMOTION;
	}

	public void setPROMOTION(Long pROMOTION) {
		PROMOTION = pROMOTION;
	}

	@XmlElement(name = "QC_IND")
	public String getQC_IND() {
		return QC_IND;
	}

	public void setQC_IND(String qC_IND) {
		QC_IND = qC_IND;
	}

	@XmlElement(name = "LTR_OF_CREDIT")
	public String getLTR_OF_CREDIT() {
		return LTR_OF_CREDIT;
	}

	public void setLTR_OF_CREDIT(String lTR_OF_CREDIT) {
		LTR_OF_CREDIT = lTR_OF_CREDIT;
	}

	@XmlElement(name = "WRITTEN_DATE")
	public Date getWRITTEN_DATE() {
		return WRITTEN_DATE;
	}

	public void setWRITTEN_DATE(Date wRITTEN_DATE) {
		WRITTEN_DATE = wRITTEN_DATE;
	}

	@XmlElement(name = "NOT_BEFORE_DATE")
	public Date getNOT_BEFORE_DATE() {
		return NOT_BEFORE_DATE;
	}

	public void setNOT_BEFORE_DATE(Date nOT_BEFORE_DATE) {
		NOT_BEFORE_DATE = nOT_BEFORE_DATE;
	}

	@XmlElement(name = "NOT_AFTER_DATE")
	public Date getNOT_AFTER_DATE() {
		return NOT_AFTER_DATE;
	}

	public void setNOT_AFTER_DATE(Date nOT_AFTER_DATE) {
		NOT_AFTER_DATE = nOT_AFTER_DATE;
	}

	@XmlElement(name = "OTB_EOW_DATE")
	public Date getOTB_EOW_DATE() {
		return OTB_EOW_DATE;
	}

	public void setOTB_EOW_DATE(Date oTB_EOW_DATE) {
		OTB_EOW_DATE = oTB_EOW_DATE;
	}

	@XmlElement(name = "CLOSE_DATE")
	public Date getCLOSE_DATE() {
		return CLOSE_DATE;
	}

	public void setCLOSE_DATE(Date cLOSE_DATE) {
		CLOSE_DATE = cLOSE_DATE;
	}

	@XmlElement(name = "TERMS")
	public String getTERMS() {
		return TERMS;
	}

	public void setTERMS(String tERMS) {
		TERMS = tERMS;
	}

	@XmlElement(name = "FREIGHT_TERMS")
	public String getFREIGHT_TERMS() {
		return FREIGHT_TERMS;
	}

	public void setFREIGHT_TERMS(String fREIGHT_TERMS) {
		FREIGHT_TERMS = fREIGHT_TERMS;
	}

	@XmlElement(name = "ORIG_IND")
	public Long getORIG_IND() {
		return ORIG_IND;
	}

	public void setORIG_IND(Long oRIG_IND) {
		ORIG_IND = oRIG_IND;
	}

	@XmlElement(name = "CUST_ORDER")
	public String getCUST_ORDER() {
		return CUST_ORDER;
	}

	public void setCUST_ORDER(String cUST_ORDER) {
		CUST_ORDER = cUST_ORDER;
	}
	
	@XmlElement(name = "STATUS")
	public String getSTATUS() {
		return STATUS;
	}

	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}

		
}
