package com.bill.elasticsearch.config;
//
//import java.io.Closeable;
//import java.io.IOException;
//import java.util.Set;
//
//import org.springframework.context.annotation.Configuration;
//
//import io.searchbox.action.Action;
//import io.searchbox.client.JestResult;
//import io.searchbox.client.JestResultHandler;
//
//@Configuration
//public class MyESConfig {
//
//	
//	public interface JestClient extends Closeable {
//
//	    <T extends JestResult> T execute(Action<T> clientRequest) throws IOException;
//
//	    <T extends JestResult> void executeAsync(Action<T> clientRequest, JestResultHandler<? super T> jestResultHandler);
//
//	    /**
//	     * @deprecated Use {@link #close()} instead.
//	     */
//	    @Deprecated
//	    void shutdownClient();
//
//	    void setServers(Set<String> servers);
//	}
//}
