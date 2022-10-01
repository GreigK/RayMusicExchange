import Instruments.InstrumentType;
import Instruments.guitar;
import Instruments.piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class pianoTest {

    Instruments.piano pianos;

    @Before
    public void setUp(){
        pianos = new piano(InstrumentType.KEYS, "yamaha", "keyboard", 350, 375, 88);
    }

    @Test
    public void canGetProperties(){
        assertEquals(InstrumentType.KEYS, pianos.getInstrumentType());
        assertEquals("yamaha", pianos.getMake());
        assertEquals("keyboard", pianos.getModel());
        assertEquals(350, pianos.getBought());
        assertEquals(375, pianos.getSell());
        assertEquals(88, pianos.getNoOfKeys());
    }

    @Test
    public void canPlay(){
        assertEquals("clink clonk", pianos.play());
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(25, pianos.calculateMarkUp(pianos), 0.0);
    }
}
