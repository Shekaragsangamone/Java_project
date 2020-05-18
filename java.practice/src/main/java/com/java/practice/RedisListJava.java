package com.java.practice;
import java.util.List;

import redis.clients.jedis.Jedis; 

public class RedisListJava { 
   public static void main(String[] args) { 
   
      //Connecting to Redis server on localhost 
      Jedis jedis = new Jedis("localhost"); 
      System.out.println("Connection to server sucessfully"); 
      
      //store data in redis list 
      jedis.lpush("tutorial", "1"); 
      jedis.lpush("tutorial", "2");
      jedis.lpush("tutorial", "3"); 
      // Get the stored data and print it 
       List<String> list = jedis.lrange("tutorial",0,5); 
      
      for(int i = 0; i<list.size(); i++) { 
         System.out.println("Stored string in redis:: "+list.get(i)); 
      } 
   } 
} 