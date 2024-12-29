import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)

public class CatTest {

    Cat cat;

    @Mock
    Feline feline;

    @Before
    public void init() {
        cat = new Cat(feline);
    }

    @Test
    public void getFoodTest() throws Exception {
        List<String> animalList = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(animalList);
        assertEquals(animalList, cat.getFood());
    }

    @Test
    public void getSoundTest() {
        assertEquals("Мяу", cat.getSound());
    }
}