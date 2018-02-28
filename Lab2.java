package lab2;

/**
 *
 * @author ismael
 */
// Ismael Al-safadi
// 120160618
// IUG 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lab2 {    
   public static void main(String[] args) {

        //creating a Scanner and saving the inserted value
        Scanner in = new Scanner(System.in);// create object from Scanner class . 
        System.out.print("type in the size of the matrix : ");// ask user to input the size of the Matrix .
        int size = in.nextInt(); // just take the value that user was entered and stored it into 'size' variable with int type .
        int[][] matrix = new int[size][size];// declare 2d matrix and give it the size that was entered by user  .
        for (int i = 0; i < matrix.length ; i++) {  //create for loop to fill the array d1
            for (int j = 0; j < matrix.length ; j++) { //create for loop to fill the array d2
                matrix[i][j] = (int)(Math.random() * 2); //choice random 0's and 1's to fill the array .
            }
        }

    
        for (int i = 0; i < matrix.length ; i++) {     // creadte another loop to print the data d1
            for (int j = 0; j < matrix.length ; j++) {   // creadte another loop to print the data d1
                System.out.print(matrix[i][j] );  // print the data from the matrix 
            }
            System.out.println();//print new line 
        }
        
        // Ok now we need to know how many 1's on each of arrays 
        // to do that we need to create list and add the number of 1's for every row 
        // we will creats 'sum' counter and add the values to this counter  1 will rise the counter and 0 does not change the value of sum
        //
        ArrayList<Integer> Sum_Of_Array_Rows = new ArrayList<>(); // create object from Arraylist empty list to add the number of 1's on every row 
        for (int i = 0; i < matrix.length ; i++) {   //
            int sum = 0;// counter 
            for (int j = 0; j < matrix.length ; j++) { 
                sum += matrix[i][j];// add the number of zeros it will add 0 and 1 to sum counter 
                
            }
            Sum_Of_Array_Rows.add(sum); //to add the number of 1's on every row to the array.
        }
        String RowMax = "";// create string to add the values of row contain the max index .
        // note that you can make another array and add the values of row that  contain the max index then print it .
        // But this way is easy .
        for (int i = 0; i < Sum_Of_Array_Rows.size() ; i++) { 
            if (Sum_Of_Array_Rows.get(i) == Collections.max(Sum_Of_Array_Rows)){ // if the element == the max value on list add it to the string 
                RowMax += i + " , "; // add the max value to the string 
                
            }
        }
        System.out.println("The largest row index : " + RowMax.substring(0,RowMax.length()-2)); // print the max value
        // RowMax.substring(0,RowMax.length()-2) to remove the last ',' from string  

        // make the same for columns
        ArrayList<Integer> Sum_Of_Array_Columns = new ArrayList<>();// create object from Arraylist empty list to add the number of 1's on every columns
        for (int i = 0; i < matrix.length ; i++) {
            int sum = 0;//another counter 
            for (int j = 0; j < matrix.length ; j++) { 
                sum += matrix[j][i];// add the number of zeros it will add 0 and 1 to sum counter , note thet j i .
            }
            Sum_Of_Array_Columns.add(sum); //to add the number of 1's on every columns to the array.
        }

        String ColumnMax = "";// create string to add the values of columns contain the max index .
        for (int i = 0; i < Sum_Of_Array_Columns.size() ; i++) {
            if (Sum_Of_Array_Columns.get(i) == Collections.max(Sum_Of_Array_Columns)){// if the element == the max value on list add it to the string 
                ColumnMax += i + " , ";// add the max value to the string 
            }
        }
        System.out.println("The largest columns index : " + ColumnMax.substring(0,ColumnMax.length()-2));
        // ColumnMax.substring(0,RowMax.length()-2) to remove the last ',' from string  
    }

}