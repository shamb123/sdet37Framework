package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericUtilities.WebDriverUtility;

public class ApartmentRoomPagee extends WebDriverUtility{
	
	//initialization
		public ApartmentRoomPagee(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//Declaration
		
		@FindBy(xpath="//input[@id='apartment_name']")
		private WebElement apartmentNameEdt;
		
		@FindBy(xpath="//h2[text()='Apartment Room']/..//input[@id='mobile']")
		private WebElement mobileNumberEdt;
		
		@FindBy(xpath="//h2[text()='Apartment Room']/..//input[@id='alternat_mobile']")
		private WebElement alternativeMobileNumberEdt;
		
		@FindBy(xpath="//h2[text()='Apartment Room']/..//input[@id='email']")
		private WebElement emailEdt;
		
		@FindBy(xpath="//h2[text()='Apartment Room']/..//input[@id='plot_number']")
		private WebElement plotNumberEdt;
		
		@FindBy(xpath="//h2[text()='Apartment Room']/..//input[@id='country']")
		private WebElement countryEdt;
		
		@FindBy(xpath="//h2[text()='Apartment Room']/..//input[@id='state']")
		private WebElement stateEdt;
		
		@FindBy(xpath="//h2[text()='Apartment Room']/..//input[@id='city']")
		private WebElement cityEdt;
		
		@FindBy(xpath="//h2[text()='Apartment Room']/..//input[@id='landmark']")
		private WebElement landmarkEdt;
		
		@FindBy(xpath="//h2[text()='Apartment Room']/..//input[@id='address']")
		private WebElement addressEdt;
		
		//@FindBy(xpath="//h2[text()='Apartment Room']/..//input[@id='image']")
		//private WebElement chooseImgFile;
		
		@FindBy(xpath="//a[text()='Add More(Plat Number/Description)']")
		private WebElement addMoreBtn;
		
		@FindBy(xpath="//h2[text()='Apartment Room']/..//input[@id='fullname']")
		private WebElement fullNameEdt;
		
		@FindBy(xpath="//input[@id='ap_number_of_plats']")
		private WebElement flatNumberEdt;
		
		@FindBy(xpath="//h2[text()='Apartment Room']/..//input[@id='rooms']")
		private WebElement roomsEdt;
		
		@FindBy(xpath="//input[@id='area']")
		private WebElement areaEdt;
		
		@FindBy(xpath="//select[@id='purpose']")
		private WebElement selectpurposeDropDown;
		
		@FindBy(xpath="//select[@id='floor']")
		private WebElement selectfloorDropDown;
		
		//@FindBy(xpath="//select[@id='ownership']")
		//private WebElement selectownerDropDown;
		
		@FindBy(xpath="//h2[text()='Apartment Room']/..//input[@id='rent']")
		private WebElement rentEdt;
		
		@FindBy(xpath="//h2[text()='Apartment Room']/..//input[@id='deposit']")
		private WebElement depositEdt;
		
		@FindBy(xpath="//h2[text()='Apartment Room']/..//input[@id='accommodation']")
		private WebElement facilitiesEdt;
		
		@FindBy(xpath="//h2[text()='Apartment Room']/..//input[@id='description']")
		private WebElement descriptionEdt;
		
		@FindBy(xpath="//h2[text()='Apartment Room']/..//select[@id='vacant']")
		private WebElement selectvacantOrOccupiedDropDownEdt;
		
		@FindBy(xpath="//h2[text()='Apartment Room']/..//button[@class='btn btn-primary']")
		private WebElement submitBtn;
		
		@FindBy(xpath="//a[@class='btn btn-danger btn-sm']")
		private WebElement deleteBtn;

		
		//Utilization
		public WebElement getApartmentNameEdt() {
			return apartmentNameEdt;
		}

		public WebElement getMobileNumberEdt() {
			return mobileNumberEdt;
		}

		public WebElement getAlternativeMobileNumberEdt() {
			return alternativeMobileNumberEdt;
		}

		public WebElement getEmailEdt() {
			return emailEdt;
		}

		public WebElement getPlotNumberEdt() {
			return plotNumberEdt;
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

		public WebElement getLandmarkEdt() {
			return landmarkEdt;
		}

		public WebElement getAddressEdt() {
			return addressEdt;
		}

		//public WebElement getChooseImgFile() {
			//return chooseImgFile;
		//}

		public WebElement getAddMoreBtn() {
			return addMoreBtn;
		}

		public WebElement getFullNameEdt() {
			return fullNameEdt;
		}

		public WebElement getFlatNumber() {
			return flatNumberEdt;
		}

		public WebElement getRoomsEdt() {
			return roomsEdt;
		}

		public WebElement getAreaEdt() {
			return areaEdt;
		}

		public WebElement getPurposeDropDown() {
			return selectpurposeDropDown;
		}

		public WebElement getFloorDropDown() {
			return selectfloorDropDown;
		}

		//public WebElement getOwnerDropDown() {
			//return selectownerDropDown;
		//}

		public WebElement getRentEdt() {
			return rentEdt;
		}

		public WebElement getDepositEdt() {
			return depositEdt;
		}

		public WebElement getFacilitiesEdt() {
			return facilitiesEdt;
		}

		public WebElement getDescriptionEdt() {
			return descriptionEdt;
		}

		public WebElement getVacantEdt() {
			return selectvacantOrOccupiedDropDownEdt;
		}

		public WebElement getSubmitBtn() {
			return submitBtn;
		}

		public WebElement getDeleteBtn() {
			return deleteBtn;
		}
		
		public void setApartmentNameEdt(String apartmentName ) {
			apartmentNameEdt.sendKeys(apartmentName);
		}
		public void setmobileNumberEdt(String mobileNumber) {
			mobileNumberEdt.sendKeys(mobileNumber);
		}
		public void setalternativeMobileNumberEdt(String alternativemobileNumber)
		{
			alternativeMobileNumberEdt.sendKeys(alternativemobileNumber);
		}
		public void setemailEdt(String email) {
			emailEdt.sendKeys(email);
		}
		public void setplotNumberEdt(String plotNumber) {
			plotNumberEdt.sendKeys(plotNumber);
		}
		public void setcountryEdt(String country) {
			countryEdt.sendKeys(country);
		}
		public void setstateEdt(String state) {
			stateEdt.sendKeys(state);
		}
		public void setcityeEdt(String city) {
			cityEdt.sendKeys(city);
		}
		public void setlandmarkEdt(String landmark) {
			landmarkEdt.sendKeys(landmark);
		}
		public void setaddressEdt(String address) {
			addressEdt.sendKeys(address);
		}
		//public void setchooseImgFile(String path) {
			//chooseImgFile.sendKeys(path);
		//}
		
		public void clickaddMoreBtn() {
			addMoreBtn.click();
		}
		public void setfullNameEdt(String fullName) {
			fullNameEdt.sendKeys(fullName);
		}
		public void setFlatNumber(String flatNumber) {
			flatNumberEdt.sendKeys(flatNumber);
		}
		public void setroomsEdt(String rooms) {
			roomsEdt.sendKeys(rooms);
		}
		public void setareaEdt(String area) {
			areaEdt.sendKeys(area);
		}
		
		public void selectpurposeDropDown(String purpose) {
			
			selectDropDown(selectpurposeDropDown, purpose);
		}
		
		/*public void selectfloorDropDown( String floor) {
			selectDropDown(selectfloorDropDown, floor);
		}*/
		public void selectfloorDropDown(String floor)
		{
			selectDropDown(selectfloorDropDown, floor);
		}

		/*public void selectownerDropDown(String owner) {
			selectDropDown(selectownerDropDown, owner);
		}*/
		
		//public void selectownerDropDown(String owner) {
			//selectDropDown(selectownerDropDown, owner);
		//}

		public void setrentEdt(String rent) {
		
			rentEdt.sendKeys(rent);
		}
		public void setdepositEdt(String deposit) {
			depositEdt.sendKeys(deposit);
		}
		public void setfacilitiesEdt(String facilities) {
			facilitiesEdt.sendKeys(facilities);
		}
		public void setdescriptionEdt(String description) {
			descriptionEdt.sendKeys(description);
		}
		
		
		public void selectvacantDropDownEdt(String vacant) {
			selectDropDown(selectvacantOrOccupiedDropDownEdt, vacant);
		}

		public void clicksubmitBtn() {
			submitBtn.click();
		}
		public void clickdeleteBtn()
		{
			deleteBtn.click();
			}

	
}
