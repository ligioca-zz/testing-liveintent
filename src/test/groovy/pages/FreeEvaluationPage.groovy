package pages

import geb.Page

class FreeEvaluationPage extends Page {

    static url = System.getProperty('geb.build.baseUrl') + "free-evaluation/"

    static at = {
        freeEvaluationVideo.displayed
    }

    static content = {
        freeEvaluationVideo() { $(".img-responsive.free-evaluation-bg.grow") }
        contactUs() { $(".header-cta") }
    }

    def contactUsExists(){
        contactUs.displayed
    }

}
