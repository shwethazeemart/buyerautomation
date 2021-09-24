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

import pageObjects.SupplierPNF7857page;

import pageObjects.SupplierPNF7855page;

import pageObjects.SupplierPNF7856page;

import pageObjects.SupplierPNF7858page;
import pageObjects.Userspage;
import stepDefinitions.AdminInvoiceuploadpageSteps;
import stepDefinitions.Adminbuyerlinktothecompany;
import stepDefinitions.AdminbuyersoutletpageSteps;
//import stepDefinitions.Adminsupplierspage;
import stepDefinitions.AdminsupplierspageSteps;
import stepDefinitions.Automationtesting;
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
import stepDefinitions.UserspageSteps;
import pageObjects.AdminInvoiceuploadpage;
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
import pageObjects.BuyerPNF7797page;
import pageObjects.Buyerdashboardlisenpage;
import pageObjects.Buyeredituserlisenpage;
import pageObjects.BuyerinventorySKUlisenpage;
import pageObjects.Buyerinventoryactivitylisenpage;
import pageObjects.Buyerinventoryoutletslisenpage;
import pageObjects.Buyerinvoicelisenpage;
import pageObjects.Buyerorderslisenpage;
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
    private BuyerPNF7797page BuyerPNF7797;
    private SupplierPNF7858page SupplierPNF7858;
    private LogInPage LogInPage3;


    private SupplierPNF7857page SupplierPNF7857;

    private SupplierPNF7855page SupplierPNF7855;


    private SupplierPNF7856page SupplierPNF7856;

    
    
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


	public BuyerPNF7797page getBuyerBuyerPNF7797page() {
		return (BuyerPNF7797 == null) ? (BuyerPNF7797 = new BuyerPNF7797page(driver)) : BuyerPNF7797;
	}




	public SupplierPNF7858page getSupplierPNF7858page() {
		return (SupplierPNF7858 == null) ? (SupplierPNF7858 = new SupplierPNF7858page(driver)) : SupplierPNF7858;
	}


	public LogInPage getLogInPage3() {
		return (LogInPage3 == null) ? (LogInPage3 = new LogInPage(driver)) : LogInPage3;
	}




	public SupplierPNF7857page getSupplierPNF7857page() {
		return (SupplierPNF7857 == null) ? (SupplierPNF7857 = new SupplierPNF7857page(driver)) : SupplierPNF7857;
	}
  
	public SupplierPNF7855page getSupplierPNF7855page() {
		return (SupplierPNF7855 == null) ? (SupplierPNF7855 = new SupplierPNF7855page(driver)) : SupplierPNF7855;

	}
	
	
	
	
	
	
	
	
	

	public SupplierPNF7856page getSupplierPNF7856page() {
		return (SupplierPNF7856 == null) ? (SupplierPNF7856 = new SupplierPNF7856page(driver)) : SupplierPNF7856;
	}

	
	
	
	
	}


	
	

	
	 
	
	
	
	



	
	

