package com.Kohaku.EulerSpring;

import com.fasterxml.jackson.databind.JsonSerializer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Euler6 {
    private final SumSquare sumSquare;

    public Euler6(SumSquare sumSquare) {
        this.sumSquare = sumSquare;
    }

    /**
     * Finds the difference of the sum of squares and the square of the sum of the first 100 natural numbers
     * @return sumSquareDifference
     */

    public int sumSquareDifference() {
        return sumSquare.getSquareOfSum() - sumSquare.getSumOfSquares();
    }




}
