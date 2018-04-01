package edu.nju.esb.filter;

import edu.nju.esb.SecurityIntercepter;
import edu.nju.esbModel.Request;
import edu.nju.esbModel.Response;

public class UserAuthority implements SecurityIntercepter {

    private DenyRecord record;

    public UserAuthority() {
        record = DenyRecord.getInstance();
    }


    public void validateUser(Request request, Response response) {

    }

    public void authorizeUser(Request request, Response response) {

    }

    public void forbidUser(Request request, Response response) {

    }

    public void preHandle(Request request, Response response) {

    }

    public void postHandle(Request request, Response reponse) {

    }

    public void afterCompletion(Request request, Response reponse) {

    }
}
