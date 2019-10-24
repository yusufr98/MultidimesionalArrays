package com.company;

public class Main {

    public static void main(String[] args) {
	    //part 1
        /*for(int i = 0; i<10; i++){
	        for(int j = 0; j<5; j++){
                System.out.print(" row " + i + " col " + j);
            }
            System.out.println();
        }*/
        //part 2
        for(int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
                System.out.print(i * j);
                System.out.print('\t');
            }
            System.out.println();
        }
    }
}
