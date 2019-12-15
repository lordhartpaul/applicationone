import java.util.*;

public class Matrixmultiplication
{
    public static void main(String args[])
    {
        int row,column,i,j,k,sum=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the rows");
        row = input.nextInt();
        System.out.println("Enter the column");
        column = input.nextInt();
        int a[][] = new int [row][column];
        int b[][] = new int [row][column];
        System.out.println("Enter the values of first matrix");
        for(i=0;i<row;i++)
        {
            for(j=0;j<column;j++)
            {
                a[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter the value of second matrix");
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
                for(k=0;k<column;k++)
                {
                    sum = sum + a[i][k] * b[k][j];
                }
                c[i][j] = sum;
                sum = 0;
            }
        }
        System.out.println("The matrix multiplication is");
        for(i=0;i<row;i++)
        {
            for(j=0;j<column;j++)
            {
                System.out.println("" +c[i][j]);
            }
        }
    }
}