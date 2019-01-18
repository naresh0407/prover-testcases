package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="WebToCaseV3"                                
     , summary=""
     , relativeUrl=""
     , connection="WebToCas"
     )             
public class WebToCaseV3 {

	@TextType()
	@FindByLabel(label = "Contact Name")
	public WebElement contactName;
	@TextType()
	@FindByLabel(label = "Email")
	public WebElement email;
	@TextType()
	@FindByLabel(label = "Phone")
	public WebElement phone;
	@ChoiceListType(values = { @ChoiceListValue(value = "High"), @ChoiceListValue(value = "Medium"),
			@ChoiceListValue(value = "Low") })
	@FindByLabel(label = "Priority")
	public WebElement priority;
	@TextType()
	@FindByLabel(label = "Subject")
	public WebElement subject;
	@FindBy(name = "submit")
	@ButtonType()
	public WebElement Submitbutton;
	@LinkType()
	@FindBy(xpath = "//header[contains(@class, \"forceHighlightsPanel\")]/div[2]/div/div[2]/ul/li/a")
	public WebElement edit;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, \"tabBarContainer\")]/div/div/ul[2]/li[3]/div/button")
	public WebElement close;
	@TextType()
	@FindBy(xpath = "//button/div/div//lightning-primitive-icon")
	public WebElement Close;
	@TextType()
	@FindBy(xpath = "//*[@id=\"recordHomePinnedHeaderTemplateDesktop_1\"]/div[1]/div/header/div[2]/div/div[2]/ul/li[1]/a/div")
	public WebElement edit1;
			
}
