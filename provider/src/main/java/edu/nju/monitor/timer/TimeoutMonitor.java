package edu.nju.monitor.timer;

public class TimeoutMonitor {
    private static TimeoutMonitor instance;

    public static TimeoutMonitor getInstance() {
        if (instance == null) {
            synchronized (TimeoutMonitor.class) {
                if (instance == null)
                    instance = new TimeoutMonitor();
            }
        }
        return instance;
    }

    void reSchedule() {
        //TODO
    }
}
