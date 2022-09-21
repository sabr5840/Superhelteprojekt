import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.w3c.dom.CDATASection;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {

    @BeforeEach
    void prepareTest(){
        Database Database = new Database();
        Database.createTestData();
    }

    @Test
    void skabSuperhelt() {
        //Arange
        Database datebase = new Database();
        //Act
        datebase.skabSuperhelt("Batman", "Iron fist", "Strong", true, 2022, 1000);
        int actualSize = datebase.getSuperhelte().size();
        int expectedSize = 1;
        assertEquals(actualSize, expectedSize);
    }

    @Test
    void deleteSuperhelt(){
        Database.deleteSuperhelte("man")
    }
}


