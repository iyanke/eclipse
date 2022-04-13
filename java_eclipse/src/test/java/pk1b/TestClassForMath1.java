package test.java.pk1b;

import main.java.pk1.ClassForMath;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by IntelliJ IDEA.
 * User: Elena.Pogorelova
 * Date: 9/23/11
 * Time: 12:50 PM
 * To change this template use File | Settings | File Templates.
 */




//fff\
////yyyyy

public class TestClassForMath1 {

        public void testMultiply() {
            ClassForMath tester = new ClassForMath();
            System.out.println("1");
            System.out.print("2");
            System.out.print("hello");
            System.err.print("hello again");
               assertEquals("Result", 30, tester.multiply(6, 5));

        }
@Test @Ignore public void testMultiply2() {
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
@Test @Ignore public void testDifference() {
    ClassForMath tester = new ClassForMath();
    System.out.println("4");
       assertEquals("Result", 7, tester.difference(12, 5));

}
@Test @Ignore public void testDifference2() {
//sdfsfdfsdfdfsdf
	//sdfsdfsdfsdfsdf
	//dfkdkfjskfjsldkfjslkdjflskjflksdjfsf
    ClassForMath tester = new ClassForMath();
       assertEquals("Result", 7, tester.difference(12, 5));

}
@Test @Ignore public void testDifference1() {
    ClassForMath tester = new ClassForMath();
       assertEquals("Result", 7, tester.difference(12, 5));

}
@Test @Ignore public void testDivision() {
    ClassForMath tester = new ClassForMath();
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



@Test @Ignore public void testTripleSumma2()
{ClassForMath test1= new ClassForMath();
assertEquals("Result", 12, test1.triple_summa(2,2) );
	}


@Test @Ignore public void testTripleSumma3()
{ClassForMath test1= new ClassForMath();
assertEquals("Result", 12, test1.triple_summa(2,2) );
	}
}

