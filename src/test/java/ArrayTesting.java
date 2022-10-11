import org.example.Arrays.ArrayMethods;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayTesting {


    @Test
    public void findIndexTest(){
        ArrayMethods obj = new ArrayMethods();

        int result = obj.findIndex(new int[]{1,2,3,4,5,6,7}, 3);


        //Testing methods
        assertEquals(2, result);
 }


    @Test
    public void searchNumberTest(){
        ArrayMethods obj = new ArrayMethods();
        boolean res = obj.searchNumber(new int[]{1,2,3,4,5,6,7,8}, 4);

        //Testing methods
        assertEquals(true, res);
        assertTrue(res);

        String str=null;
        assertNull(str);
        assertNotNull(res);
//        assertEquals(null, str);

//        fail("Unfinished Feature");


    }

    @Test
    public void findIndexEmpty(){
        ArrayMethods obj = new ArrayMethods();
        assertEquals(-1, obj.findIndex(new int[]{}, 2));

    }

    @Test
    public void findIndexOutOfBound(){
        ArrayMethods obj = new ArrayMethods();

        //assertaion based exception handling
        assertThrows(ArrayIndexOutOfBoundsException.class, ()->obj.printArray(new int[]{1,2,3,4,56}, 31));
    }

    @Test
    public void findIndexMultiple(){
        ArrayMethods obj = new ArrayMethods();

        assertAll(
                () -> assertEquals(1,obj.findIndex(new int[]{1,2}, 2)),
                () -> assertEquals(1, obj.findIndex(new int[]{1,2,3,4}, 2))
        );
    }


    //Test Asserts
    @Test
    public void testAssert(){
        boolean flag = true;
        assertEquals(true, flag);
        assertTrue(flag);
    }




}
