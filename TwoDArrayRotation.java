import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayRotation {
    public static void degree1(int arr[][],int n){
          for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j)
                    if(i>j){
                        int temp=arr[i][j];
                        arr[i][j]=arr[j][i];
                        arr[j][i]=temp;
                    }
            }
        }
        //reverse the each row 
        //means swapping the starting and last element

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length/2;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[i][n-j-1];
                arr[i][n-j-1]=temp;
            }
        }
         for(int i=0;i<arr.length;i++)
        System.out.println(Arrays.toString(arr[i]));

    }
    public static void degree2(int arr[][],int n){
         for(int i=0;i<arr.length/2;i++){
            for(int j=0;j<arr.length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[n-i-1][j];
                arr[n-i-1][j]=temp;

            }
        }
         for(int i=0;i<arr.length;i++)
        System.out.println(Arrays.toString(arr[i]));

    }
    public static void degree3(int arr[][],int n){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j)
                    if(i>j){
                        int temp=arr[i][j];
                        arr[i][j]=arr[j][i];
                        arr[j][i]=temp;
                    }
                }
        }
         for(int i=0;i<arr.length;i++)
        System.out.println(Arrays.toString(arr[i]));
}

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[4][4];
        int n=arr.length;
        
        System.out.println("Enter the elements:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the what rotatation you want(90/180/270):");
        int rotate=sc.nextInt();

       if(rotate==90){
        degree1(arr,n);
       }
       else if(rotate==180){
        degree2(arr,n);
       }
       else{
        degree3(arr,n);
       }
    }     
}
    

