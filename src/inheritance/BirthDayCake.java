package inheritance;

public class BirthDayCake extends Cake {
    private int candle;

    public BirthDayCake() {
        super("Chocolate");
    }

    public int getCandle() {
        return candle;
    }

    public void setCandle(int candle) {
        this.candle = candle;
    }
}
