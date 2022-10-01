package Instruments;

import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {

    private InstrumentType instrumentType;
    private String make;
    private String model;
    private int bought;
    private int sell;

    public Instrument(InstrumentType instrumentType, String make, String model, int bought, int sell) {
        this.instrumentType = instrumentType;
        this.make = make;
        this.model = model;
        this.bought = bought;
        this.sell = sell;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getBought() {
        return bought;
    }

    public int getSell() {
        return sell;
    }

    public double calculateMarkUp(Instrument instrument) {
        double profit = instrument.sell - instrument.bought;
        return profit;
    }
}
