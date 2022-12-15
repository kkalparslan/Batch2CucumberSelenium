package com.krafttech.step_definitions;

public class ZeroBankTask_Step_Defs {

    /**
     * Zero Bank Test Automation Task 1
     * TANIM
     * Bu odevde online bir bankacilik uygulamasi ile ilgili test otomasyonu yapacaksiniz.
     * Framework icin Cucumber BDD ve Selenium kullancaksiniz.
     *
     * Projenin Kurulumu
     * Maven projesi olusturun. Group-id icin zerobank ve artifact-id icin zerobank-automation kullanin.
     * Pom file icerisinde Cucumber ve Selenium icin gerekli olan tum dependencies ve Cucumber HTML Report
     * icin eklemelerinizi yapin.
     * src/test/java altinda asagidaki packages olustur:
     * zerobank.pages
     * zerobank.runners
     * zerobank.stepdefinitions
     * zerobank.utilities
     * src/test altinda resources directory olusturun.
     * src/test/resources altinda features klasorunu olusturun.
     * Proje klasorunun atinda properties dosyasini olusturun.
     * Utilities package altinda:
     * ConfigurationReader
     * BrowserUtils
     * Driver classlarini olusturun
     * Runner package altinda CukesRunner classini olusturun
     * Feature Dosyalarinin Yazimi
     * Feature dosyalarini asagidaki gerekliliklere gore yazin. Her gereksinim icin bir feature dosyasi olusturun.
     * Her feature dosyasinin birden fazla gereksinimi olabilir.
     *
     * Login
     * Uygulamaya sadece yetkili kullanicilar giris yapabilir. Kullanici gecerli kimlik bilgileri ile oturum
     * actiginda Account summary (Hesap ozeti) sayfasini goruntuleyebilmelidir.
     *
     * Kullanici adi veya sifresi yanlis olan kullanicilar giris yapmamalidirlar. Kullanaicilarin bos kullanici
     * adi veya sifre ile de girisleri mumkun olmamalidir. Kullanici gecersiz kullanici bigileri ile giris yapmak
     * istediginde  Login and/or password are wrong seklinde mesaji gorebilmelidirler.
     *
     * Account summary
     * Account summary sayfasinin basligi Zero -Account summary olmalidir. Account summary sayfasinda asagidaki
     * hesap turleri olmalidir:
     *
     * Cash Accounts,
     * Investment Accounts,
     * Credit Accounts,
     * Loan Accounts.
     * Credit Accounts tablosunda:
     *
     * Account
     * Credit Card
     * Balance sutunlari olmalidir.
     *
     *
     * Account Activity
     * Account Activity sayfasinin basligi Zero-Account activity olmalidir.
     *
     * Account menusunde varsayilan secenek Savings olmalidir. Account menusu asagidaki secenekleri de icermelidir:
     *
     * Savings,
     * Checking,
     * Loan,
     * Credit Card,
     * Transactions tablosu ndaki sutun isimleri sunlar olmalidir:
     *
     * Date,
     * Description,
     * Deposit
     * Withdrawal
     * Pay Bills
     * Account Activity sayfasinin basligi Zero -Pay Bills olmalidir. Kullanici odeme(Pay) islemini
     * gerceklestirdiginde The payment was successfully submitted mesajini gorebilmelidir. Kullanici
     * odeme islemi yaparken miktari veya tarihi girmediginde Please fill out this field message!
     * gorebilmelidir. Tutar (Amount) alani alfabetik veya ozel karakter icermemelidir. Tarih alani alfabetik
     * karakter kabul etmemelidir.
     *
     * NOT: input alanlari icin sendKeys kullanabilirsiniz. Date navigetoru click yapmaya gerek yok.
     *
     * Test Datalari:
     *
     * browser=chrome
     * url=http://zero.webappsecurity.com/
     * userName=username
     * passWord=password
     *
     * NOT: Sayfaya verilen url ile girdikten sonra Signin button a basilmali, sonrasinda verilen
     * veriler girilmeli ve Sign in butona basilmali. Ancak acilan sayfadan tekrar
     * http://zero.webappsecurity.com/bank/account-summary.html Links to an external site.sayfasina gidilmeli.
     *
     * TASK IN ENGLİSH
     *
     * Description
     * In this assignment you will create an automated testing framework for testing Zero online banking
     * application. The framework will use Cucumber BDD and Selenium.
     *
     *  Project set up
     * Create a maven project. Use group-id com.zerobank and artifact-id zerobankautomation. Add all the
     * required dependencies for Cucumber and Selenium to the pom file. Also add required plugins for HTML
     * reporting with cucumber.
     * Under src/test/java create following packages:
     * com.zerobank.pages
     * com.zerobank.runners
     * com.zerobank.stepdefnitions
     * com.zerobank.utilities
     * Under src/test create following directory resources. Mark the new resources directory as a test
     * resource folder.
     * Under the src/test/resources create new folder features.
     * Under the project folder add file configuration.properties.
     * Under utilities package create ConfigurationReader which reads from the properties file.
     * Under utilities package create Driver utility which can create a new web driver object based on value
     * from configuration.properties.
     * Under utilities package create BrowserUtils based on the example shown in the class. You can more methods
     * to this utility as you see fit.
     * Under runner package create CukesRunner based on the example shown in the class. In this class you
     * can use any CucumberOptions as you see fit.
     *
     *
     * Write feature files
     * Write feature files based on the following requirements. Create one feature file per requirement.
     * Each feature file can have multiple requirements.
     *
     *  Login
     * Only authorized users should be able to login to the application. When user logs in with valid credentials,
     * Account summary page should be displayed. Users with wrong username or wrong password should not be able
     * to login. Users with blank username or password should also not be able to login. When user tries to
     * login with invalid information, error message Login and/or password are wrong. should be displayed.
     *
     * Account summary
     * Account summary page should have the title Zero – Account summary. Account summary page should have to
     * following account types: Cash Accounts, Investment Accounts, Credit Accounts, Loan Accounts. Credit
     * Accounts table must have columns Account, Credit Card and Balance.
     *
     * Account Activity
     *
     * Account Activity page should have the title Zero – Account activity. In the Account drop down default
     * option should be Savings. Account drop down should have the following options: Savings, Checking,
     * Loan, Credit Card, Brokerage. Transactions table should have column names Date, Description, Deposit,
     * Withdrawal.
     *
     *  Pay Bills
     * Account Activity page should have the title Zero – Pay Bills. When user completes a successful
     * Pay operation, The payment was successfully submitted. should be displayed. When user tries to
     * make a payment without entering the amount or date, Please fill out this field message! should
     * be displayed. Amount field should not accept alphabetical or special characters. Date field should
     * not accept alphabetical characters.
     *
     * NOTE: . For the date input field you can just use sendKeys. No need to click on the date navigator.
     */
}
