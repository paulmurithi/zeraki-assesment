
package missinginteger;

public class MissingInteger {

    /**
     * get the missing integer 
     * we apply mathematical formula whereby the summing up numbers from 1 to N 
     * gives you the sum of a all the numbers
     * N *(N+1)/2
     */
    public static int missingInt(int K[], int len) 
    { 
        int i, total; 
        total = (len + 1) * (len + 2) / 2; 
//        subtract every number in the array to get the missing one
        for (i = 0; i < len; i++) 
            total -= K[i]; 
        
        return total; 
    } 
  
    /* program to test above function */
    public static void main(String args[]) 
    { 
        //declare and initialize array
        int array_k[] = { 1,2,3,4,5,7 }; 
        int missing_num = missingInt(array_k, 6); 
        System.out.println(missing_num); 
    } 
    
}
