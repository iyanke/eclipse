package test.java.pk1a;

import main.java.pk1.ClassForMath;
import junit.framework.*;
//fff\rttttttttttttttttt
////yyyyy
//tg



public class TestClassForMath6a extends TestCase {

        public void testMultTest6()  throws InterruptedException {
            ClassForMath tester = new ClassForMath();
            System.out.println("1");
            System.out.print("2");
            System.out.print("hello");
            System.err.print("hello again");
		 Thread.sleep(10000);
               Assert.assertEquals("Result", 30, tester.multiply(6, 5));

        }
        public void testMultyTest6()  throws InterruptedException {
            ClassForMath tester = new ClassForMath();
            System.out.print("2");
            System.out.print("hello");
            System.err.print("hello again");
		 Thread.sleep(10000);
               Assert.assertEquals("Result", 30, tester.multiply2(6, 5));
       }
////t

public void testSummaTest6() throws InterruptedException {
	
    ClassForMath tester = new ClassForMath();
    System.out.println("3");
	 Thread.sleep(10000);
    
       Assert.assertEquals("Result", 17, tester.summa(12, 5));
//dddddd
}
public void testDifferenceTest6Second() throws InterruptedException {
    ClassForMath tester = new ClassForMath();
    System.out.println("4");
	 Thread.sleep(10000);
       Assert.assertEquals("Result", 7, tester.difference(12, 5));

}
public void testDifferencesTest6() throws InterruptedException {
//sdfsfdfsdfdfsdf
    ClassForMath tester = new ClassForMath();
	 Thread.sleep(10000);
       Assert.assertEquals("Result", 7, tester.difference(12, 5));

}
public void testDifferenceTest6() throws InterruptedException {
    ClassForMath tester = new ClassForMath();
	 Thread.sleep(10000);
       Assert.assertEquals("Result", 7, tester.difference(12, 5));

}
public void testDivisionTest6() throws InterruptedException {
    ClassForMath tester = new ClassForMath();
	 Thread.sleep(10000);
       Assert.assertEquals("Result", 8, tester.division(8,1));}

public void testDoubleSummaTest6() throws InterruptedException {
	//dfdfdfsfsdfsfdsfsf
	//dfsfdfsdfdfsdfsff
    ClassForMath tester = new ClassForMath();
	 Thread.sleep(10000);
       Assert.assertEquals("Result", 34, tester.double_summa(12, 5));
       //zzxzxzxzxzxzxzxzxzxzx
       
}
public void testTripleSummaTest6() throws InterruptedException
{ClassForMath test1= new ClassForMath();
  Thread.sleep(10000);
Assert.assertEquals("Result", 12, test1.triple_summa(2,2) );
	}


}
