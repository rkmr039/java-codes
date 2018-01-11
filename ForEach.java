class ForEach
{
    public static void main(String []args)
    {
        int array[] = {1,2,6,8,3,9,5,0};
        int max = maximum(array);
        System.out.println("Maximum number found: "+max);
    }

    public static int maximum(int array[])
    {
        int max = array[0];
        for(int temp: array)
        {
            if(temp>max)
            {
                max =temp;
            }
        }
        return max;

    }
}