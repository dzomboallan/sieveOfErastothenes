/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sieveoferatosthenes;

/**
 *
 * @author hunnytaggy
 * Java program to print all primes
 * n using Sieve of Eratosthenes
 */
public class SieveOfEratosthenes {

    void SieveOfEratosthenes(int n){
        /* Create a boolean array "prime[0...n]" and initialize all entries it as true. A value
        in prime[i] will finally be false if i is Not a prime, else true.
        */
        boolean prime [] = new boolean[n + 1];
        for (int i = 0; i < n; i++) {
            prime[i] = true;
        }
        
        for (int p = 0; p*p < n; p++) {
            // If prime[p] is not changed, then it is a prime
            if (prime[p] == true) {
                /* Update all multiples of p greater than or equal to the square of it numbers which
                are multiples of p and are less than p^2 are already marked.
                */
                for (int i = p*p; i <= n; i++) {
                    prime[i] = false;
                }
            }
        }
        
        // print all prime numbers
        for (int i = 2; i <= n; i++) {
            if (prime[i] == true) {
                System.out.println(i + " ");
            }
        }
    }
    
    // Driver code
    public static void main(String[] args) {
        int n = 30;
        System.out.println("Following are the prime numbers: ");
        System.out.println("smaller than or equal to "+ n);
        SieveOfEratosthenes g = new SieveOfEratosthenes();
        g.SieveOfEratosthenes(n);
    }
    
}
