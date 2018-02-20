import java.util.Scanner;

public class CircleArea {

	public static Double calcArea(double r) {
		double area = Math.PI * (r * r);
		return area;
	}

  public static Double calcHalfArea(double r) {
		double area = (Math.PI * (r * r))/2;
		return area;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a radio to calculate area of circle: ");
		do {
			double radio = sc.nextDouble();
			System.out.println("Area of circle: " + calcArea(radio));
      System.out.println("Half Area of circle: " + calcHalfArea(radio));
		} while (sc.hasNext());
	}
}
