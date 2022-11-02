package ie.atu.assignment_1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PassengerTest {
    Passenger myPassenger;

    @BeforeEach
    void setUp(){
        myPassenger = new Passenger("Mr", "Lokesh", "0892448588", 20, "G0038350700");
    }

    @Test
    void testName(){
        assertEquals("Lokesh", myPassenger.Name());
     }

    @Test
    void testTitleMr(){
        assertEquals("Mr", myPassenger.title());
    }

    @Test
    void testTitleMrs(){
        assertEquals("Mrs", myPassenger.title());
    }

    @Test
    void testTitleMs(){
        assertEquals("Ms", myPassenger.title());
    }

    @Test
    void testTitleFail(){
        assertEquals("Miss", myPassenger.title());
    }

    @Test
    void testAge(){
        assertEquals(20, myPassenger.age());
    }

    @Test
    void testpNum(){
        assertEquals("0892448588", myPassenger.pNum());
    }

    @Test
    void testID(){
        assertEquals("G0038350700", myPassenger.ID());
    }

}
