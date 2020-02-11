import org.junit.Assert;
import org.junit.Test;

public class PowerFunctionTest {

    PowerFunction powerFunction = new PowerFunction();

    @Test
    public void givenTwoValuesInInteger_WhenPerformOperation_ShouldReturnResult() {
        int result = powerFunction.calculator(2, 3);
        Assert.assertEquals(8, result);
    }

    @Test
    public void givenExponentZeroBaseIntegerValue_WhenPerformOperation_ShouldReturnOne() {
        int result = powerFunction.calculator(5, 0);
        Assert.assertEquals(1, result);
    }

    @Test
    public void givenExponentIntegerBaseZero_WhenPerformOpeartion_ShouldReturnZero() {
        int result = powerFunction.calculator(0, 4);
        Assert.assertEquals(0, result);
    }

    @Test
    public void givenExponentIntegeBaseNegative_WhenPerformOperation_ShouldReturnResult() {
        int result = powerFunction.calculator(-2, 2);
        Assert.assertEquals(4, result);
    }

    @Test
    public void givenExponentNegativeBaseInteger_WhenPerformOpeartion_ShouldReturnOne() {
        int result = powerFunction.calculator(5, -5);
        Assert.assertEquals(1, result);
    }

    @Test
    public void givenBothValuesNegative_WhenPerformOperation_ShouldReturnOne() {
        int result = powerFunction.calculator(-2, -2);
        Assert.assertEquals(1, result);
    }


}
