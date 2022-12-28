public class DemoTest {
    /**
 * The class containing your tests for the {@link Demo} class.  Make sure you
 * test all methods in this class (including both 
 * {@link Demo#main(String[])} and 
 * {@link Demo#isTriangle(double, double, double)}).
 */
public class DemoTest {
    @Test
    public void test_is_tringle_1(){
        assertTrue(Demo.isTriangle(3,4,5));
    }
    @Test
    public void test_is_tringle_2(){
        assertTrue(Demo.isTriangle(5,12,13));
    }
    @Test
    public void test_is_tringle_3(){
        assertTrue(Demo.isTriangle(5,13,12));
    }

    @Test
    public void test_is_tringle_4(){
        assertTrue(Demo.isTriangle(12,5,13));
    }
    public void test_is_tringle_5(){
        assertTrue(Demo.isTriangle(12,13,5));
    }
     public void test_is__Not_tringle_1(){
        assertFalse(Demo.isTriangle(5,7,13));
    }
     public void test_is_Not_tringle_2(){
        assertFalse(Demo.isTriangle(5,13,7));
    }
     public void test_is_Not_tringle_3(){
        assertFalse(Demo.isTriangle(13,5,7));
    }
    public void test_is_Not_tringle_4(){
        assertFalse(Demo.isTriangle(13,7,5));
    }
    public void test_is_Not_tringle_5(){
        assertFalse(Demo.isTriangle(13,7,5));
    }
    public void test_is_Not_tringle_6(){
        assertFalse(Demo.isTriangle(5,9,3));
    }
    public void test_is_Not_tringle_7(){
        assertFalse(Demo.isTriangle(1,2,-1));
    }
    @Test
    public void test_main_program_1(){
        ByTeArrayInputStream in=new ByTeArrayInputStream("5\n12\n13\n".getBytes());
        System.setIn(in);
        ByTeArrayOutputStream out=new ByTeArrayOutputStream();
        System.setOut(new PrintStream(out));
        String consoleOutput="Enter side 1: \n ";
        consoleOutput += "Enter side 2: \n";
        consoleOutput += "Enter side 3: \n";
        consoleOutput += "This is triangle. \n";
        assertEquals(consoleOutput, out.toString());

    }
}
    
}
