import com.example.Feline;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    Feline feline;

    @Before
    public void init() {
        feline = new Feline();
    }

    @Test
    public void eatMeatTest() throws Exception {
        List<String> animalList = List.of("Животные", "Птицы", "Рыба");
        assertEquals(animalList, feline.eatMeat());
    }

    @Test
    public void getFamilyTest() {
        assertEquals("Кошачьи",  feline.getFamily());
    }

    @Test
    public void getKittensTest_empty_param() {
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittenTest_with_param() {
        assertEquals(10, feline.getKittens(10));
    }
}
