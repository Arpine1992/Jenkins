package com.mycompany.app;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


public class AppTest {
    @Test
    public void testAdd() {
        String str = "TestNG is working fine";
        AssertEquals("TestNG is working fine", str);
    }
}