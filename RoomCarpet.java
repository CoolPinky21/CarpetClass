/*
  Ashley Palmer
June 2025
Chapter 8
*/
public class RoomCarpet{
   private RoomDimension size;
   private double carpetCost;
   public RoomCarpet(RoomDimension dim, double cost){
      size = dim;
      carpetCost = cost;
   }
   public double getTotalCost(){
      double total = size.getArea() * carpetCost;
      return total;
   }
   public String toString(){
      return "The cost is $" + getTotalCost();
   }
}