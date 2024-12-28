package org.mazend.maze;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MazeNDTest {
    @Test void testConstructor() {
        MazeND maze = new MazeND(4);
        assertEquals(4, maze.getDimension());
    }
}
