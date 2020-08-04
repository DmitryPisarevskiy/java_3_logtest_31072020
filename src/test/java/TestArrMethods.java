import com.geekbrains.ArrMethods;
import org.junit.*;

public class TestArrMethods {

    @Test
    public void testArrAfterLastFour01() {
        Assert.assertArrayEquals(new int[]{5, 2}, ArrMethods.arrAfterLastFour(new int[]{7,4,5,2}));
    }

    @Test
    public void testArrAfterLastFour02() {
        Assert.assertArrayEquals(new int[]{5,2}, ArrMethods.arrAfterLastFour(new int[]{5,4,7,7,4,5,2}));
    }

    @Test (expected = RuntimeException.class)
    public void testArrAfterLastFour03() {
        int[] arr = ArrMethods.arrAfterLastFour(new int[]{1,1,1,1,1});
    }

    @Test
    public void testArrAfterLastFour04() {
        Assert.assertArrayEquals(new int[]{}, ArrMethods.arrAfterLastFour(new int[]{4}));
    }

    @Test
    public void testArrFromOneFour01() {
        Assert.assertTrue(ArrMethods.isArrFromOneFour(new int[]{1,1,4,4}));
    }

    @Test
    public void testArrFromOneFour02() {
        Assert.assertFalse(ArrMethods.isArrFromOneFour(new int[]{1,1,1,1}));
    }

    @Test
    public void testArrFromOneFour03() {
        Assert.assertFalse(ArrMethods.isArrFromOneFour(new int[]{4,4,4,4}));
    }

    @Test
    public void testArrFromOneFour04() {
        Assert.assertFalse(ArrMethods.isArrFromOneFour(new int[]{1,3,4,4}));
    }
}

