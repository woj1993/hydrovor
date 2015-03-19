package hydrovor;

/**
 * Tank provides water to Hydrovor and gets water from Pump
 */
public class Tank {

    private int maxVolume;

    private int volume;

    public Tank(int maxVolume, int volume)
    {
    }

    /**
     * Simulates water out flow.
     *
     * @return 1 when there is any water (volume) and decrements volume; 0 otherwise
     */
    public int getWater()
    {
        return 0;
    }

    /**
     * Simulates filling up the tank.
     * <p/>
     * This method does not allow to exceed maxVolume.
     *
     * @param volume amount of water attempted to be added
     *
     * @return amount of accepted water
     */
    public int addWater(int volume)
    {
        return 0;
    }
}
