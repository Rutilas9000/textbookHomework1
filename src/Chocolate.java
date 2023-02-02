/**
 * @class: Chocolate
 * @author: Savion Plater
 * @course: ITEC2140 - 05, Spring 2023
 * @version: 1.0
 * @date: January 31, 2023
 * description: this program will write program to compute
 * the number of bags you will need to add three chocolates instead of two chocolates.
 * */
public class Chocolate {
    public static void main(String[] args){
        int bags = 9;
        int bars = 2;
        int total = bags * bars;
        System.out.println("There are " + bags + " bags." );
        System.out.println("There are " + bars + " chocolate bars in each bag." );
        System.out.println("There are " + total + " chocolate bars in total." );
        bars = 3;
        bags = total/bars;
        System.out.println("In order to add three chocolate bars to each bag instead of two, we need " + bags + " bags." );
    }
}
