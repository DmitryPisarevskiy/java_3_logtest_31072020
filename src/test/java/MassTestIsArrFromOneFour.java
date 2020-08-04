import com.geekbrains.ArrMethods;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MassTestIsArrFromOneFour {
    private int[] arrSource;
    private boolean result;

    public MassTestIsArrFromOneFour(int[] arrSource, boolean result) {
        this.arrSource = arrSource;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1,1,4,4}, true},
                {new int[]{1,1,1,1}, false},
                {new int[]{4,4,4,4}, false},
                {new int[]{1,3,4,4}, false},
        });
    }

    @Test
    public void testArrFromOneFour() {
        Assert.assertEquals(result, ArrMethods.isArrFromOneFour(arrSource));
    }
}
