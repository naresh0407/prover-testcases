package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Ui__day In Month Cell"                                
               , summary=""
               , connection="KAM_USER"
               , lightningComponent="dayInMonthCell"
               , namespacePrefix="ui"
     )             
public class ui__dayInMonthCell {

	@TextType()
	@AuraBy(componentXPath = "//ui:dayInMonthCell[@aura:id= '17']")
	public WebElement WED;
	
}
