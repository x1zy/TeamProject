package irinabigtests;

import allclasses.irinabig.Feline;
import org.junit.Assert;
import org.junit.Test;

public class FelineTests {

    @Test
    public void GetKittensTest(){
        Feline feline = new Feline();
        int expected = 1;
        Assert.assertEquals(expected, feline.getKittens());
    }
}
