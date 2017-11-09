package org.tmea.unido.ipmis.data.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "classification")
public class Medicine implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "id")
	private long id;

	@Column(name = "product_trade_name")
	private String productTradeName;

	@Column(name = "generic_name")
	private String genericName;

	@Column(name = "manufacturer")
	private String manufacturer;

	@Column(name = "local_agent")
	private String localAgent;

	@Column(name = "intended_use")
	private String intendedUse;

	@Column(name = "strength")
	private String strength;

	@Column(name = "country_of_manufacturer")
	private String countryOfOrigin;

	@Column(name = "ephmra_code_level1")
	private String atcCodeLevelOne;

	@Column(name = "ephmra_code_level1_description")
	private String atcCodeLevelOneDescription;

	@Column(name = "ephmra_code_level2")
	private String atcCodeLevelTwo;

	@Column(name = "ephmra_code_level2_description")
	private String atcCodeLevelTwoDescription;

	@Column(name = "ephmra_code_level3")
	private String atcCodeLevelThree;

	@Column(name = "ephmra_code_level3_description")
	private String atcCodeLevelThreeDescription;

	@Column(name = "ephmra_code_level4")
	private String atcCodeLevelFour;

	@Column(name = "ephmra_code_level4_description")
	private String atcCodeLevelFourDescription;

	@Column(name = "nfc_code3")
	private String nfcCodeThree;

	@Column(name = "nfc_code3_description")
	private String nfcCodeThreeDescription;

	@Column(name = "country_registered")
	private String countryRegistered;

	public Medicine() {

	}

	public Medicine(long id, String productTradeName, String genericName, String manufacturer, String localAgent,
			String intendedUse, String strength, String countryOfOrigin, String atcCodeLevelOne,
			String atcCodeLevelOneDescription, String atcCodeLevelTwo, String atcCodeLevelTwoDescription,
			String atcCodeLevelThree, String atcCodeLevelThreeDescription, String atcCodeLevelFour,
			String atcCodeLevelFourDescription, String nfcCodeThree, String nfcCodeThreeDescription,
			String countryRegistered) {
		this.id = id;
		this.productTradeName = productTradeName;
		this.genericName = genericName;
		this.manufacturer = manufacturer;
		this.localAgent = localAgent;
		this.intendedUse = intendedUse;
		this.strength = strength;
		this.countryOfOrigin = countryOfOrigin;
		this.atcCodeLevelOne = atcCodeLevelOne;
		this.atcCodeLevelOneDescription = atcCodeLevelOneDescription;
		this.atcCodeLevelTwo = atcCodeLevelTwo;
		this.atcCodeLevelTwoDescription = atcCodeLevelTwoDescription;
		this.atcCodeLevelThree = atcCodeLevelThree;
		this.atcCodeLevelThreeDescription = atcCodeLevelThreeDescription;
		this.atcCodeLevelFour = atcCodeLevelFour;
		this.atcCodeLevelFourDescription = atcCodeLevelFourDescription;
		this.nfcCodeThree = nfcCodeThree;
		this.nfcCodeThreeDescription = nfcCodeThreeDescription;
		this.countryRegistered = countryRegistered;
	}

	public Medicine(String productTradeName, String genericName, String manufacturer, String localAgent,
			String intendedUse, String strength, String countryOfOrigin, String atcCodeLevelOne,
			String atcCodeLevelOneDescription, String atcCodeLevelTwo, String atcCodeLevelTwoDescription,
			String atcCodeLevelThree, String atcCodeLevelThreeDescription, String atcCodeLevelFour,
			String atcCodeLevelFourDescription, String nfcCodeThree, String nfcCodeThreeDescription,
			String countryRegistered) {
		this.productTradeName = productTradeName;
		this.genericName = genericName;
		this.manufacturer = manufacturer;
		this.localAgent = localAgent;
		this.intendedUse = intendedUse;
		this.strength = strength;
		this.countryOfOrigin = countryOfOrigin;
		this.atcCodeLevelOne = atcCodeLevelOne;
		this.atcCodeLevelOneDescription = atcCodeLevelOneDescription;
		this.atcCodeLevelTwo = atcCodeLevelTwo;
		this.atcCodeLevelTwoDescription = atcCodeLevelTwoDescription;
		this.atcCodeLevelThree = atcCodeLevelThree;
		this.atcCodeLevelThreeDescription = atcCodeLevelThreeDescription;
		this.atcCodeLevelFour = atcCodeLevelFour;
		this.atcCodeLevelFourDescription = atcCodeLevelFourDescription;
		this.nfcCodeThree = nfcCodeThree;
		this.nfcCodeThreeDescription = nfcCodeThreeDescription;
		this.countryRegistered = countryRegistered;
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

	public String getStrength() {
		return strength;
	}

	public void setStrength(String strength) {
		this.strength = strength;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	public String getAtcCodeLevelOne() {
		return atcCodeLevelOne;
	}

	public void setAtcCodeLevelOne(String atcCodeLevelOne) {
		this.atcCodeLevelOne = atcCodeLevelOne;
	}

	public String getAtcCodeLevelOneDescription() {
		return atcCodeLevelOneDescription;
	}

	public void setAtcCodeLevelOneDescription(String atcCodeLevelOneDescription) {
		this.atcCodeLevelOneDescription = atcCodeLevelOneDescription;
	}

	public String getAtcCodeLevelTwo() {
		return atcCodeLevelTwo;
	}

	public void setAtcCodeLevelTwo(String atcCodeLevelTwo) {
		this.atcCodeLevelTwo = atcCodeLevelTwo;
	}

	public String getAtcCodeLevelTwoDescription() {
		return atcCodeLevelTwoDescription;
	}

	public void setAtcCodeLevelTwoDescription(String atcCodeLevelTwoDescription) {
		this.atcCodeLevelTwoDescription = atcCodeLevelTwoDescription;
	}

	public String getAtcCodeLevelThree() {
		return atcCodeLevelThree;
	}

	public void setAtcCodeLevelThree(String atcCodeLevelThree) {
		this.atcCodeLevelThree = atcCodeLevelThree;
	}

	public String getAtcCodeLevelThreeDescription() {
		return atcCodeLevelThreeDescription;
	}

	public void setAtcCodeLevelThreeDescription(String atcCodeLevelThreeDescription) {
		this.atcCodeLevelThreeDescription = atcCodeLevelThreeDescription;
	}

	public String getAtcCodeLevelFour() {
		return atcCodeLevelFour;
	}

	public void setAtcCodeLevelFour(String atcCodeLevelFour) {
		this.atcCodeLevelFour = atcCodeLevelFour;
	}

	public String getAtcCodeLevelFourDescription() {
		return atcCodeLevelFourDescription;
	}

	public void setAtcCodeLevelFourDescription(String atcCodeLevelFourDescription) {
		this.atcCodeLevelFourDescription = atcCodeLevelFourDescription;
	}

	public String getNfcCodeThree() {
		return nfcCodeThree;
	}

	public void setNfcCodeThree(String nfcCodeThree) {
		this.nfcCodeThree = nfcCodeThree;
	}

	public String getNfcCodeThreeDescription() {
		return nfcCodeThreeDescription;
	}

	public void setNfcCodeThreeDescription(String nfcCodeThreeDescription) {
		this.nfcCodeThreeDescription = nfcCodeThreeDescription;
	}

	public String getCountryRegistered() {
		return countryRegistered;
	}

	public void setCountryRegistered(String countryRegistered) {
		this.countryRegistered = countryRegistered;
	}

	@Override
	public String toString() {
		return "Medicine [id=" + id + ", productTradeName=" + productTradeName + ", genericName=" + genericName
				+ ", manufacturer=" + manufacturer + ", localAgent=" + localAgent + ", intendedUse=" + intendedUse
				+ ", strength=" + strength + ", countryOfOrigin=" + countryOfOrigin + ", atcCodeLevelOne="
				+ atcCodeLevelOne + ", atcCodeLevelOneDescription=" + atcCodeLevelOneDescription + ", atcCodeLevelTwo="
				+ atcCodeLevelTwo + ", atcCodeLevelTwoDescription=" + atcCodeLevelTwoDescription
				+ ", atcCodeLevelThree=" + atcCodeLevelThree + ", atcCodeLevelThreeDescription="
				+ atcCodeLevelThreeDescription + ", atcCodeLevelFour=" + atcCodeLevelFour
				+ ", atcCodeLevelFourDescription=" + atcCodeLevelFourDescription + ", nfcCodeThree=" + nfcCodeThree
				+ ", nfcCodeThreeDescription=" + nfcCodeThreeDescription + ", countryRegistered=" + countryRegistered
				+ "]";
	}

	

}
