import com.example.FelineInterface;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    FelineInterface felineInterface;
    Lion lion;

    @Before
    public void init() throws Exception {
        felineInterface = Mockito.mock(FelineInterface.class);
        lion = new Lion("Самец", felineInterface);
    }

    @Test(expected = Exception.class)
    public void createLionTest_exception() throws Exception {
        new Lion("Ошибка", felineInterface);
    }

    @Test
    public void getKittensTest() {
        Mockito.when(felineInterface.getKittens()).thenReturn(1);
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void getFoodTest() throws Exception {
        List<String> animalList = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(felineInterface.eatMeat()).thenReturn(animalList);
        assertEquals(animalList, lion.getFood());
    }
}