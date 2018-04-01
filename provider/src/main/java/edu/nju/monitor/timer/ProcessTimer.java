package edu.nju.monitor.timer;

public class ProcessTimer {

    private static ProcessTimer instance;

    private ProcessTimer processTimer;

    private TimeoutMonitor timeoutMonitor;

    private ProcessTimer() {
        this.processTimer = ProcessTimer.getInstance();
        this.timeoutMonitor = TimeoutMonitor.getInstance();
    }

    public static ProcessTimer getInstance() {
        if (instance == null) {
            synchronized (ProcessTimer.class) {
                if (instance == null)
                    instance = new ProcessTimer();
            }
        }
        return instance;
    }

    void timeOut() {

    }
}
