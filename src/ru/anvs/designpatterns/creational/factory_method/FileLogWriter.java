package ru.anvs.designpatterns.creational.factory_method;

public class FileLogWriter implements LogWriter {
    @Override
    public void write(final String event) {
    	System.out.println(this.getClass().getName());
        System.out.print(event + " ... ");
        System.out.println("I should write it to log file, but i`m not able to do it yet. Sorry...");
    }
}