# testing-liveintent

## Overall informartion

Automation test project to cover the test case bellow:

### Contact Us button should be present on Free Evaluation page
| Step | Result |
| User opens https://liveintent.com/ | 'Get Started' button is present on the page |
| User clicks on the 'Get Started' button | The page https://liveintent.com/free-evaluation/ is loaded |
| Verify the presence of CONTACT US button | CONTACT US button should be present |

## Execution

Clone project
`git clone https://github.com/ligioca/testing-liveintent.git`

In the root of the project execute
`./gradlew clean test`