package yakovleva;

import allclasses.yakovleva.Deer;
import allclasses.yakovleva.Type;

import java.time.LocalDate;
import java.time.Period;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class DeerTests 
{
    @Test
    void AgeCorrect() 
    {
        Deer deer = new Deer("Ми", LocalDate.of(2020, 10, 12), Type.лань);
       
        int actual = deer.Age();
        
        Period expected = Period.between(deer.getBirthday(), LocalDate.now());

        Assert.assertEquals(expected, actual);
    }
}
