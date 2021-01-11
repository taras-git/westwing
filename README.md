**Automation testing framework**

for Westwingnow.de web-application


Tools used: Selenide, Testng, Maven

The framework uses "Page Object" pattern and separates "Pages" and "Test" classes.

Main testing class - src/test/java/WishListTest.java.

Resources for the test (user login data) - src/test/resources/testcase.properties.

Browsers used for testing - Chrome and Firefox, can be run with UI mode, or in "headless" mode.


Run tests: 
1. from IDE (run testcase src/test/java/WishListTest.java)
2. from command line, default browser - Chrome, with UI: 
   >mvn test 
  
  or, with specific browser settings:
   >mvn test -Dbrowser=chrome -Dheadless=1