package ie.atu.assignment_1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PassengerTest {
    Passenger title;
    Passenger id;
    Passenger age;
    Passenger num;
    Passenger name;


    @BeforeEach
    void setUp(){
        title = new Passenger();
        id = new Passenger();
        age = new Passenger();
        num = new Passenger();
        name = new Passenger();
    }

    @Test
    void testName(){
        assertEquals("Lokesh", name.Name("Lokesh"));
     }

     @Test
    void testNameFail(){
        Exception msgName = assertThrows(IllegalArgumentException.class, () -> {name.Name("x");});
        assertEquals("whose name is less 3 characters long.....you have a default name", msgName.getMessage());
     }


    @Test
    void testTitle(){
        assertEquals("Mr", title.title("Mr"));
    }

    @Test
    void testTitle2(){
        assertEquals("Ms", title.title("Ms"));
    }

    @Test
    void testTitle3(){
        assertEquals("Mrs", title.title("Mrs"));
    }

    @Test
    void testTitleFail(){
        Exception msgTitle = assertThrows(IllegalArgumentException.class, () -> {title.title("Miss");});
        assertEquals("either you are a married man or woman....or you are single....no in betweens", msgTitle.getMessage());

    }

    @Test
    void testAge(){
        assertEquals(20, age.age(20));
    }

    @Test
    void testAgeFail(){
        Exception msgAge = assertThrows(IllegalArgumentException.class, () -> {age.age(16);});
        assertEquals("What are you doing here you are too young for this....get lost", msgAge.getMessage());
    }

    @Test
    void testpNum(){
        assertEquals("0892448588", num.pNum("0892448588"));
    }

    @Test
    void testpNumFail(){
        Exception msgNum = assertThrows(IllegalArgumentException.class, () -> {num.pNum("123456");});
        assertEquals("I cant call you with that number...enter it properly....basic stuff", msgNum.getMessage());
    }

    @Test
    void testID(){
        assertEquals("G0038350700", id.ID("G0038350700"));
    }

    @Test
    void testIDFail(){
        Exception msgID = assertThrows(IllegalArgumentException.class, () -> {id.ID("123456789");});
        assertEquals("Either you enter the correct ID or you leave...simple math, 10 characters", msgID.getMessage());
    }

}
