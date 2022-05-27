package managers;

import org.openqa.selenium.WebDriver;

//import AdminInvoiceuploadpage;
import cucumber.TestContext;
import pageObjects.LogInPage;
import pageObjects.Newrecurringorderspage;
import pageObjects.Orchidpage;
import pageObjects.OrdersPage;
import pageObjects.OutletsPagesteps;
import pageObjects.PasswordResetPage;
import pageObjects.Reportspage;
import pageObjects.SucessfullyLoginpage;
import pageObjects.SupplierAddNewSkuPage;
import pageObjects.SupplierCatalogueListPage;
import pageObjects.SupplierCompanySettingsPage;
import pageObjects.SupplierCustomerCompanyPage;
import pageObjects.SupplierDirectoryProductPage;
import pageObjects.SupplierDirectorySettingPage;
import pageObjects.SupplierPaymentPlansPage;
import pageObjects.SupplierPaymentsTransactionPgae;
import pageObjects.SupplierReportAgeingPage;
import pageObjects.SupplierReportOutletPage;
import pageObjects.SupplierReportPlanningPage;
import pageObjects.SupplierReportSalesCustomerPage;
import pageObjects.SupplierReportSkuPage;
import pageObjects.SupplierTeamListPage;
import pageObjects.Suppliercustomerlocationlistingpage;
import pageObjects.Supplierdashboardpage;
import pageObjects.Supplierinvoicesaddcreditnotepage;
import pageObjects.Supplierinvoiceslistingpage;
import pageObjects.Supplierorderseinvoicepage;
import pageObjects.Supplierorderslistingpage;
import pageObjects.SupplierUserListPage;
import pageObjects.Userspage;
import stepDefinitions.AdminInvoiceuploadpageSteps;
import stepDefinitions.Adminbuyerlinktothecompany;
import stepDefinitions.AdminbuyersoutletpageSteps;
//import stepDefinitions.Adminsupplierspage;
import stepDefinitions.AdminsupplierspageSteps;
import stepDefinitions.Automationtesting;
import stepDefinitions.BuyerInventoryNewStockCount;
import stepDefinitions.Buyerinventoryoutletslisen;
import stepDefinitions.Buyerinvoicelisen;
//import stepDefinitions.Invoiceprocesspage;
import stepDefinitions.InvoiceprocesspageSteps;
import stepDefinitions.InvoicespageSteps;
import stepDefinitions.NewRecurrOrderspageSteps;
import stepDefinitions.Orchidpagesteps;
import stepDefinitions.Outletspagesteps;
import stepDefinitions.Reportspagesteps;
//import stepDefinitions.NewRecurringOrderspage;
import stepDefinitions.SucessfullyLoginPage;
import stepDefinitions.SupplierDirectoryProduct;
import stepDefinitions.UserspageSteps;
import pageObjects.AdminBuyersListingPage;
import pageObjects.AdminBuyerEditSettingsPage;
import pageObjects.AdminBuyerNewCompanypage;
import pageObjects.AdminBuyerViewSuppliersPage;
import pageObjects.AdminBuyersEditDetailsPage;
import pageObjects.AdminEssentialsPage;

