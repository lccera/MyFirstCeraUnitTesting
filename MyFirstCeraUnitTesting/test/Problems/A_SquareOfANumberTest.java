/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problems;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 3rdyearaccount
 */
public class A_SquareOfANumberTest {
    
    public A_SquareOfANumberTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testMain() throws Exception {
//        System.out.println("main");
//        String[] args = null;
//        A_SquareOfANumber.main(args);
        //fail("The test case is a prototype.");
    }

    @Test
    /*public void testSquare() {
        System.out.println("square");
        int a = 0;
        int expResult = 0;
        int result = A_SquareOfANumber.square(a);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }*/
    public void testSquare1() throws FileNotFoundException{
        Scanner scInput1 = new Scanner(new File("src/TestCases/A1.in"));
        Scanner scOutput1 = new Scanner(new File("src/TestCases/A1.out"));
        
        int testcases = scInput1.nextInt();
        while(testcases>0){
            int num = scInput1.nextInt();
            String actualResult = "";
            if(num>1000)
                actualResult = "TOO BIG";
            else if(num<0)
                actualResult = "INVALID";
            else
                actualResult = Integer.toString(A_SquareOfANumber.square(num));
            String expectedResult = scOutput1.nextLine();
            assertEquals(expectedResult,actualResult);
            testcases--;
        }
    System.out.println("\n############################");
    System.out.println("TestCase 1: Square Method Test Passed");
    System.out.println("############################");
    
    Scanner scInput2 = new Scanner(new File("src/TestCases/A2.in"));
    Scanner scOutput2 = new Scanner(new File("src/TestCases/A2.out"));
        
        int testcases2 = scInput2.nextInt();
        while(testcases2>0){
            int num2 = scInput2.nextInt();
            String actualResult2 = "";
            if(num2>1000)
                actualResult2 = "TOO BIG";
            else if(num2<0)
                actualResult2 = "INVALID";
            else
                actualResult2 = Integer.toString(A_SquareOfANumber.square(num2));
            String expectedResult2 = scOutput2.nextLine();
            assertEquals(expectedResult2,actualResult2);
            testcases2--;
        }
    System.out.println("\n############################");
    System.out.println("TestCase 2: Square Method Test Passed");
    System.out.println("############################");
    
    Scanner scInput3 = new Scanner(new File("src/TestCases/A3.in"));
        Scanner scOutput3 = new Scanner(new File("src/TestCases/A3.out"));
        
        int testcases3 = scInput3.nextInt();
        while(testcases3>0){
            int num3 = scInput3.nextInt();
            String actualResult3 = "";
            if(num3>1000)
                actualResult3 = "TOO BIG";
            else if(num3<0)
                actualResult3 = "INVALID";
            else
                actualResult3 = Integer.toString(A_SquareOfANumber.square(num3));
            String expectedResult3 = scOutput3.nextLine();
            assertEquals(expectedResult3,actualResult3);
            testcases3--;
        }
    System.out.println("\n############################");
    System.out.println("TestCase 3: Square Method Test Passed");
    System.out.println("############################");
    }
}
