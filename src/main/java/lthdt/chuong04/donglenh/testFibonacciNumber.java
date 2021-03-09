/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong04.donglenh;

import lthdt.chuong04.logic.FibonacciNumber;

/**
 *
 * @author ASUS
 */
public class testFibonacciNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FibonacciNumber fn = new FibonacciNumber();
        System.out.println("Số FibonacciNumber ở vị trí n = 15 là: "+fn.calcfibo(15));
        for(int i=1; i<=20; i++){
            System.out.println(fn.calcfibo(i) );
        
    
    
}
    }
    
}
