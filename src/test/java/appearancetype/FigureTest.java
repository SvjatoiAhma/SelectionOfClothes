package appearancetype;

import figure.Figure;
import figure.FigureException;
import org.junit.Assert;
import org.junit.Test;

public class FigureTest {

    @Test
    public void testFigureById() throws Exception {
        Assert.assertEquals(Figure.APPLE, Figure.getById("apple"));
        Assert.assertEquals(Figure.APPLE, Figure.getById("APPLE"));
    }
    @Test(expected = Exception.class)
    public void testFigureWithException() throws Exception {
        Assert.assertEquals(Figure.APPLE, Figure.getById("Sumer"));

    }
}