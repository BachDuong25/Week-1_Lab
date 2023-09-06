/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import function.Algorithm;
import model.InputUser;
import view.Menu;
import function.Validate;
import function.Library;
/**
 *
 * @author ADMIN
 */
public class sortProgramming extends Menu<String> {

    static String[] mc = {"", "Exit", "Sort", "Search"};

    protected Library library;
    protected Algorithm algorithm;
    protected int[] array;
    protected int size_array;

    public sortProgramming(InputUser inputUser) {
        super("PROGRAMMING", mc);
        library = new Library();
        algorithm = new Algorithm();
        size_array = inputUser.getInput_array();
        array = inputUser.getArray();
        //1. Enter a possitive number
        //size_array = library.getInt("Enter number of array", 1, 100);
        //2. Create array by generate random integer in range
        //array = library.createArray(size_array);
    }

    public void execute(int n) {
        switch (n) {
            case 1:
                System.exit(0);
                break;
            case 2:
                sort();
                break;
            case 3:
                search();
        }
    }

    public void sort() {
        final String[] mcSort = {"Exit","Buddle Sort", "Quick Sort"};
        class SortMenu extends Menu<String> {

            public SortMenu() {
                super("Sort Option", mcSort);
            }

            @Override
            public void execute(int n) {
                System.out.println("Unsorted array: ");
                library.display(array);
                switch (n) {
                    case 2:
                        algorithm.buddleSort(array);
                        System.out.println("\nSorted array by Buddle Sort: ");
                        library.display(array);
                        System.out.println("");
                        break;
                    case 3:
                        algorithm.quickSort(array, 0, size_array - 1);
                        System.out.println("\nSorted array by Quick Sort: ");
                        library.display(array);
                        System.out.println("");
                        break;
                    case 1:
                        System.exit(0);
                        break;
                }
            }
        }
        SortMenu sm = new SortMenu();
        sm.run();
    }
    
    public void search(){
        
    }

}
