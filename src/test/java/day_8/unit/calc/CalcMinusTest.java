package day_8.unit.calc;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static day_2.Calculator.add;
import static day_2.Calculator.minus;

public class CalcMinusTest {

    @Test
    @Parameters({ "a","b" })
    void calcMinusTest(Integer a, Integer b){
        Assert.assertEquals(minus(a,b),a-b," invalid minus operation");
    }

}
