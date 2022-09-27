package week2.task2.c;

import java.util.Scanner;

public class SieveOfEratosthenes {
    static void sieveOfEratosthenes(int n)
    {
        // Create a boolean array "prime[0…n]" and initialize
        // all entries it as true. A value in prime[i] will
        // finally be false if I am Not a prime, else true.
        boolean[] prime = new boolean[n+1];
        for(int i=0;i<=n;i++)
            prime[i] = true;

        for(int p = 2; p*p <=n; p++)
        {
            // If prime[p] is not changed, then it is a prime
            if(prime[p])
            {
                // Update all multiples of p
                for(int i = p*p; i <= n; i += p)
                    prime[i] = false;
            }
        }

        // Print all prime numbers
        for(int i = 2; i <= n; i++)
        {
            if(prime[i])
                System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter a diapason numbers >>>");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.print("Following are the prime numbers ");
        System.out.println("smaller than or equal to " + n);
        sieveOfEratosthenes(n);
    }
}
