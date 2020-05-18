package com.java.practice;

import java.util.HashSet;
import java.util.Set;

import redis.clients.jedis.Jedis; 

public class RedisKeyJava { 
   public static void main(String[] args) { 
   
      //Connecting to Redis server on localhost 
      Jedis jedis = new Jedis("localhost"); 
      System.out.println("Connection to server sucessfully"); 
      //store data in redis list 
      // Get the stored data and print it 
      Set<String> keysSet = jedis.keys("*"); 
      
      for(int i = 0; i<keysSet.size(); i++) { 
         System.out.println("List of stored keys:: "+keysSet ); 
      } 
   } 
}

