package ru.geekbrains.second_lesson;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {

        // 1
        int [] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
	    for (int i = 0; i < array.length; i++){
	        if(array[i] == 1){
	            array[i] = 0;
            } else {
	            array[i] = 1;
            }
            //System.out.println(array[i]);
        }

	    // 2
        int [] arr = new int[8];
	    int sum = 0;
	    for(int i = 0; i < arr.length; i++){
	        arr[i] = sum;
	        sum += 3;
            //System.out.println(arr[i]);
        }

	    // 3
        int [] massive = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
	    for (int i = 0; i<massive.length; i++){
	        if(massive[i] < 6){
	            massive[i] *= 2;
                //System.out.println(massive[i]);
            }
        }

	    // 4
        int n = 5;
        int [] [] squareArr = new int[n][n];
	    for (int i = 0; i < n; i++){
	        for (int j = 0; j < n; j++){
	            if (i == j){
	                squareArr[i][j] = 1;
                } else {
	                squareArr[i][j] = 0;
                }
	            int lastIndex = n - 1;
	            squareArr[i][lastIndex - i] = 1;
                //System.out.print(squareArr[i][j] + " ");
            }
            //System.out.println();
        }

	    // 5
        int [] minAndMax = {1, 100, 0, 3, 2, 11, 4, 5, -15};
        int min, max;
        min = max = minAndMax[0];

	    for (int i = 1; i < minAndMax.length; i++){
	        if (minAndMax[i] < min){
	            min = minAndMax[i];
            } else if (minAndMax[i] > max){
	            max = minAndMax[i];
            }
        }
        //System.out.println("Min number = " + min + "\n" + "Max number = " + max);
        }

        // 6,7 не успеваю доделать, если не против вернусь к нему чуть позже

        public static boolean checkToEqual(int [] array){
            int sumLeft = 0;
            int sumRight = 0;
            for (int i = 0; i < array.length; i++){
                if (i > 0){
                    sumRight += array[i - 1];
                    for (int j = i + 1; j < array.length; j++){
                        sumLeft += array[j];
                    }
                    if (sumLeft == sumRight){
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    System.out.println("Add value and try again!");
                }
            }
        }

    }




