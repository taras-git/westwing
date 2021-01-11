import app.App;
import app.helpers.Driver;
import java.lang.reflect.Method;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

class BaseTest {

    protected App app;
    protected SoftAssert softAssert;
    protected Logger logger;

    @BeforeClass
    public void setUp() {
        Driver.initDriver();

        app = new App();
        softAssert = new SoftAssert();
        logger = LogManager.getLogger("");
        DOMConfigurator.configure("src/main/resources/log4j.xml");
    }

    @BeforeMethod
    public void beforeTestCase(Method m) {
        logger.info("START " + m.getName());
    }

    @AfterMethod
    public void afterTestCase(Method m) {
        logger.info("END " + m.getName());
        Driver.clearCookies();
    }

    @AfterClass
    public void tearDown() {
        Driver.close();
    }
}