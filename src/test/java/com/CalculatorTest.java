package com;

import org.junit.jupiter.api.Test;

import com.qianhong.calculator.CalculatorService;
import com.qianhong.calculator.CalculatorServiceTest;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
private final CalculatorService calculator = new CalculatorService();
@Test
public void testAdd(){

assertEquals(5,calculator.Add(2,3),"2+3 shoud equal 5");


}


}
