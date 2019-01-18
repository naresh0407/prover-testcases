package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="ProductAvailabilityOnAccount"                                
               , summary=""
               , connection="SalesDEV"
               , lightningComponent="ProductAvailabilityOnAccount"
               , namespacePrefix=""
     )             
public class ProductAvailabilityOnAccount {

	@PageRow()
	public static class FilteredList {

		@LinkType()
		@FindBy(linkText = "TEST-2018-08-21")
		public WebElement tEST20180821;
	}

	@AuraBy(componentXPath = "//aura:iteration[@iterationListName = 'v.filteredList']")
	@PageTable(firstRowContainsHeaders = false, row = FilteredList.class)
	public List<FilteredList> filteredList;
	
}
