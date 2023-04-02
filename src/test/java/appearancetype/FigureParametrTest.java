package appearancetype;

import appearancetype.ColorType;
import appearancetype.ColorTypeException;
import figure.Figure;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class FigureParametrTest {
    Figure figure;
    String figureTestValue;


    public FigureParametrTest(Figure figure, String figureTestValue) {
        this.figure = figure;
        this.figureTestValue = figureTestValue;
    }

    @Parameterized.Parameters(name = "{index}:  figure = {0} figureTestValue = {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{

                {Figure.PEAR, "Pear"},
                {Figure.APPLE, "apple"},
                {Figure.HOURGLASS, "Hourglass"}
        });

    }
    @Test
    public void testFigureByIdWithException() throws Exception {
        Assert.assertEquals(figure, Figure.getById(figureTestValue));

    }
}
