Automation framework

Tools: Selenide, Testng, Maven

Run tests: 
1. from IDE (run testcase src/test/java/WishListTest.java)
2. from command line, default browser - Chrome, with UI: 
    mvn test 
  
  or, with specific settings:
    mvn test -Dbrowser=chrome -Dheadless=1