/**
 * @class: speedLight
 * @author: Savion Plater
 * @course: ITEC2140 - 05, Spring 2023
 * @version: 1.0
 * @date: January 31, 2023
 * description: this program will write speedLight that calculates
 * the distance to a lightning strike based on the time elapsed
 * between the flash and the sound of thunder.
 * In this program, I will declare variables: speedOfSound, timeElapsed
 * distance
 * */
public class speedLight {
    public static void main(String[] args){
        int SPEED_OF_SOUND = 340; //this value will never changed. constant
        // variable with a fixed value.
        int timeElapsed = 5;
        int distance = SPEED_OF_SOUND * timeElapsed;
        System.out.println("Speed of sound: " + SPEED_OF_SOUND);
        System.out.println("Time Elapsed: " + timeElapsed);
        System.out.println("Distance: " + distance);

    }
}
