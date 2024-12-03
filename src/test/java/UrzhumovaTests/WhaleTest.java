package UrzhumovaTests;

import allclasses.urzhumova.Whale;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class WhaleTest {
    @Test
    public void testMethodOne() throws Exception {
        Whale whale = new Whale();
        Assert.assertEquals(whale.eatMeat(), List.of("Планктон","Креветки"));
    }
}
