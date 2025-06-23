package com.example;

public class FilePrinter extends Printer {
    public FilePrinter(Channel channel) {
        super(channel);
    }

    @Override
    protected String formatMessage(String msg) {
        return "[File] " + msg;
    }
}
