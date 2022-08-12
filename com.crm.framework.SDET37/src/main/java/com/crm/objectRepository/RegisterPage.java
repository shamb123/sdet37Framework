package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericUtilities.WebDriverUtility;
import com.mysql.jdbc.Driver;

public class RegisterPage extends WebDriverUtility{
	
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "fullname") private WebElement fullNameEdt;
	@FindBy(id = "mobile") private WebElement mobileEdt;
	@FindBy(id = "alternat_mobile") private WebElement altMobEdt;
	@FindBy(id = "email") private WebElement emailEdt;
	@FindBy(id = "plot_number") private WebElement plotNumEdt;
	@FindBy(id = "rooms") private WebElement roomsEdt;
	@FindBy(id = "country") private WebElement countryEdt;
	@FindBy(id = "state") private WebElement stateEdt;
	@FindBy(id = "city") private WebElement cityEdt;
	@FindBy(id = "rent") private WebElement rentEdt;
	@FindBy(id = "sale") private WebElement saleEdt;
	@FindBy(id = "deposit") private WebElement depositEdt;
	@FindBy(id = "accommodation") private WebElement FacilitiesEdt;
	@FindBy(id = "description") private WebElement descriptionEdt;
	@FindBy(id = "landmark") private WebElement landmarkEdt;
	@FindBy(id = "address") private WebElement addressEdt;
	@FindBy(id = "vacant") private WebElement vacantEdt;
	@FindBy(id ="image") private WebElement imageEdt;
	@FindBy(xpath = "//a[.='Register']")
	private WebElement registerLink;
	@FindBy(xpath = "//a[.='Details/Update']")
	private WebElement detailsupdatelnk;
	
	@FindBy(name = "register_individuals") private WebElement submitbtnEdt;
	public WebElement getFullNameEdt() {
		return fullNameEdt;
	}
	public WebElement getmobileEdt() {
		return mobileEdt;
	}
	public WebElement getAltMobEdt() {
		return altMobEdt;
	}
	public WebElement getEmailEdt() {
		return emailEdt;
	}
	public WebElement getPlotNumEdt() {
		return plotNumEdt;
	}
	public WebElement getRoomsEdt() {
		return roomsEdt;
	}
	public WebElement getCountryEdt() {
		return countryEdt;
	}
	public WebElement getStateEdt() {
		return stateEdt;
	}
	public WebElement getCityEdt() {
		return cityEdt;
	}
	public WebElement getRentEdt() {
		return rentEdt;
	}
	public WebElement getSaleEdt() {
		return saleEdt;
	}
	public WebElement getDepositEdt() {
		return depositEdt;
	}
	public WebElement getFacilitiesEdt() {
		return FacilitiesEdt;
	}
	public WebElement getDescriptionEdt() {
		return descriptionEdt;
	}
	public WebElement getLandmarkEdt() {
		return landmarkEdt;
	}
	public WebElement getAddressEdt() {
		return addressEdt;
	}
	public WebElement getVacantEdt() {
		return vacantEdt;
	}
	public WebElement getImageEdt() {
		return imageEdt;
	}
	public WebElement getSubmitbtnEdt() {
		return submitbtnEdt;
	}
	public WebElement getRegisterLink() {
		return registerLink;
	}
	
	public WebElement getDetailsupdatelnk() {
		return detailsupdatelnk;
	}
	
	
	public void fullname(String name) {
		fullNameEdt.sendKeys(name);
	}
	public void MobileEdtt(String num) {
		mobileEdt.sendKeys(num);
	}
	public void altMobEdt(String numm) {
		altMobEdt.sendKeys(numm);
	}
	public void email(String email){
		emailEdt.sendKeys(email);
	}
	
	public void plotNum(String plotnum) {
		plotNumEdt.sendKeys(plotnum);
	}
	
	public void rooms(String room) {
		roomsEdt.sendKeys(room);
	}
	public void country(String country) {
		countryEdt.sendKeys(country);
		
	}
	public void state(String state) {
		stateEdt.sendKeys(state);
	}
	public void city(String city) {
		cityEdt.sendKeys(city);
	}
	public void rent(String rent) {
		rentEdt.sendKeys(rent);
	}
	public void sale(String sale) {
		saleEdt.sendKeys(sale);
	}
	public void deposit(String deposit) {
		depositEdt.sendKeys(deposit);
	}
	public void facilities(String facilities) {
		FacilitiesEdt.sendKeys(facilities);
	}
	public void description(String description) {
		descriptionEdt.sendKeys(description);
	}
	public void landmark(String landmark) {
		landmarkEdt.sendKeys(landmark);
	}
	public void addressDetails(String address) {
		addressEdt.sendKeys(address);
	}
	public void vaccantDrpDwn(String value) {
		selectDropDown(vacantEdt, value);
	}
//	public void image(String path) {
//		//imageEdt.click();
//		imageEdt.sendKeys(path);
//	}
	public void submit() {
		submitbtnEdt.click();
	}
	
	public void registerLnk() {
		registerLink.click();
		
	}
	
	
		
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
} 
