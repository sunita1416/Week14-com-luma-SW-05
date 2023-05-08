package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Women')]")
    WebElement WomenMenuOption;

    public void mouseHoverOnWomenMenuTab() {
        mouseHoverToElement(WomenMenuOption);
    }
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-9']//span[contains(text(),'Tops')]")
    WebElement mouseHoverOnTopMenuOption;
    public void mouseHoverOnWomenTopMenuOption() {
        mouseHoverToElement(mouseHoverOnTopMenuOption);
    }
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-11']")
    WebElement jacketsOption;
    public void setJacketsOption() {
        clickOnElement(jacketsOption);
    }
    @CacheLookup
    @FindBy(xpath = "//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[3]/select[1]")
    WebElement sortProductNameInDropDownOption;
    public void productSortByProductName(String product) {
        selectByVisibleTextFromDropDown(sortProductNameInDropDownOption, product);
    }
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Men']")
    WebElement menMenuOption;
    public void mouseHoverOnMenMenuTab() {
        mouseHoverToElement(menMenuOption);
    }
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-18']")
    WebElement mouseHoverOnBottomsMenuOption;

    public void mouseHoverOnMenBottomsMenuOption() {
        mouseHoverToElement(mouseHoverOnBottomsMenuOption);
    }
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement pantsOption;
    public void setPantsOption() {
        clickOnElement(pantsOption);
    }
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cronus Yoga Pant']")
    WebElement mouseHoverOnProductNameOption;
    public void mouseHoverOnMenPantsProductNameOption() {
        mouseHoverToElement(mouseHoverOnProductNameOption);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@class='swatch-option text'])[1]")
    WebElement mouseHoverAndClickOnProductNameOption;
    public void mouseHoverOnProductNameCronusYogaPantAndClicksOnSizeOption(String pant) {
        mouseHoverToElementAndClick(mouseHoverAndClickOnProductNameOption);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@class='swatch-option color'])[1]")
    WebElement mouseHoverAndClickOnColourNameOption;
    public void mouseHoverOnProductNameCronusYogaPantAndClicksOnColourOption(String pant) {
        mouseHoverToElementAndClick(mouseHoverAndClickOnProductNameOption);
    }
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Add to Cart')])[1]")
    WebElement mouseHoverAndClickOnAddToCartOption;
    public void mouseHoverOnProductNameCronusYogaPantAndClicksOnAddToCartOption() {
        mouseHoverToElementAndClick(mouseHoverAndClickOnAddToCartOption);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement addedToYourShoppingCartMethodText;
    public String youAddedCronusYogaPantToYourShoppingCartMethodTextMethodText() {
        return getTextFromElement(addedToYourShoppingCartMethodText);
    }
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCartOption;
    public void clickOnShoppingCartOption() {
        clickOnElement(pantsOption);
    }
    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement shoppingCartTextMethod;
    public String shoppingCartText() {
        return getTextFromElement(shoppingCartTextMethod);
    }
    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement pantTextMethod;
    public String cronusPantText() {
        return getTextFromElement(pantTextMethod);
    }
    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement sizeTextMethod;
    public String verifySizeText() {
        return getTextFromElement(sizeTextMethod);
    }
    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement colourTextMethod;
    public String verifyColourOfPantText() {
        return getTextFromElement(colourTextMethod);
    }

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Gear']")
    WebElement mouseHoverOnGearOption;
    public void mouseHoverOnGearMenuOption() {
        mouseHoverToElement(mouseHoverOnGearOption);
    }
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Gear']")
    WebElement mouseHoverGearAndClickOption;
    public void mouseHoverOnGearMenuAndClicksOnBagsOption() {
        mouseHoverToElementAndClick(mouseHoverAndClickOnAddToCartOption);
    }
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Overnight Duffle']")
    WebElement duffleBagOption;
    public void clickODuffleBagOption() {
        clickOnElement(duffleBagOption);
    }
    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement overNightDuffleText;
    public String verifyOvernightDuffleText() {
        return getTextFromElement(overNightDuffleText);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement quantityOption;
    public void quantitySpaceOption() {
        clickOnElement(quantityOption);
        sendTextToElement(quantityOption, Keys.CONTROL + "a"); // Select all existing text
        sendTextToElement(quantityOption, "3"); // Type in the new text
    }
    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement youAddedText;
    public String verifyYouAddedOvernightDuffleToYourShoppingCartText() {
        return getTextFromElement(youAddedText);
    }
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement cartOption;
    public void clickOnShoppingCartLinkOption() {
        clickOnElement(cartOption);
    }
    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement nightDuffleText;
    public String verifyOvernightDuffleTextMethod() {
        return getTextFromElement(nightDuffleText);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@title='Qty']")
    WebElement qtyText;
    public String verifyQuantityText() {
        return getTextFromElement(qtyText);
    }
    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span)[2]")
    WebElement priceText;
    public String verifyProductPrice() {
        return getTextFromElement(priceText);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement qtyOption;
    public void quantityUpdateText() {
        clickOnElement(qtyOption);
        sendTextToElement(qtyOption, Keys.CONTROL + "a"); // Select all existing text
        sendTextToElement(qtyOption, "5"); // Type in the new text
    }
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shopCartOption;
    public void clickOnShoppingCartButtonOption() {
        clickOnElement(shopCartOption);
    }
    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span)[2]")
    WebElement priceTextMethod;
    public String verifyUpdatedPriceText() {
        return getTextFromElement(priceTextMethod);
    }
}
