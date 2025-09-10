package com.Kohaku.EulerSpring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Euler7 {

    /**
     * Finds the nth prime number using a brute-force search.
     * <p>
     * This method iterates through natural numbers, tests each for primality,
     * and collects them until the nth prime is found.
     *
     * @param targetPrimeNumberIndex The index of the prime number to find (e.g., n=6 for the 6th prime).
     * @return The nth prime number as a long.
     */
    public long getNthPrimeNumber(int targetPrimeNumberIndex) {
        List<Long> primeNumbers = new ArrayList<>();
        long candidateNumber = 2;

        while (primeNumbers.size() < targetPrimeNumberIndex) {
            if (isPrimenumber(candidateNumber)) {
                primeNumbers.add(candidateNumber);
            }
            candidateNumber++;
        }
        return primeNumbers.get(targetPrimeNumberIndex - 1);
    }

    private boolean isPrimenumber(long testNumber) {
        if (testNumber < 2) return false;

        for (long x = 2L; x * x <= testNumber; x++) {
            if (testNumber % x == 0)
                return false;
        }
        return true;
    }

}
