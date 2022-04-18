import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;


    @Test
    public void getKittensReturnKittensCount() throws Exception {
        Lion lion = new Lion ("Самец");
        lion.setFeline(feline);
        int actualKittensCount = lion.getKittens();
        Assert.assertEquals(0, actualKittensCount);
    }

    @Test
    public void getKittensReturnFoodList() throws Exception {
        Lion lion = new Lion ("Самка");
        lion.setFeline(feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String>actualFood = lion.getFood();
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), actualFood);
    }

    //если не указать "Самец" это или "Самка", тест проверит исключение при создании объекта класса Lion
    @Test(expected = Exception.class)
    public void lionInvalidValueOfSexExceptionTest() throws Exception {
        Lion lion = new Lion("Еще не определился");
        lion.doesHaveMane();
    }
}