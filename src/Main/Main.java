/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author florenthaxha
 */
public class Main {
    
    public static void main(String[] args) {
        TriangleChecker tc = new TriangleChecker();
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        System.out.println(tc.triangleRunner(a, b, c));
        
    }
    
}
