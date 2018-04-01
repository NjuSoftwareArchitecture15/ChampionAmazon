package edu.nju.monitor.timer;

public class TimeCheck {

    private static TimeCheck instance;

    public static TimeCheck getInstance() {
        if (instance == null) {
            synchronized (TimeCheck.class) {
                if (instance == null)
                    instance = new TimeCheck();
            }
        }
        return instance;
    }

    void check(String process, double time) {

    }
}
