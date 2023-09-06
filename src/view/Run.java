/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.sortProgramming;
import function.Library;
import model.InputUser;

/**
 *
 * @author ADMIN
 */
public class Run {
    public static void main(String[] args) {
        Library library = new Library();
        InputUser inputUser = new InputUser();
        //1. Enter a possitive number
        inputUser.setInput_array(library.getInt("Enter number of array", 1, 100));
        //2. Create array by generate random integer in range
        inputUser.setArray(library.createArray(inputUser.getInput_array()));
        new sortProgramming(inputUser).run();
    }
}
