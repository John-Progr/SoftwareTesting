import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayUtilTest3170106 {

	//we test if we actually reverse the elements of an array 
    @Test
    public void reverseStart1() {
        int [] testArrayBefore={1,2,3,4};
        int [] testArrayAfter={1,2,3,4};
        int [] expected={1,4,3,2};

        ArrayUtil arrayutil=new ArrayUtil();
        boolean b=arrayutil.reverse(testArrayAfter,1);
        assertArrayEquals(expected,testArrayAfter);
    }

    
	//we test if it returns false with a null array as input
    @Test
    public void nullTest(){
        ArrayUtil arrayutil=new ArrayUtil();
        boolean expected=false;

        int [] arraynull=null;

        boolean actual=arrayutil.reverse(arraynull,3);

        assertFalse(actual);

    }
   
	
	//we test if we put start value greater than array length,returns false
    @Test
    public void startTest(){
        ArrayUtil arrayutil=new ArrayUtil();
        int [] testArray={1,2,3,4};
        int start=testArray.length+1;
        boolean actual=arrayutil.reverse(testArray,start);
        assertFalse(actual);

    }
    
	//we test the output in case start has negative value as long as there is a condition(start>0)
    @Test
    public void startTest2(){
        ArrayUtil arrayutil=new ArrayUtil();
        int [] testArray={1,2,3,4};
        int start=-1;
        boolean actual=arrayutil.reverse(testArray,start);
        assertFalse(actual);



    }


}