package edu.nju.esb.filter;


import edu.nju.monitor.heartbeat.HeartbeatChecker;

public class DataEncryption {

    private HeartbeatChecker heartbeatChecker;

    public DataEncryption() {
        super();
        this.heartbeatChecker = HeartbeatChecker.getInstance();
    }

    /**
     * @param data
     */
    public void encryptData(Object data) {
        //TODO
    }

}
