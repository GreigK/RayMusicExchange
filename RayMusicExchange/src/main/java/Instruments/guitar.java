package Instruments;

public class guitar extends Instrument{
    private int noOfStrings;
    private String type;

    public guitar(InstrumentType instrumentType, String make, String model, int bought, int sell, int noOfStrings, String type) {
        super(instrumentType, make, model, bought, sell);
        this.noOfStrings = noOfStrings;
        this.type = type;
    }

    public int getNoOfStrings() {
        return noOfStrings;
    }

    public String getType() {
        return type;
    }

    public String play(){
        return "Twang";
    }
}
