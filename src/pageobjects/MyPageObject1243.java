package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="MyPageObject1243"                                
     , summary=""
     , relativeUrl=""
     , connection="NAM_USER"
     )             
public class MyPageObject1243 {

	@LinkType()
	@FindBy(linkText = "Edit")
	public WebElement edit;
			
}
