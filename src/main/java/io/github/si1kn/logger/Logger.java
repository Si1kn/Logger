package io.github.si1kn.logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static final Logger instance = new Logger();

    public void warn(String messageLog) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        System.out.println("[" + Thread.currentThread().getName() + "] Time: " + dtf.format(now) + " [WARN]: " + messageLog);
    }

    public void log(String messageLog) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        System.out.println("[" + Thread.currentThread().getName() + "] Time: " + dtf.format(now) + " [LOG]: " + messageLog);
    }

    public void info(String messageLog) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        System.out.println("[" + Thread.currentThread().getName() + "] Time: " + dtf.format(now) + " [INFO]: " + messageLog);
    }

    public void error(String messageLog) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        System.out.println("[" + Thread.currentThread().getName() + "] Time: " + dtf.format(now) + " [ERROR]: " + messageLog);
    }


    public static Logger getInstance() {
        return instance;
    }
}
