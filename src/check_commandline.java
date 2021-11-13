class check_commandline
{
    public static void main (String[] args)
    {

        if (args.length ==0)
        {
            System.out.println("No Values");
        }
        else{
            for(String i : args)
                System.out.print(i+" , ");

        }
    }
}