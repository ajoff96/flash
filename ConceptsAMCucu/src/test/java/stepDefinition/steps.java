package stepDefinition;

import java.io.FileInputStream;

import org.openqa.selenium.WebDriver;

import com.base.BaseClassCuc;

import TestRunner.TestRun;
import cucumber.api.java.en.*;
import jxl.Sheet;
import jxl.Workbook;
import pageObject.LoginPageC;

public class steps extends BaseClassCuc {
	WebDriver d = TestRun.d; // object to object declaration
	LoginPageC l = new LoginPageC(d);

	@Given("^user is on login page$")
	public void user_is_on_login_page() throws InterruptedException {
		l = new LoginPageC(d);// object created//null
		get();
		wait(3000);

	}

	@When("^user enters username and Password$")
	public void user_navigates_to_Login_Page() throws Throwable {

		// Base Class with POM & Data Driven
		FileInputStream f = new FileInputStream("C:\\Users\\HP\\Desktop\\ddp.xls");
		Workbook b = Workbook.getWorkbook(f);
		Sheet s = b.getSheet(0);
		int rowcount = s.getRows();
		for (int i = 1; i < rowcount; i++) {
			String usern = s.getCell(0, i).getContents();
			String passn = s.getCell(1, i).getContents();

			send(l.getUser(), usern);
			send(l.getpwd(), passn);
			wait(5000);
			clk(l.getlogin());
			wait(8000);
			clk(l.getlogout());
			wait(2000);
		}
	}

}
