package com.github.italia.daf.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;

@SuppressWarnings("squid:S1148")
public class LoggerFactory {
    static {
        try (InputStream stream = LoggerFactory.class.getClassLoader().getResourceAsStream("logging.properties")) {
            LogManager.getLogManager().readConfiguration(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Logger getLogger(final String className) {
        return Logger.getLogger(className);
    }

    private LoggerFactory() {
        throw new IllegalStateException("Utility class");
    }
}
