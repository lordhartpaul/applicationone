

public class Threedmatrix
{
    public static void main(String args[])
    {
        int threed[][][] = new int [3][3][2];
        int i,j,k;
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                for(k=0;k<2;k++)
                {
                    threed[i][j][k] = (i-j)-k;
                }
            }
        }
        System.out.println("The threed matrix is");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                for(k=0;k<2;k++)
                {
                    System.out.println("" +threed[i][j][k]);
                }
            }
        }
    }
}