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
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        if(a <= 0 || b <= 0 || c <= 0){
            System.out.println("This is not valid values for a Triangle, all sides need to be a 1 or higher");
        }else if(a == b && b == c){
            System.out.println("This is a equilateral Triangle");
        }else if(a == b && b != c || b == c && b != a || a == c && a != b){
            System.out.println("This is a isoscele Triangle");
        }else if(a != b && b != c){
            System.out.println("This is a scalene Triangle");
        }
        System.out.println("************** End ************");
    }
    
}
