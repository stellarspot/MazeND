package org.mazend.utils.loader;

import java.io.IOException;
import java.net.URL;

public interface LevelsLoader {
    Levels loadLevels(URL levelsURL) throws IOException;
}
