package com.hictc.grpcserver.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.grpc.Server;
import io.grpc.ServerBuilder;

//@Component 
public class ContextLoaderListener  extends org.springframework.web.context.ContextLoaderListener { //implements ApplicationListener<ContextRefreshedEvent> { 
	private static final Logger logger = LoggerFactory.getLogger(ContextLoaderListener.class);
	private Server server;
	private int port;
	
//	@Override z	
//	public void onApplicationEvent(final ContextRefreshedEvent event) {
//	@EventListener(ContextRefreshedEvent.class)
//	public void contextRefreshedEvent() {
	 public ContextLoaderListener()  {	        
		port = 8888;
		server = ServerBuilder.forPort(port) .addService(new ProtoTestServiceImpl()) .build(); 
		try {
			this.server.start();
			logger.info("[STARTUP] gRPC Server Listening on port " + port); 
			this.server.awaitTermination();
		} catch (Exception e) {
			logger.info("################### eRROR!");
			e.printStackTrace();
		} 
	} 
}

