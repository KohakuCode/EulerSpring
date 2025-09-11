package com.Kohaku.EulerSpring;

import com.fasterxml.jackson.databind.JsonSerializer;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Euler6 {
    @Autowired
    private MathHelper mathHelper;


    /**
     * Finds the difference of the sum of squares and the square of the sum of the first 100 natural numbers
     * @return sumSquareDifference
     */

    public int sumSquareDifference() {
        return mathHelper.getSquareOfSum() - mathHelper.getSumOfSquares();
    }




}
