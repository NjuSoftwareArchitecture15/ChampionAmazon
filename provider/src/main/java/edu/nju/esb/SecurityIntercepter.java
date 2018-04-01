package edu.nju.esb;

import edu.nju.esbModel.Request;
import edu.nju.esbModel.Response;

public interface SecurityIntercepter {

    //对request进行拦截，然后进行处理
    void preHandle(Request request, Response response);


    void postHandle(Request request, Response reponse);


    void afterCompletion(Request request, Response reponse);

}
