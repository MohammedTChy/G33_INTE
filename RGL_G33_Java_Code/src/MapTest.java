import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MapTest {

    @Test
    void TestWidth()
    {
        Tile tile=new Tile();
        Map map=new Map(10,15,tile);
        assertEquals(map.getWidth(),10);
    }
    @Test// just wrote this test.
    void TestBreadth(){
        Tile tile = new Tile();
        Map map=new Map(12,14,tile);
        assertEquals(map.getBreadth(),14);
    }

}