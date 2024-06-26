package FinalProject.Page;

import drivers.DriverManager;
import keywords.WebUI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.Hashtable;
import java.util.List;

public class CustomerPage {


    private By buttonAddNewCustomer = By.xpath("//a[normalize-space()='New Customer']");
    private By inputSearchCustomer = By.xpath("//div[@id='DataTables_Table_0_filter']//input[@type = \"search\"]");
    private By inputSearchCustomer1 = By.xpath("//div[@id='top_search']//input[@type = \"search\"]");



    //Customer List
    private By inputSearchCustomers = By.xpath("//input[@class='form-control input-sm']");


    //New Customers (Sheet Detail)
    private By inputCompany = By.xpath("//input[@id='company']");
    private By inputVATNumber = By.xpath("//input[@id='vat']");
    private By inputPhone = By.xpath("//input[@id='phonenumber']");
    private By inputWebsite = By.xpath("//input[@id='website']");
    private By clickdropdownGroups = By.xpath("//button[@data-id='groups_in[]']");
    private By inputSearchdropdownGroups = By.xpath("//div[@app-field-wrapper='groups_in[]']//input[@type='search']");
    private By clickdropdownCurrency = By.xpath("//button[@data-id='default_currency']");
    private By inputSearchdropdownCurrency = By.xpath("//div[@app-field-wrapper='default_currency']//input[@type='search']");
    private By clickdropdownLanguage = By.xpath("//button[@data-id='default_language']");
    private By selectLanguage = By.xpath("//span[normalize-space()='Italian']");
    private By inputAddress1 = By.xpath("//textarea[@id='address']");
    private By inputCity1 = By.xpath("//input[@id='city']");
    private By inputState1 = By.xpath("//input[@id='state']");
    private By inputCode1 = By.xpath("//input[@id='zip']");
    private By clickdropdownCountry1 = By.xpath("//button[@data-id='country']");
    private By inputSearchcountry1 = By.xpath("//div[@app-field-wrapper='country']//input[@type='search']");
    private By clickSaveandCreat = By.xpath("//button[normalize-space()= 'Save and create contact']");
    private By clickSave = By.xpath("//div[@id='profile-save-section']//button[normalize-space()= 'Save']");
    private By headerProfile = By.xpath("//h4[normalize-space()='Profile']");
    private By getTextGroupts = By.xpath("//button[@title='VIP']");
    private By getTextCurrency = By.xpath("//button[@title='USD']");
    private By getTextLanguage = By.xpath("//button[@title='Italian']");
    private By getTextCountry = By.xpath("//button[@title='Vietnam']");
    private By linkDetailCustomer = By.xpath("//td[@class='sorting_1']/a");
    private By pageTotal = By.xpath("//div[@id='clients_info']");


    private By BillingStressAddress = By.xpath("//textarea[@id='billing_street']");
    private By BillingCityAddress = By.xpath("//input[@id='billing_city']");
    private By BillingStateAddress = By.xpath("//input[@id='billing_state']");
    private By BillingZipCodeAddress = By.xpath("//input[@id='billing_zip']");
    private By clickdropdownCountryBilling = By.xpath("//button[@data-id='billing_country']");
    private By inputSearchdropdownGrouptBilling = By.xpath("//div[@app-field-wrapper='billing_country']//input[@type='search']");
    private By ShippingStressAddress = By.xpath("//textarea[@id='shipping_street']");
    private By ShippingCityAddress = By.xpath("//input[@id='shipping_city']");
    private By ShippingStateAddress = By.xpath("//input[@id='shipping_state']");
    private By ShippingZipCodeAddress = By.xpath("//input[@id='shipping_zip']]");
    private By clickdropdownCountryShipping = By.xpath("//button[@data-id='shipping_zip']");
    private By inputSearchdropdownGrouptShipping = By.xpath("//div[@app-field-wrapper='shipping_country']//input[@type='search']");
    private By message = By.xpath("//span[@class='alert-title']");


