package test.java.pk1b;

import main.java.pk1.ClassForMath;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
  Templates.
 */




//fff\
////yyyyy

 public class TestClassForMath7 {

   @Test     public void testMultiply() throws InterruptedException {
            ClassForMath tester = new ClassForMath();
            System.out.println("1");
            System.out.print("2");
            System.out.print("hello");
            System.err.print("hello again");
		 Thread.sleep(10000);
               assertEquals("Result", 30, tester.multiply(6, 5));

        }
public void testMultiply2() {
            ClassForMath tester = new ClassForMath();
            System.out.print("2");
            System.out.print("hello");
            System.err.print("hello again");
               assertEquals("Result", 30, tester.multiply2(6, 5));
       }
////t

public void testSumma() {
	
    ClassForMath tester = new ClassForMath();
    System.out.println("3");
    
       assertEquals("Result", 17, tester.summa(12, 5));
//dddddd
}
public void testDifference() {
    ClassForMath tester = new ClassForMath();
    System.out.println("4");
       assertEquals("Result", 7, tester.difference(12, 5));

}
public void testDifference2() {
//sdfsfdfsdfdfsdf
	//sdfsdfsdfsdfsdf
	//dfkdkfjskfjsldkfjslkdjflskjflksdjfsf
    ClassForMath tester = new ClassForMath();
       assertEquals("Result", 7, tester.difference(12, 5));

}
@Test public void testDifference1() throws InterruptedException {
    ClassForMath tester = new ClassForMath();
	Thread.sleep(10000);
       assertEquals("Result", 7, tester.difference(12, 5));

}
@Test @Ignore public void testDivision() throws InterruptedException {
    ClassForMath tester = new ClassForMath();
	 Thread.sleep(10000);
       assertEquals("Result", 8, tester.division(8,1));}

@Test @Ignore public void testDoubleSumma() {
	//dfdfdfsfsdfsfdsfsf
	//dfsfdfsdfdfsdfsff
    ClassForMath tester = new ClassForMath();
       assertEquals("Result", 34, tester.double_summa(12, 5));
       //zzxzxzxzxzxzxzxzxzxzx
       
}
@Test @Ignore public void testTripleSumma()
{ClassForMath test1= new ClassForMath();
assertEquals("Result", 12, test1.triple_summa(2,2) );
	}



@Test @Ignore public void testTripleSumma2() throws InterruptedException {
ClassForMath test1= new ClassForMath();
  Thread.sleep(10000);
assertEquals("Result", 12, test1.triple_summa(2,2) );
	}


@Test @Ignore public void testTripleSumma3()
{ClassForMath test1= new ClassForMath();
assertEquals("Result", 12, test1.triple_summa(2,2) );
	}

}
