/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clowndunk;

import java.util.ArrayList;

/**
 *
 * @author benjaminfarias
 */
public class Game {
    private String word;
    private char[] letters;
    private String hint = "";
    private String[] words;
    private ArrayList<Character> guessed = new ArrayList<>();
    
    public Game() {
        
    }
    
    public Game(String start) {
        word = start;
        letters = word.toCharArray();
        words=word.split(" ");
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i)!=' ') {
                hint+="_";
            }
            else {
                hint+=" ";
            }
        }
    }
    
    public boolean guess(String guess) {
        if (guess.length()>1) {
            for (String word : words) {
                if (guess.equals(word)) {
                    
                }
            }
        }
        return true;
    }
}
