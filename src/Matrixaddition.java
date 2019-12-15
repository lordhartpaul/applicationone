import java.util.*;

public class Matrixaddition
{
    public static void main(String args[])
    {
        int row,column,i,j;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the rows");
        row = input.nextInt();
        System.out.println("Enter the column");
        column = input.nextInt();
        int a[][] = new int [row] [column];
        int b[][] = new int [row][column];
        System.out.println("Enter the first matrix values");
        for(i=0;i<row;i++)
        {
            for(j=0;j<column;j++)
            {
                a[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter the second matrix vallues");
        for(i=0;i<row;i++)
        {
            for(j=0;j<column;j++)
            {
                b[i][j] = input.nextInt();
            }
        }
        int c[][] = new int [row][column];
        for(i=0;i<row;i++)
        {
            for(j=0;j<column;j++)
            {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("The addition of matrix is");
        for(i=0;i<row;i++)
        {
            for(j=0;j<column;j++)
            {
                System.out.println("" +c[i][j]);
            }
        }
    }
}