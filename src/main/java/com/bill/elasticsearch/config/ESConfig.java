package com.bill.elasticsearch.config;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;

@Configuration
public class ESConfig {

	     @Bean
	     RestHighLevelClient elasticsearchClient() {
	         ClientConfiguration configuration = ClientConfiguration.builder()
	                 .connectedTo("192.168.99.100:9200")
	   		//.withConnectTimeout(Duration.ofSeconds(5))                        
	 		//.withSocketTimeout(Duration.ofSeconds(3))                         
	 		//.useSsl()                                                         
	 		//.withDefaultHeaders(defaultHeaders)                               
	 		//.withBasicAuth(username, password)                                
	 		// ... other options
	                 .build();
	         RestHighLevelClient client = RestClients.create(configuration).rest();
	  
	         return client;
	     }
	  
}
