package com.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class USBChannel implements Channel {
    private static final Logger logger = Logger.getLogger(USBChannel.class.getName());

    @Override
    public void send(String message) {
        logger.log(Level.INFO, "[USB] Sending: {0}", message);
    }
}
