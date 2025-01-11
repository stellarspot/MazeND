package org.mazend.utils.loader.jackson;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import org.mazend.utils.loader.Levels;
import org.mazend.utils.loader.LevelsLoader;
import java.io.IOException;
import java.net.URL;

public class JacksonLevelLoader implements LevelsLoader {

    public Levels loadLevels(URL levelsURL) throws IOException {
        ObjectMapper objectMapper = new YAMLMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return objectMapper.readValue(levelsURL, Levels.class);
    }
}
