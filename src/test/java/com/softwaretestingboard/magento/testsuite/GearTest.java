package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class GearTest extends BaseTest {
    HomePage homePage;

    @BeforeMethod
    public void inIt(){
        homePage = new HomePage();
    }
    @Test(groups = {"sanity", "regression"})
    public void userShouldAddProductSuccessFullyToShoppingCart(){
        homePage.mouseHoverOnGearMenuOption();
        homePage.mouseHoverOnGearMenuAndClicksOnBagsOption();
        homePage.clickODuffleBagOption();
        String expectedMessage = "Overnight Duffle";
        Assert.assertEquals(homePage.verifyOvernightDuffleText(),
                expectedMessage, "Overnight Duffle Text is not displayed");
        homePage.quantitySpaceOption();
        String expectedMessage1 = "You added Overnight Duffle to your shopping cart.";
        Assert.assertEquals(homePage.verifyYouAddedOvernightDuffleToYourShoppingCartText(),
                expectedMessage1, "Text is not displayed");
        homePage.clickOnShoppingCartLinkOption();
        String expectedMessage2 = "Overnight Duffle";
        Assert.assertEquals(homePage.verifyOvernightDuffleTextMethod(),
                expectedMessage2, "Overnight Duffle Text is not displayed");
        String expectedMessage3 = "3";
        Assert.assertEquals(homePage.verifyQuantityText(),
                expectedMessage3, "Correct Quantity is not displayed");
        String expectedMessage4 = "$135.00";
        Assert.assertEquals(homePage.verifyProductPrice(),
                expectedMessage4, "Correct Price is not displayed");
        homePage.quantityUpdateText();
        homePage.clickOnShoppingCartButtonOption();
        String expectedMessage5 = "$225.00";
        Assert.assertEquals(homePage.verifyOvernightDuffleTextMethod(),
                expectedMessage5, "Incorrect Price is displayed");
           }
}
