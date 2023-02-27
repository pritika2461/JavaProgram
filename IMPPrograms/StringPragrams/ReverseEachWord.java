// WAP to reverse each word in a string
package StringPragrams;

public class ReverseEachWord 
{
 
		public static String reverseWord(String str){  
		    String words[]=str.split("\\s");  
		    String reverseWord="";  
		    for(String w:words){  
		        StringBuilder sb=new StringBuilder(w);  
		        sb.reverse();  
		        reverseWord+=sb.toString()+" ";  
		    }  
		    return reverseWord.trim();  
		}  
		
	public static void main(String[] args)
	{
		 System.out.println(ReverseEachWord.reverseWord("my nama is pritika"));  
		    System.out.println(ReverseEachWord.reverseWord("I am pritika somase"));    

	}

}
