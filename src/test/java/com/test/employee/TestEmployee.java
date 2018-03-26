/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.employee;

import com.myemployee.employee.employee;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ckurt
 */
public class TestEmployee {
    
    employee employee;
    
    public TestEmployee() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        employee = new employee();
        
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void firstName() {
     employee.setFirstname("Craig");
        assertEquals("Craig", employee.getFirstname());
        System.out.println("First Name Check Inprogress"); 
        System.out.println("First Name of " + employee.getFirstname() + " was successful");
        
    }
    
    @Test
    public void lastName() {
     employee.setLastname("Kurtz");
        assertEquals("Kurtz", employee.getLastname());
        System.out.println("Last Name Check Inprogress"); 
        System.out.println("Lase Name of " + employee.getLastname()+ " was successful");
}
   @Test
    public void employeeNum() {
        
        
     employee.setEmployeeNum(10000);
       assertEquals(10000, 10000, 0);
    }
}
