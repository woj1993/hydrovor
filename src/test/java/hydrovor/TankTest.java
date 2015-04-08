package hydrovor;

import org.junit.Assert;
import org.junit.Test;

public class TankTest {
    
    private Tank tank;
    
    @Test
    public void WellIsEmpty()
    {
        //        Given
            tank = new Tank(2,0);
        //        When
        int result = tank.getWater();

        //        Then
        Assert.assertEquals(0, result);
    }

    @Test
    public void IsWater()
    {
        //        Given
            tank = new Tank(2,1);
        //        When
        int result = tank.getWater();
        //        Then
        Assert.assertEquals(1, result);
    }
        @Test
    public void IsEmptying()
    {
        //        Given
            tank = new Tank(2,1);
        //        When
        tank.getWater();
        int result = tank.getWater();
        //        Then
        Assert.assertEquals(0, result);
    }
            @Test
    public void IsMaxVolumeWorking()
    {
        //        Given
            tank = new Tank(2,1);
        //        When
        tank.addWater(2);
        tank.getWater();
        int result = tank.getWater();
        //        Then
        Assert.assertEquals(0, result);
    }
}
