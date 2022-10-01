import Instruments.InstrumentType;
import Instruments.drums;
import Instruments.guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class guitarTest {

    Instruments.guitar guitars;

    @Before
    public void setUp(){
        guitars = new guitar(InstrumentType.STRING, "Bigone", "GreenOne", 200, 300, 6, "Electric");
    }

    @Test
    public void canGetProperties(){
        assertEquals(InstrumentType.STRING, guitars.getInstrumentType());
        assertEquals("Bigone", guitars.getMake());
        assertEquals("GreenOne", guitars.getModel());
        assertEquals(200, guitars.getBought());
        assertEquals(300, guitars.getSell());
        assertEquals(6, guitars.getNoOfStrings());
        assertEquals("Electric", guitars.getType());
    }

    @Test
    public void canPlay(){
        assertEquals("Twang", guitars.play());
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(100, guitars.calculateMarkUp(guitars), 0.0);
    }



}
