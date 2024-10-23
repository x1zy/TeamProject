package irinabigtests;

import allclasses.irinabig.Alex;
import allclasses.irinabig.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class AlexTests {
    @Test
    public void testMethodOne() throws Exception {
        Feline  feline = new Feline();
        Alex alex = new Alex(feline);
        Assert.assertEquals(alex.getFriends(), List.of("Мартин", "Глория", "Мелман"));
    }
    @Test
    public void testMethodTwo() throws Exception {
        Feline  feline = new Feline();
        Alex alex = new Alex(feline);
        Assert.assertEquals(alex.getKittens(), 0);
    }

}
