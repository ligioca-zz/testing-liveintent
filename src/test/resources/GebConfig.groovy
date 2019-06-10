import org.openqa.selenium.chrome.ChromeDriver


final int DEFAULT_TIMEOUT = 60

baseUrl = "https://www.liveintent.com/"

waiting {
    timeout = 30
}

driver = {
    System.setProperty('webdriver.chrome.driver', 'src/main/resources/chromedriver')
    new ChromeDriver()
}

reportsDir = new File("target/geb-reports")
reportOnTestFailureOnly = true