package shape_project;

import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Game g = new Game(); // new game start here
		char c;
		do {
			int choice = g.selectShape();
			if (choice == 1) {
				System.out.println("You have Selected 2D Shape");
				TwoDShape td = g.selectTwoDShape(); // upcasting
				td.getArea(); // polymorphism
				td.getPerimeter();
			} else {
				System.out.println("You have Selected 3D Shape");
				ThreeDShape td = g.selectThreeDShape(); // upcasting
				td.getVolume();
				td.getCurvedSurfaceArea();
				td.getTotalSurfaceArea(); // polymorphsm
			}
			System.out.println("Press Y/y to restart....");
			c = sc.next().charAt(0);
		} while (c == 'Y' || c == 'y');
		System.out.println("====Thank you for playing game====");
	}

}