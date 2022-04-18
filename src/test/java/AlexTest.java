import com.example.Alex;
import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AlexTest {

    @Mock
    Feline feline;

    @Test
    public void getFriends() throws Exception {
        Alex alex = new Alex();
        alex.setFeline(feline);
        List<String> actualFriends = alex.getFriends();
        assertEquals(List.of("Марти", "Глория", "Мелман"), actualFriends);
    }

    @Test
    public void getPlaceOfLiving() throws Exception {
        Alex alex = new Alex();
        alex.setFeline(feline);
        assertEquals("Нью-Йоркский Зоопарк", alex.getPlaceOfLiving());
    }

    @Test
    public void getKittens() throws Exception {
        Alex alex = new Alex();
        alex.setFeline(feline);
        Assert.assertEquals(0,  alex.getKittens());
    }

}
