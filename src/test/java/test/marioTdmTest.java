package test;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import page.marioTdmPage;
/**
 * Created by mal89 on 14/02/2018.
 */

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value="src/test/resources/testDataTDM.csv")
public class marioTdmTest {


        @Managed(driver = "chrome", uniqueSession = true)
        public WebDriver driver;

        @Steps
        marioTdmPage marioPage;


        private String dnNum;
        private String uanNum;
        private String connect;
        private String urban;
        private String fibre;

        public void assignTestDataTDM (String dn, String uan, String connect, String urban, String fibre)  throws Exception
        {
            this.dnNum = dn;
            this.uanNum = uan;
            this.connect =connect;
            this.urban = urban;
            this.fibre = fibre;
        }


        @Test
        public void openMarioTdm () throws Exception {

            marioPage.open();
            marioPage.clickCollapseDnUan();
            marioPage.inputUan(uanNum);
            marioPage.inputDn(dnNum);
            marioPage.clickShowSenarios();
            marioPage.clickAvailableScenarios();

        }

}
