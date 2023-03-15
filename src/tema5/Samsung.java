package tema5;
/**
 * Samsung is a phone brand. Can't be instantiated.
 */
public abstract class Samsung extends Phone {
    public Samsung(int batteryLife, String color, String material, String IMEI) {
        super(batteryLife, color, material, IMEI);
    }
}
