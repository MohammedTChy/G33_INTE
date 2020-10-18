import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MapTest {

    @Disabled
    void TestWidth()
    {
        Tile tile=new Tile();
        Map map=new Map(10,15,tile);
        assertEquals(map.getWidth(),10);
    }

}