/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_10_09_2020;


public class MovieTheather {

    public boolean acceptIntoMovie(int age, boolean isSupervised) {
        if (age >= 15 || isSupervised == true) {
            return true;
        } else {
            return false;
        }
    }
}
