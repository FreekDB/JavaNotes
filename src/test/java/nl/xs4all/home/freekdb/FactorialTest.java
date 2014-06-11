/**
 * Copyright 2014 Freek de Bruijn.
 * Licensed under the Apache License version 2.0 (see http://www.apache.org/licenses/LICENSE-2.0.html).
 */

package nl.xs4all.home.freekdb;

import java.math.BigInteger;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Freek
 * Date: 11-6-2014
 * Time: 16:51
 */
public class FactorialTest {
    @Test
    public void testFactorial() {
        final Factorial factorial = new Factorial();
        assertEquals(BigInteger.ONE, factorial.factorial(BigInteger.ZERO));
        assertEquals(new BigInteger("120"), factorial.factorial(new BigInteger("5")));
        assertEquals(new BigInteger("3628800"), factorial.factorial(BigInteger.TEN));
        final BigInteger prettyBigInteger = new BigInteger("1405006117752879898543142606244511569936384000000000");
        assertEquals(prettyBigInteger, factorial.factorial(new BigInteger("42")));
    }
}
