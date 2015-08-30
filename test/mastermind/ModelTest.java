package mastermind;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jeroen De Meyer
 */
public class ModelTest {
    
    private final Model model = new Model();
     
    private final int[] code1 = {};
    private final int[] code2 = {0};
    private final int[] code3 = {0,1};
    private final int[] code4 = {0,0};
    private final int[] code5 = {'a',0,1};
    private final int[] code6 = {10,0,1};
    private final int[] code7 = {1,1,1,1};
    private final int[] code8 = {'a', 'b'};
    private final int[] code9 = {1,1,1,1,1,1,1,1,1,1,1};
    private final int[] code10 = {0,1,2,3,4,5,6,7};
    private final int[] code11 = {0,1,2,3,4,5,6,7,8};
    private final int[] code12 = {0,1,2,3};
    private final int[] code13 = {0,1,1,2};
    private final int[] code14 = {0,1,2,2,3};
    private final int[] code15 = {0,1,2,3,4};
    private final int[] code16 = {5,5,4,3,2,1};
    private final int[] code17 = {5,4,3,2,1,0};
    private final int[] code18 = {6,5,5,4,3,2,1};
    private final int[] code19 = {6,5,4,3,2,1,0};
    private final int[] code20 = {7,6,5,5,4,3,2,1};
    private final int[] code21 = {7,6,5,4,3,2,1,0};
    private final int[] code22 = {8,7,6,5,5,4,3,2,1};
    private final int[] code23 = {8,7,6,5,4,3,2,1,0}; 
    
