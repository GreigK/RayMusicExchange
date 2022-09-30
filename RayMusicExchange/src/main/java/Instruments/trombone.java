package Instruments;

public class trombone extends Instrument {

    private int getNoOfValves;

    public trombone(InstrumentType instrumentType, String make, String model, int bought, int sell, int getNoOfValves) {
        super(instrumentType, make, model, bought, sell);
        this.getNoOfValves = getNoOfValves;
    }


    public int getGetNoOfValves() {
        return getNoOfValves;
    }

    public String play(){
        return "Doo Doo";
    }
}
