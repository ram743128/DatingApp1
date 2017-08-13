package com.ram.unittestcase;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ram on 8/10/2017.
 */

public class CalcTest {
    private Calculator mCalc;

    @Before
    public void initTest(){
        mCalc=new Calculator();//initialize calulator object
    }
    @Test
    public void addNumberTest(){

       assertEquals( 45,mCalc.addNumbers(15,30));
    }
    @Test
    public void subtractNumberTest(){
        assertEquals(30,mCalc.subtractNumber(40,15),5);//result between 25 to 30,delta 5 is there
    }
    @Test
    public void multiplyNumberTest(){
        assertEquals(60,mCalc.multplyNumber(12,5));
    }
    @Test
    public void divideNumberTest(){
        assertEquals(40,mCalc.divideNumber(80,2));
    }
}
