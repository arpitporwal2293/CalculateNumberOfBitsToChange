
public class NumberOfBitsChange {

	//brian kernighan's algorithm
	//do and with last bit and if its one increment
	//then right shift the bits
	 public static int countSetBits(int n)
	    {
	        int count = 0;
	        while (n != 0) {
	        	System.out.println(Integer.toBinaryString(n));
	            count += n & 1;
	            System.out.println(count);
	            n >>= 1;
	        }
	        return count;
	    }
	     
	    public static void main(String[] args)
	    {
	        int a = 30;
	        int b = 20;
	        //counting the number of set bits after xor of a and b
	        System.out.print(countSetBits(a ^ b));
	    }
	
}
