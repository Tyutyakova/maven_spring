
import org.example.smartphone.controls.Switch;
import org.example.smartphone.devices.Kittle;
import org.testng.annotations.Test;
import org.testng.Assert;

import static org.example.Main.getPad;
@Test
public class MainTest {
    public void test1Test() {

        System.out.println((getPad("ab",2)).equals("aba"));
        System.out.println((getPad("ab",2)).equals("abab"));
        Assert.assertEquals((getPad("ac",3)), "acaca");

    }
    public void test2Test() {

    }
}
