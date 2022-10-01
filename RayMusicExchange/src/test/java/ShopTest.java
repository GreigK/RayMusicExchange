import Instruments.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Instruments.drums drums;
    Instruments.guitar guitars;
    Instruments.piano pianos;
    Instruments.trombone trombones;

    Shop shop;


    @Before
    public void setUp(){
        drums = new drums(InstrumentType.PERCUSSION, "Steel", "Adams", 100, 150);
        guitars = new guitar(InstrumentType.STRING, "Bigone", "GreenOne", 200, 300, 6, "Electric");
        pianos = new piano(InstrumentType.KEYS, "yamaha", "keyboard", 350, 375, 88);
        trombones = new trombone(InstrumentType.BRASS, "Piccolo", "tenor", 200, 500, 0);
        shop = new Shop("Ray");
    }

    @Test
    public void canFindShop(){
        assertEquals("Ray", shop.getName());
        assertEquals(0, shop.getStockSize());
    }

    @Test
    public void canAddStock(){
        shop.addStock(drums);
        shop.addStock(guitars);
        shop.addStock(pianos);
        shop.addStock(trombones);
        assertEquals(4, shop.getStockSize());
    }


    @Test
    public void canRemoveStock(){
        shop.addStock(drums);
        shop.addStock(guitars);
        shop.addStock(pianos);
        shop.addStock(trombones);
        shop.removeStock(drums);
        shop.removeStock(guitars);
        assertEquals(2, shop.getStockSize());
    }






}
