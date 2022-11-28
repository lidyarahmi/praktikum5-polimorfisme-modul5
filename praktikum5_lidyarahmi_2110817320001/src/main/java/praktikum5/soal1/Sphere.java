/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5.soal1;

/**
 *
 * @author LIDYA RAHMI
 */
public class Sphere extends Shape {
    private final double radius;
    
    public Sphere(double r){
  super("Sphere");
  radius= r;
    }
    
    @Override
    public double area(){
        return 4*Math.PI*(radius*radius);
    }
    
    @Override
    public String toString(){
        return super.toString() + " of radius " + radius;
        
    }
    
}
