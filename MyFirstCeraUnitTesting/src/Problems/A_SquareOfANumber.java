
package Problems;
import java.util.*;
import java.io.*;

public class A_SquareOfANumber {

    private static int num;
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(new File("src/TestCases/A3.in"));
        int testcases = input.nextInt();
        while(testcases>0){
            int num = input.nextInt();
            if(num>1000)
                System.out.print("TOO BIG");
            else if(num<0)
                System.out.println("INVALID");
            else
                System.out.println(square(num));
            testcases--;
        }
    }
    public static int square(int a){
        return a*a;
    }
}
