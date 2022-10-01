import Instruments.InstrumentType;
import Instruments.drums;
import org.junit.Before;

public class drumsTest {

    Instruments.drums drums;

    @Before
    public void setUp(){
        drums = new drums(InstrumentType.PERCUSSION, "Steel", "Adams", 100, 150);
    }

    
}