    public void clickButtonAddNew() {

        WebUI.clickElement(buttonAddNewCustomer);
    }


    public void setInputCompany(String company) {

        WebUI.setText(inputCompany, company);
    }


    public void setInputVAT(String VAT) {

        WebUI.setText(inputVATNumber, VAT);
    }


    public void setInputPhone(String phone) {

        WebUI.setText(inputPhone, phone);
    }


    public void setInputWebsite(String website) {

        WebUI.setText(inputWebsite, website);
    }


    public void clickdropdownGroups() {

        WebUI.clickElement(clickdropdownGroups);
    }


    public void setInputSearchdropdownGroups(String searchgroups) {

        WebUI.setText(inputSearchdropdownGroups, searchgroups);
    }


    public void clickdropdownCurrency() {

        WebUI.clickElement(clickdropdownCurrency);
    }


    public void setInputSearchdropdownCurrency(String currency) {

        WebUI.setText(inputSearchdropdownCurrency, currency);
    }


    public void clickdropdownLanguage() {

        WebUI.clickElement(clickdropdownLanguage);
    }

    public void setSelectLanguage(){
        WebUI.clickElement(selectLanguage);
    }


    public void setInputAddress(String address1) {

        WebUI.setText(inputAddress1, address1);
    }

    public void setInputCity(String city1) {

        WebUI.setText(inputCity1, city1);
    }

    public void setInputState(String state1) {

        WebUI.setText(inputState1, state1);
    }

    public void setInputCode(String code1) {

        WebUI.setText(inputCode1, code1);
    }

    public void clickdropdownCountry1() {

        WebUI.clickElement(clickdropdownCountry1);
    }

    public void setSearchdropdownCountry1(String country1) {

        WebUI.setText(inputSearchcountry1, country1);
    }

    public void clickButtonSave() {

        WebUI.clickElement(clickSave);
    }

    public void verifyAddSuccess(){
        WebUI.waitForPageLoaded();
        //Assert.assertTrue(DriverManager.getDriver().findElement(messageSuccessfully).isDisplayed(),"NOT successfully");
    }

    public void verifyCustomerSuccess(){
        WebUI.waitForElementVisible(message);
        Assert.assertTrue(DriverManager.getDriver().findElement(message).isDisplayed(),"Error message NOT displays");
        //Assert.assertEquals(WebUI.getElementText(message),"Invalid email or password123","Content of error massage NOT match");
    }

    public void searchCustomer(String COMPANY_NAME) {
        WebUI.setText(inputSearchCustomers, COMPANY_NAME);
        WebUI.sleep(1);
        Assert.assertTrue(WebUI.checkElementExist(linkDetailCustomer),"Khong tim thay Customer");
    }

    public void searchCustomer2(String COMPANY_NAME) {
        WebUI.setText(inputSearchCustomers, COMPANY_NAME);
        WebUI.sleep(1);
        WebUI.waitForPageLoaded();
    }

    //Tinh tong so dong trong 1 trang
    public void checkPageTotal(int total){
        String pageTotalText = WebUI.getElementText(pageTotal);
        System.out.println(pageTotalText);
        //Show 1 to 10 of 159 entries (filltered from total entries)
        String pageTotolNumber1[] = pageTotalText.split(" ");
        String pageTotolNumber2 = pageTotalText.split(" ")[3];
        System.out.println("Check Page Total:"+ pageTotolNumber2);

        Assert.assertEquals(Integer.parseInt(pageTotolNumber2),total,"The page total not match");
        

    }

