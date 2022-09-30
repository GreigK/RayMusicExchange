package Instruments;

public class drums extends Instrument{

    private String type;

    public drums(InstrumentType instrumentType, String make, String model, int bought, int sell, String type) {
        super(instrumentType, make, model, bought, sell);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String play(){
        return "Bang";
    }
}
