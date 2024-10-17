public class dimond {


public static void rectangle(int n)
{
    //first half
    for (int i=1;i<=n;i++)
    {
        //spaces
      for(int j=1;j<=(n-i);j++)
      {
        System.out.print(" ");
      }
    //star
     for(int j=1;j<=(2*i)-1;j++)
     {
        System.out.print("*");
     }
     System.err.println();
    }

    //Second half
    for (int i=n;i>=1;i--)
    {
        //spaces
      for(int j=1;j<=(n-i);j++)
      {
        System.out.print(" ");
      }
      for(int j=1;j<=(2*i)-1;j++)
     {
        System.out.print("*");
     }
     System.err.println();
      
    }
}

    public static void main(String[] args) {
        rectangle(4);
    }
    
}
