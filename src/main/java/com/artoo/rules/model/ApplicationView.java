package com.artoo.rules.model;

public class ApplicationView {
	private String loan_type;
	private String person_applicant_occupation_code;
	private String person_applicant_present_home_address_years;
	private int person_applicant_years_of_experience;
	private String collateral_asset_type;
	private int collateral_asset_age;
	private String asset_status;
	private int business_age;
	private String vintage_with_esaf;
	private String business_location;
	private String house_available_for_pledging;
	
	public String getHouse_available_for_pledging() {
		return house_available_for_pledging;
	}
	public void setHouse_available_for_pledging(String house_available_for_pledging) {
		this.house_available_for_pledging = house_available_for_pledging;
	}
	public String getBusiness_location() {
		return business_location;
	}
	public void setBusiness_location(String business_location) {
		this.business_location = business_location;
	}
	public String getVintage_with_esaf() {
		return vintage_with_esaf;
	}
	public void setVintage_with_esaf(String vintage_with_esaf) {
		this.vintage_with_esaf = vintage_with_esaf;
	}
	public String getLoan_type() {
		return loan_type;
	}
	public void setLoan_type(String loan_type) {
		this.loan_type = loan_type;
	}
	public String getPerson_applicant_occupation_code() {
		return person_applicant_occupation_code;
	}
	public void setPerson_applicant_occupation_code(String person_applicant_occupation_code) {
		this.person_applicant_occupation_code = person_applicant_occupation_code;
	}
	public String getPerson_applicant_present_home_address_years() {
		return person_applicant_present_home_address_years;
	}
	public void setPerson_applicant_present_home_address_years(String person_applicant_present_home_address_years) {
		this.person_applicant_present_home_address_years = person_applicant_present_home_address_years;
	}
	public int getPerson_applicant_years_of_experience() {
		return person_applicant_years_of_experience;
	}
	public void setPerson_applicant_years_of_experience(int person_applicant_years_of_experience) {
		this.person_applicant_years_of_experience = person_applicant_years_of_experience;
	}
	public String getCollateral_asset_type() {
		return collateral_asset_type;
	}
	public void setCollateral_asset_type(String collateral_asset_type) {
		this.collateral_asset_type = collateral_asset_type;
	}
	public int getCollateral_asset_age() {
		return collateral_asset_age;
	}
	public void setCollateral_asset_age(int collateral_asset_age) {
		this.collateral_asset_age = collateral_asset_age;
	}
	public String getAsset_status() {
		return asset_status;
	}
	public void setAsset_status(String asset_status) {
		this.asset_status = asset_status;
	}
	public int getBusiness_age() {
		return business_age;
	}
	public void setBusiness_age(int business_age) {
		this.business_age = business_age;
	}
	
	
}
