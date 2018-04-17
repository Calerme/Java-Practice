package com.LittleJava;

// 定义多项式，求解
// f(x, y)  = a*x + b*y
public class QuadPolynomial {

    // 这是类里的状态
    public int a;
    public int b;
    public int c;

    public int result(int x) {
        return a*x*x + b*x + c + 54;
    }
}
