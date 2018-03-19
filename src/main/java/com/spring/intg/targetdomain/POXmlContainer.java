package com.spring.intg.targetdomain;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType @XmlRootElement(name = "POContainer")
public class POXmlContainer {

	List<POXml> poList;

	/**
	 * @return the poList
	 */
	@XmlElement(name = "po")
	public List<POXml> getPoList() {
		return poList;
	}

	/**
	 * @param poList
	 *            the poList to set
	 */
	public void setPoList(List<POXml> poList) {
		this.poList = poList;
	}

}
