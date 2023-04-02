package appearancetype;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ColorTypeParametrTest {
    ColorType colorType;
    String testValue;

    public ColorTypeParametrTest(ColorType colorType, String testValue) {
        this.colorType = colorType;
        this.testValue = testValue;
    }

    @Parameterized.Parameters(name = "{index}:  colorType = {0} testValue = {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{

                {ColorType.WINTER, "Winter"},
                {ColorType.SUMMER, "Summer"},
                {ColorType.AUTUMN, "Autumn"}
        });

    }

    @Test
    public void testColorByIdWithException() throws ColorTypeException {
        Assert.assertEquals(colorType, ColorType.getById(testValue));

    }
}
