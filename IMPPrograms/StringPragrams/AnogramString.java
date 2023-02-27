package StringPragrams;

public class AnogramString
{
	static final int NO_OF_CHARS = 256;
	 

    static boolean canFormPalindrome(String str)
    {
        int[] count = new int[NO_OF_CHARS];
 
        for (int i = 0; i < str.length(); i++)
            count[str.charAt(i)]++;
 
        // Count odd occurring characters
        int odd = 0;
        for (int i = 0; i < NO_OF_CHARS; i++) {
            if ((count[i] & 1) != 0)
                odd++;
 
            if (odd > 1)
                return false;
        }
 
        // Return true if odd count is 0 or 1,
        return true;
    }
 
    
    public static void main(String args[])
    {
        System.out.println(canFormPalindrome("geeksforgeeks")
                               ? "Yes"
                               : "No");
        System.out.println(canFormPalindrome("geeksogeeks")
                               ? "Yes"
                               : "No");
    }
}
