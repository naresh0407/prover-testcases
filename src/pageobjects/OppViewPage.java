package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage(connection = "SalesTest", object = "Opportunity", title = "OppViewPage")
public class OppViewPage {

	@LinkType()
	@FindBy(linkText = "Edit")
	public WebElement edit;
			
}
