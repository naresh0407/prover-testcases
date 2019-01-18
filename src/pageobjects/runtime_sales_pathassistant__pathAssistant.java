package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="runtime_sales_pathassistant__pathAssistant"                                
               , summary=""
               , connection="KAM_USER"
               , lightningComponent="pathAssistant"
               , namespacePrefix="runtime_sales_pathassistant"
     )             
public class runtime_sales_pathassistant__pathAssistant {

	@LinkType()
	@FindBy(linkText = "Pending")
	public WebElement pending;
	@ButtonType()
	@AuraBy(componentXPath = "//lightning:buttonIcon[@aura:id= 'inlineEditTrigger']")
	public WebElement editCommiteeApprovalDate;
	@ButtonType()
	@FindBy(xpath = "//label[contains(@class, \"closeStepActionLabel\")]//button")
	public WebElement changeClosedStage;
	@LinkType()
	@FindBy(linkText = "Edit")
	public WebElement edit;
	@TextType()
	@FindBy(xpath = "//a[contains(@class, \"actionLink\")]//p")
	public WebElement inlineEdit;
	@TextType()
	@FindByLabel(label = "Due Diligence", labelType = LabelType.SalesforceLightningDesignSystem)
	public WebElement _318_a;
	@TextType()
	@FindBy(xpath = "(//div[contains(@class, \"path_assistant\")]/div/div/div/div[1]/div/div/div[2]/span](2)")
	public WebElement DueDiligence;
	
}
