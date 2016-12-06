package util;

import org.apache.logging.log4j.status.StatusLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;


/**
 * Created by vanithakasala on 26/05/2016.
 */
public class Driver {
    public static WebDriver webDriver;
    protected static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Driver.class);

    public static void getWebDriver() {

        FirefoxProfile profile = new FirefoxProfile();
        profile.setPreference("browser.download.folderList", 2);
        profile.setPreference("extensions.firebug.currentVersion", "2.0.11");
        profile.setPreference("extensions.firebug.onByDefault", true);
        profile.setPreference("extensions.firebug.previousPlacement", 2);
        profile.setPreference("extensions.firebug.netFilterCategories", "xhr");
        profile.setPreference("extensions.firebug.defaultPanelName", "net");
        profile.setPreference("extensions.firebug.net.enableSites", true);
        profile.setPreference("extensions.firebug.net.persistent", true);
        profile.setPreference("extensions.firebug.netexport.autoExportToServer", false);
        profile.setPreference("extensions.firebug.netexport.showPreview", false);
        profile.setPreference("extensions.firebug.netexport.sendToConfirmation", false);
        profile.setPreference("extensions.firebug.netexport.pageLoadedTimeout", 360000);
        profile.setPreference("extensions.firebug.netexport.timeout", 360000);
        profile.setPreference("extensions.firebug.netexport.Automation", true);
        profile.setPreference("extensions.firebug.netexport.compress", false);
        profile.setPreference("extensions.firebug.netexport.includeResponseBodies", true);
        profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/pdf, application/octet-stream, application/csv,text/csv");
        profile.setPreference("pdfjs.migrationVersion", 1);
        DesiredCapabilities dc = new DesiredCapabilities().firefox();
        dc.setCapability(myFirefoxDriver.PROFILE, profile);
        try {
            webDriver = new myFirefoxDriver(dc);
            webDriver.manage().window().maximize();
        } catch (Exception e) {
            LOG.error("Error on initializing firefox browser");
            LOG.error("", e);
        }
    }
}


