import com.example.FelineInterface;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParamTest {

    FelineInterface felineInterface;
    String sex;
    boolean expectedCondition;

    public LionParamTest(String sex, boolean expectedCondition) {
        this.sex = sex;
        this.expectedCondition = expectedCondition;
    }

    @Parameterized.Parameters
    public static Object[][] lionTest() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Before
    public void init() {
        felineInterface = Mockito.mock(FelineInterface.class);
    }

    @Test
    public void haveManeTest() throws Exception {
        Lion lion = new Lion(sex, felineInterface);
        assertEquals(expectedCondition, lion.doesHaveMane());
    }
}