import pageObjects.AdminInvoiceuploadpage;
import pageObjects.AdminNewEssentialsPage;
import pageObjects.AdminNewNotificationPage;
import pageObjects.AdminNotificationEditPage;
import pageObjects.AdminOrderDetailsPage;
import pageObjects.AdminOrderListingPage;
import pageObjects.AdminPromoCodeListingPage;
import pageObjects.AdminPromoCodePage;
import pageObjects.AdminPromotionListingPage;
import pageObjects.AdminPromotionNewDealPage;
import pageObjects.AdminReportsOutletspage;
import pageObjects.AdminReportsUserspage;
import pageObjects.AdminSupplierApplyOutletpage;
import pageObjects.AdminSupplierBuyerCompaniespage;
import pageObjects.AdminSupplierEditBlackoutpage;
import pageObjects.AdminSupplierEditCompanypage;
import pageObjects.AdminSupplierEditDefaultpage;
import pageObjects.AdminSupplierEditDirectorypage;
import pageObjects.AdminSupplierEditManageSettingpage;
import pageObjects.AdminSupplierSubscriptionInvoicepage;
import pageObjects.AdminSupplierTeamspage;
import pageObjects.Adminbuyerlinktothecompanypage;
import pageObjects.Adminbuyeroutletsubscriptionpage;
import pageObjects.Adminbuyersoutletpage;
import pageObjects.Admininvoiceprocesspage;
import pageObjects.Adminnewadminuserpage;
import pageObjects.Adminnewbuyeruserpage;
import pageObjects.Adminnewsupplieruserpage;
import pageObjects.Adminsupplierpage;
import pageObjects.Adminsuppliersviewoutletspage;
import pageObjects.Automationtestingpage;
import pageObjects.BuyerInventoryNewStockCountPage;
import pageObjects.BuyerInventoryTagpage;
import pageObjects.BuyerNewslistingpage;
import pageObjects.BuyerOrderDeliveryFilterpage;
import pageObjects.BuyerOutletApproverpage;
import pageObjects.BuyerRecipesListingPage;
//import pageObjects.BuyerPNF7797page;
import pageObjects.Buyerdashboardlisenpage;
import pageObjects.Buyeredituserlisenpage;
import pageObjects.BuyerinventorySKUlisenpage;
import pageObjects.Buyerinventoryactivitylisenpage;
import pageObjects.Buyerinventoryoutletslisenpage;
import pageObjects.Buyerinvoicelisenpage;
import pageObjects.Buyernewweeklyorderpage;
import pageObjects.Buyerorderslisenpage;
import pageObjects.Buyeroutletslistingpage;
import pageObjects.Buyeroutletsmanagedetailspage;
import pageObjects.Buyeroutletsmanagesettingspage;
import pageObjects.Buyeroutletsviewsupplierspage;
import pageObjects.Buyerpaymentspaymentplanspage;
import pageObjects.Buyerpaymentstransactonspage;
import pageObjects.Buyerreportinvoicevariancepage;
import pageObjects.Buyerreportpriceupdatespage;
import pageObjects.Buyerreportspenpercategorypage;
import pageObjects.Buyerreportspenperoutletpage;
import pageObjects.Buyerreportspenperskupage;
import pageObjects.Buyerreportspenpersupplierpage;
import pageObjects.Buyerreportspenpertagpage;
import pageObjects.Buyerusernamesettingspage;
import pageObjects.DashboardPage;
import pageObjects.InventoryPage;
import pageObjects.InvoiceprocessPage;
import pageObjects.InvoicesPage;
import pageObjects.AdminOrderDetailsPage;


public class PageObjectManager<admininvoiceuploadpageSteps> {
	private WebDriver driver; 

	private LogInPage logInPage1;
	private LogInPage logInPage2;
	private DashboardPage dashboardPage;
	private PasswordResetPage passwordResetPage;
	private OrdersPage ordersPage;
	private SucessfullyLoginpage sucessfullylogInpage;
	private Newrecurringorderspage newrecurringorderspageSteps;
	private InvoicesPage invoicespagesteps;
	private InvoiceprocessPage invoiceprocesspageSteps;
	private InventoryPage inventorypageSteps;
	private AdminInvoiceuploadpage admininvoiceuploadpageSteps;
	private Admininvoiceprocesspage admininvoiceprocesspageSteps;;
	private Adminbuyersoutletpage adminbuyersoutletpageSteps;;
	private Adminnewbuyeruserpage adminnewbuyeruserpageSteps;
	private Adminsupplierpage adminsupplierspageSteps;
	private Adminnewsupplieruserpage adminnewsupplieruserpagesteps;
	private Adminnewadminuserpage adminnewadminuserpagesteps;
	private Adminsuppliersviewoutletspage adminsuppliersviewoutletspagesteps;
	private Orchidpage orchidpagesteps;
	private Adminbuyeroutletsubscriptionpage adminbuyersoutletsubscriptionpageSteps;
	private OutletsPagesteps outletsPagesteps;
	private Reportspage reportspage;
	private Adminbuyerlinktothecompanypage adminbuyerlinktothecompany;
	private Object userspage;
	private Automationtestingpage automationtesting;
	private Buyerinvoicelisenpage buyerinvoicelisen;
	private Buyerinventoryoutletslisenpage Buyerinventoryoutletslisen;
	private BuyerinventorySKUlisenpage BuyerinventorySKUlisen;
	private Buyerdashboardlisenpage Buyerdashboardlisen;
	private Buyerinventoryactivitylisenpage Buyerinventoryactivitylisen;
	private Buyeroutletsmanagedetailspage Buyeroutletsmanagedetails;
	private Buyeroutletsmanagesettingspage Buyeroutletsmanagesettings;
	private Buyeroutletsviewsupplierspage Buyeroutletsviewsuppliers;
	private Buyerreportspenperoutletpage Buyerreportspenperoutlet;
	private Buyerreportspenpersupplierpage Buyerreportspenpersupplier;
	private Buyerreportspenperskupage Buyerreportspenpersku;
	private Buyerreportspenpercategorypage Buyerreportspenpercategory;
	private Buyerreportspenpertagpage Buyerreportspenpertag;
	private Buyerreportinvoicevariancepage Buyerreportinvoicevariance;
	private Buyerreportpriceupdatespage Buyerreportpriceupdates;
	private Buyerpaymentstransactonspage Buyerpaymentstransactons;
	private Buyerpaymentspaymentplanspage Buyerpaymentspaymentplans;
	private Buyeredituserlisenpage Buyeredituserlisen;
	private Buyerorderslisenpage Buyerorderslisen;
	private Buyerusernamesettingspage Buyerusernamesettings;
	private BuyerRecipesListingPage BuyerRecipesListing;
	private BuyerInventoryNewStockCountPage BuyerInventoryNewStockCount;



