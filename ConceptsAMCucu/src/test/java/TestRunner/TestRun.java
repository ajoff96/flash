package TestRunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.base.BaseClassCuc;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions (
		features = "D:\\JavaProgram\\ConceptsAMCucu\\Feature\\Login.feature",
		glue="stepDefinition",
		dryRun=false, monochrome=true,
		plugin= {"pretty","html:test-output"}
		
		
		
 )

public class TestRun {

	public static WebDriver d;


	@BeforeClass
	public static  void setup() {
		d=BaseClassCuc.setProperty();//Static concept-method calling by class reference
		d=BaseClassCuc.get();
	}
	@AfterClass
	public static void tearDown() {
		
		BaseClassCuc.cls();
	}
	
	


}
