/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5.soal1;

/**
 *
 * @author LIDYA RAHMI
 */
public abstract class  Shape {
   protected  String shapeName;
    
   public Shape(String shapeName){
       this.shapeName=shapeName;
   }
   
   protected abstract double area();
       
  /**
     *
     * @return
     */
   
   @Override
   public String toString(){
      return shapeName;

   }
}

