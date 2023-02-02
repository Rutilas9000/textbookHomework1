/**
 * @class: Cycle
 * @author: Savion Plater
 * @course: ITEC2140 - 05, Spring 2023
 * @version: 1.0
 * @date: January 31, 2023
 * description: This program will compute the total number tricycles at the shop.
 * */
public class Cycle {
    public static void main(String[] args){
        int bicycles = 10;
        int biWheels = 2;
        int triWheels = 3;
        int totalWheels = 47;
        System.out.println("There are " + bicycles + " bicycles and an unknown number of tricycles.");
        System.out.println("There are " + totalWheels + " wheels in total.");
        int biTotal = bicycles * biWheels;
        int triTotal = totalWheels - biTotal;
        int tricycles = triTotal/triWheels;
        System.out.println("There are " + biTotal + " bicycle wheels.");
        System.out.println("There are " + triTotal + " tricycle wheels.");
        System.out.println("The total number of tricycles is " + tricycles);
    }
}
