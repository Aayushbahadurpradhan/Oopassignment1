/*Write a Java program to find the maximum and minimum value of an
array.*/
import java.util.Scanner;
public class MinAndMax {
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        System.out.println("Enter elements in array");
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=9;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]<min)
            {
                min=arr[i];
            }
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("Maximum element is "+max);
        System.out.println("Minimum element is "+min);
    }
}
//public static void findMinAndMax(int[] args) {
//        int[]myArr = new int[]{10,2,13,40,15};
//        int min = myArr[0];
//        int max = myArr[0];
//        for (int i = 1; i<myArr.length;i++)
//        if (min>=myArr[i]){
//        min= myAr[i];
//        }
//        if (max<=myArr[i]){
//        max= myAr[i];
//        }
//            }
//            System.out.println("The minimum value of the array"+min);
//            System.out.println("The minimum value of the array"+max);