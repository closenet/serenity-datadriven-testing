package page;

  import net.serenitybdd.core.annotations.findby.FindBy;
  import net.serenitybdd.core.pages.PageObject;
  import net.serenitybdd.core.pages.WebElementFacade;
  import net.thucydides.core.annotations.DefaultUrl;
  import net.serenitybdd.core.annotations.findby.FindBy;



@DefaultUrl("http://mariopdv.sns.sky.com/mario/availability")
public class marioE05Page extends PageObject {

    @FindBy(id = "directoryNumber")
    private WebElementFacade DnLocator;

    @FindBy(id = "uan")
    public WebElementFacade UanLocator;

    @FindBy(id = "rural-checkbox")
    private WebElementFacade ruralRadioBtn;
    @FindBy(id = "urban-checkbox")
    private WebElementFacade urbanRadioBtn;

    @FindBy(id = "fibre-checkbox")
    private WebElementFacade fibreRadioBtn;

    @FindBy(name = "submitButton")
    private WebElementFacade SubmitBtn;


    // locate the UAN
    public void inputUanItem(String UAN)
    {
        UanLocator.type(UAN);
    }

    //locate the DN
    public void inputDnItem(String DN) {
        DnLocator.type(DN);
    }


    // locate the the Broadband type Radio buttons

    public void clickRequiredBroadband(String rural, String urban, String fibre) {
        if (rural.equals("x"))
            ruralRadioBtn.click();

        if (urban.equals("x"))
            urbanRadioBtn.click();

        if (fibre.equals("x"))
            fibreRadioBtn.click();
    }

    public void clickSubmit() {
        SubmitBtn.click();
    }

}



