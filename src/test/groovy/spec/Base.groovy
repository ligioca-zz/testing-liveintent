package spec

import geb.spock.GebReportingSpec
import org.openqa.selenium.Dimension


class Base extends GebReportingSpec {


    def setup() {
        cleanReportGroupDir()
    }

    def setupSpec() {
        browser.config.cacheDriver = false
        browser.driver = browser.config.driver
    }

    def cleanup() {
        clearCookies()
        browser.close()
    }

    def cleanupSpec() {
        browser.quit()
    }
}
