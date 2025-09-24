import java.util.*;
public class Matrices {

    public static void printSpiral(int matrix [][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;
        while (startRow <= endRow && startCol <= endCol) {
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            for (int j = endCol - 1; j >= startCol; j--) {
                if(startCol==endCol){
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }    

    public static int diagonalSum(int matrix[][]){
        int sum = 0;

        //this is brute force approach
        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[0].length; j++){
        //         if(i==j){
        //             sum += matrix[i][j];
        //         }
        //         else if(i+j == matrix.length-1){
        //             sum += matrix[i][j];
        //         }
        //     }
        // }

        //this is optimised approach
        for(int i=0; i<matrix.length; i++){
            sum += matrix[i][i];
            if(i!=matrix.length-1-i){
                sum += matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }

    public static boolean searchMatrix(int matrix[][],int target){
        int row = 0;
        int col = matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col] == target){
                System.out.println("Target found at (" + row + "," + col + ")");
                return true;
            }
            else if(target<matrix[row][col]) {
                col--;
            }
            else{
                row++;
            }
        }      
        System.out.println("Target not found");        
        return false;
    }

    public static void main(String[] args) {
        /* 
        int matrix[][] = new int [3][5];
        int n = matrix.length;
        int m = matrix[0].length;
        Scanner sc = new Scanner(System.in); 
        for (int i=0; i<matrix.length; i++){
            for ( int j=0; j<matrix[0].length; j++){
                matrix[i][j] = sc.nextInt();

            }
        }
        for (int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        */

        int matrix [][] =  {{1 , 2, 3, 4},
                            {5 , 6, 7, 8},
                            {9 ,10,11,12},
                            {13,14,15,16}};
        
        int target = 14;
        // printSpiral(matrix);
        // System.out.println(diagonalSum(matrix));
        searchMatrix(matrix, target);
    }
}