	private LogInPage LogInPage3;
	private Suppliercustomerlocationlistingpage Suppliercustomerlocationlisting;
	private Buyeroutletslistingpage Buyeroutletslisting;
	private Buyernewweeklyorderpage Buyernewweeklyorder;
	private BuyerNewslistingpage BuyerNewslisting;
    private Supplierdashboardpage Supplierdashboard; 
    private Supplierorderslistingpage Supplierorderslisting;
    private Supplierorderseinvoicepage Supplierorderseinvoice;
    private Supplierinvoiceslistingpage Supplierinvoiceslisting;
    private Supplierinvoicesaddcreditnotepage Supplierinvoicesaddcreditnote;
    private SupplierUserListPage Supplierusersscreenlisting;
    private SupplierUserListPage SupplierUserList;
    private SupplierTeamListPage SupplierTeamList;
    private SupplierCustomerCompanyPage SupplierCustomerCompany;
    private SupplierCatalogueListPage SupplierCatalogueList;
    private SupplierAddNewSkuPage SupplierAddNewSku;
    private SupplierDirectoryProductPage supplierdirectoryproduct;
    private SupplierReportSalesCustomerPage SupplierReportSalesCustomer;

    private SupplierDirectorySettingPage supplierdirectorysetting;

    private SupplierReportOutletPage SupplierReportOutlet;
    private SupplierReportSkuPage SupplierReportSku;
    private SupplierPaymentsTransactionPgae SupplierPaymentsTransaction;
    private SupplierReportPlanningPage SupplierReportPlanning;
    private SupplierReportAgeingPage SupplierReportAgeing;
    private SupplierPaymentPlansPage SupplierPaymentPlans;
    private SupplierCompanySettingsPage SupplierCompanySettings;
    private BuyerOrderDeliveryFilterpage BuyerOrderDeliveryFilter;
    private BuyerInventoryTagpage BuyerInventoryTag;
    private AdminOrderListingPage AdminOrderListing;
    private AdminOrderDetailsPage AdminOrderDetails;
    private AdminPromotionListingPage AdminPromotionListing;
    private AdminPromotionNewDealPage AdminPromotionNewDeal;
    private AdminPromoCodePage AdminPromoCode;
    private AdminReportsOutletspage AdminReportsOutlets;
    private AdminReportsUserspage AdminReportsUsers;
    private AdminBuyerNewCompanypage AdminBuyerNewCompany;
    private AdminPromoCodeListingPage AdminPromoCodeListing;
    private AdminEssentialsPage AdminEssentials;
    private AdminSupplierEditCompanypage AdminSupplierEditCompany;
    private AdminSupplierEditDefaultpage AdminSupplierEditDefault;
    private AdminNewEssentialsPage AdminNewEssentials;
    private AdminSupplierEditBlackoutpage AdminSupplierEditBlackout;
    private AdminSupplierEditDirectorypage AdminSupplierEditDirectory;
    private AdminSupplierEditManageSettingpage AdminSupplierEditManageSetting;
    private AdminSupplierTeamspage AdminSupplierTeams;
    private AdminSupplierBuyerCompaniespage AdminSupplierBuyerCompanies;
    private AdminBuyersListingPage AdminBuyersListing;
    private AdminBuyersEditDetailsPage AdminBuyersEditDetails;

    private AdminSupplierSubscriptionInvoicepage AdminSupplierSubscriptionInvoice;
    private AdminBuyerEditSettingsPage AdminBuyerEditSettings;
    private AdminBuyerViewSuppliersPage AdminBuyerViewSuppliers;
    private AdminNotificationEditPage AdminNotificationEdit;
    private AdminNewNotificationPage AdminNewNotification;



