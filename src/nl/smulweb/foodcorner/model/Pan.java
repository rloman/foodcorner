package nl.smulweb.foodcorner.model;

import java.awt.Color;

public class Pan {
   
   private String brand;
   
   private int size;
   private int width;
   private double weight;
   private Color color;
   
   public Pan() {
   }
   
   public Pan(String myBrand, int width) {
      brand = myBrand;
      this.width = width;
   }
   
   
   public int getSize() {
      return size;
   }
   
   public void setSize(int size) {
      this.size = size;
   }
   
   public double getWeight() {
      return weight;
   }
   
   public void setWeight(double weight) {
      this.weight = weight;
   }

   
   public String getBrand() {
      return brand;
   }

   
   public void setBrand(String brand) {
      this.brand = brand;
   }

   
   public Color getColor() {
      return color;
   }

   
   public void setColor(Color color) {
      this.color = color;
   }
   
}
