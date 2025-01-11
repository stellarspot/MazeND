package org.mazend.main;

import org.mazend.maze.MazeND;
import org.mazend.utils.loader.Level;
import org.mazend.utils.loader.Levels;
import org.mazend.utils.loader.LevelsLoader;
import org.mazend.utils.loader.jackson.JacksonLevelLoader;

import java.io.File;
import java.net.URL;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.printf("Hello, Maze!%n");
        MazeND maze = new MazeND(4);
        System.out.printf("Maze dimension: %d%n", maze.getDimension());

        URL levelsURL = Thread.currentThread().getContextClassLoader().getResource("levels.yml");
        LevelsLoader loader = new JacksonLevelLoader();
        Levels levels = loader.loadLevels(levelsURL);
        System.out.printf("Levels: %d%n", levels.getLevels().length);
        for (Level level : levels.getLevels()) {
            System.out.printf("Level{ %s }%n", level);
        }
    }
}
