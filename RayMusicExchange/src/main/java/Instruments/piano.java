package Instruments;

public class piano extends Instrument {

    private int noOfKeys;

    public piano(InstrumentType instrumentType, String make, String model, int bought, int sell, int noOfKeys) {
        super(instrumentType, make, model, bought, sell);
        this.noOfKeys = noOfKeys;
    }

    public int getNoOfKeys() {
        return noOfKeys;
    }

    public String play(){
        return "clink clonk";
    }

}
