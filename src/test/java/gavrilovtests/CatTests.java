package gavrilovtests;

import allclasses.gavrilov.Cat;
import org.junit.Assert;
import org.junit.Test;

public class CatTests {
    @Test
    public void CheckTrueCatTest(){
        Cat cat = new Cat();
        Assert.assertEquals("Ваш кот есть в базе данных", cat.CheckCat("Борис"));
    }

    @Test
    public void CheckFalseCatTest(){
        Cat cat = new Cat();
        Assert.assertEquals("Вашего кота нет в базе данных", cat.CheckCat("Феликс"));
    }
}
