package com.nmicra.math.service;

public class PhysicsDoNothingImpl extends MathDoNothingImpl implements PhysicsService {

    public void addThreeNumbers(Integer a, Integer b, Integer c) {
        System.out.println("PhysicsDoNothingImpl: " + a+b+c );
    }
}
