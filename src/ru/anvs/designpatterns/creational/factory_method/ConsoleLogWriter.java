package ru.anvs.designpatterns.creational.factory_method;

public class ConsoleLogWriter implements LogWriter {

    @Override
    public void write(final String event) {
    	System.out.println(this.getClass().getName());
        System.out.println(">> " + event);
    }
}