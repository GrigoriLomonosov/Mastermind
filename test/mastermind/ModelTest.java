package mastermind;

import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.BLACK;
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

        model.makePossibilities(6);
        model.setCodeLength(4);
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
         
        model.makePossibilities(7);
        model.setCodeLength(5);
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
        
        model.makePossibilities(8);
        model.setCodeLength(6);
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
        
        model.makePossibilities(9);
        model.setCodeLength(7);
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
        
        model.makePossibilities(10);
        model.setCodeLength(8);
        assertFalse(model.makeCode(code1));
        assertFalse(model.makeCode(code2));
        assertFalse(model.makeCode(code3));
        assertFalse(model.makeCode(code4));
        assertFalse(model.makeCode(code5));
        assertFalse(model.makeCode(code6));
        assertFalse(model.makeCode(code7));
        assertFalse(model.makeCode(code8));
        assertFalse(model.makeCode(code9));
        assertTrue(model.makeCode(code10));
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
        
        model.makePossibilities(11);
        model.setCodeLength(9);
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
        assertTrue(model.makeCode(code11));
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
    
    @Test
    public void testNewGame() {
        System.out.println("newGame");
        
        assertTrue(model.newGame(6, 4)); //true
        assertFalse(model.newGame(4, 6)); //false
        assertFalse(model.newGame(5, 4)); //false
        assertFalse(model.newGame(6, 9));
        assertTrue(model.newGame(9,6));
    }

    /**
     * Test of makeAttempt method, of class Model.
     */
    @Test
    public void testMakeAttempt() {
        System.out.println("makeAttempt");
        
        model.makePossibilities(6);
        model.setCodeLength(4);
        model.makeCode(new int[]{0,1,2,3});
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
         
        model.makePossibilities(7);
        model.setCodeLength(5);
        model.makeCode(new int[]{0,1,2,3,4});
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
        
        model.makePossibilities(8);
        model.setCodeLength(6);
        model.makeCode(new int[]{0,1,2,3,4,5});
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
        
        model.makePossibilities(9);
        model.setCodeLength(7);
        model.makeCode(new int[]{0,1,2,3,4,5,6});
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
        
        model.makePossibilities(10);
        model.setCodeLength(8);
        model.makeCode(new int[]{0,1,2,3,4,5,6,7});
        assertFalse(model.makeAttempt(code1));
        assertFalse(model.makeAttempt(code2));
        assertFalse(model.makeAttempt(code3));
        assertFalse(model.makeAttempt(code4));
        assertFalse(model.makeAttempt(code5));
        assertFalse(model.makeAttempt(code6));
        assertFalse(model.makeAttempt(code7));
        assertFalse(model.makeAttempt(code8));
        assertFalse(model.makeAttempt(code9));
        assertTrue(model.makeAttempt(code10));
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
               
        model.makePossibilities(11);
        model.setCodeLength(9);
        model.makeCode(new int[]{0,1,2,3,4,5,6,7,8});
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
        assertTrue(model.makeAttempt(code11));
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
        assertFalse(model.makePossibilities(0));
        assertFalse(model.makePossibilities(1));
        assertFalse(model.makePossibilities(2));
        assertFalse(model.makePossibilities(3));
        model.makePossibilities(6);
        assertArrayEquals(new int[]{0,1,2,3,4,5}, model.getPossibilities());
        model.makePossibilities(7);
        assertArrayEquals(new int[]{0,1,2,3,4,5,6}, model.getPossibilities());
        model.makePossibilities(8);
        assertArrayEquals(new int[]{0,1,2,3,4,5,6,7}, model.getPossibilities());
        model.makePossibilities(9);
        assertArrayEquals(new int[]{0,1,2,3,4,5,6,7,8}, model.getPossibilities());
        model.makePossibilities(10);
        assertArrayEquals(new int[]{0,1,2,3,4,5,6,7,8,9}, model.getPossibilities());
        assertFalse(model.makePossibilities(12));
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
        model.makePossibilities(6);
        model.setCodeLength(4);
        model.makeCode(c1);
        model.makeAttempt(c1);
        assertArrayEquals(new int[]{4,0}, model.checkCode());
        model.makeAttempt(c2);
        assertArrayEquals(new int[]{3,0}, model.checkCode());
        model.makeAttempt(c3);
        assertArrayEquals(new int[]{2,0}, model.checkCode());
        model.makeAttempt(c4);
        assertArrayEquals(new int[]{1,0}, model.checkCode());
        model.makeAttempt(c5);
        assertArrayEquals(new int[]{2,2}, model.checkCode());
        model.makeAttempt(c6);
        assertArrayEquals(new int[]{1,2}, model.checkCode());
        model.makeCode(c2);
        model.makeAttempt(c2);
        assertArrayEquals(new int[]{4,0}, model.checkCode());
        model.makeAttempt(c3);
        assertArrayEquals(new int[]{3,0}, model.checkCode());
        model.makeAttempt(c4);
        assertArrayEquals(new int[]{2,0}, model.checkCode());
        model.makeAttempt(c5);
        assertArrayEquals(new int[]{2,1}, model.checkCode());
        model.makeAttempt(c6);
        assertArrayEquals(new int[]{0,2}, model.checkCode());
        model.makeCode(c3);
        model.makeAttempt(c3);
        assertArrayEquals(new int[]{4,0}, model.checkCode());
        model.makeAttempt(c4);
        assertArrayEquals(new int[]{3,0}, model.checkCode());
        model.makeAttempt(c5);
        assertArrayEquals(new int[]{1,1}, model.checkCode());
        model.makeAttempt(c6);
        assertArrayEquals(new int[]{0,1}, model.checkCode());
        model.makeCode(c4);
        model.makeAttempt(c4);
        assertArrayEquals(new int[]{4,0}, model.checkCode());
        model.makeAttempt(c5);
        assertArrayEquals(new int[]{1,0}, model.checkCode());
        model.makeAttempt(c6);
        assertArrayEquals(new int[]{0,0}, model.checkCode());
        model.makeCode(c5);
        model.makeAttempt(c5);
        assertArrayEquals(new int[]{4,0}, model.checkCode());
        model.makeAttempt(c6);
        assertArrayEquals(new int[]{0,3}, model.checkCode());
        model.makeCode(c6);
        model.makeAttempt(c6);
        assertArrayEquals(new int[]{4,0}, model.checkCode());
        

        int[] c7 = {0,1,2,3,4};
        int[] c8 = {0,0,2,3,4};
        int[] c9 = {0,0,0,3,1};
        int[] c10 = {0,0,0,0,0};
        int[] c11 = {0,3,2,1,3};
        int[] c12 = {3,1,1,2,1};
        model.makePossibilities(7);
        model.setCodeLength(5);
        model.makeCode(c7);
        model.makeAttempt(c7);
        assertArrayEquals(new int[]{5,0}, model.checkCode());
        model.makeAttempt(c8);
        assertArrayEquals(new int[]{4,0}, model.checkCode());
        model.makeAttempt(c9);
        assertArrayEquals(new int[]{2,1}, model.checkCode());
        model.makeAttempt(c10);
        assertArrayEquals(new int[]{1,0}, model.checkCode());
        model.makeAttempt(c11);
        assertArrayEquals(new int[]{2,2}, model.checkCode());
        model.makeAttempt(c12);
        assertArrayEquals(new int[]{1,2}, model.checkCode());
        model.makeCode(c8);
        model.makeAttempt(c8);
        assertArrayEquals(new int[]{5,0}, model.checkCode());
        model.makeAttempt(c9);
        assertArrayEquals(new int[]{3,0}, model.checkCode());
        model.makeAttempt(c10);
        assertArrayEquals(new int[]{2,0}, model.checkCode());
        model.makeAttempt(c11);
        assertArrayEquals(new int[]{2,1}, model.checkCode());
        model.makeAttempt(c12);
        assertArrayEquals(new int[]{0,2}, model.checkCode());
        model.makeCode(c9);
        model.makeAttempt(c9);
        assertArrayEquals(new int[]{5,0}, model.checkCode());
        model.makeAttempt(c10);
        assertArrayEquals(new int[]{3,0}, model.checkCode());
        model.makeAttempt(c11);
        assertArrayEquals(new int[]{1,2}, model.checkCode());
        model.makeAttempt(c12);
        assertArrayEquals(new int[]{1,1}, model.checkCode());
        model.makeCode(c10);
        model.makeAttempt(c10);
        assertArrayEquals(new int[]{5,0}, model.checkCode());
        model.makeAttempt(c11);
        assertArrayEquals(new int[]{1,0}, model.checkCode());
        model.makeAttempt(c12);
        assertArrayEquals(new int[]{0,0}, model.checkCode());
        model.makeCode(c11);
        model.makeAttempt(c11);
        assertArrayEquals(new int[]{5,0}, model.checkCode());
        model.makeAttempt(c12);
        assertArrayEquals(new int[]{0,3}, model.checkCode());
        model.makeCode(c12);
        model.makeAttempt(c12);
        assertArrayEquals(new int[]{5,0}, model.checkCode());
        
        
        int[] c13 = {0,1,2,3,4,5};
        int[] c14 = {0,0,2,3,4,5};
        int[] c15 = {0,0,0,3,1,3};
        int[] c16 = {0,0,0,0,0,0};
        int[] c17 = {0,3,2,1,3,0};
        int[] c18 = {3,1,1,2,1,5};
        model.makePossibilities(8);
        model.setCodeLength(6);
        model.makeCode(c13);
        model.makeAttempt(c13);
        assertArrayEquals(new int[]{6,0}, model.checkCode());
        model.makeAttempt(c14);
        assertArrayEquals(new int[]{5,0}, model.checkCode());
        model.makeAttempt(c15);
        assertArrayEquals(new int[]{2,1}, model.checkCode());
        model.makeAttempt(c16);
        assertArrayEquals(new int[]{1,0}, model.checkCode());
        model.makeAttempt(c17);
        assertArrayEquals(new int[]{2,2}, model.checkCode());
        model.makeAttempt(c18);
        assertArrayEquals(new int[]{2,2}, model.checkCode());
        model.makeCode(c14);
        model.makeAttempt(c14);
        assertArrayEquals(new int[]{6,0}, model.checkCode());
        model.makeAttempt(c15);
        assertArrayEquals(new int[]{3,0}, model.checkCode());
        model.makeAttempt(c16);
        assertArrayEquals(new int[]{2,0}, model.checkCode());
        model.makeAttempt(c17);
        assertArrayEquals(new int[]{2,2}, model.checkCode());
        model.makeAttempt(c18);
        assertArrayEquals(new int[]{1,2}, model.checkCode());
        model.makeCode(c15);
        model.makeAttempt(c15);
        assertArrayEquals(new int[]{6,0}, model.checkCode());
        model.makeAttempt(c16);
        assertArrayEquals(new int[]{3,0}, model.checkCode());
        model.makeAttempt(c17);
        assertArrayEquals(new int[]{1,4}, model.checkCode());
        model.makeAttempt(c18);
        assertArrayEquals(new int[]{1,1}, model.checkCode());
        model.makeCode(c16);
        model.makeAttempt(c16);
        assertArrayEquals(new int[]{6,0}, model.checkCode());
        model.makeAttempt(c17);
        assertArrayEquals(new int[]{2,0}, model.checkCode());
        model.makeAttempt(c18);
        assertArrayEquals(new int[]{0,0}, model.checkCode());
        model.makeCode(c17);
        model.makeAttempt(c17);
        assertArrayEquals(new int[]{6,0}, model.checkCode());
        model.makeAttempt(c18);
        assertArrayEquals(new int[]{0,3}, model.checkCode());
        model.makeCode(c18);
        model.makeAttempt(c18);
        assertArrayEquals(new int[]{6,0}, model.checkCode());
        
        
        int[] c19 = {0,1,2,3,4,5,6};
        int[] c20 = {0,0,2,3,4,5,1};
        int[] c21 = {0,0,0,3,1,3,3};
        int[] c22 = {0,0,0,0,0,0,0};
        int[] c23 = {0,3,2,1,3,0,0};
        int[] c24 = {3,1,1,2,1,5,4};
        model.makePossibilities(9);
        model.setCodeLength(7);
        model.makeCode(c19);
        model.makeAttempt(c19);
        assertArrayEquals(new int[]{7,0}, model.checkCode());
        model.makeAttempt(c20);
        assertArrayEquals(new int[]{5,1}, model.checkCode());
        model.makeAttempt(c21);
        assertArrayEquals(new int[]{2,1}, model.checkCode());
        model.makeAttempt(c22);
        assertArrayEquals(new int[]{1,0}, model.checkCode());
        model.makeAttempt(c23);
        assertArrayEquals(new int[]{2,2}, model.checkCode());
        model.makeAttempt(c24);
        assertArrayEquals(new int[]{2,3}, model.checkCode());
        model.makeCode(c20);
        model.makeAttempt(c20);
        assertArrayEquals(new int[]{7,0}, model.checkCode());
        model.makeAttempt(c21);
        assertArrayEquals(new int[]{3,1}, model.checkCode());
        model.makeAttempt(c22);
        assertArrayEquals(new int[]{2,0}, model.checkCode());
        model.makeAttempt(c23);
        assertArrayEquals(new int[]{2,3}, model.checkCode());
        model.makeAttempt(c24);
        assertArrayEquals(new int[]{1,4}, model.checkCode());
        model.makeCode(c21);
        model.makeAttempt(c21);
        assertArrayEquals(new int[]{7,0}, model.checkCode());
        model.makeAttempt(c22);
        assertArrayEquals(new int[]{3,0}, model.checkCode());
        model.makeAttempt(c23);
        assertArrayEquals(new int[]{1,5}, model.checkCode());
        model.makeAttempt(c24);
        assertArrayEquals(new int[]{1,1}, model.checkCode());
        model.makeCode(c22);
        model.makeAttempt(c22);
        assertArrayEquals(new int[]{7,0}, model.checkCode());
        model.makeAttempt(c23);
        assertArrayEquals(new int[]{3,0}, model.checkCode());
        model.makeAttempt(c24);
        assertArrayEquals(new int[]{0,0}, model.checkCode());
        model.makeCode(c23);
        model.makeAttempt(c23);
        assertArrayEquals(new int[]{7,0}, model.checkCode());
        model.makeAttempt(c24);
        assertArrayEquals(new int[]{0,3}, model.checkCode());
        model.makeCode(c24);
        model.makeAttempt(c24);
        assertArrayEquals(new int[]{7,0}, model.checkCode());
    }
    
    
    /**
     * Test of makeCode method, of class Model.
     */
    @Test
    public void testCheckCodeCorrectness() {
        System.out.println("checkCodeCorrectness");
        model.makePossibilities(6);
        model.setCodeLength(4);
        model.makeCode(new int[]{0,1,2,3});
        model.makeAttempt(new int[]{0,1,2,3});
        model.checkCode();
        assertTrue(model.checkCodeCorrectness());
        model.makeCode(new int[]{0,1,2,3});
        model.makeAttempt(new int[]{0,0,2,3});
        model.checkCode();
        assertFalse(model.checkCodeCorrectness());
        model.makeCode(new int[]{0,1,2,3});
        model.makeAttempt(new int[]{3,2,1,0});
        model.checkCode();
        assertFalse(model.checkCodeCorrectness());
        model.makeCode(new int[]{0,1,2,3});
        model.makeAttempt(new int[]{0,0,0,0});
        model.checkCode();
        assertFalse(model.checkCodeCorrectness());
        model.makeCode(new int[]{1,1,2,3});
        model.makeAttempt(new int[]{1,1,2,3});
        model.checkCode();
        assertTrue(model.checkCodeCorrectness());
        model.makeCode(new int[]{0,1,2,3});
        model.makeAttempt(new int[]{0,1,1,3});
        model.checkCode();
        assertFalse(model.checkCodeCorrectness());
        model.makeCode(new int[]{0,3,2,1});
        model.makeAttempt(new int[]{0,3,2,0});
        model.checkCode();
        assertFalse(model.checkCodeCorrectness());
        
        model.makePossibilities(7);
        model.setCodeLength(5);
        model.makeCode(new int[]{0,1,2,3,4});
        model.makeAttempt(new int[]{0,1,2,4,3});
        model.checkCode();
        assertFalse(model.checkCodeCorrectness());
        model.makeCode(new int[]{0,1,2,3,4});
        model.makeAttempt(new int[]{0,1,2,3,4});
        model.checkCode();
        assertTrue(model.checkCodeCorrectness());
        
        model.makePossibilities(8);
        model.setCodeLength(6);
        model.makeCode(new int[]{0,1,2,3,4,5});
        model.makeAttempt(new int[]{0,1,2,5,5});
        model.checkCode();
        assertFalse(model.checkCodeCorrectness());
        model.makeCode(new int[]{0,0,0,1,2,3});
        model.makeAttempt(new int[]{0,0,0,1,2,3});
        model.checkCode();
        assertTrue(model.checkCodeCorrectness());
        
        model.makePossibilities(9);
        model.setCodeLength(7);
        model.makeCode(new int[]{0,1,2,3,4,5,6});
        model.makeAttempt(new int[]{6,5,4,3,2,1,0});
        model.checkCode();
        assertFalse(model.checkCodeCorrectness());
    }
    
    @Test
    public void testGetResultConfiguration() {
        System.out.println("resultConfiguration");
        model.makePossibilities(7);
        model.setCodeLength(5);
        model.makeCode(new int[]{0,1,2,3,2});
        model.makeAttempt(new int[]{0,1,2,3,2});
        model.checkCode();
        assertArrayEquals(new Color[]{Color.BLACK,Color.BLACK,Color.BLACK,Color.BLACK,Color.BLACK}, model.getResultConfiguration(0));
        model.makeAttempt(new int[]{0,1,2,4,3});
        model.checkCode();
        assertArrayEquals(new Color[]{Color.BLACK,Color.BLACK,Color.BLACK,Color.WHITE,Color.TRANSPARENT}, model.getResultConfiguration(0));
        model.makeAttempt(new int[]{0,1,2,3,3});
        model.checkCode();
        assertArrayEquals(new Color[]{Color.BLACK,Color.BLACK,Color.BLACK,Color.BLACK,Color.TRANSPARENT}, model.getResultConfiguration(0));
        model.makeAttempt(new int[]{0,0,0,0,0});
        model.checkCode();
        assertArrayEquals(new Color[]{Color.BLACK,Color.TRANSPARENT,Color.TRANSPARENT,Color.TRANSPARENT,Color.TRANSPARENT}, model.getResultConfiguration(0));
        
        model.makeCode(new int[]{0,1,2,4,4});
        model.makeAttempt(new int[]{0,1,2,3,2});
        model.checkCode();
        assertArrayEquals(new Color[]{Color.BLACK,Color.BLACK,Color.BLACK,Color.TRANSPARENT,Color.TRANSPARENT}, model.getResultConfiguration(0));
        model.makeAttempt(new int[]{0,1,2,4,4});
        model.checkCode();
        assertArrayEquals(new Color[]{Color.BLACK,Color.BLACK,Color.BLACK,Color.BLACK,Color.BLACK}, model.getResultConfiguration(0));
        model.makeAttempt(new int[]{0,1,3,2,3});
        model.checkCode();
        assertArrayEquals(new Color[]{Color.BLACK,Color.BLACK,Color.WHITE,Color.TRANSPARENT,Color.TRANSPARENT}, model.getResultConfiguration(0));
        model.makeAttempt(new int[]{0,0,0,0,0});
        model.checkCode();
        assertArrayEquals(new Color[]{Color.BLACK,Color.TRANSPARENT,Color.TRANSPARENT,Color.TRANSPARENT,Color.TRANSPARENT}, model.getResultConfiguration(0));
    }
}
