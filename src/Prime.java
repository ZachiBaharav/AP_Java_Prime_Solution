
/**
 *
 * @author Dr. Baharav
 */

/*

It is not a good practice usually, but since we do it BEFORE we learned arrays
or lists, out output will be printed rather than returned as an array (or a list).

*/

public class Prime {

    public static boolean isPrime(int n) {
        
        for (int ii=2; ii<=Math.sqrt(n) ; ++ii)
            if (n%ii ==0)
                return false;
        
        return true;
    }
    
    
    
    public static void allPrimesUpTo(int n) {
        System.out.println("allPrimesUpTo(" + n + ")");
        int cnt = 0;
        for (int ii=2; ii<=n; ++ii)
            if (isPrime(ii)) {
                cnt++;
                System.out.println(cnt + " :: " + ii);
            }
    }
    
    public static void firstNPrimes(int n) {
        System.out.println("firstNPrimes(" + n + ")");

        int ii=2;
        int cnt = 0;

        while ( cnt<n ) {
            if (isPrime(ii)) {
                cnt++;
                System.out.println(cnt + " :: " + ii);
            }
            ii++;
        }
          
    } 
    
    /* check your answers
    https://www.miniwebtool.com/list-of-prime-numbers/?to=1000
    */
    public static void main(String[] args) {
        
       int n=7;
       System.out.println("isPrime(" + n + ") ==> " + isPrime(n) );
       n=401;
       System.out.println("isPrime(" + n + ") ==> " + isPrime(n) );
       n=839;
       System.out.println("isPrime(" + n + ") ==> " + isPrime(n) );
       n=841;
       System.out.println("isPrime(" + n + ") ==> " + isPrime(n) );
        
       n=1000;
       allPrimesUpTo(n);
       firstNPrimes(n);
       
       
    }
}
