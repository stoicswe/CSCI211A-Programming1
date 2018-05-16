package ClassicWalk;

import java.util.Scanner;

public class ClassicWalk {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        while(true) {

            System.out.println("Please enter number of bits:");
            System.out.print(":>");
            int bitCount = userInput.nextInt();

            System.out.println("Please enter the number of steps:");
            System.out.println(":>");
            int stepCount = userInput.nextInt();

            double[][] walk = generateArray(bitCount, stepCount);

            System.out.println();
            System.out.println("Calculating...");

            walk = calculateWalk(walk);

            System.out.println(walk);
        }

    }

    public static double[][] generateArray(int bits, int steps){
        double[][] temp = new double[steps][bits];
        temp[0][0] = 1;
        return temp;
    }

    public static double[][] calculateWalk(double[][] original){

        double factor = 0.5;

        for (int i = 0; i < original[0].length; i++){
            for (int j = 0; j < original[1].length; j++){
                if (i == 0 && j == 0){ } else {
                    original[0][j] = original[0][j-1] * 0.5;
                    original[i][j] = (original[i/i + 1][j-1] + original[i/i+2][j-1])*0.5;

                }
            }
        }

        return original;
    }

}
