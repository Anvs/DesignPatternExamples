package ru.anvs.designpatterns.creational.factory_method;


public class Log {
    enum LogType {
        LOG_CONSOLE, LOG_FILE
    }
//    private LogType outType;

    public LogWriter getWriter(Log.LogType outType) {
        LogWriter writer = null;
        switch (outType) {
            case LOG_CONSOLE:
                writer = new ConsoleLogWriter();
                break;
            case LOG_FILE:
                writer = new FileLogWriter();
        }
        return writer;
    }
}