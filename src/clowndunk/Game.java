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
        String newHint = "";
        if (guess.length()>1) {
            char[] gletters;
            if (guess.contains(" ")) {
               String[] gwords = guess.split(" "); 
                for (int i = 0; i< words.length; i++) {
                    if (words[i].equals(gwords[0])) {
                        for (int j = 1; j < gwords.length; j++) {
                            if (!gwords[i].equals(words[i+j])) {
                                return false;
                            }
                        }
                    }
                }
                gletters = guess.toCharArray();
                for (char gletter : gletters) {
                    if (gletter==' ') {    }
                    else {
                        for (char letter : letters) {
                            if (letter==gletter) {
                                for (int i = 0; i < letters.length; i++) {
                                    if (gletter==letters[i]) {
                                        letters[i]=0;
                                    }
                                }
                                //NEW HINT
                                for (int i = 0; i < hint.length(); i++) {
                                    if (hint.charAt(i)=='_') {
                                        if (gletter==word.charAt(i)) {
                                            newHint+=gletter;
                                        }
                                        else {
                                            newHint+="_";
                                        }
                                    }
                                    else {
                                        newHint+=hint.charAt(i);
                                    }
                                }
                            }
                        }
                        guessed.add(gletter);
                    }
                }
                return true;
            }
            else {
                 for (String wword : words) {
                     if (guess.equals(wword)) {
                         gletters = guess.toCharArray();
                         for (char gletter : gletters) {
                            if (gletter==' ') {    }
                            else {
                                for (char letter : letters) {
                                    if (letter==gletter) {
                                        for (int i = 0; i < letters.length; i++) {
                                            if (gletter==letters[i]) {
                                                letters[i]=0;
                                            }
                                        }
                                        //NEW HINT
                                        for (int i = 0; i < hint.length(); i++) {
                                            if (hint.charAt(i)=='_') {
                                                if (gletter==word.charAt(i)) {
                                                    newHint+=gletter;
                                                }
                                                else {
                                                    newHint+="_";
                                                }
                                            }
                                            else {
                                                newHint+=hint.charAt(i);
                                            }
                                        }
                                    }
                                }
                                guessed.add(gletter);
                            }
                        }
                         return true;
                     }
                }
                return false;
            }  
        }
        for (char letter : letters) {
            if (letter==guess.charAt(0)) {
                for (int i = 0; i < letters.length; i++) {
                    if (guess.charAt(0)==letters[i]) {
                        letters[i]=0;
                    }
                }
                //NEW HINT
                for (int i = 0; i < hint.length(); i++) {
                    if (hint.charAt(i)=='_') {
                        if (guess.charAt(0)==word.charAt(i)) {
                            newHint+=guess.charAt(0);
                        }
                        else {
                            newHint+="_";
                        }
                    }
                    else {
                        newHint+=hint.charAt(i);
                    }
                }
                
                guessed.add(guess.charAt(0));
                return true;
            }
        }
        return false;
    }
}
