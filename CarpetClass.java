/*
  Ashley Palmer
June 2025
Chapter 8
*/
import java.util.*;
public class CarpetClass{
   static Scanner scanner = new Scanner(System.in);
   public static void main(String[] args){
      System.out.print("Enter the length: ");
      double length = scanner.nextDouble();
      System.out.print("Enter the width: ");
      double width = scanner.nextDouble();
      System.out.print("Enter the cost per foot: ");
      double cost = scanner.nextDouble();
      RoomDimension dim = new RoomDimension(length, width);
      RoomCarpet total = new RoomCarpet(dim, cost);
      System.out.print(total);
      scanner.close();
   }
}