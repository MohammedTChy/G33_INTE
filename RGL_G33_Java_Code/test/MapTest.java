import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MapTest {


    // TEST TYPE Unit test
    @Test
    void TestWidth() {
        Map map = new Map(10, 15);
        assertEquals(map.getWidth(), 10);
    }

    @Test
// just wrote this test.
    void TestBreadth() {
        Map map = new Map(12, 14);
        assertEquals(map.getBreadth(), 14);
    }
    // TEST TYPE TDD(test driven dev)


    @Test
// in this test we dont want more then one tile can be placed in the same position,
        // so we have make a hash set to check if one object is already there, we have to creat an IAE.
    void SamePositionTest() {
        Map map = new Map(10, 10);
        map.addTile(new Tile(new Position(5, 5)));
        assertThrows(IllegalArgumentException.class, () -> {
            map.addTile(new Tile(new Position(5, 5)));
        });
    }

    @Test
// in this test
    void tileOutofMapInX() {
        Map map = new Map(10, 10);
        assertThrows(IllegalArgumentException.class, () -> {
            map.addTile(new Tile(new Position(15, 5)));
        });
    }

    @Test
// in this test
    void tileOutofMapInY() {
        Map map = new Map(10, 10);
        assertThrows(IllegalArgumentException.class, () -> {
            map.addTile(new Tile(new Position(5, 15)));
        });
    }

    @Test
// in this test TDD , i am expecting if the width is less then 0 , will throw IAE.test has failed .I have written code  in map class,retest.
    void tileOutofMapInXInNegetive() {
        Map map = new Map(10, 10);
        assertThrows(IllegalArgumentException.class, () -> {
            map.addTile(new Tile(new Position(-15, 5)));
        });
    }

    @Test
// in this test TDD , i am expecting if the breadth is less then 0 , will throw IAE.
    void tileOutofMapInYInNegetive() {
        Map map = new Map(10, 10);
        assertThrows(IllegalArgumentException.class, () -> {
            map.addTile(new Tile(new Position(5, -15)));
        });
    }

    @Test
    void mansSetPositionTest(){
        Map map = new Map(3,5);
        map.addTile(new Tile(new Position(1,2),true,false,false,false,false,false,false));
        map.addTile(new Tile(new Position(1,3),false,true,false,false,false,false,false));
        map.addTile(new Tile(new Position(2,3),false,false,false,false,false,false,true));
        map.addTile(new Tile(new Position(3,2),false,true,false,false,false,false,false));
        map.addTile(new Tile(new Position(3,3),false,false,true,false,false,false,false));
        map.addTile(new Tile(new Position(3,5),false,false,false,false,false,true,false));
        assertTrue(map.checkPosition(new Position(1,1)));
    }

    @Test
    void mansMoveUpPositionTest(){
        Map map = new Map(3,5);
        map.addTile(new Tile(new Position(1,2),true,false,false,false,false,false,false));
        map.addTile(new Tile(new Position(1,3),false,true,false,false,false,false,false));
        map.addTile(new Tile(new Position(2,3),false,false,false,false,false,false,true));
        map.addTile(new Tile(new Position(3,2),false,true,false,false,false,false,false));
        map.addTile(new Tile(new Position(3,3),false,false,true,false,false,false,false));
        map.addTile(new Tile(new Position(3,5),false,false,false,false,false,true,false));
        Man player=new Man(100,100,100);
        if(map.checkPosition(new Position(1,1))){
            player.setCreaturePosition(new Position(1,1));
        }
        player.setCreaturePosition(map.movePosition(player.getCreaturePosition(),1));
        assertEquals(1,player.getCreaturePosition().getX());
        assertEquals(1,player.getCreaturePosition().getY());
    }

    @Test
    void mansMoveDownPositionTest(){
        Map map = new Map(3,5);
        map.addTile(new Tile(new Position(1,2),true,false,false,false,false,false,false));
        map.addTile(new Tile(new Position(1,3),false,true,false,false,false,false,false));
        map.addTile(new Tile(new Position(2,3),false,false,false,false,false,false,true));
        map.addTile(new Tile(new Position(3,2),false,true,false,false,false,false,false));
        map.addTile(new Tile(new Position(3,3),false,false,true,false,false,false,false));
        map.addTile(new Tile(new Position(3,5),false,false,false,false,false,true,false));
        Man player=new Man(100,100,100);
        if(map.checkPosition(new Position(1,1))){
            player.setCreaturePosition(new Position(1,1));
        }
        player.setCreaturePosition(map.movePosition(player.getCreaturePosition(),3));
        assertEquals(2,player.getCreaturePosition().getX());
        assertEquals(1,player.getCreaturePosition().getY());
    }

    @Test
    void mansMoveRightPositionTest(){
        Map map = new Map(3,5);
        map.addTile(new Tile(new Position(1,4),true,false,false,false,false,false,false));
        map.addTile(new Tile(new Position(1,3),false,true,false,false,false,false,false));
        map.addTile(new Tile(new Position(2,3),false,false,false,false,false,false,true));
        map.addTile(new Tile(new Position(3,2),false,true,false,false,false,false,false));
        map.addTile(new Tile(new Position(3,3),false,false,true,false,false,false,false));
        map.addTile(new Tile(new Position(3,5),false,false,false,false,false,true,false));
        Man player=new Man(100,100,100);
        if(map.checkPosition(new Position(1,1))){
            player.setCreaturePosition(new Position(1,1));
        }
        player.setCreaturePosition(map.movePosition(player.getCreaturePosition(),2));
        assertEquals(1,player.getCreaturePosition().getX());
        assertEquals(2,player.getCreaturePosition().getY());
    }

    @Test
    void mansMoveLeftPositionTest(){
        Map map = new Map(3,5);
        map.addTile(new Tile(new Position(1,4),true,false,false,false,false,false,false));
        map.addTile(new Tile(new Position(1,3),false,true,false,false,false,false,false));
        map.addTile(new Tile(new Position(2,3),false,false,false,false,false,false,true));
        map.addTile(new Tile(new Position(3,2),false,true,false,false,false,false,false));
        map.addTile(new Tile(new Position(3,3),false,false,true,false,false,false,false));
        map.addTile(new Tile(new Position(3,5),false,false,false,false,false,true,false));
        Man player=new Man(100,100,100);
        if(map.checkPosition(new Position(1,1))){
            player.setCreaturePosition(new Position(1,1));
        }
        player.setCreaturePosition(map.movePosition(player.getCreaturePosition(),4));
        assertEquals(1,player.getCreaturePosition().getX());
        assertEquals(1,player.getCreaturePosition().getY());
    }

    @Test
    void mansMoveLeftPositionInvalidTest(){
        Map map = new Map(3,5);
        map.addTile(new Tile(new Position(1,4),true,false,false,false,false,false,false));
        map.addTile(new Tile(new Position(1,3),false,true,false,false,false,false,false));
        map.addTile(new Tile(new Position(2,3),false,false,false,false,false,false,true));
        map.addTile(new Tile(new Position(3,2),false,true,false,false,false,false,false));
        map.addTile(new Tile(new Position(3,3),false,false,true,false,false,false,false));
        map.addTile(new Tile(new Position(3,5),false,false,false,false,false,true,false));
        Man player=new Man(100,100,100);
        if(map.checkPosition(new Position(1,1))){
            player.setCreaturePosition(new Position(1,1));
        }
        player.setCreaturePosition(map.movePosition(player.getCreaturePosition(),4));
        assertEquals(1,player.getCreaturePosition().getX());
        assertNotEquals(0,player.getCreaturePosition().getY());
    }

    @Test
    void mansMoveRightPositionInvalidTest(){
        Map map = new Map(3,5);
        map.addTile(new Tile(new Position(1,4),true,false,false,false,false,false,false));
        map.addTile(new Tile(new Position(1,3),false,true,false,false,false,false,false));
        map.addTile(new Tile(new Position(2,3),false,false,false,false,false,false,true));
        map.addTile(new Tile(new Position(3,2),false,true,false,false,false,false,false));
        map.addTile(new Tile(new Position(3,3),false,false,true,false,false,false,false));
        map.addTile(new Tile(new Position(3,5),false,false,false,false,false,true,false));
        Man player=new Man(100,100,100);
        if(map.checkPosition(new Position(1,1))){
            player.setCreaturePosition(new Position(1,1));
        }
        player.setCreaturePosition(map.movePosition(player.getCreaturePosition(),2));
        assertEquals(1,player.getCreaturePosition().getX());
        assertNotEquals(1,player.getCreaturePosition().getY());
    }

    @Test
    void mansMoveDownPositionInvalidTest(){
        Map map = new Map(3,5);
        map.addTile(new Tile(new Position(1,2),true,false,false,false,false,false,false));
        map.addTile(new Tile(new Position(1,3),false,true,false,false,false,false,false));
        map.addTile(new Tile(new Position(2,3),false,false,false,false,false,false,true));
        map.addTile(new Tile(new Position(3,2),false,true,false,false,false,false,false));
        map.addTile(new Tile(new Position(3,3),false,false,true,false,false,false,false));
        map.addTile(new Tile(new Position(3,5),false,false,false,false,false,true,false));
        Man player=new Man(100,100,100);
        if(map.checkPosition(new Position(1,1))){
            player.setCreaturePosition(new Position(1,1));
        }
        player.setCreaturePosition(map.movePosition(player.getCreaturePosition(),3));
        assertNotEquals(1,player.getCreaturePosition().getX());
        assertEquals(1,player.getCreaturePosition().getY());
    }

    @Test
    void mansMoveUpPositionInvalidTest(){
        Map map = new Map(3,5);
        map.addTile(new Tile(new Position(1,2),true,false,false,false,false,false,false));
        map.addTile(new Tile(new Position(1,3),false,true,false,false,false,false,false));
        map.addTile(new Tile(new Position(2,3),false,false,false,false,false,false,true));
        map.addTile(new Tile(new Position(3,2),false,true,false,false,false,false,false));
        map.addTile(new Tile(new Position(3,3),false,false,true,false,false,false,false));
        map.addTile(new Tile(new Position(3,5),false,false,false,false,false,true,false));
        Man player=new Man(100,100,100);
        if(map.checkPosition(new Position(1,1))){
            player.setCreaturePosition(new Position(1,1));
        }
        player.setCreaturePosition(map.movePosition(player.getCreaturePosition(),1));
        assertNotEquals(0,player.getCreaturePosition().getX());
        assertEquals(1,player.getCreaturePosition().getY());
    }

}

