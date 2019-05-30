package Car;

public class Transmission {
    private int shiftGearsNumber;
    private int currentShiftGear;


    private Transmission(int shiftGearsNumber) {
        this.shiftGearsNumber = shiftGearsNumber;
    }

    public static Transmission createTransmission(int shiftGearsNumber) {
        if (shiftGearsNumber < 0) {
            return null;
        }
        return new Transmission(shiftGearsNumber);
    }

    public void setShiftGear(int gearNumber) {
        this.currentShiftGear = gearNumber;
    }

    public void shiftUp() {
        this.currentShiftGear = this.currentShiftGear + 1;
    }

    public void shiftDown() {
        if (this.shiftGearsNumber != 0) {
            this.currentShiftGear = this.currentShiftGear - 1;
        }
    }
}
