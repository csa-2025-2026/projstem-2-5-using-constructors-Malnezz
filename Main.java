import java.util.Scanner;

public class Main{
  public static void main(String[] args)
  {
    // write solutions to problems her
    double polySide;
		RegularPolygon regPoly1;
		RegularPolygon regPoly2;
		
		System.out.println("Type a side length:");
    System.out.println(regPoly1.toString());
    System.out.println(regPoly2.toString());  
		polySide = sc.nextDouble();

		regPoly1 = new RegularPolygon(polySide);
		regPoly2 = new RegularPolygon(4, polySide);
  }
}
