package util;
import helper.SizzleSelector;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

/**
 * Customised {@link FirefoxDriver} which has been extended and customized in order to exclusively use sizzle.js
 * for all Selenium CSS selectors.
 */
public class myFirefoxDriver extends FirefoxDriver {

    /**
     * Sizzle CSS Selector implementation
     */
    private final SizzleSelector sizzleSelector;

    /**
     * Driver constructor
     *
     * @param desiredCapabilities to be passed into the standard FirefoxDriver
     */
    public myFirefoxDriver(Capabilities desiredCapabilities) {
        super(desiredCapabilities);
        sizzleSelector = new SizzleSelector(this);
    }

    @Override
    public WebElement findElementByCssSelector(String using) {
        return sizzleSelector.findElementBySizzleCss(using);
    }

    @Override
    public List<WebElement> findElementsByCssSelector(String using) {
        return sizzleSelector.findElementsBySizzleCss(using);
    }

}
