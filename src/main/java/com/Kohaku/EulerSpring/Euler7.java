package com.Kohaku.EulerSpring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Euler7 {
    private boolean isPrimenumber(long testNumber) {
        if (testNumber < 2)
            return false;

        for (long x = 2L; x * x <= testNumber; x++) {
            if (testNumber % x == 0)
                return false;
        }
        return true;
    }

    public long getPrimeNumber(int n) {
        List<Long> primeNumbers = new ArrayList<>();
        long candidateNumber = 2;

        while (primeNumbers.size() < n) {
            if (isPrimenumber(candidateNumber)) {
                primeNumbers.add(candidateNumber);
            }
            candidateNumber++;
        }
        return primeNumbers.get(n - 1);
    }

}
