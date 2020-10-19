import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MapTest {


    // TEST TYPE Unit test
    @Test
    void TestWidth()
    {
        Tile tile=new Tile(new Position(0,0));
        Map map=new Map(10,15);
        assertEquals(map.getWidth(),10);
    }
    @Test// just wrote this test.
    void TestBreadth(){
        Tile tile = new Tile(new Position(0,0));
        Map map=new Map(12,14);
        assertEquals(map.getBreadth(),14);
    }
    // TEST TYPE TDD(test driven dev)
    @Test
    void PositionTest(){
        Map map=new Map(10,10);
        map.addTile(new Tile(new Position(5,5)));
        map.addTile(new Tile(new Position(5,15)));
        assertThrows(IllegalArgumentException.class, () -> {
            map.addTile(new Tile(new Position(5,10)));
        });

    }



}

