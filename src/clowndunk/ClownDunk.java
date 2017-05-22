/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clowndunk;

import java.util.Scanner;

/**
 *
 * @author benjaminfarias
 */
public class ClownDunk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Game game = new Game("The cow goes moo");
        String guess;
        for (int i = 0; i < 3; i++) {
            //guess=scan.next();
            System.out.println(game.guess("goes moo"));
            System.out.println(game.getHint());
        }
    }
    
}
