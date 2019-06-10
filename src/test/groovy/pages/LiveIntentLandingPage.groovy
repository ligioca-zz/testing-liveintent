package pages

import geb.Page


class LiveIntentLandingPage extends Page {

    static url = System.getProperty('geb.build.baseUrl')

    static at = {
        getStarted.displayed
    }

    static content = {
        getStarted() { $(href: "/free-evaluation/") }
    }

    def clicksOnGetStarted(){
        getStarted.click()
    }
}
