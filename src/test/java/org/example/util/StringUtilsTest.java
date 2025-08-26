package org.example.util;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test per StringUtils
 */
public class StringUtilsTest extends TestCase {
    
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public StringUtilsTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(StringUtilsTest.class);
    }

    /**
     * Test del metodo isEmpty
     */
    public void testIsEmpty() {
        assertTrue(StringUtils.isEmpty(null));
        assertTrue(StringUtils.isEmpty(""));
        assertTrue(StringUtils.isEmpty("   "));
        assertFalse(StringUtils.isEmpty("test"));
        assertFalse(StringUtils.isEmpty(" test "));
    }
    
    /**
     * Test del metodo capitalize
     */
    public void testCapitalize() {
        assertEquals("Test", StringUtils.capitalize("test"));
        assertEquals("Test", StringUtils.capitalize("TEST"));
        assertEquals("Test", StringUtils.capitalize("tEST"));
        assertEquals(null, StringUtils.capitalize(null));
        assertEquals("", StringUtils.capitalize(""));
    }
}