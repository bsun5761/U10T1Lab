public class Summing
{
    public static void main(String[] args)
    {
        System.out.println(sum(6));  // should print 21
        System.out.println(sum(10)); // should print 55
    }

    public static int sum(int n)
    {
        int count=n;
        if(n==1)
        {
            return n;
        }
        else{
            while(n!=1)
            {
                n--;
                count+=n;
            }
        }
        return count;
    }
}
