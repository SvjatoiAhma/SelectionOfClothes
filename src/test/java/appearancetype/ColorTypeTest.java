package appearancetype;

import figure.Figure;
import main.Profile;
import org.junit.Assert;
import org.junit.Test;

public class ColorTypeTest {
   @Test
   public void testColorTypeById() throws Exception {
      Assert.assertEquals(ColorType.SUMMER, ColorType.getById("Summer"));
      Assert.assertEquals(ColorType.SUMMER, ColorType.getById("summer"));

     /*
      Assert.assertEquals(Clothes.DRESSES, Clothes.getById("Dresses"));
      Assert.assertEquals(Figure.PEAR, Figure.getById("Pear"));
      Assert.assertEquals(Figure.APPLE, Figure.getById("Apple"));
      Assert.assertEquals(ColorType.SUMMER, ColorType.getById("Summer"));
      Assert.asseAssert.assertEquals(ColorType.WINTER, ColorType.getById("winter"));rtNotEquals(ColorType.SUMMER, ColorType.getById("Winter"));
      Assert.assertNotEquals(Clothes.SHIRTS_AND_TOPSTSHIRTS, Clothes.getById("SKIRTS"));
      Assert.assertNotEquals(ColorType.SUMMER, ColorType.getById("Winter"));
      Assert.assertNotEquals(Figure.PEAR, Figure.getById("Apple"));*/

   }
   @Test(expected = Exception.class)
   public void testColorByIdWithException() throws ColorTypeException {
      Assert.assertEquals(ColorType.SUMMER, ColorType.getById("Sumer"));

   }
}
