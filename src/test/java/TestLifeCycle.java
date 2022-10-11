import org.example.Arrays.ArrayMethods;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestLifeCycle {

    private ArrayMethods obj;

    @Test
    public void findIndexTest(){

        int result = obj.findIndex(new int[]{1,2,3,4,5,6,7}, 3);
        //Testing methods
        assertEquals(2, result);
    }


    @Test
    public void searchNumberTest(){

        boolean res = obj.searchNumber(new int[]{1,2,3,4,5,6,7,8}, 4);
        //Testing methods
        assertEquals(true, res);
//        assertTrue(res);
    }

    @BeforeEach
    public void beforeEachTest(){
        System.out.println("2.First initialize method before test");
        obj = new ArrayMethods();
    }

    @AfterEach
    public void afterEachTest(){
        System.out.println("3.CleanUp after each test");
    }

    @BeforeAll
    public static void beforeAllTest(){
        System.out.println("1.Before runing all the tests");
    }

    @AfterAll
    public static void afterAllTest(){
        System.out.println("4.After running all the tests");
    }


}
