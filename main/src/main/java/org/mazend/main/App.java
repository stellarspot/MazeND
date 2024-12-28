package org.mazend.main;

import org.mazend.maze.MazeND;

public class App {
    public static void main(String[] args) {
        System.out.printf("Hello, Maze!%n");
        MazeND maze = new MazeND(4);
        System.out.printf("Maze dimension: %d%n", maze.getDimension());
    }
}
