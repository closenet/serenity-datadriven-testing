package page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.ui.Duration;

import java.util.concurrent.TimeUnit;

/**
 * Created by mal89 on 14/02/2018.
 */

@DefaultUrl("http://mariopdv.sns.sky.com/mario/#/availabilitycheck")
public class marioTdmPage extends PageObject {


        @FindBy(name="eircode")
        private WebElementFacade eircodeBox;

        @FindBy(css="#eircodeHeader > h5 > a")
        private WebElementFacade collapseEircode;

        @FindBy(css="#dnAndUanHeader > h5 > a")
        private  WebElementFacade collapseUanDn;

        @FindBy(css="#collapseDnAndUan > div > form > div > div:nth-child(1) > input")
        private WebElementFacade dnNumber;

        @FindBy(id="#selectScenarioSelect")
        private WebElementFacade selectScenario;


        @FindBy (name="uan")
        private WebElementFacade uanNumber;

        @FindBy(css="#collapseDnAndUan > div > form > div > button")
        private WebElementFacade showScenariosBtn;


        @FindBy(css="#selectScenarioSelect")
        private WebElementFacade availableScenario;

        // the eircode
        public void inputEircode(String eircode)
        {
            eircodeBox.waitUntilVisible();
            eircodeBox.type(eircode);
        }

        //locate the collapsEircode
        public void clickCollapseEircode() {
            collapseEircode.waitUntilVisible();
            collapseEircode.click();
        }


        // add dn and uan

        //locate the collapsEircode
        public void clickCollapseDnUan() {
            collapseUanDn.waitUntilVisible();
            collapseUanDn.click();
        }

        public void inputDn(String dn)
        {
            dnNumber.waitUntilEnabled();
            dnNumber.type(dn);
        }

        public void inputUan(String uan)
        {
            uanNumber.waitUntilVisible();
            uanNumber.type(uan);
        }


        public void clickShowSenarios()
        {
            showScenariosBtn.waitUntilVisible();
            showScenariosBtn.click();
        }


        public void clickAvailableScenarios()
        {
            availableScenario.waitUntilVisible();
            availableScenario.selectByIndex(2);
        }


}
