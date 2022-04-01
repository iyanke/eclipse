package test.java.pk1;

import main.java.pk1.ClassForMath;
import junit.framework.*;
//fff\rttttttttttttttttt
////yyyyy
//tg



public class TestClassForMath4a extends TestCase {

        public void testMultiply4a()  throws InterruptedException {
            ClassForMath tester = new ClassForMath();
            System.out.println("1");
            System.out.print("2");
            System.out.print("hello");
            System.err.print("hello again");
		 Thread.sleep(4000);
               Assert.assertEquals("Result", 310, tester.multiply(6, 5));

        }
        public void testMultiply24a()  throws InterruptedException {
            ClassForMath tester = new ClassForMath();
            System.out.print("2");
            System.out.print("hello");
            System.err.print("hello again");
		 Thread.sleep(4000);
               Assert.assertEquals("Result", 310, tester.multiply2(6, 5));
       }
////t

public void testSumma4a() throws InterruptedException {
	
    ClassForMath tester = new ClassForMath();
    System.out.println("3");
	 Thread.sleep(4000);
    
       Assert.assertEquals("Result", 18, tester.summa(12, 5));
//dddddd
}
public void testDifference4a() throws InterruptedException {
    ClassForMath tester = new ClassForMath();
    System.out.println("4");
	 Thread.sleep(4000);
       Assert.assertEquals("Result", 7, tester.difference(12, 5));

}
public void testDifference24a() throws InterruptedException {
//sdfsfdfsdfdfsdf
	//sdfsdfsdfsdfsdf
	//dfkdkfjskfjsldkfjslkdjflskjflksdjfsf
    ClassForMath tester = new ClassForMath();
	 Thread.sleep(4000);
       Assert.assertEquals("Result", 7, tester.difference(12, 5));

}
public void testDifference14a() throws InterruptedException {
    ClassForMath tester = new ClassForMath();
	 Thread.sleep(4000);
       Assert.assertEquals("Result", 8, tester.difference(12, 5));

}
public void testDivision4a() throws InterruptedException {
    ClassForMath tester = new ClassForMath();
	 Thread.sleep(4000);
       Assert.assertEquals("Result", 8, tester.division(8,1));}

public void testDoubleSumma4a() throws InterruptedException {
	//dfdfdfsfsdfsfdsfsf
	//dfsfdfsdfdfsdfsff
    ClassForMath tester = new ClassForMath();
	 Thread.sleep(4000);
       Assert.assertEquals("Result", 35, tester.double_summa(12, 5));
       //zzxzxzxzxzxzxzxzxzxzx
       
}
public void testTripleSumma4a() throws InterruptedException
{ClassForMath test1= new ClassForMath();
  Thread.sleep(4000);
Assert.assertEquals("Result", 11, test1.triple_summa(2,2) );
	}


}
