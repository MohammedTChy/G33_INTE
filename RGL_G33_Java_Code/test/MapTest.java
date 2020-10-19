
import com.intellij.internal.statistic.beans.StatisticsEventProvider;

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
    @Test// in this test we dont want more then one tile can be placed in the same position,
    // so we have make a hash set to check if one object is already there, we have to creat an IAE.
    void SamePositionTest(){
        Map map=new Map(10,10);
        map.addTile(new Tile(new Position(5,5)));
        assertThrows(IllegalArgumentException.class, () -> {
            map.addTile(new Tile(new Position(5,5)));
        });

    }



}