    public ModelTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }


    /**
     * Test of makeCode method, of class Model.
     */
    @Test
    public void testMakeCode() {
        System.out.println("makeCode");

        model.makePossibilities(4);
        assertFalse(model.makeCode(code1));
        assertFalse(model.makeCode(code2));
        assertFalse(model.makeCode(code3));
        assertFalse(model.makeCode(code4));
        assertFalse(model.makeCode(code5));
        assertFalse(model.makeCode(code6));
        assertTrue(model.makeCode(code7));
        assertFalse(model.makeCode(code8));
        assertFalse(model.makeCode(code9));
        assertFalse(model.makeCode(code10));
        assertFalse(model.makeCode(code11));
        assertTrue(model.makeCode(code12));
        assertTrue(model.makeCode(code13));
        assertFalse(model.makeCode(code14));
        assertFalse(model.makeCode(code15));
        assertFalse(model.makeCode(code16));
        assertFalse(model.makeCode(code17));
        assertFalse(model.makeCode(code18));
        assertFalse(model.makeCode(code19));
        assertFalse(model.makeCode(code20));
        assertFalse(model.makeCode(code21));
        assertFalse(model.makeCode(code22));
        assertFalse(model.makeCode(code23));
         
        model.makePossibilities(5);
        assertFalse(model.makeCode(code1));
        assertFalse(model.makeCode(code2));
        assertFalse(model.makeCode(code3));
        assertFalse(model.makeCode(code4));
        assertFalse(model.makeCode(code5));
        assertFalse(model.makeCode(code6));
        assertFalse(model.makeCode(code7));
        assertFalse(model.makeCode(code8));
        assertFalse(model.makeCode(code9));
        assertFalse(model.makeCode(code10));
        assertFalse(model.makeCode(code11));
        assertFalse(model.makeCode(code12));
        assertFalse(model.makeCode(code13));
        assertTrue(model.makeCode(code14));
        assertTrue(model.makeCode(code15));
        assertFalse(model.makeCode(code16));
        assertFalse(model.makeCode(code17));
        assertFalse(model.makeCode(code18));
        assertFalse(model.makeCode(code19));
        assertFalse(model.makeCode(code20));
        assertFalse(model.makeCode(code21));
        assertFalse(model.makeCode(code22));
        assertFalse(model.makeCode(code23));
        
        model.makePossibilities(6);
        assertFalse(model.makeCode(code1));
        assertFalse(model.makeCode(code2));
        assertFalse(model.makeCode(code3));
        assertFalse(model.makeCode(code4));
        assertFalse(model.makeCode(code5));
        assertFalse(model.makeCode(code6));
        assertFalse(model.makeCode(code7));
        assertFalse(model.makeCode(code8));
        assertFalse(model.makeCode(code9));
        assertFalse(model.makeCode(code10));
        assertFalse(model.makeCode(code11));
        assertFalse(model.makeCode(code12));
        assertFalse(model.makeCode(code13));
        assertFalse(model.makeCode(code14));
        assertFalse(model.makeCode(code15));
        assertTrue(model.makeCode(code16));
        assertTrue(model.makeCode(code17));
        assertFalse(model.makeCode(code18));
        assertFalse(model.makeCode(code19));
        assertFalse(model.makeCode(code20));
        assertFalse(model.makeCode(code21));
        assertFalse(model.makeCode(code22));
        assertFalse(model.makeCode(code23));
        
        model.makePossibilities(7);
        assertFalse(model.makeCode(code1));
        assertFalse(model.makeCode(code2));
        assertFalse(model.makeCode(code3));
        assertFalse(model.makeCode(code4));
        assertFalse(model.makeCode(code5));
        assertFalse(model.makeCode(code6));
        assertFalse(model.makeCode(code7));
        assertFalse(model.makeCode(code8));
        assertFalse(model.makeCode(code9));
        assertFalse(model.makeCode(code10));
        assertFalse(model.makeCode(code11));
        assertFalse(model.makeCode(code12));
        assertFalse(model.makeCode(code13));
        assertFalse(model.makeCode(code14));
        assertFalse(model.makeCode(code15));
        assertFalse(model.makeCode(code16));
        assertFalse(model.makeCode(code17));
        assertTrue(model.makeCode(code18));
        assertTrue(model.makeCode(code19));
        assertFalse(model.makeCode(code20));
        assertFalse(model.makeCode(code21));
        assertFalse(model.makeCode(code22));
        assertFalse(model.makeCode(code23));
        
        model.makePossibilities(8);
        assertFalse(model.makeCode(code1));
        assertFalse(model.makeCode(code2));
        assertFalse(model.makeCode(code3));
        assertFalse(model.makeCode(code4));
        assertFalse(model.makeCode(code5));
        assertFalse(model.makeCode(code6));
        assertFalse(model.makeCode(code7));
        assertFalse(model.makeCode(code8));
        assertFalse(model.makeCode(code9));
        assertFalse(model.makeCode(code10));
        assertFalse(model.makeCode(code11));
        assertFalse(model.makeCode(code12));
        assertFalse(model.makeCode(code13));
        assertFalse(model.makeCode(code14));
        assertFalse(model.makeCode(code15));
        assertFalse(model.makeCode(code16));
        assertFalse(model.makeCode(code17));
        assertFalse(model.makeCode(code18));
        assertFalse(model.makeCode(code19));
        assertTrue(model.makeCode(code20));
        assertTrue(model.makeCode(code21));
        assertFalse(model.makeCode(code22));
        assertFalse(model.makeCode(code23));
        
        model.makePossibilities(9);
        assertFalse(model.makeCode(code1));
        assertFalse(model.makeCode(code2));
        assertFalse(model.makeCode(code3));
        assertFalse(model.makeCode(code4));
        assertFalse(model.makeCode(code5));
        assertFalse(model.makeCode(code6));
        assertFalse(model.makeCode(code7));
        assertFalse(model.makeCode(code8));
        assertFalse(model.makeCode(code9));
        assertFalse(model.makeCode(code10));
        assertFalse(model.makeCode(code11));
        assertFalse(model.makeCode(code12));
        assertFalse(model.makeCode(code13));
        assertFalse(model.makeCode(code14));
        assertFalse(model.makeCode(code15));
        assertFalse(model.makeCode(code16));
        assertFalse(model.makeCode(code17));
        assertFalse(model.makeCode(code18));
        assertFalse(model.makeCode(code19));
        assertFalse(model.makeCode(code20));
        assertFalse(model.makeCode(code21));
        assertTrue(model.makeCode(code22));
        assertTrue(model.makeCode(code23));
    }

    /**
     * Test of makeAttempt method, of class Model.
     */
    @Test
    public void testMakeAttempt() {
        System.out.println("makeAttempt");
        
        model.makePossibilities(4);
        assertFalse(model.makeAttempt(code1));
        assertFalse(model.makeAttempt(code2));
        assertFalse(model.makeAttempt(code3));
        assertFalse(model.makeAttempt(code4));
        assertFalse(model.makeAttempt(code5));
        assertFalse(model.makeAttempt(code6));
        assertTrue(model.makeAttempt(code7));
        assertFalse(model.makeAttempt(code8));
        assertFalse(model.makeAttempt(code9));
        assertFalse(model.makeAttempt(code10));
        assertFalse(model.makeAttempt(code11));
        assertTrue(model.makeAttempt(code12));
        assertTrue(model.makeAttempt(code13));
        assertFalse(model.makeAttempt(code14));
        assertFalse(model.makeAttempt(code15));
        assertFalse(model.makeAttempt(code16));
        assertFalse(model.makeAttempt(code17));
        assertFalse(model.makeAttempt(code18));
        assertFalse(model.makeAttempt(code19));
        assertFalse(model.makeAttempt(code20));
        assertFalse(model.makeAttempt(code21));
        assertFalse(model.makeAttempt(code22));
        assertFalse(model.makeAttempt(code23));
         
        model.makePossibilities(5);
        assertFalse(model.makeAttempt(code1));
        assertFalse(model.makeAttempt(code2));
        assertFalse(model.makeAttempt(code3));
        assertFalse(model.makeAttempt(code4));
        assertFalse(model.makeAttempt(code5));
        assertFalse(model.makeAttempt(code6));
        assertFalse(model.makeAttempt(code7));
        assertFalse(model.makeAttempt(code8));
        assertFalse(model.makeAttempt(code9));
        assertFalse(model.makeAttempt(code10));
        assertFalse(model.makeAttempt(code11));
        assertFalse(model.makeAttempt(code12));
        assertFalse(model.makeAttempt(code13));
        assertTrue(model.makeAttempt(code14));
        assertTrue(model.makeAttempt(code15));
        assertFalse(model.makeAttempt(code16));
        assertFalse(model.makeAttempt(code17));
        assertFalse(model.makeAttempt(code18));
        assertFalse(model.makeAttempt(code19));
        assertFalse(model.makeAttempt(code20));
        assertFalse(model.makeAttempt(code21));
        assertFalse(model.makeAttempt(code22));
        assertFalse(model.makeAttempt(code23));
        
        model.makePossibilities(6);
        assertFalse(model.makeAttempt(code1));
        assertFalse(model.makeAttempt(code2));
        assertFalse(model.makeAttempt(code3));
        assertFalse(model.makeAttempt(code4));
        assertFalse(model.makeAttempt(code5));
        assertFalse(model.makeAttempt(code6));
        assertFalse(model.makeAttempt(code7));
        assertFalse(model.makeAttempt(code8));
        assertFalse(model.makeAttempt(code9));
        assertFalse(model.makeAttempt(code10));
        assertFalse(model.makeAttempt(code11));
        assertFalse(model.makeAttempt(code12));
        assertFalse(model.makeAttempt(code13));
        assertFalse(model.makeAttempt(code14));
        assertFalse(model.makeAttempt(code15));
        assertTrue(model.makeAttempt(code16));
        assertTrue(model.makeAttempt(code17));
        assertFalse(model.makeAttempt(code18));
        assertFalse(model.makeAttempt(code19));
        assertFalse(model.makeAttempt(code20));
        assertFalse(model.makeAttempt(code21));
        assertFalse(model.makeAttempt(code22));
        assertFalse(model.makeAttempt(code23));
        
        model.makePossibilities(7);
        assertFalse(model.makeAttempt(code1));
        assertFalse(model.makeAttempt(code2));
        assertFalse(model.makeAttempt(code3));
        assertFalse(model.makeAttempt(code4));
        assertFalse(model.makeAttempt(code5));
        assertFalse(model.makeAttempt(code6));
        assertFalse(model.makeAttempt(code7));
        assertFalse(model.makeAttempt(code8));
        assertFalse(model.makeAttempt(code9));
        assertFalse(model.makeAttempt(code10));
        assertFalse(model.makeAttempt(code11));
        assertFalse(model.makeAttempt(code12));
        assertFalse(model.makeAttempt(code13));
        assertFalse(model.makeAttempt(code14));
        assertFalse(model.makeAttempt(code15));
        assertFalse(model.makeAttempt(code16));
        assertFalse(model.makeAttempt(code17));
        assertTrue(model.makeAttempt(code18));
        assertTrue(model.makeAttempt(code19));
        assertFalse(model.makeAttempt(code20));
        assertFalse(model.makeAttempt(code21));
        assertFalse(model.makeAttempt(code22));
        assertFalse(model.makeAttempt(code23));
        
        model.makePossibilities(8);
        assertFalse(model.makeAttempt(code1));
        assertFalse(model.makeAttempt(code2));
        assertFalse(model.makeAttempt(code3));
        assertFalse(model.makeAttempt(code4));
        assertFalse(model.makeAttempt(code5));
        assertFalse(model.makeAttempt(code6));
        assertFalse(model.makeAttempt(code7));
        assertFalse(model.makeAttempt(code8));
        assertFalse(model.makeAttempt(code9));
        assertFalse(model.makeAttempt(code10));
        assertFalse(model.makeAttempt(code11));
        assertFalse(model.makeAttempt(code12));
        assertFalse(model.makeAttempt(code13));
        assertFalse(model.makeAttempt(code14));
        assertFalse(model.makeAttempt(code15));
        assertFalse(model.makeAttempt(code16));
        assertFalse(model.makeAttempt(code17));
        assertFalse(model.makeAttempt(code18));
        assertFalse(model.makeAttempt(code19));
        assertTrue(model.makeAttempt(code20));
        assertTrue(model.makeAttempt(code21));
        assertFalse(model.makeAttempt(code22));
        assertFalse(model.makeAttempt(code23));
        
        model.makePossibilities(9);
        assertFalse(model.makeAttempt(code1));
        assertFalse(model.makeAttempt(code2));
        assertFalse(model.makeAttempt(code3));
        assertFalse(model.makeAttempt(code4));
        assertFalse(model.makeAttempt(code5));
        assertFalse(model.makeAttempt(code6));
        assertFalse(model.makeAttempt(code7));
        assertFalse(model.makeAttempt(code8));
        assertFalse(model.makeAttempt(code9));
        assertFalse(model.makeAttempt(code10));
        assertFalse(model.makeAttempt(code11));
        assertFalse(model.makeAttempt(code12));
        assertFalse(model.makeAttempt(code13));
        assertFalse(model.makeAttempt(code14));
        assertFalse(model.makeAttempt(code15));
        assertFalse(model.makeAttempt(code16));
        assertFalse(model.makeAttempt(code17));
        assertFalse(model.makeAttempt(code18));
        assertFalse(model.makeAttempt(code19));
        assertFalse(model.makeAttempt(code20));
        assertFalse(model.makeAttempt(code21));
        assertTrue(model.makeAttempt(code22));
        assertTrue(model.makeAttempt(code23));
    }

    /**
     * Test of makePossibilities method, of class Model.
     */
    @Test
    public void testMakePossibilities() {
        System.out.println("makePossibilities");
        model.makePossibilities(0);
        assertArrayEquals(new int[]{}, model.getPossibilities());
        model.makePossibilities(1);
        assertArrayEquals(new int[]{0}, model.getPossibilities());
        model.makePossibilities(2);
        assertArrayEquals(new int[]{0,1}, model.getPossibilities());
        model.makePossibilities(3);
        assertArrayEquals(new int[]{0,1,2}, model.getPossibilities());
        model.makePossibilities(4);
        assertArrayEquals(new int[]{0,1,2,3}, model.getPossibilities());
        model.makePossibilities(5);
        assertArrayEquals(new int[]{0,1,2,3,4}, model.getPossibilities());
        model.makePossibilities(6);
        assertArrayEquals(new int[]{0,1,2,3,4,5}, model.getPossibilities());
        model.makePossibilities(7);
        assertArrayEquals(new int[]{0,1,2,3,4,5,6}, model.getPossibilities());
        model.makePossibilities(8);
        assertArrayEquals(new int[]{0,1,2,3,4,5,6,7}, model.getPossibilities());
        model.makePossibilities(9);
        assertArrayEquals(new int[]{0,1,2,3,4,5,6,7,8}, model.getPossibilities());
    }

    /**
     * Test of checkCode method, of class Model.
     */
    @Test
    public void testCheckCode() {
        System.out.println("checkCode");
        int[] c1 = {0,1,2,3};
        int[] c2 = {0,0,2,3};
        int[] c3 = {0,0,0,3};
        int[] c4 = {0,0,0,0};
        int[] c5 = {0,3,2,1};
        int[] c6 = {3,1,1,2};
        int[] c31 = {-1,1,2,3};
        int[] c32 = {0,1,2,4};
        
        int[] c7 = {0,1,2,3,4};
        int[] c8 = {0,0,2,3,4};
        int[] c9 = {0,0,0,3,1};
        int[] c10 = {0,0,0,0,0};
        int[] c11 = {0,3,2,1,3};
        int[] c12 = {3,1,1,2,1};
        int[] c33 = {-1,1,2,3,-1};
        int[] c34 = {0,1,2,3,5};
        
        int[] c13 = {0,1,2,3,4,5,6};
        int[] c14 = {0,0,2,3,4,5,1};
        int[] c15 = {0,0,0,3,1,3,3};
        int[] c16 = {0,0,0,0,0,0,0};
        int[] c17 = {0,3,2,1,3,0,0};
        int[] c18 = {3,1,1,2,1,5,4};
        int[] c35 = {0,1,2,3,4,5,7};
        int[] c36 = {-1,-1,-1,-7,1,1,};
        
        int[] c19 = {0,1,2,3,4,5,6,7};
        int[] c20 = {0,0,2,3,4,5,1,0};
        int[] c21 = {0,0,0,3,1,3,3,3};
        int[] c22 = {0,0,0,0,0,0,0,0};
        int[] c23 = {0,3,2,1,3,0,0,7};
        int[] c24 = {3,1,1,2,1,5,4,7};
        
        int[] c25 = {0,1,2,3,4,5,6,7,8};
        int[] c26 = {0,0,2,3,4,5,1,0,8};
        int[] c27 = {0,0,0,3,1,3,3,3,3};
        int[] c28 = {0,0,0,0,0,0,0,0,0};
        int[] c29 = {0,3,2,1,3,0,0,7,3};
        int[] c30 = {3,1,1,2,1,5,4,7,5};

        asssertArrayEquals(int[]{0,4})
    }
    
}
