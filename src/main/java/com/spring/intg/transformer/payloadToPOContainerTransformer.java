package com.spring.intg.transformer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.integration.transformer.AbstractTransformer;
import org.springframework.messaging.Message;

import com.spring.intg.domain.PO;
import com.spring.intg.targetdomain.POXml;
import com.spring.intg.targetdomain.POXmlContainer;

public class payloadToPOContainerTransformer extends AbstractTransformer {

	@Override
	protected Object doTransform(Message<?> message) throws Exception {

		List<PO> pos =  new ArrayList<PO>();
		pos= (List<PO>) message.getPayload();
		List<POXml> listOfPosXml = new ArrayList<POXml>();

		for (PO po : pos) {
			POXml p = new POXml();
			p.setBUYER(po.getBUYER());
			p.setCLOSE_DATE(po.getCLOSE_DATE());
			p.setCUST_ORDER(po.getCUST_ORDER());
			p.setDEPT(po.getDEPT());
			p.setFREIGHT_TERMS(po.getFREIGHT_TERMS());
			p.setLTR_OF_CREDIT(po.getLTR_OF_CREDIT());
			p.setNOT_AFTER_DATE(po.getNOT_AFTER_DATE());
			p.setNOT_BEFORE_DATE(po.getNOT_BEFORE_DATE());
			p.setORDER_NO(po.getORDER_NO());
			p.setORDER_TYPE(po.getORDER_TYPE());
			p.setORIG_IND(po.getORIG_IND());
			p.setOTB_EOW_DATE(po.getOTB_EOW_DATE());
			p.setPROMOTION(po.getPROMOTION());
			p.setQC_IND(po.getQC_IND());
			p.setSTATUS(po.getSTATUS());
			p.setSUPP_ADD_SEQ_NO(po.getSUPP_ADD_SEQ_NO());
			p.setSUPPLIER(po.getSUPPLIER());
			p.setTERMS(po.getTERMS());
			p.setWRITTEN_DATE(po.getWRITTEN_DATE());
			
			listOfPosXml.add(p);
		}

		POXmlContainer pocxml = new POXmlContainer();
		pocxml.setPoList(listOfPosXml);
		return pocxml;
	}

}
