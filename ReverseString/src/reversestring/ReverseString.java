
package reversestring;

public class ReverseString {

// returns reversed string
    static String reverseSTR_chunks(String s,int k, int len) 
    { 
        String reconstructed_str = new String();
        String reversed_str = null;
        int i = 0;
        while ( i < s.length()) 
        { 

            /**
             * if string length is less than current position + k
             * set end position to be string length(@param len)
             * */
            if (i + k > len) {
                reversed_str = new String(new StringBuilder(s.substring(i, len)).reverse()); 
            }else{
            // Reverse first k characters 
                reversed_str = new String(new StringBuilder(s.substring(i, i + k)).reverse());
            }
            
//            reconstruct new string after reversal iteration
            reconstructed_str += reversed_str;
            
            // Skip the next k characters 
            i += k;
        } 
        return reconstructed_str; 
    } 

    // Driver code 
    public static void main(String[] args)  
    { 
        String s = " Tempor ip"; 
        int len = s.length(); 
        //chunk size
        int k = 4; 
        System.out.println("Default string:\t\t"+s);
        System.out.println("Reversed string:\t"+reverseSTR_chunks(s, k, len)); 
    } 
    
}
