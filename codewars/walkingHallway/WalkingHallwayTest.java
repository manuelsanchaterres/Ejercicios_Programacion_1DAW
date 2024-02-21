package walkingHallway;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class WalkingHallwayTest {
    @Test
    public void testContact() {
        assertEquals(1, WalkingHallway.contact("---><----"));
        assertEquals(1, WalkingHallway.contact("--->-<------->----<-"));
        assertEquals(-1, WalkingHallway.contact("----<----->----"));
        assertEquals(2, WalkingHallway.contact(">-----<-->--<-----")); 
        assertEquals(3, WalkingHallway.contact(">>-----<<")); 
        assertEquals(5, WalkingHallway.contact(">---------------<--------------------------<-------->---------<------->----------<----<---->>----------<------->>>---------------<<------>"));
    }
    public void testContact2() {
        assertEquals(1, WalkingHallway.contact("---><----"));
        assertEquals(1, WalkingHallway.contact("--->-<------->----<-"));
        assertEquals(-1, WalkingHallway.contact("----<----->----"));
        assertEquals(2, WalkingHallway.contact(">-----<-->--<-----")); 
        assertEquals(3, WalkingHallway.contact(">>-----<<")); 
        assertEquals(5, WalkingHallway.contact(">---------------<--------------------------<-------->---------<------->----------<----<---->>----------<------->>>---------------<<------>"));
    } 
}
