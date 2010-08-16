/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package trafficsim;

/**
 * This class is designed to make the setting and retrieval of settings for the application easier. NOTE: This class is a singleton and values must be accessed throught the .getSimSettings() function. 
 *
 * @author Tristan Davey
 */
public class Settings {

    //Singleton Instance
    private static Settings simulationSettings = null;

    private short hLanes = 3;
    private short vLanes = 2;
    private int vLaneLength = 500;
    private int hLaneLength = 500;
    private int vLaneStopLine = 250;
    private int hLaneStopLine = 250;
    private float hCarProbability = 1;
    private float vCarProbability = 1;

    //Static
    public static final int LANE_WIDTH = 15;
    public static final int DEFAULT_ROAD_LENGTH = 500;
    public static final int CAR_LENGTH = 30;
    public static final int CAR_WIDTH = 12;
    public static final int CAR_MOVE = 1;
    public static final Boolean TRAFFIC_EAST_SOUTH = true;
    public static final Boolean TRAFFIC_WEST_NORTH = false;
    public static final Boolean ROAD_SOUTH_NORTH = true;
    public static final Boolean ROAD_EAST_WEST = false; 

    protected void Settings() {
        //Prevents Instantiation
    }

    public static synchronized Settings getSimSettings() {
        if (simulationSettings == null) {
            simulationSettings = new Settings();
        }
        return simulationSettings;
    }

    /**
     * @return the hLanes
     */
    public short getHLanes() {
        return hLanes;
    }

    /**
     * @param hLanes the hLanes to set
     */
    public void setHLanes(short hLanes) {
        this.hLanes = hLanes;
    }

    /**
     * @return the vLanes
     */
    public short getVLanes() {
        return vLanes;
    }

    /**
     * @param vLanes the vLanes to set
     */
    public void setVLanes(short vLanes) {
        this.vLanes = vLanes;
    }

    /**
     * @return the hCarProbability
     */
    public float getHCarProbability() {
        return hCarProbability;
    }

    /**
     * @param hCarProbability the hCarProbability to set
     */
    public void setHCarProbability(float hCarProbability) {
        this.hCarProbability = hCarProbability;
    }

    /**
     * @return the vCarProbability
     */
    public float getVCarProbability() {
        return vCarProbability;
    }

    /**
     * @param vCarProbability the vCarProbability to set
     */
    public void setVCarProbability(float vCarProbability) {
        this.vCarProbability = vCarProbability;
    }

    /**
     * @return the vLaneLength
     */
    public int getvLaneLength() {
        return vLaneLength;
    }

    /**
     * @param vLaneLength the vLaneLength to set
     */
    public void setvLaneLength(int vLaneLength) {
        this.vLaneLength = vLaneLength;
    }

    /**
     * @return the hLaneLength
     */
    public int gethLaneLength() {
        return hLaneLength;
    }

    /**
     * @param hLaneLength the hLaneLength to set
     */
    public void sethLaneLength(int hLaneLength) {
        this.hLaneLength = hLaneLength;
    }

    /**
     * @return the vLaneStopLine
     */
    public int getvLaneStopLine() {
        return vLaneStopLine;
    }

    /**
     * @param vLaneStopLine the vLaneStopLine to set
     */
    public void setvLaneStopLine(int vLaneStopLine) {
        this.vLaneStopLine = vLaneStopLine;
    }

    /**
     * @return the hLaneStopLine
     */
    public int gethLaneStopLine() {
        return hLaneStopLine;
    }

    /**
     * @param hLaneStopLine the hLaneStopLine to set
     */
    public void sethLaneStopLine(int hLaneStopLine) {
        this.hLaneStopLine = hLaneStopLine;
    }

}