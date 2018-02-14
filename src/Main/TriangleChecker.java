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
public class TriangleChecker {
    
    public String triangleRunner(int a, int b, int c){
        if(isEquilateral(a, b, c)){
            return "This is a equilateral Triangle";
        }else if(isIsoscele(a, b, c)){
            return "This is a isoscele Triangle";
        }else if(isScalene(a, b, c)){
            return "This is a scalene Triangle";
        }
        return "Thats no Triangle";
    }
    
    // returns true if the numbers form a triangle
    private boolean isTriangle(int a, int b, int c){
        return a + b > c && a + c > b && b + c > a;
    }
    // returns true if the triangle is an Equilateral
    public boolean isEquilateral(int a, int b, int c){
        if(isTriangle(a, b, c)) return a == b && b == c;
        return false;     
    }
    // returns true if the triangle is Isoscele
    public boolean isIsoscele(int a, int b, int c){
        if(isTriangle(a, b, c)) return a == b && b != c || b == c && b != a || a == c && a != b;
        return false;
    }
    // returns true if the triangle is Scalene
    public boolean isScalene(int a, int b, int c){
        if(isTriangle(a, b, c)) return a != b && b != c; 
        return false;
    }
    
}
