import Instruments.InstrumentType;
import Instruments.piano;
import Instruments.trombone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class tromboneTest {

    Instruments.trombone trombones;

    @Before
    public void setUp(){
        trombones = new trombone(InstrumentType.BRASS, "Piccolo", "tenor", 200, 500, 0);
    }

    @Test
    public void canGetProperties(){
        assertEquals(InstrumentType.BRASS, trombones.getInstrumentType());
        assertEquals("Piccolo", trombones.getMake());
        assertEquals("tenor", trombones.getModel());
        assertEquals(200, trombones.getBought());
        assertEquals(500, trombones.getSell());
        assertEquals(0, trombones.getGetNoOfValves());
    }

    @Test
    public void canPlay(){
        assertEquals("Doo Doo", trombones.play());
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(300, trombones.calculateMarkUp(trombones), 0.0);
    }
}
