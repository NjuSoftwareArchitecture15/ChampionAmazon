package edu.nju.esb.verifier;

import edu.nju.monitor.heartbeat.HeartbeatChecker;

public class DataVerifier {

    private HeartbeatChecker heartbeatChecker;

    public DataVerifier() {
        super();
        heartbeatChecker = HeartbeatChecker.getInstance();
    }

    public boolean verify(String data){
        //TODO  数据验证
        return false;
    }

}
