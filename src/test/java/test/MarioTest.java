package test;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.junit.annotations.UseTestDataFrom;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


import page.MarioPage;


/**
 * Created by mal89 on 03/03/2017.
 */

//@RunWith(SerenityRunner.class)
@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value="src/test/resources/testData.csv")
public class MarioTest
{


    @Managed(driver = "firefox", uniqueSession = true)
    public WebDriver driver;

    @Steps
    MarioPage marioPage;


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
        marioPage.inputDnItem(dnNum);
        marioPage.inputUanItem(uanNum);
        Thread.sleep(2000);
        marioPage.clickRequiredBroadband(connect, urban, fibre);
        Thread.sleep(2000);
        marioPage.clickSubmit();
        Thread.sleep(2000);
        System.out.println("END of Priming for DN: " + this.dnNum + " AND UAN: " + this.uanNum);

        //   System.exit(0);


    }

}



