package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.DashboardPage;
import pageObjects.OrdersPage;
import pageObjects.SupplierTeamListPage;
import pageObjects.SupplierUserListPage;
import pageObjects.Suppliercustomerlocationlistingpage;
import pageObjects.Supplierdashboardpage;
import pageObjects.Supplierorderslistingpage;

public class SupplierTeamList {

	private TestContext testContext;
	private OrdersPage orderspage;
	private Object OrderID;
	private Object logInPage;
	private DashboardPage dashboradpage;
	private Suppliercustomerlocationlistingpage suppliercustomerlocationlisting;
	private Supplierdashboardpage supplierdashboard;
	private Supplierorderslistingpage supplierorderslisting;
	private SupplierUserListPage supplierUserList;
	private SupplierTeamListPage supplierTeamList;

	public SupplierTeamList(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.orderspage = testContext.getPageObjectManager().getOrdersPage();
		this.logInPage =  testContext.getPageObjectManager().getLogInPage3();
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
		this.suppliercustomerlocationlisting=testContext.getPageObjectManager().getSuppliercustomerlocationlistingpage();
		this.supplierdashboard=	testContext.getPageObjectManager().getSupplierdashboardpage();
		this.supplierorderslisting=testContext.getPageObjectManager().getSupplierorderslistingpage();
		this.supplierUserList=testContext.getPageObjectManager().getSupplierUserListPage();
		this.supplierTeamList=testContext.getPageObjectManager().getSupplierTeamListPage();
	}



	@Then("User click on teams icon")
	public void user_click_on_teams_icon() {
		SupplierTeamListPage.Teamsclick();
	}


	@Then("User click on new team in users page")
	public void user_click_on_new_team_in_users_page() {
		SupplierTeamListPage.NewTeamclick();
	}
	@Then("User enter on team name in team page{string}")
	public void user_enter_on_team_name_in_team_page_Sabaritesting(String TeamName) {
		SupplierTeamListPage.TeamNameEnter(TeamName);
	}
	@Then("User click on next link to outlet")
	public void user_click_on_next_link_to_outlet() {
		SupplierTeamListPage.NextLinkOutletclick();
	}
	@Then("User click on add new button")
	public void user_click_on_add_new_button() throws InterruptedException {
		SupplierTeamListPage.AddNewbuttonclick();
	}
	@Then("User select on outlet in dropdown field")
	public void user_select_on_outlet_in_dropdown_field() {
		SupplierTeamListPage.OutletDropdownclick();
	}
	@Then("User click on save button in popup field")
	public void user_click_on_save_button_in_popup_field() {
		SupplierTeamListPage.Savebuttonclick();
	}
	@Then("User click on actions dropdown")
	public void user_click_on_actions_dropdown() throws InterruptedException {
		SupplierTeamListPage.ActionsDropdownclick();
	}
	@Then("User click on go to outlet setting")
	public void user_click_on_go_to_outlet_setting() {
		SupplierTeamListPage.GotoOutletSettingclick();
	}
	@Then("User click on actions dropdown teams field")
	public void user_click_on_actions_dropdown_teams_field() throws InterruptedException {
		SupplierTeamListPage.ActionsDropdowninTeamsclick();
	}
	@Then("User clear on team name field")
	public void user_clear_on_team_name_field() {
		SupplierTeamListPage.TeamNameclear();
	}
	@Then("User click on save button in team page")
	public void user_click_on_save_button_in_team_page() {
		SupplierTeamListPage.Saveclick();
	}



	@Then("User click on first dropdown list")
	public void user_click_on_first_dropdown_list() {
		SupplierTeamListPage.FirstDropdownList();
	}




	@Then("User click on edit details in actions filed")
	public void user_click_on_edit_details_in_actions_filed() {
		SupplierTeamListPage.EditDetailsclick();
	}





}
