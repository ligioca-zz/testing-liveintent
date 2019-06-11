## Overall informartion

Automation test project to cover the test case:

*Contact Us button should be present on Free Evaluation page*

Steps | Expected Result
--------- | ------
User opens https://liveintent.com/     | 'Get Started' button is present on the page
User clicks on the 'Get Started' button    | The page https://liveintent.com/free-evaluation/ is loaded
Verify the presence of CONTACT US button    | CONTACT US button should be present

This project uses Gradle as build platform so the test can be executed using a regular `./gradlew clean test` execution on the command line. It is written in Groovy and uses Geb as test framework with Spock as BDD.
It runs in chrome browser.


## Execution

Clone project
`git clone https://github.com/ligioca/testing-liveintent.git`

In the root of the project execute
`./gradlew clean test`
