package com.service.cse.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.service.cse.bcs.FabricHelper;


@Component
public class Bcstank1Delegate {
	private static Logger logger = LoggerFactory.getLogger(Bcstank1Delegate.class);
    static{	
	FabricHelper helper = FabricHelper.getInstance();
    	helper.setConfigPath("C:\\work\\version\\JavaSDKDemo\\config\\tank-test-sdk-config.yaml");
    	helper.setChannelName("c12345");
    	helper.setChaincodeName("javatestchaincode");
    	helper.setAccessKey("f94cb52579151f11617f0bd878611a0db91023a9");
    }

    public  String LoopInvoke(int loop) throws Exception{
    	FabricHelper helper = FabricHelper.getInstance();
    	for (int i=0; i<loop;i++){
        	helper.invokeBlockchain("invoke", new String[]{"a","b","100"});
           	helper.invokeBlockchain("invoke", new String[]{"b","a","200"});
        	String a=helper.queryBlockchain("query", new String[]{"a"});
        	String b=helper.queryBlockchain("query", new String[]{"b"});
        	logger.info("after invoke  a=" + a +", invoke b=" + b);
        	return "after invoke  a=" + a +", invoke b=" + b;
    	}
    	return "not call bcs service";
    }
    
    
    public String helloworld(String name) throws Exception{
    	
        return LoopInvoke(1);
    }
}
