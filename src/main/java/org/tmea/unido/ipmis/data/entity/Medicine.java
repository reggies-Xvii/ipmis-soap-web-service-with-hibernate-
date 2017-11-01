package org.tmea.unido.ipmis.data.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="classification")
public class Medicine implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private long id;
	
	@Column(name="product_trade_name")
	private String productTradeName;
	
	@Column(name="generic_name")
	private String genericName;
	
	@Column(name="manufacturer")
	private String manufacturer;
	
	@Column(name="local_agent")
	private String localAgent;
	
	@Column(name="intended_use")
	private String intendedUse;
	
	public Medicine(){
		
	}
	
	public Medicine(long id, String productTradeName, String genericName, String manufacturer, String localAgent,
			String intendedUse) {
		this.id = id;
		this.productTradeName = productTradeName;
		this.genericName = genericName;
		this.manufacturer = manufacturer;
		this.localAgent = localAgent;
		this.intendedUse = intendedUse;
	}
	
	

	public Medicine(String productTradeName, String genericName, String manufacturer, String localAgent,
			String intendedUse) {
		this.productTradeName = productTradeName;
		this.genericName = genericName;
		this.manufacturer = manufacturer;
		this.localAgent = localAgent;
		this.intendedUse = intendedUse;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProductTradeName() {
		return productTradeName;
	}

	public void setProductTradeName(String productTradeName) {
		this.productTradeName = productTradeName;
	}

	public String getGenericName() {
		return genericName;
	}

	public void setGenericName(String genericName) {
		this.genericName = genericName;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getLocalAgent() {
		return localAgent;
	}

	public void setLocalAgent(String localAgent) {
		this.localAgent = localAgent;
	}

	public String getIntendedUse() {
		return intendedUse;
	}

	public void setIntendedUse(String intendedUse) {
		this.intendedUse = intendedUse;
	}

	@Override
	public String toString() {
		return "Medicine [id=" + id + ", productTradeName=" + productTradeName + ", genericName=" + genericName
				+ ", manufacturer=" + manufacturer + ", localAgent=" + localAgent + ", intendedUse=" + intendedUse
				+ "]";
	}
	
	
}
