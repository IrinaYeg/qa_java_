import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class FelineTest {

    Feline feline;

    @Before
    public void initFeline() {
        feline = new Feline();
    }

    @Test
    public void eatMeatReturnFoodList() throws Exception {
        List<String> expectedFoodList = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFoodList = feline.eatMeat();
        Assert.assertEquals(expectedFoodList, actualFoodList);
    }

    @Test
    public void getFamilyReturnName() {
        String expectedFamilyName = "Кошачьи";
        String actualFamilyName = feline.getFamily();
        Assert.assertEquals(expectedFamilyName, actualFamilyName);
    }

    @Test
    public void getKittensReturnKittensCount() {
        int actualKittensCount = feline.getKittens();
        Assert.assertEquals(1, actualKittensCount);
    }

    @Test
    public void getKittensTestMethodWithoutParameters() {
        int actualKittensCount = feline.getKittens(5);
        Assert.assertEquals(5, actualKittensCount);
    }

}