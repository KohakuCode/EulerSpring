package com.Kohaku.EulerSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Euler7 {

    @Autowired
    private MathHelper mathHelper;

    /**
     * Finds the nth prime number using a brute-force search.
     *
     * @param targetPrimeNumberIndex The index of the prime number to find (e.g., n=6 for the 6th prime).
     * @return The nth prime number as a long.
     */
    public long getNthPrimeNumber(int targetPrimeNumberIndex) {

        return mathHelper.getPrimeNumbers(targetPrimeNumberIndex).get(targetPrimeNumberIndex-1);
    }


}


