package com.vensai.demo;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class KeySpace {
	public static void main(String args[]) {
		//Query
	      String createQuery = "CREATE KEYSPACE test2_keyspace WITH replication "
	         + "= {'class':'SimpleStrategy', 'replication_factor':1};";
	      
	      String alterQuery = "ALTER KEYSPACE test2_keyspace WITH replication "
	 	         + "= {'class':'SimpleStrategy', 'replication_factor': 1} and DURABLE_WRITES = true;";
	                    
	      String dropQuery = "DROP KEYSPACE test2_keyspace";
	      //creating Cluster object
	      Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
	    
	      //Creating Session object
	      Session session = cluster.connect();
	     
	      //Executing the query
	      //session.execute(createQuery);
	      //session.execute(alterQuery);
	      session.execute(dropQuery);
	     
	      //using the KeySpace
	      //session.execute("USE tp");
	      System.out.println("Keyspace created"); 
	}
}
