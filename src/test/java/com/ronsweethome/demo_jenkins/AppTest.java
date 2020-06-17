/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ronsweethome.demo_jenkins;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ronrs
 */
public class AppTest {
    
    
    /**
     * Test of sum method, of class App.
     */
    @Test
    public void testSum() {
        System.out.println("sum");
        int a = 3;
        int b = 2;
        int expResult = 5;
        int result = App.sum(a, b);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testDifference() {
        System.out.println("sum");
        int a = 3;
        int b = 2;
        int expResult = 1;
        int result = App.difference(a, b);
        assertEquals(expResult, result);
        
    }
    
}
