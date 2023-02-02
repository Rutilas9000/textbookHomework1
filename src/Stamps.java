/**
 * @class: Stamps
 * @author: Savion Plater
 * @course: ITEC2140 - 05, Spring 2023
 * @version: 1.0
 * @date: January 31, 2023
 * description: This program will compute the difference between Jean’s and Susan’s collections of the stamps.
 * */
public class Stamps {
    public static void main(String[] args){
        int susanStamps = 8;
        int jeanStamps = 40;
        System.out.println("Susan has " + susanStamps + " stamps.");
        System.out.println("Jean has " + jeanStamps + " stamps.");
        int difference = jeanStamps - susanStamps;
        System.out.println("Jean has " + difference + " more stamps than Susan.");
    }
}
