package ru.anvs.designpatterns.creational.factory_method;

public class FactoryMethodDemo {


    public static void main(String[] args) {
        String event = "smth happened!";
        LogWriter writer_c;
        LogWriter writer_f;
        Log l = new Log();
        writer_c = l.getWriter(Log.LogType.LOG_CONSOLE);
        writer_f = l.getWriter(Log.LogType.LOG_FILE);
        writer_c.write(event);
        writer_f.write(event);

    }
}
