package com.example;

public class Main {
    public static void main(String[] args) {
        Channel usb = new USBChannel();
        Channel wifi = new WiFiChannel();

        Printer consolePrinter = PrinterFactory.createPrinter("console", usb);
        Printer filePrinter = PrinterFactory.createPrinter("file", wifi);

        consolePrinter.printMessage("Hello from Console!");
        filePrinter.printMessage("Log this to a file");
    }
}
