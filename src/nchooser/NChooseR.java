/*
 * Evan Robertson
 * NChooseR.java
 * March 24th 2020
 * This program calculates the number of ways to choose r different objects from a set of n objects
 */

package nchooser;
import javax.swing.*;

/**
 *
 * @author Evan
 */
public class NChooseR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Get the total set of objects
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter how many objects there are to choose from"));
        //Get the amount to choose
        int r = Integer.parseInt(JOptionPane.showInputDialog("Enter how many objects are to be chosen"));
        //Calculate how many ways to do so
        int choose = factorial(n)/(factorial(r)*(factorial(n-r)));
        JOptionPane.showMessageDialog(null, "There are " + choose + " ways of getting " + r + " object(s) from " + n + " total");
    }
    public static int factorial(int num) {
        //If the number is equal to 0 or 1, return 1
        if (num == 0 || num ==1) {
            return 1;
        }
        //safe catch
        else if (num < 0) {
            return(0);
        }
        //Run down each number and its factorial until it reaches 1
        else {
            return (num * factorial(num-1));
        }

    }
    
}
