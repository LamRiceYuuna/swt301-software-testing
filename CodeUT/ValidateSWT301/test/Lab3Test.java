/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.sun.istack.internal.NotNull;
import java.util.NoSuchElementException;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author admin
 */
public class Lab3Test {
    
    public Lab3Test() {
    }

    /**
     * Test of checkTriangle method, of class Lab3.
     */
    @Test
    public void testCheckTriangleWithValidInput() {
        String sideA = "3";
        String sideB = "4";
        String sideC = "5";
        boolean expResult = true;
        boolean result = Lab3.checkTriangle(sideA, sideB, sideC);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkTriangle method, of class Lab3.
     */
    @Test
    public void testCheckTriangleWithCreateEquilateralTriangle() {
        String sideA = "6";
        String sideB = "6";
        String sideC = "6";
        boolean expResult = true;
        boolean result = Lab3.checkTriangle(sideA, sideB, sideC);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkTriangle method, of class Lab3.
     */
    @Test
    public void testCheckTriangleWith1SlideEqualZero() {
        String sideA = "0";
        String sideB = "4";
        String sideC = "5";
        boolean expResult = false;
        boolean result = Lab3.checkTriangle(sideA, sideB, sideC);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkTriangle method, of class Lab3.
     */
    @Test
    public void testCheckTriangleWith1SlideEqualNegativeInteger() {
        String sideA = "-6";
        String sideB = "4";
        String sideC = "5";
        boolean expResult = false;
        boolean result = Lab3.checkTriangle(sideA, sideB, sideC);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkTriangle method, of class Lab3.
     */
    @Test
    public void testCheckTriangleWith1SlideIsString() {
        String sideA = "abcd";
        String sideB = "4";
        String sideC = "5";
        boolean expResult = false;
        boolean result = Lab3.checkTriangle(sideA, sideB, sideC);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkTriangle method, of class Lab3.
     */
    @Test
    public void testCheckTriangleWith1SlideIsEmpty() {
        String sideA = "";
        String sideB = "4";
        String sideC = "5";
        boolean expResult = false;
        boolean result = Lab3.checkTriangle(sideA, sideB, sideC);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkTriangle method, of class Lab3.
     */
    @Test
    public void testCheckTriangleWithSumOf2SlideLessThan1Slide() {
        String sideA = "1";
        String sideB = "4";
        String sideC = "6";
        boolean expResult = false;
        boolean result = Lab3.checkTriangle(sideA, sideB, sideC);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkTriangle method, of class Lab3.
     */
    @Test
    public void testCheckTriangleWithOneSlideMoreThanMaxValue() {
        String sideA = "2147483648";
        String sideB = "4";
        String sideC = "6";
        boolean expResult = false;
        boolean result = Lab3.checkTriangle(sideA, sideB, sideC);
        assertEquals(expResult, result);
    }
    

    /**
     * Test of isPrime method, of class Lab3.
     */
    @Test
    public void testIsPrimeWithInputValid() {
        String number = "5";
        boolean expResult = true;
        boolean result = Lab3.isPrime(number);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isPrime method, of class Lab3.
     */
    @Test
    public void testIsPrimeWithInputDoubleNumber() {
        String number = "10.5";
        boolean expResult = false;
        boolean result = Lab3.isPrime(number);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isPrime method, of class Lab3.
     */
    @Test
    public void testIsPrimeWithInputEmpty() {
        String number = "";
        boolean expResult = false;
        boolean result = Lab3.isPrime(number);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsPrimeWithInputString() {
        String number = "asdfa";
        boolean expResult = false;
        boolean result = Lab3.isPrime(number);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsPrimeWithInputZero() {
        String number = "0";
        boolean expResult = false;
        boolean result = Lab3.isPrime(number);
        assertEquals(expResult, result);
    }
    
    
    @Test
    public void testIsPrimeWithInputOne() {
        String number = "1";
        boolean expResult = false;
        boolean result = Lab3.isPrime(number);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsPrimeWithInputNegativeInteger() {
        String number = "-15";
        boolean expResult = false;
        boolean result = Lab3.isPrime(number);
        assertEquals(expResult, result);
    }
    

    /**
     * Test of calculateFactorial method, of class Lab3.
     */
    @Test
    public void testCalculateFactorialInputValid() {
        String number = "5";
        long expResult = 120;
        long result = Lab3.calculateFactorial(number);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalculateFactorialInputZero() {
        String number = "0";
        long expResult = 1;
        long result = Lab3.calculateFactorial(number);
        assertEquals(expResult, result);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculateFactorialInputEmpty() {
        String number = "";
        long result = Lab3.calculateFactorial(number);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculateFactorialInputStringNotNumber() {
        String number = "abcd";
        long result = Lab3.calculateFactorial(number);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculateFactorialInputNegativeNumber() {
        String number = "-10";
        long result = Lab3.calculateFactorial(number);
    }
    
    @Test
    public void testCalculateFactorialInputLargerIntegerNumber() {
        String number = "300";
        long expResult = 156315654;
        long result = Lab3.calculateFactorial(number);
        Assert.assertNotEquals(expResult, result);
    }
    

    /**
     * Test of isValidPassword method, of class Lab3.
     */
    @Test
    public void testIsValidPasswordWithInputValid() {
        String password = "Abc123!@";
        boolean expResult = true;
        boolean result = Lab3.isValidPassword(password);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsValidPasswordWithInputLess8Characters() {
        String password = "Abc12";
        boolean expResult = false;
        boolean result = Lab3.isValidPassword(password);
        assertEquals(expResult, result);
    }
    
    
    @Test
    public void testIsValidPasswordWithInputOnlyUpperCharAndNumber() {
        String password = "Abc12345";
        boolean expResult = false;
        boolean result = Lab3.isValidPassword(password);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsValidPasswordWithInputOnlyLowerCharAndSpecialChar() {
        String password = "abc!@#$%";
        boolean expResult = false;
        boolean result = Lab3.isValidPassword(password);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsValidPasswordWithInputOnlyUpperChar() {
        String password = "ABCDEFGH";
        boolean expResult = false;
        boolean result = Lab3.isValidPassword(password);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsValidPasswordWithInputOnlyNumber() {
        String password = "123456798";
        boolean expResult = false;
        boolean result = Lab3.isValidPassword(password);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsValidPasswordWithInputOnlyLowerChar() {
        String password = "abcderdg";
        boolean expResult = false;
        boolean result = Lab3.isValidPassword(password);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsValidPasswordWithInputOnlySpecialChar() {
        String password = "!@#$%$^%*^";
        boolean expResult = false;
        boolean result = Lab3.isValidPassword(password);
        assertEquals(expResult, result);
    }

    /**
     * Test of isValidPhoneNumber method, of class Lab3.
     */
    @Test
    public void testIsValidPhoneNumberInputValid() {
        String phoneNumber = "0123-456-789";
        boolean expResult = true;
        boolean result = Lab3.isValidPhoneNumber(phoneNumber);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsValidPhoneNumberInputWithLengthNot10Number() {
        String phoneNumber = "0123-456-78";
        boolean expResult = false;
        boolean result = Lab3.isValidPhoneNumber(phoneNumber);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsValidPhoneNumberInputWithIncludeChar() {
        String phoneNumber = "0123-456-acb";
        boolean expResult = false;
        boolean result = Lab3.isValidPhoneNumber(phoneNumber);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsValidPhoneNumberInputWithNotBeginZero() {
        String phoneNumber = "3123-456-456";
        boolean expResult = false;
        boolean result = Lab3.isValidPhoneNumber(phoneNumber);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsValidPhoneNumberInputZero() {
        String phoneNumber = "";
        boolean expResult = false;
        boolean result = Lab3.isValidPhoneNumber(phoneNumber);
        assertEquals(expResult, result);
    }

    /**
     * Test of isPositiveNumberInRange method, of class Lab3.
     */
    @Test
    public void testIsPositiveNumberInRangeWithInputValid() {
        String input = "5";
        boolean expResult = true;
        boolean result = Lab3.isPositiveNumberInRange(input);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsPositiveNumberInRangeWithInputLowBoundary() {
        String input = "1";
        boolean expResult = true;
        boolean result = Lab3.isPositiveNumberInRange(input);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsPositiveNumberInRangeWithInputUpBoundary() {
        String input = "10";
        boolean expResult = true;
        boolean result = Lab3.isPositiveNumberInRange(input);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsPositiveNumberInRangeWithInputOutRange() {
        String input = "15";
        boolean expResult = false;
        boolean result = Lab3.isPositiveNumberInRange(input);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsPositiveNumberInRangeWithInputNegative() {
        String input = "-15";
        boolean expResult = false;
        boolean result = Lab3.isPositiveNumberInRange(input);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsPositiveNumberInRangeWithInputZero() {
        String input = "0";
        boolean expResult = false;
        boolean result = Lab3.isPositiveNumberInRange(input);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsPositiveNumberInRangeWithInputEmpty() {
        String input = "";
        boolean expResult = false;
        boolean result = Lab3.isPositiveNumberInRange(input);
        assertEquals(expResult, result);
    }
    }
