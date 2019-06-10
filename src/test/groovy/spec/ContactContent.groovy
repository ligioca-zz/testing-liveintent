package spec

import pages.FreeEvaluationPage
import pages.LiveIntentLandingPage

class ContactContent extends Base {

    def "Contact Us button should be present in Free Evaluation page"(){

        when: "User access LiveIntent landing page"
        waitFor { to LiveIntentLandingPage }

        and: "User clicks on Get Started button"
        at(LiveIntentLandingPage).clicksOnGetStarted()
        waitFor { at FreeEvaluationPage }

        then: "Contact Us button should be present"
        at(FreeEvaluationPage).contactUsExists()

    }

}