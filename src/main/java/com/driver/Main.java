package com.driver;

public class Main {

    public static void main(String[] args){
       Product p = new Product();
       int ans = p.product(2, 6);
       int ans1 = p.product(4, 7, 8);
       double ans2 = p.product(10.2, 9.7);
    }

    public static class Product{
        public int product(int x, int y) {
            return x*y;
        }

        public int product(int x, int y, int z) {
            return x*y*z;
        }

        public double product(double x, double y) {
            return x*y;
        }
    }

}