    public void checkSearchTableByColumn(int column, String value) {

        //Xác định số dòng của table sau khi search
        List<WebElement> row = DriverManager.getDriver().findElements(By.xpath("//table//tbody/tr"));
        int rowTotal = row.size(); //Lấy ra số dòng
        System.out.println("Số dòng tìm thấy: " + rowTotal);


        //Duyệt từng dòng
        for (int i = 1; i <= rowTotal; i++) {
            WebElement elementCheck = DriverManager.getDriver().findElement(By.xpath("//table//tbody/tr[" + i + "]/td[" + column + "]"));

            JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
            js.executeScript("arguments[0].scrollIntoView(true);", elementCheck);

            System.out.print(value + " - ");
            System.out.println(elementCheck.getText());
            Assert.assertTrue(elementCheck.getText().toUpperCase().contains(value.toUpperCase()), "Dòng số " + i + " không chứa giá trị tìm kiếm.");
        }

    }

    public void verifyCustomerDetail(String COMPANY_NAME){
        SoftAssert softAssert = new SoftAssert();
        WebUI.sleep(1);
        softAssert.assertTrue(WebUI.checkElementDisplay(linkDetailCustomer),"No matching records found");

        WebUI.clickElement(linkDetailCustomer);
        softAssert.assertTrue(WebUI.checkElementDisplay(headerProfile), "Khong phai trang Profile");
        softAssert.assertEquals(WebUI.getElementAttribute(inputCompany, "value"), COMPANY_NAME , "Gia tri company khong dung" );
        softAssert.assertEquals(WebUI.getElementAttribute(inputVATNumber, "value"), "10" , "Gia tri VAT khong dung" );
        softAssert.assertEquals(WebUI.getElementAttribute(inputPhone, "value"), "0123456789" , "Gia tri phone khong dung" );
        softAssert.assertEquals(WebUI.getElementAttribute(inputWebsite, "value"), "abc@gmail.com" , "Gia tri website khong dung" );
        softAssert.assertEquals(WebUI.getElementText(getTextGroupts), "VIP", "Gia tri Groupt khong dung");
        softAssert.assertEquals(WebUI.getElementText(getTextCurrency), "USD", "Gia tri Currency khong dung");
        softAssert.assertEquals(WebUI.getElementText(getTextLanguage), "Italian", "Gia tri Language khong dung");

        softAssert.assertEquals(WebUI.getElementAttribute(inputAddress1, "value"), "Thot Not" , "Gia tri address khong dung" );
        softAssert.assertEquals(WebUI.getElementAttribute(inputCity1, "value"), "Can Tho" , "Gia tri city khong dung" );
        softAssert.assertEquals(WebUI.getElementAttribute(inputState1, "value"), "OK" , "Gia tri state khong dung" );
        softAssert.assertEquals(WebUI.getElementAttribute(inputCode1, "value"), "Code" , "Gia tri code khong dung" );
        softAssert.assertEquals(WebUI.getElementText(getTextCountry), "Vietnam", "Gia tri Country khong dung");

        softAssert.assertAll();
    }

    public void autoFillData(Hashtable< String, String > data) {
        setInputCompany(data.get("company"));
        setInputVAT(data.get("VAT"));
        setInputPhone(data.get("phone"));
        setInputWebsite(data.get("website"));

//        clickdropdownGroups();
//        setInputSearchdropdownGroups(data.get("searchgroups"));
//        WebUI.setKey(inputSearchdropdownGroups, Keys.ENTER);
//        WebUI.sleep(2);

        clickdropdownCurrency();
        setInputSearchdropdownCurrency(data.get("currency"));
        WebUI.setKey(inputSearchdropdownCurrency, Keys.ENTER);
        WebUI.sleep(2);

        clickdropdownLanguage();
        setSelectLanguage();

        setInputAddress(data.get("address1"));
        WebUI.sleep(2);
        setInputCity(data.get("city1"));
        setInputState(data.get("state1"));
        setInputCode(data.get("code1"));

        clickdropdownCountry1();
        setSearchdropdownCountry1(data.get("country1"));
        WebUI.setKey(inputSearchcountry1, Keys.ENTER);
        WebUI.sleep(2);
        clickButtonSave();
    }
}
