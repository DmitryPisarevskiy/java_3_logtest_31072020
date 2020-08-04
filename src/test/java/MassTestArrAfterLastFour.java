import com.geekbrains.ArrMethods;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MassTestArrAfterLastFour {
    private int[] arrResult;
    private int[] arrSource;

    public MassTestArrAfterLastFour(int[] arrSource, int[] arrResult) {
        this.arrResult = arrResult;
        this.arrSource = arrSource;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{7,4,5,2} ,new int[]{5, 2}},
                {new int[]{5,4,7,7,4,5,2}, new int[]{5,2}},
                {new int[]{4}, new int[]{}},
        });
    }

    @Test
    public void testArrAfterLastFour() {
        Assert.assertArrayEquals(arrResult, ArrMethods.arrAfterLastFour(arrSource));
    }
}
