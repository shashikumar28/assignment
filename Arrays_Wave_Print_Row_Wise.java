package twoD_array;

import java.util.Scanner;

public class Arrays_Wave_Print_Row_Wise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m =sc.nextInt();
        int[][] arr = new int[n][m];
        for(int row = 0; row< arr.length; row++){
            for(int col = 0; col <arr[0].length;col++){
                arr[row][col] = sc.nextInt();
            }
        }
        rowprint(arr);
        
    }
public static void rowprint(int[][]arr){
    for(int row = 0; row< arr.length; row++){
        if(row % 2 == 0){
            for(int col = 0; col < arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
                
            }
        }
        else{
            for( int col = arr[row].length-1; col >= 0; col--){
                System.out.print(arr [row][col] + " ");
            }
        }
    }

}
}
