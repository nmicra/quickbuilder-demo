package com.nmicra.math.service;

public class MathErrorImpl implements MathService {
    public void addTwoNumbers(Integer a, Integer b) {
        throw new RuntimeException("I'm lazy don't want to implement this service");
    }
}
