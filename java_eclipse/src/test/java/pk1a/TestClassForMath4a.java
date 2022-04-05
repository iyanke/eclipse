package test.java.pk1;

import main.java.pk1.ClassForMath;
import junit.framework.*;
//fff\rttttttttttttttttt
////yyyyy
//tg



public class TestClassForMath4a extends TestCase {

        public void testMult4a()  throws InterruptedException {
            ClassForMath tester = new ClassForMath();
            System.out.println("1");
            System.out.print("2");
            System.out.print("hello");
            System.err.print("hello again");
		 Thread.sleep(10000);
               Assert.assertEquals("Result", 30, tester.multiply(6, 5));

        }
        public void testMulty24a()  throws InterruptedException {
            ClassForMath tester = new ClassForMath();
            System.out.print("2");
            System.out.print("hello");
            System.err.print("hello again");
		 Thread.sleep(10000);
               Assert.assertEquals("Result", 30, tester.multiply2(6, 5));
       }
////t

public void testSummaFor4a() throws InterruptedException {
	
    ClassForMath tester = new ClassForMath();
    System.out.println("3");
	 Thread.sleep(10000);
    
       Assert.assertEquals("Result", 17, tester.summa(12, 5));
//dddddd
}
public void testDifferenceFor4a() throws InterruptedException {
    ClassForMath tester = new ClassForMath();
    System.out.println("4");
	 Thread.sleep(10000);
       Assert.assertEquals("Result", 7, tester.difference(12, 5));

}
public void testDifference2For4a() throws InterruptedException {
//sdfsfdfsdfdfsdf
	//sdfsdfsdfsdfsdf
	//dfkdkfjskfjsldkfjslkdjflskjflksdjfsf
    ClassForMath tester = new ClassForMath();
	 Thread.sleep(10000);
       Assert.assertEquals("Result", 7, tester.difference(12, 5));

}
public void testDifference1For4a() throws InterruptedException {
    ClassForMath tester = new ClassForMath();
	 Thread.sleep(10000);
       Assert.assertEquals("Result", 7, tester.difference(12, 5));

}
public void testDivisionFor4a() throws InterruptedException {
    ClassForMath tester = new ClassForMath();
	 Thread.sleep(10000);
       Assert.assertEquals("Result", 8, tester.division(8,1));}

public void testDoubleSummaFor4a() throws InterruptedException {
	//dfdfdfsfsdfsfdsfsf
	//dfsfdfsdfdfsdfsff
    ClassForMath tester = new ClassForMath();
	 Thread.sleep(10000);
       Assert.assertEquals("Result", 34, tester.double_summa(12, 5));
       //zzxzxzxzxzxzxzxzxzxzx
       
}
public void testTripleSummaFor4a() throws InterruptedException
{ClassForMath test1= new ClassForMath();
  Thread.sleep(10000);
Assert.assertEquals("Result", 12, test1.triple_summa(2,2) );
	}


}
