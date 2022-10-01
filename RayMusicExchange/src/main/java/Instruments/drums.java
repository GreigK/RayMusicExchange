package Instruments;

public class drums extends Instrument{



    public drums(InstrumentType instrumentType, String make, String model, int bought, int sell) {
        super(instrumentType, make, model, bought, sell);
    }


    public String play(){
        return "Bang";
    }
}
