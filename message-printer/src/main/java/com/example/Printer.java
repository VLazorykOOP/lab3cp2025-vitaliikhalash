package com.example;

public abstract class Printer {
    protected Channel channel;

    protected Printer(Channel channel) {
        this.channel = channel;
    }

    public final void printMessage(String msg) {
        String prepared = prepareMessage(msg);
        String formatted = formatMessage(prepared);
        sendMessage(formatted);
    }

    protected String prepareMessage(String msg) {
        return msg.trim();
    }

    protected abstract String formatMessage(String msg);

    protected void sendMessage(String formattedMsg) {
        channel.send(formattedMsg);
    }
}
