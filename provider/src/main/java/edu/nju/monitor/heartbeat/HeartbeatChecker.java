package edu.nju.monitor.heartbeat;

public class HeartbeatChecker {

    private static HeartbeatChecker instance;

    private int maxTimeInterval;

    private HeartbeatChecker() {
        maxTimeInterval = 100;
    }

    public static HeartbeatChecker getInstance() {
        if (instance == null) {
            synchronized (HeartbeatChecker.class) {
                if (instance == null)
                    instance = new HeartbeatChecker();
            }
        }
        return instance;
    }


    /**
     * 看门狗
     */
    public void cancelWarning() {
        //TODO
    }

    /**
     * 报警
     */
    public void warning() {
        //TODO
    }
}
