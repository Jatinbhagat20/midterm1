/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daysmidterm;

import java.util.Scanner;

/**This class takes String input from user 
 * and calls method  to print the 
 * name of the day.
 * if the input is not given in String, 
 * program will accept and produce wrong results. 
 * change the code to use enums which avoids String input 
 * then print the week day names. 
 *
 * @author sivagamasrinivasan
 */
public class Daysmidterm {

    enum Day {
        ONE("Monday"), TWO("Tuesday"), THREE("Wednesday"), FOUR("Thursday"), FIVE("Friday");
        
        private final String name;
        
        Day(String name) {
            this.name = name;
        }
        
        public String getName() {
            return name;
        }
    }
    
    public static void main(String[] args) {
         
        for (Day day : Day.values()) {
            System.out.println(day + " is " + day.getName());
        }
    }
}