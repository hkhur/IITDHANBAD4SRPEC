/*Define a recursive method for computing x raised to power y by doing repetitive multiplication
where x and y are positive integer numbers.
Define main to use above method.*/

import java.util.Scanner;
class PowerRaised

{
static int power(int x, int y)
    {
        if (y == 0)
            return 1;
        else if (y % 2 == 0)
            return power(x, y / 2) * power(x, y / 2);
        else
            return x * power(x, y / 2) * power(x, y / 2);
    }

   public static void main(String[] args)
    {
        Scanner scanner =new Scanner(System.in);
        System.out.println(" ENTER THE VALUE Of x ");
        int x=scanner.nextInt();
        System.out.println(" ENTER THE VALUE of y ");
        int y=scanner.nextInt();
        System.out.println();
        System.out.println(" THE VALUE OF x raised to power y is ");
        System.out.printf("%d", power(x, y));
        System.out.println();
    }
}