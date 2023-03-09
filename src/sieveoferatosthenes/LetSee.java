/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sieveoferatosthenes;

/**
 *
 * @author hunnytaggy
 */
public class LetSee {
    
    static int [] Primes = new int [500001];
    
    static void SieveOfErastothenes(int n){
        Primes [0] = 1;
        for (int i = 3; i*i <= n; i+=2) {
            if (Primes[i/2] == 0) {
                for (int j = 3*i; j <= n; j+=2*i) {
                    Primes[j/2] = 1;
                }
            }
        }
    }
    
    //Driver code
    public static void main(String[] args) {
        int n = 100;
        SieveOfErastothenes(n);
        for (int i = 1; i <= n; i++) {
            if (i == 2) {
                System.out.println(i +"");
            }else if (i%2 == 1 && Primes[i/2] == 0) {
                System.out.println(i + "");
            }
        }
    }
    
}
