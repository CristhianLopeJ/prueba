/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_10_09_2020;


public class ProfitableGamble {

    public  boolean profitableGamble(double prob, double prize, double pay) {
        if (prob * prize - pay > 0) {
            return true;
        }
        else{
            return false;
        }
    }

}
