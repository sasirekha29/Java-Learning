/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author anitha.ramatenki
 */
import java.util.Scanner;
public class shapeArea implements Area {

public void Circle() {

Scanner kb = new Scanner(System.in);

System.out.println("Enter the radius of the circle");

double r = kb.nextInt();

double areaOfCircle = 3.142 * r * r;

System.out.println("Area of the circle is" + areaOfCircle);

}


public void Square() {

// TODO Auto-generated method stub

Scanner kb2 = new Scanner(System.in);

System.out.println("Value of the side the square");

double s = kb2.nextInt();

double areaOfSquare = s * s;

System.out.println("Area of the square is" + areaOfSquare);

}


public void Rectangle() {

// TODO Auto-generated method stub

Scanner kb3 = new Scanner(System.in);

System.out.println("Enter the length of the Rectangle");

double l = kb3.nextInt();

System.out.println("Enter the breadth of the Rectangle");

double b = kb3.nextInt();

double areaOfRectangle = l * b;

System.out.println("Area of the Rectangle is" + areaOfRectangle);

}

public void Triangle() {

// TODO Auto-generated method stub

Scanner kb4 = new Scanner(System.in);

System.out.println("Enter the base of the Triangle");

double base = kb4.nextInt();

System.out.println("Enter the height of the Triangle");

double h = kb4.nextInt();

double areaOfTriangle = 0.5 * base * h;

System.out.println("Area of the Triangle is" + areaOfTriangle);

}

public static void main(String[] args) {

shapeArea geometry = new shapeArea();

geometry.Circle();

geometry.Square();

geometry.Rectangle();

geometry.Triangle();

}
}
