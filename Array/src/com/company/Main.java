package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 /*tring[] masīvs;
	 masīvs = new String[5];

	 String[][] masīvs2D = new String[3][];
	 /*masīvs2D[0] = new String[5];
	 masīvs2D[1] = new String[5];
	 masīvs2D[2] = new String[5];*/



	 /*for (int i = 0; i < masīvs2D.length; i++) {
	     masīvs2D[i] = new String[4];
     }

		masīvs2D[0][0] = "honey";
		masīvs2D[0][1] = "track";
		masīvs2D[0][2] = "this";
		masīvs2D[0][3] = "lack";

		masīvs2D[1][0] = "wing";
		masīvs2D[1][1] = "trip";
		masīvs2D[1][2] = "pop";
		masīvs2D[1][3] = "art";



	 for (int i = 0; i < masīvs2D.length; i++) {
	 	String[] rinda = masīvs2D[i];
	 	for (int j = 0; j < rinda.length; j++) {
	 		//System.out.println(rinda[j]);
			System.out.println(masīvs2D[i][j]);
			}
		}


    }*/

        int n = 5;
        String[][] masīvs = new String[n][n];

        //masīvs[0][0] = 1;
        //[0][0] 1
        //[0][1] 0
        //[0][2] 0


        /*for (int i = 0; i < masīvs.length; i++) {
            String[] rinda = masīvs[i];

            for (int j = 0; j < rinda.length; j++) {
                if (i == j) {
                    masīvs[i][j] = "1";
                    System.out.print(masīvs[i][j]);
                } else {
                    masīvs[i][j] = "0";
                    System.out.print(masīvs[i][j]);
                }

            }
            System.out.println();
        }*/


        /*for (int i = 0; i < masīvs.length; i++) {
            String[] rinda = masīvs[i];

            for (int j = rinda.length - 1; j >= 0; j--) {
                if (i == j) {
                    masīvs[i][j] = "1";
                    System.out.print(masīvs[i][j]);
                } else {
                    masīvs[i][j]="0";
                    System.out.print(masīvs[i][j]);
                }
            }
            System.out.println();
        }*/

        /*for (int i = 0; i < masīvs.length; i++) {
            String[] rinda = masīvs[i];

            for (int j = 0; j < rinda.length; j++) {
                if (i == j || i == rinda.length-1 -j) {
                    masīvs[i][j] = "1";
                    System.out.print(masīvs[i][j]);}
                else {
                    masīvs[i][j] = "0";
                    System.out.print(masīvs[i][j]);
                }

            }
            System.out.println();
        }*/

        int x = 15;
        boolean exit = false;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Ievadiet skaitli: ");
            int input = sc.nextInt();

            if (input < x) {
                System.out.println("Ievadītais skaitlis par mazu");
            } else if (input > x) {
                System.out.println("Ievadītais skaitlis ir par lielu");
            } else if (input == x) {
                System.out.println("Uzminēts skaitlis");
                exit = true;
            }
        } while (exit==false);



    }
}
