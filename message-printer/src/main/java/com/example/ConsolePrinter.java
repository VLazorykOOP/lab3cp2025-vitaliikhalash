package com.example;

public class ConsolePrinter extends Printer {
    public ConsolePrinter(Channel channel) {
        super(channel);
    }

    @Override
    protected String formatMessage(String msg) {
        return "[Console] " + msg;
    }
}
