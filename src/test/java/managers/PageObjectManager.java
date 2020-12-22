package managers;

import org.openqa.selenium.WebDriver;

//import AdminInvoiceuploadpage;
import cucumber.TestContext;
import pageObjects.LogInPage;
import pageObjects.Newrecurringorderspage;
import pageObjects.Orchidpage;
import pageObjects.OrdersPage;
import pageObjects.PasswordResetPage;
import pageObjects.SucessfullyLoginpage;
import pageObjects.Userspage;
import stepDefinitions.AdminInvoiceuploadpageSteps;
//import stepDefinitions.Adminsupplierspage;
import stepDefinitions.AdminsupplierspageSteps;
//import stepDefinitions.Invoiceprocesspage;
import stepDefinitions.InvoiceprocesspageSteps;
import stepDefinitions.InvoicespageSteps;
import stepDefinitions.NewRecurrOrderspageSteps;
//import stepDefinitions.NewRecurringOrderspage;
import stepDefinitions.SucessfullyLoginPage;
import stepDefinitions.UserspageSteps;
import pageObjects.AdminInvoiceuploadpage;
import pageObjects.Adminbuyersoutletpage;
import pageObjects.Admininvoiceprocesspage;
import pageObjects.Adminnewadminuserpage;
import pageObjects.Adminnewbuyeruserpage;
import pageObjects.Adminnewsupplieruserpage;
import pageObjects.Adminsupplierpage;
import pageObjects.Adminsuppliersviewoutletspage;
import pageObjects.DashboardPage;
import pageObjects.InventoryPage;
import pageObjects.InvoiceprocessPage;
import pageObjects.InvoicesPage;

/**
 * 
 * @author AjanthanSivalingarajah
 * @param <admininvoiceuploadpageSteps>
 * @since 2020/05/12
 *
 */
public class PageObjectManager<admininvoiceuploadpageSteps> {
    private WebDriver driver; 

    private LogInPage logInPage;
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


	private Object userspage;
    

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public LogInPage getLogInPage() {
        return (logInPage == null) ? logInPage = new LogInPage(driver) : logInPage;
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
	

 
 
	
	
	
	
	
	
	
	
	
}
