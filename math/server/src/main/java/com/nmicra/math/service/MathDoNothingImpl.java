package com.nmicra.math.service;

public class MathDoNothingImpl implements MathService {
    public void addTwoNumbers(Integer a, Integer b) {
        System.out.println("MathDoNothingImpl: " + a+b );
    }
}
