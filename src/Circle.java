/**
 * @class: Circle
 * @author: Savion Plater
 * @course: ITEC2140 - 05, Spring 2023
 * @version: 1.0
 * @date: January 31, 2023
 * description: This program will compute the area and perimeter
 * of a circle.
 * */
public class Circle {
    public static void main(String[] args){
        double radius = 9.5;
        double area = radius * radius * Math.PI;
        double perimeter = 2 * radius * Math.PI;
        System.out.println("The radius of the circle is " + radius);
        System.out.println("The area is " + area);
        System.out.println("The perimeter is " + perimeter);
    }
}
