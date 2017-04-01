import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //sc.useDelimiter("");
        int ith = 0, jth = 0;
        String left = "LEFT", right = "RIGHT", up = "UP", down = "DOWN";
        char arr[][] = new char[n][n];
        for (int i = 0; i < n; i++){
        	String nextL = sc.next();
            for (int j = 0; j < n; j++){
            	arr[i][j] = nextL.charAt(j);
                if (arr[i][j] == 'm'){
                    ith = i;
                    jth = j;
                }
            }
        }
        if (arr[0][0] == 'p'){
           if (arr[0][n - 1] == 'm'){
               search(left, n - 1);
           } else if (arr[n - 1][0] == 'm'){
               search(up, n - 1);
           } else if (arr[n-1][n-1] == 'm'){
               search(up, n - 1);
               search(left, n - 1);
           } else {
               search(up, (n - 1) - ith);
               search(left, (n - 1) - jth);
           }
        } else if (arr[0][n - 1] == 'p'){
            if (arr[0][0] == 'm'){
               search(right, n - 1);
           } else if (arr[n - 1][0] == 'm'){
               search(up, n - 1);
               search(right, n - 1);
           } else if (arr[n-1][n-1] == 'm'){
               search(up, n - 1);
           } else {
               search(up, (n - 1) - ith);
               search(right, (n - 1) - jth);
            }
        } else if (arr[n - 1][n - 1] == 'p'){
            if (arr[0][0] == 'm'){
               search(right, n - 1);
               search(down, n - 1);
           } else if (arr[n - 1][0] == 'm'){
               search(right, n - 1);
           } else if (arr[0][n - 1] == 'm'){
               search(down, n - 1);
           } else {
               search(down, (n - 1) - ith);
               search(right, (n - 1) - jth); 
            }
        } else {
            if (arr[0][0] == 'm'){
               search(down, n - 1);
            } else if (arr[n - 1][n - 1] == 'm') {
               search(left, n - 1); 
            } else if (arr[0][n-1] == 'm') {
               search(down, n - 1);
               search(left, n - 1); 
            } else {
               search(down, (n - 1) - ith);
               search(left, (n - 1) - jth);
            }
        }
    }
    
    public static void search(String com, int n){
        for (int i = 0; i < n; i++){
            System.out.println(com);
        }
    }
    
}