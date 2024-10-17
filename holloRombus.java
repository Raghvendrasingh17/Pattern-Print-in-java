public class holloRombus {

public static void rectangle(int n)
{
    for(int i=1;i<=n;i++)
    {
        //space
        for( int j=1;j<=(n-i);j++)
        {
            System.out.print(" ");
        }


        //rectangle start
        for(int j=1;j<=n;j++)
        {
            if(i==1 || i==n || j==1 || j==n)
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
        }
        System.err.println();
    }
}

    public static void main(String[] args) {
        rectangle(5);
        
    }
    
}
