// WAP to count the number of worlds in a string using hashmap
package assignment9;

import java.util.HashMap;
import java.util.Map;

public class CountWorlds {

	public static void main(String[] args) 
	{
	        // Declaring the String
	        String str = "Alice is girl and Bob is boy";
	        // Declaring a HashMap of <String, Integer>
	        Map<String, Integer> hashMap = new HashMap<>();
	 
	        String[] words = str.split(" ");
	 
	        for (String word : words) 
	        {
	            Integer integer = hashMap.get(word);
	 
	            if (integer == null)
	                hashMap.put(word, 1);
	 
	            else {
	                
	                hashMap.put(word, integer + 1);
	            }
	        }
	        System.out.println(hashMap);
	    }	

	}

