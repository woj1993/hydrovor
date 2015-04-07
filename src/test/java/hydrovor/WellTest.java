package hydrovor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WellTest {
    private Well well;
    
    @Test
    public void WellIsEmpty()
    {
        //        Given
            well = new Well(0);
        //        When
        int result = well.getWater(1);

        //        Then
        Assert.assertEquals(0, result);
    }

    @Test
    public void IsWater()
    {
        //        Given
            well = new Well(10);
        //        When
        int result = well.getWater(10);
        //        Then
        Assert.assertEquals(10, result);
    }
        @Test
    public void IsEmptying()
    {
        //        Given
            well = new Well(10);
        //        When
        well.getWater(10);
        int result = well.getWater(10);
        //        Then
        Assert.assertEquals(0, result);
    }
}
