package edu.nju.esb.filter;

import edu.nju.esbModel.Request;

import java.util.ArrayList;
import java.util.List;

public class DenyRecord {
	List denyList;
	
	private DenyRecord(){
		denyList=new ArrayList();
	}
	
	private static DenyRecord instance;
	
	public void recordDeny(Request request){
		
	}
	
	public void handleDeny(){
		
	}
	
	
	public static DenyRecord getInstance(){
		if(instance==null){
			synchronized(DenyRecord.class){
				if(instance==null){
					instance=new DenyRecord();
				}
			}
			
		}
		
		return instance;
	}

}
