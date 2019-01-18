package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="TESTDetail"                                
     , summary=""
     , relativeUrl=""
     , connection="Admin"
     )             
public class TESTDetail {

	@LinkType()
	@FindBy(linkText = "Details")
	public WebElement details;
			
}
