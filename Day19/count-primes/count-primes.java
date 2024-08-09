// https://leetcode.com/explore/interview/card/top-interview-questions-easy/102/math/744/
/*
 * Print all prime numbers less than 15.

    Create list = 2,3,4,5,6,7,8,9,10,11,12,13,14,15

    num=2.

    traverse from 2 to √15.

    num =2. Remove all multiples of 2 then list= [ 2,3,0,5,0,7,0,9,0,11,0,13,0,15 ]

    num=3, immediate non zero number.

    Mark all multiples of 3 then list= [ 2,3,0,5,0,7,0,0,0,11,0,13,0,0 ]

    num=5, which is the next prime, but num is not <=√15.

    Now we have generated all the prime numbers less than 15. Prime numbers less than 15 are 2, 3, 5, 7, 11, 13.
 */
class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0;
        
        boolean[] primes = new boolean[n];
        Arrays.fill(primes, true);
        
        for (int i = 2; i * i < n; i++) {
            if (primes[i]) {
                for (int j = i; j * i < n; j++) {
                    primes[j * i] = false;
                }
            }
        }
        
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (primes[i]){
                count++;
            }
        }
        
        return count;
    }
}