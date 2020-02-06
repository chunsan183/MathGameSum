/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.game.summative;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author studentadmin
 */
public class MathGameSummative {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Create a game that tests basic math skills (multiplication, division, addition, subtraction).
        
        // The user should be prompted with these choices:
        // Start a new game, Display single highest and lowest scores, Display scores sorted from highest to lowest, 
        // Display scores sorted from lowest to highest, Quit
        
        // If the user chooses a new game s/he will then be presented with 12 random questions
        // (6 addition and/or subtraction, 6 multiplication and/or division).
        
        // For each question assign points as follows:
        // Addition - 1 Point, Subtraction - 2 Points, Multiplication - 3 Points, Division - 4 Points
        // For each correct answer, give the appropriate amount of points.
        // For each incorrect answer, subtract one point, and give the correct answer.
        
        // Note: numbers should be integers between -50 and 50. The result of a division needs to be an integer.
        
        // Your main class should contain the user menu. Everything else should be in separate classes/methods.
        
        //MAIN CLASS
        
        System.out.println("Hello feller! Welcome to the MATH GAME!");
        System.out.println("=======================================");
        System.out.println("This game will test your math skills to the best of your abilities... can you keep up? We shall see!");
        
        System.out.println("\n");
        
        System.out.println("Please select one of the following:");
        System.out.println("1) Start new game. \n2) Display single highest and lowest scores. \n3) Display scores sorted from highest to lowest. \n4) Display scores sorted from lowest to highest. \n5) Quit \nSelection: ");
        
        Scanner selection = new Scanner(System.in);
        int menuSelect = selection.nextInt();
        
        
            if (menuSelect == 1){
                //Link to NewGame
            }
            else if (menuSelect == 2){
                //Link to HighLowHigh
            }
            else if (menuSelect == 3){
                //Link to DisplayHighLow
            }
            else if (menuSelect == 4){
                //Link to DisplayLowHigh
            }
            else if (menuSelect == 5){
                //Link to Quit
            }
            else{
                System.out.println("(Sigh!) Hey man... You gotta read more carefully!");
            }
            
    }
    
}
