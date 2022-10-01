import Instruments.Instrument;

import java.util.ArrayList;
import java.util.Arrays;

public class Shop {

    private String name;
    private ArrayList<Instrument> stock;

    public Shop(String name) {
        this.name = name;
        stock = new ArrayList<Instrument>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Instrument> getStock() {
        return stock;
    }

    public int getStockSize(){
        return stock.size();
    }

    public void addStock(Instrument instrument){
        stock.add(instrument);
    }

    public void removeStock(Instrument instrument){
        stock.remove(instrument);
    }

}
