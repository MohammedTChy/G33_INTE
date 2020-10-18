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

}