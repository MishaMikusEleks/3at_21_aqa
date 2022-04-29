package day_8.unit.calc;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static day_2.Calculator.add;

public class CalcAddTest {

    @DataProvider
    public static Object[][] addTestDataProvider() {

        //column count => argument count
        //row count => test execution count
        Object[][] res= new Object[][]{
                {1,2},
                {0,0},
                {-1,1},
                {100,0}
        };

        return res;
    }

    @Test(dataProvider = "addTestDataProvider")
    void calcAddTest(Integer a, Integer b){
        Integer expected=a+b;
        Assert.assertEquals(add(a,b),expected," invalid add operation");
    }

}
