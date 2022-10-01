import Instruments.InstrumentType;
import Instruments.drums;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class drumsTest {

    Instruments.drums drums;

    @Before
    public void setUp(){
        drums = new drums(InstrumentType.PERCUSSION, "Steel", "Adams", 100, 150);
    }

    @Test
    public void canGetProperties(){
        assertEquals(InstrumentType.PERCUSSION, drums.getInstrumentType());
        assertEquals("Steel", drums.getMake());
        assertEquals("Adams", drums.getModel());
        assertEquals(100, drums.getBought());
        assertEquals(150, drums.getSell());
    }

}
