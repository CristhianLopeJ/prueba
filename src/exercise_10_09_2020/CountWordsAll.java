/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_10_09_2020;

/**
 *
 * @author Toshiba
 */
public class CountWordsAll {

    public int countWords(String countWords) {
        int count = 1;
        for (int i = 0; i < countWords.length(); i++) {
            char position = countWords.charAt(i);
            if (position == ' ') {
                count = count + 1;
            }
        }
        return count;
    }
}
