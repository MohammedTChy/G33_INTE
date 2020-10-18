import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TileTest {

        // TEST TYPE normal unit test
    @Test
    void TestExistenceOfFire()
    {
        Tile tile1=new Tile(new Position(0,0),true,false,false,false,false,false,false);
        assertTrue(tile1.isFire(),String.format("Fire should be on this place"));
        assertFalse(tile1.isHills());
        assertFalse(tile1.isJangle());
        assertFalse(tile1.isEnemy());
        assertFalse(tile1.isEmpty());
        assertFalse(tile1.isLevel());
        assertFalse(tile1.isLife());
    }


    @Test
    void HillsExistence(){
        Tile tile1=new Tile(new Position(0,0),false,true,false,false,false,false,false);
        assertEquals(tile1.isFire(),false);
        assertEquals(tile1.isHills(),true);
        assertEquals(tile1.isJangle(),false);
        assertEquals(tile1.isEnemy(),false);
        assertEquals(tile1.isEmpty(),false);
        assertEquals(tile1.isLevel(),false);
        assertEquals(tile1.isLife(),false);
    }
    @Test
    void JangleExistence(){
        Tile tile1=new Tile(new Position(0,0),false,false,true,false,false,false,false);
        assertEquals(tile1.isFire(),false);
        assertEquals(tile1.isHills(),false);
        assertEquals(tile1.isJangle(),true);
        assertEquals(tile1.isEnemy(),false);
        assertEquals(tile1.isEmpty(),false);
        assertEquals(tile1.isLevel(),false);
        assertEquals(tile1.isLife(),false);
    }


    @Test
    void EnemyExistence(){
        Tile tile1=new Tile(new Position(0,0),false,false,false,true,false,false,false);
        assertEquals(tile1.isFire(),false);
        assertEquals(tile1.isHills(),false);
        assertEquals(tile1.isJangle(),false);
        assertEquals(tile1.isEnemy(),true);
        assertEquals(tile1.isEmpty(),false);
        assertEquals(tile1.isLevel(),false);
        assertEquals(tile1.isLife(),false);
    }

    @Test
    void EmptyPlaceCheck(){
        Tile tile1=new Tile(new Position(0,0),false,false,false,false,true,false,false);
        assertEquals(tile1.isFire(),false);
        assertEquals(tile1.isHills(),false);
        assertEquals(tile1.isJangle(),false);
        assertEquals(tile1.isEnemy(),false);
        assertEquals(tile1.isEmpty(),true);
        assertEquals(tile1.isLevel(),false);
        assertEquals(tile1.isLife(),false);
    }

    @Test
    void LevelComplitionPlaceCheck(){
        Tile tile1=new Tile(new Position(0,0),false,false,false,false,false,true,false);
        assertEquals(tile1.isFire(),false);
        assertEquals(tile1.isHills(),false);
        assertEquals(tile1.isJangle(),false);
        assertEquals(tile1.isEnemy(),false);
        assertEquals(tile1.isEmpty(),false);
        assertEquals(tile1.isLevel(),true);
        assertEquals(tile1.isLife(),false);
    }
    @Test
    void EnergyExistance(){
        Tile tile1=new Tile(new Position(0,0),false,false,false,false,false,false,true);
        assertEquals(tile1.isFire(),false);
        assertEquals(tile1.isHills(),false);
        assertEquals(tile1.isJangle(),false);
        assertEquals(tile1.isEnemy(),false);
        assertEquals(tile1.isEmpty(),false);
        assertEquals(tile1.isLevel(),false);
        assertEquals(tile1.isLife(),true,"One life/food is available in this position ");
    }

    // TEST TYPE TDD(test driven dev)


}