package com.Kohaku.EulerSpring;

import org.springframework.stereotype.Component;

@Component
public class Euler8 {

    private String digitString = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
    private final int ADJACENT_DIGIT_COUNT = 13;

    /**
     * Finds the largest product of any 13 adjacent digits within the 'checkDigitNumber' string.
     * This method iterates through the string using a sliding window of 13 characters,
     * calculates the product for each window, and keeps track of the maximum product found.
     *
     * @return The greatest product of 13 adjacent digits as a long. Returns 0 if no product is found
     * or if the string is shorter than 13 characters.
     */
    public long getLargestProduct() {
        long largestProduct = 0;

        for (int i = 0; i <= digitString.length() - ADJACENT_DIGIT_COUNT; i++) {
            long currentProduct = getProductOfNumbers(digitString.substring(i, i + ADJACENT_DIGIT_COUNT));
            if (currentProduct > largestProduct) {
                largestProduct = currentProduct;
            }
        }
        return largestProduct;
    }

    private long getProductOfNumbers(String numbers) {
        long product = 1;
        for (int x = 0; x < numbers.length(); x++) {
            int digit = Character.getNumericValue(numbers.charAt(x)); //get number as int at index x

            if (digit == 0) {
                return 0;
            }

            product *= digit;
        }
        return product;
    }
}

