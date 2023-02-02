/**
 * @class: MaleStudent
 * @author: Savion Plater
 * @course: ITEC2140 - 05, Spring 2023
 * @version: 1.0
 * @date: January 31, 2023
 * description: This program will compute the number of male students in the school.
 * */
public class MaleStudent {
    public static void main(String[] args){
        int total = 389;
        int female = 175;
        int male = total - female;
        System.out.println("There are " + total + " students in the school.");
        System.out.println("There are " + female + " female students in the school.");
        System.out.println("There are " + male + " male students in the school.");
    }
}
