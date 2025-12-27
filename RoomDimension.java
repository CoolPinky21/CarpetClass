/*
  Ashley Palmer
June 2025
Chapter 8
*/
public class RoomDimension{
   private double length;
   private double width;
   public RoomDimension(double len, double w){
      length = len;
      width = w;
   }
   public double getArea(){
      double area = length * width;
      return area;
   }
   public String toString(){
      return "Total Area: " + getArea();
   }
}