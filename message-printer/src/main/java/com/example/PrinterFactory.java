package com.example;

public class PrinterFactory {
    public static Printer createPrinter(String type, Channel channel) {
        return switch (type.toLowerCase()) {
            case "console" -> new ConsolePrinter(channel);
            case "file" -> new FilePrinter(channel);
            default -> throw new IllegalArgumentException("Unknown printer type: " + type);
        };
    }
}
