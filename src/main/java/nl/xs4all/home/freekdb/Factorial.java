/**
 * Copyright 2014 Freek de Bruijn.
 * Licensed under the Apache License version 2.0 (see http://www.apache.org/licenses/LICENSE-2.0.html).
 */

package nl.xs4all.home.freekdb;

import java.math.BigInteger;

/**
 * Created with IntelliJ IDEA.
 * User: Freek
 * Date: 11-6-2014
 * Time: 16:45
 */
public class Factorial {
    public static void main(final String[] arguments) {
        final BigInteger number = new BigInteger("42");
        System.out.println(number + "! = " + new Factorial().factorial(number));
    }

    public BigInteger factorial(final BigInteger number) {
        final BigInteger zero = BigInteger.ZERO;
        final BigInteger one = BigInteger.ONE;
        return number.compareTo(zero) <= 0 ? one : number.multiply(factorial(number.subtract(one)));
    }
}
