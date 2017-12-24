package test.life_array;

import life_array.simpleGOL;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class simpleGOLTestTest {

    @Test
    public void before() {
    }

    @Test
    public void after() {
    }

    @Test
    public void testNextWorld() {
        assertEquals(0,new simpleGOL().nextWorld());
    }

    @Test
    public void testPrint() {
        assertEquals(true,new simpleGOL().print());
    }

    @Test
    public void testCellState() {
    }

    @Test
    public void testGetNeighbors() {
    }
}