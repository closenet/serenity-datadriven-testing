package test;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.junit.annotations.UseTestDataFrom;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import page.MarioPage_TDM;


/**
 * Created by mal89 on 03/03/2017.
 */

//@RunWith(SerenityRunner.class)
@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value="src/test/resources/testData_TDM.csv")
public class MarioTest_TDM
{

    @Managed(driver = "chrome", uniqueSession = true)
    public WebDriver driver;

    @Steps
    MarioPage_TDM marioPage;


    private String dnNum;
    private String uanNum;
    private String connect;
    private String urban;
    private String fibre;

    public void assignTestData (String dn, String uan, String connect, String urban, String fibre)  throws Exception //
    {
        this.dnNum = dn;
        this.uanNum = uan;
        this.connect =connect;
        this.urban = urban;
        this.fibre = fibre;
    }

    @Test
    public void openMario () throws Exception {

        marioPage.open();
        marioPage.clickCollapseDnUan();
        marioPage.inputUan(uanNum);
        marioPage.inputDn(dnNum);
        marioPage.clickShowSenarios();
        marioPage.clickAvailableScenarios();
        Thread.sleep(30000);

    }

}