    private AdminSupplierApplyOutletpage AdminSupplierApplyOutlet;
    private BuyerOutletApproverpage BuyerOutletApprover;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}


	public LogInPage getLogInPage1() {
		return (logInPage1 == null) ? logInPage1 = new LogInPage(driver) : logInPage1;
	}

	public PasswordResetPage getPasswordResetPage() {
		return (passwordResetPage == null) ? passwordResetPage = new PasswordResetPage(driver) : passwordResetPage;
	}

	public DashboardPage getDashboardPage() {
		return (dashboardPage == null) ? dashboardPage = new DashboardPage(driver) : dashboardPage;
	}




	public OrdersPage getOrdersPage() {
		return (ordersPage == null) ? ordersPage = new OrdersPage(driver) : ordersPage;
	}
	public SucessfullyLoginpage getSucessfullyLoginPage() {
		return (sucessfullylogInpage == null) ? sucessfullylogInpage = new SucessfullyLoginpage(driver) : sucessfullylogInpage;
	}

	/*public Object getNewRecurringOrderspage() {
		return (newrecurringorderspage == null) ? newrecurringorderspage = new Newrecurringorderspage(driver) : newrecurringorderspage;
	}*/

	public Object getInvoicesPage() {
		return (invoicespagesteps == null) ? invoicespagesteps = new InvoicesPage(driver) : invoicespagesteps;
	}

	public Object getUsersPage() {
		return (userspage == null) ? (Object) (userspage = new Userspage(driver)) : userspage; 
	}

	public Object getInvoiceprocesspage() {
		return (invoiceprocesspageSteps == null) ? invoiceprocesspageSteps = new InvoiceprocessPage(driver) :invoiceprocesspageSteps ;
	}

	public Object getInventoryPage() {
		return (inventorypageSteps == null) ? inventorypageSteps = new InventoryPage(driver) :invoiceprocesspageSteps ;
	}

	public Object getNewRecurringOrderspageSteps() {
		return (newrecurringorderspageSteps == null) ?  newrecurringorderspageSteps= new Newrecurringorderspage(driver) : newrecurringorderspageSteps; 
	}

	public Object getAdminInvoiceuploadpageSteps() {
		return (admininvoiceuploadpageSteps == null) ? (Object) (admininvoiceuploadpageSteps = new AdminInvoiceuploadpage(driver)) : admininvoiceuploadpageSteps; 
	}

	public Admininvoiceprocesspage getAdmininvoiceprocesspageSteps() {
		return (admininvoiceprocesspageSteps == null) ?  (admininvoiceprocesspageSteps = new Admininvoiceprocesspage(driver)) : admininvoiceprocesspageSteps;
	}

	public Adminbuyersoutletpage getAdminbuyersoutletpageSteps() {
		return (adminbuyersoutletpageSteps == null) ?  (adminbuyersoutletpageSteps = new Adminbuyersoutletpage(driver)) : adminbuyersoutletpageSteps;
	}

	public Adminnewbuyeruserpage getAdminnewbuyeruserpageSteps() {

		return (adminnewbuyeruserpageSteps == null) ?  (adminnewbuyeruserpageSteps = new Adminnewbuyeruserpage(driver)) : adminnewbuyeruserpageSteps;

	}

	public Adminsupplierpage getAdminsupplierspageSteps() {

		return (adminsupplierspageSteps == null) ?  (adminsupplierspageSteps = new Adminsupplierpage(driver)) : adminsupplierspageSteps;

	}

	public Adminnewsupplieruserpage getAdminnewsupplieruserpagesteps() {
		return (adminnewsupplieruserpagesteps == null) ?  (adminnewsupplieruserpagesteps = new Adminnewsupplieruserpage(driver)) : adminnewsupplieruserpagesteps;


	}

	public Adminnewadminuserpage getAdminnewadminuserpagesteps() {
		return (adminnewadminuserpagesteps == null) ?  (adminnewadminuserpagesteps = new Adminnewadminuserpage(driver)) : adminnewadminuserpagesteps;

	}

	public Adminsuppliersviewoutletspage getAdminsuppliersviewoutletspage() {
		return (adminsuppliersviewoutletspagesteps == null) ?  (adminsuppliersviewoutletspagesteps = new Adminsuppliersviewoutletspage(driver)) : adminsuppliersviewoutletspagesteps;

	}


	public Orchidpage getOrchidpagesteps() {
		return (orchidpagesteps == null) ?  (orchidpagesteps = new Orchidpage(driver)) : orchidpagesteps;

	}

	public Object getLogInPage2() {
		return (logInPage2 == null) ? logInPage2 = new LogInPage(driver) : logInPage2;
	}


	public Adminbuyeroutletsubscriptionpage getAdminbuyersoutletsubscriptionpageSteps() {
		return (adminbuyersoutletsubscriptionpageSteps == null) ?  (adminbuyersoutletsubscriptionpageSteps = new Adminbuyeroutletsubscriptionpage(driver)) : adminbuyersoutletsubscriptionpageSteps;

	}


	public Object getOutletspage() {

		return (outletsPagesteps==null) ? (outletsPagesteps=new OutletsPagesteps(driver)) : outletsPagesteps; 
	}


	public Object getReportspage() {
		return (reportspage==null) ? (reportspage=new Reportspage(driver)) : reportspage; 
	}


	public Object getAdminbuyerlinktothecompany() {
		return (adminbuyerlinktothecompany == null) ?  (adminbuyerlinktothecompany = new Adminbuyerlinktothecompanypage(driver)) : adminbuyerlinktothecompany;
	}



	public Automationtestingpage getAutomationtestingpage() {
		return (automationtesting == null) ? (automationtesting = new Automationtestingpage(driver)) : automationtesting;
	}


	public Buyerinvoicelisenpage getBuyerinvoicelisen() {
		return (buyerinvoicelisen == null) ? (buyerinvoicelisen = new Buyerinvoicelisenpage(driver)) : buyerinvoicelisen;
	}


	public Buyerinventoryoutletslisenpage getBuyerinventoryoutletslisenpage() {
		return (Buyerinventoryoutletslisen == null) ? (Buyerinventoryoutletslisen = new Buyerinventoryoutletslisenpage(driver)) : Buyerinventoryoutletslisen;
	}


	public BuyerinventorySKUlisenpage getBuyerinventorySKUlisenpage() {
		return (BuyerinventorySKUlisen == null) ? (BuyerinventorySKUlisen = new BuyerinventorySKUlisenpage(driver)) : BuyerinventorySKUlisen;
	}


	public Buyerdashboardlisenpage getBuyerdashboardlisenpage() {
		return (Buyerdashboardlisen == null) ? (Buyerdashboardlisen = new Buyerdashboardlisenpage(driver)) : Buyerdashboardlisen;

	} 


	public Buyerinventoryactivitylisenpage getBuyerinventoryactivitylisenpage() {
		return (Buyerinventoryactivitylisen == null) ? (Buyerinventoryactivitylisen = new Buyerinventoryactivitylisenpage(driver)) : Buyerinventoryactivitylisen;
	}


	public Buyeroutletsmanagedetailspage getBuyeroutletsmanagedetailspage() {
		return (Buyeroutletsmanagedetails == null) ? (Buyeroutletsmanagedetails = new Buyeroutletsmanagedetailspage(driver)) : Buyeroutletsmanagedetails;
	}


	public Buyeroutletsmanagesettingspage getBuyeroutletsmanagesettingspage() {
		return (Buyeroutletsmanagesettings == null) ? (Buyeroutletsmanagesettings = new Buyeroutletsmanagesettingspage(driver)) : Buyeroutletsmanagesettings;
	}


	public Buyeroutletsviewsupplierspage getBuyeroutletsviewsupplierspage() {
		return (Buyeroutletsviewsuppliers == null) ? (Buyeroutletsviewsuppliers = new Buyeroutletsviewsupplierspage(driver)) : Buyeroutletsviewsuppliers;
	}


	public Buyerreportspenperoutletpage getBuyerreportspenperoutletpage() {
		return (Buyerreportspenperoutlet == null) ? (Buyerreportspenperoutlet = new Buyerreportspenperoutletpage(driver)) : Buyerreportspenperoutlet;
	}


	public Buyerreportspenpersupplierpage getBuyerreportspenpersupplierpage() {
		return (Buyerreportspenpersupplier == null) ? (Buyerreportspenpersupplier = new Buyerreportspenpersupplierpage(driver)) : Buyerreportspenpersupplier;
	}


	public Buyerreportspenperskupage getbuyerreportspenpersku() {
		return (Buyerreportspenpersku == null) ? (Buyerreportspenpersku = new Buyerreportspenperskupage(driver)) : Buyerreportspenpersku;
	}


	public Buyerreportspenpercategorypage getBuyerreportspenpercategorypage() {
		return (Buyerreportspenpercategory == null) ? (Buyerreportspenpercategory = new Buyerreportspenpercategorypage(driver)) : Buyerreportspenpercategory;
	}


	public Buyerreportspenpertagpage getBuyerreportspenpertagpage() {
		return (Buyerreportspenpertag == null) ? (Buyerreportspenpertag = new Buyerreportspenpertagpage(driver)) : Buyerreportspenpertag;
	}


	public Buyerreportinvoicevariancepage getBuyerreportinvoicevariancepage() {
		return (Buyerreportinvoicevariance == null) ? (Buyerreportinvoicevariance = new Buyerreportinvoicevariancepage(driver)) : Buyerreportinvoicevariance;
	}

	public Buyerreportpriceupdatespage getBuyerreportpriceupdatespage() {
		return (Buyerreportpriceupdates == null) ? (Buyerreportpriceupdates = new Buyerreportpriceupdatespage(driver)) : Buyerreportpriceupdates;
	}


	public Buyerpaymentstransactonspage getBuyerpaymentstransactonspage() {
		return (Buyerpaymentstransactons == null) ? (Buyerpaymentstransactons = new Buyerpaymentstransactonspage(driver)) : Buyerpaymentstransactons;
	}


	public Buyerpaymentspaymentplanspage getBuyerpaymentspaymentplanspage() {
		return (Buyerpaymentspaymentplans == null) ? (Buyerpaymentspaymentplans = new Buyerpaymentspaymentplanspage(driver)) : Buyerpaymentspaymentplans;
	}


	public Buyeredituserlisenpage getBuyeredituserlisenpage() {
		return (Buyeredituserlisen == null) ? (Buyeredituserlisen = new Buyeredituserlisenpage(driver)) : Buyeredituserlisen;
	}


	public Buyerorderslisenpage getBuyerorderslisenpage() {
		return (Buyerorderslisen == null) ? (Buyerorderslisen = new Buyerorderslisenpage(driver)) : Buyerorderslisen;
	}


	public Buyerusernamesettingspage getBuyerusernamesettingspage() {
		return (Buyerusernamesettings == null) ? (Buyerusernamesettings = new Buyerusernamesettingspage(driver)) : Buyerusernamesettings;
	}


	public LogInPage getLogInPage3() {
		return (LogInPage3 == null) ? (LogInPage3 = new LogInPage(driver)) : LogInPage3;
	}


	public Suppliercustomerlocationlistingpage getSuppliercustomerlocationlistingpage() {
		return (Suppliercustomerlocationlisting == null) ? (Suppliercustomerlocationlisting = new Suppliercustomerlocationlistingpage(driver)) : Suppliercustomerlocationlisting;
	}


	public Buyeroutletslistingpage getBuyeroutletslistingpage() {
		return (Buyeroutletslisting == null) ? (Buyeroutletslisting = new Buyeroutletslistingpage(driver)) : Buyeroutletslisting;
	}


	public Buyernewweeklyorderpage getBuyernewweeklyorderpage() {
		return (Buyernewweeklyorder == null) ? (Buyernewweeklyorder = new Buyernewweeklyorderpage(driver)) : Buyernewweeklyorder;
	}


	public BuyerNewslistingpage getBuyerNewslistingpage() {
		return (BuyerNewslisting == null) ? (BuyerNewslisting = new BuyerNewslistingpage(driver)) : BuyerNewslisting;

	}


	public Supplierdashboardpage getSupplierdashboardpage() {
		return (Supplierdashboard == null) ? (Supplierdashboard = new Supplierdashboardpage(driver)) : Supplierdashboard;

	}


	public Supplierorderslistingpage getSupplierorderslistingpage() {
		return (Supplierorderslisting == null) ? (Supplierorderslisting = new Supplierorderslistingpage(driver)) : Supplierorderslisting;

	}


	public Supplierorderseinvoicepage getSupplierorderseinvoicepage() {
		return (Supplierorderseinvoice == null) ? (Supplierorderseinvoice = new Supplierorderseinvoicepage(driver)) : Supplierorderseinvoice;

	}


	public Supplierinvoiceslistingpage getSupplierinvoiceslistingpage() {
		return (Supplierinvoiceslisting == null) ? (Supplierinvoiceslisting = new Supplierinvoiceslistingpage(driver)) : Supplierinvoiceslisting;

	}


	public Supplierinvoicesaddcreditnotepage getSupplierinvoicesaddcreditnotepage() {
		return (Supplierinvoicesaddcreditnote == null) ? (Supplierinvoicesaddcreditnote = new Supplierinvoicesaddcreditnotepage(driver)) : Supplierinvoicesaddcreditnote;

	}


	public SupplierUserListPage getSupplierusersscreenlistingpage() {
		return (Supplierusersscreenlisting == null) ? (Supplierusersscreenlisting = new SupplierUserListPage(driver)) : Supplierusersscreenlisting;

	}


	public SupplierUserListPage getSupplierUserListPage() {
		return (SupplierUserList == null) ? (SupplierUserList = new SupplierUserListPage(driver)) : SupplierUserList;

	}


	public SupplierTeamListPage getSupplierTeamListPage() {
		return (SupplierTeamList == null) ? (SupplierTeamList = new SupplierTeamListPage(driver)) : SupplierTeamList;

	}
	
	
	
	
	 public SupplierCustomerCompanyPage getSupplierCustomerCompanyPage() {
			return (SupplierCustomerCompany == null) ? (SupplierCustomerCompany = new SupplierCustomerCompanyPage(driver)) : SupplierCustomerCompany;

		}


	public SupplierCatalogueListPage getSupplierCatalogueListPage() {
		return (SupplierCatalogueList == null) ? (SupplierCatalogueList = new SupplierCatalogueListPage(driver)) : SupplierCatalogueList;

	}


	public SupplierAddNewSkuPage getSupplierAddNewSkuPage() {
		return (SupplierAddNewSku == null) ? (SupplierAddNewSku = new SupplierAddNewSkuPage(driver)) : SupplierAddNewSku;

	}


	public SupplierDirectoryProductPage getSupplierDirectoryProductPage() {
		return (supplierdirectoryproduct == null) ? (supplierdirectoryproduct = new SupplierDirectoryProductPage(driver)) : supplierdirectoryproduct;
	}

	public SupplierReportOutletPage getSupplierReportOutletPage() {
		return (SupplierReportOutlet == null) ? (SupplierReportOutlet = new SupplierReportOutletPage(driver)) : SupplierReportOutlet;

	}



	public SupplierReportSkuPage getSupplierReportSkuPage() {
		return (SupplierReportSku == null) ? (SupplierReportSku = new SupplierReportSkuPage(driver)) : SupplierReportSku;

	}



	public SupplierPaymentsTransactionPgae getSupplierPaymentsTransactionPgae() {
		return (SupplierPaymentsTransaction == null) ? (SupplierPaymentsTransaction = new SupplierPaymentsTransactionPgae(driver)) : SupplierPaymentsTransaction;

	}
	

	public SupplierReportPlanningPage getSupplierReportPlanningPage() {
		return (SupplierReportPlanning == null) ? (SupplierReportPlanning = new SupplierReportPlanningPage(driver)) : SupplierReportPlanning;

	}


	public SupplierReportAgeingPage getSupplierReportAgeingPage() {
		return (SupplierReportAgeing == null) ? (SupplierReportAgeing = new SupplierReportAgeingPage(driver)) : SupplierReportAgeing;

	}


	public SupplierPaymentPlansPage getSupplierPaymentPlansPage() {
		return (SupplierPaymentPlans == null) ? (SupplierPaymentPlans = new SupplierPaymentPlansPage(driver)) : SupplierPaymentPlans;

	}


	public SupplierCompanySettingsPage getSupplierCompanySettingsPage() {
		return (SupplierCompanySettings == null) ? (SupplierCompanySettings = new SupplierCompanySettingsPage(driver)) : SupplierCompanySettings;

	}




	public SupplierDirectorySettingPage getSupplierDirectorySettingPage() {
		return (supplierdirectorysetting == null) ? (supplierdirectorysetting = new SupplierDirectorySettingPage(driver)) : supplierdirectorysetting;
	
	}


	public BuyerOrderDeliveryFilterpage getBuyerOrderDeliveryFilterpage() {
		return (BuyerOrderDeliveryFilter == null) ? (BuyerOrderDeliveryFilter = new BuyerOrderDeliveryFilterpage(driver)) : BuyerOrderDeliveryFilter;
		

	}


	public BuyerInventoryTagpage getBuyerInventoryTagpage() {
		return (BuyerInventoryTag == null) ? (BuyerInventoryTag = new BuyerInventoryTagpage(driver)) : BuyerInventoryTag;
		

	}


	public AdminOrderListingPage getAdminOrderListingPage() {
		return (AdminOrderListing == null) ? (AdminOrderListing = new AdminOrderListingPage(driver)) : AdminOrderListing;
	}


	public AdminOrderDetailsPage getAdminOrderDetailsPage() {
		return (AdminOrderDetails == null) ? (AdminOrderDetails = new AdminOrderDetailsPage(driver)) : AdminOrderDetails;
	}


	public AdminPromotionListingPage getAdminPromotionListingPage() {
		return (AdminPromotionListing == null) ? (AdminPromotionListing = new AdminPromotionListingPage(driver)) : AdminPromotionListing;
	}


	public AdminPromotionNewDealPage getAdminPromotionNewDealPage() {
		return (AdminPromotionNewDeal == null) ? (AdminPromotionNewDeal = new AdminPromotionNewDealPage(driver)) : AdminPromotionNewDeal;
	}

	public AdminReportsOutletspage getAdminReportsOutletspage() {
		return (AdminReportsOutlets == null) ? (AdminReportsOutlets = new AdminReportsOutletspage(driver)) : AdminReportsOutlets;
	}


	public AdminReportsUserspage getAdminReportsUserspage() {
		return (AdminReportsUsers == null) ? (AdminReportsUsers = new AdminReportsUserspage(driver)) : AdminReportsUsers;

	}


	public AdminPromoCodePage getAdminPromoCodePage() {
		return (AdminPromoCode == null) ? (AdminPromoCode = new AdminPromoCodePage(driver)) : AdminPromoCode;

	}



	public AdminBuyerNewCompanypage getAdminBuyerNewCompanypage() {
		return (AdminBuyerNewCompany == null) ? (AdminBuyerNewCompany = new AdminBuyerNewCompanypage(driver)) : AdminBuyerNewCompany;

	}



	public AdminPromoCodeListingPage getAdminPromoCodeListingPage() {
		return (AdminPromoCodeListing == null) ? (AdminPromoCodeListing = new AdminPromoCodeListingPage(driver)) : AdminPromoCodeListing;
	}

	
	public AdminEssentialsPage getAdminEssentialsPage() {
		return (AdminEssentials == null) ? (AdminEssentials = new AdminEssentialsPage(driver)) : AdminEssentials;
	}

	public AdminSupplierEditCompanypage getAdminSupplierEditCompanypage() {
		return (AdminSupplierEditCompany == null) ? (AdminSupplierEditCompany = new AdminSupplierEditCompanypage(driver)) : AdminSupplierEditCompany;

	}


	public AdminSupplierEditDefaultpage getAdminSupplierEditDefaultpage() {
		return (AdminSupplierEditDefault == null) ? (AdminSupplierEditDefault = new AdminSupplierEditDefaultpage(driver)) : AdminSupplierEditDefault;

	}

	public AdminNewEssentialsPage getAdminNewEssentialsPage() {
		return (AdminNewEssentials == null) ? (AdminNewEssentials = new AdminNewEssentialsPage(driver)) : AdminNewEssentials;
	}
	
	public AdminSupplierEditBlackoutpage getAdminSupplierEditBlackoutpage() {
		return (AdminSupplierEditBlackout == null) ? (AdminSupplierEditBlackout = new AdminSupplierEditBlackoutpage(driver)) : AdminSupplierEditBlackout;

	}


	public AdminSupplierEditDirectorypage getAdminSupplierEditDirectorypage() {
		return (AdminSupplierEditDirectory == null) ? (AdminSupplierEditDirectory = new AdminSupplierEditDirectorypage(driver)) : AdminSupplierEditDirectory;

	}


	public AdminSupplierEditManageSettingpage getAdminSupplierEditManageSettingpage() {
		return (AdminSupplierEditManageSetting == null) ? (AdminSupplierEditManageSetting = new AdminSupplierEditManageSettingpage(driver)) : AdminSupplierEditManageSetting;

	}

	public AdminSupplierTeamspage getAdminSupplierTeamspage() {
		return (AdminSupplierTeams == null) ? (AdminSupplierTeams = new AdminSupplierTeamspage(driver)) : AdminSupplierTeams;

	}



	public AdminSupplierBuyerCompaniespage getAdminSupplierBuyerCompaniespage() {
		return (AdminSupplierBuyerCompanies == null) ? (AdminSupplierBuyerCompanies = new AdminSupplierBuyerCompaniespage(driver)) : AdminSupplierBuyerCompanies;

	}
	
	public AdminBuyersListingPage getAdminBuyersListingPage() {
		return (AdminBuyersListing == null) ? (AdminBuyersListing = new AdminBuyersListingPage(driver)) : AdminBuyersListing;

	}


	public AdminBuyersEditDetailsPage getAdminBuyersEditDetailsPage() {
		return (AdminBuyersEditDetails == null) ? (AdminBuyersEditDetails = new AdminBuyersEditDetailsPage(driver)) : AdminBuyersEditDetails;
	}



	public AdminSupplierSubscriptionInvoicepage getAdminSupplierSubscriptionInvoicepage() {
		return (AdminSupplierSubscriptionInvoice == null) ? (AdminSupplierSubscriptionInvoice = new AdminSupplierSubscriptionInvoicepage(driver)) : AdminSupplierSubscriptionInvoice;
	}


	public AdminBuyerEditSettingsPage getAdminBuyerEditSettingsPage() {
		return (AdminBuyerEditSettings == null) ? (AdminBuyerEditSettings = new AdminBuyerEditSettingsPage(driver)) : AdminBuyerEditSettings;
	}


	public AdminBuyerViewSuppliersPage getAdminBuyerViewSuppliersPage() {
		return (AdminBuyerViewSuppliers == null) ? (AdminBuyerViewSuppliers = new AdminBuyerViewSuppliersPage(driver)) : AdminBuyerViewSuppliers;
	}


	public AdminNotificationEditPage getAdminNotificationEditPage() {
		return (AdminNotificationEdit == null) ? (AdminNotificationEdit = new AdminNotificationEditPage(driver)) : AdminNotificationEdit;
	}


	public AdminNewNotificationPage getAdminNewNotificationPage() {
		return (AdminNewNotification == null) ? (AdminNewNotification = new AdminNewNotificationPage(driver)) : AdminNewNotification;
	}


	public AdminSupplierApplyOutletpage getAdminSupplierApplyOutletpage() {
		return (AdminSupplierApplyOutlet == null) ? (AdminSupplierApplyOutlet = new AdminSupplierApplyOutletpage(driver)) : AdminSupplierApplyOutlet;
	}


	public BuyerOutletApproverpage getBuyerOutletApproverpage() {
		return (BuyerOutletApprover == null) ? (BuyerOutletApprover = new BuyerOutletApproverpage(driver)) : BuyerOutletApprover;
	}


	public BuyerRecipesListingPage getBuyerRecipesListingpage() {
		return (BuyerRecipesListing == null) ? (BuyerRecipesListing = new BuyerRecipesListingPage(driver)) : BuyerRecipesListing;

	}



	public SupplierReportSalesCustomerPage getSupplierReportSalesCustomerPage() {
		return (SupplierReportSalesCustomer == null) ? (SupplierReportSalesCustomer = new SupplierReportSalesCustomerPage(driver)) : SupplierReportSalesCustomer;
	}

	public BuyerInventoryNewStockCountPage getBuyerInventoryNewStockCount() {
		return (BuyerInventoryNewStockCount == null) ? (BuyerInventoryNewStockCount = new BuyerInventoryNewStockCountPage(driver)) : BuyerInventoryNewStockCount;
		
}
	

	

	
	}


