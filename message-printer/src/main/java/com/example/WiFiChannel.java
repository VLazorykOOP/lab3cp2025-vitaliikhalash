package com.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class WiFiChannel implements Channel {
    private static final Logger logger = Logger.getLogger(WiFiChannel.class.getName());

    @Override
    public void send(String message) {
        logger.log(Level.INFO, "[WiFi] Sending: {0}", message);
    }
}
