package mastermind;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Jeroen De Meyer
 */
public class Model {
    
    private static final int MIN_POSS = 4;
    private static final int MAX_POSS = 9;
    
    private int[] possibilities;
    public int[] getPossibilities(){
        return possibilities;
    }
    
    private int[] code;
    
    private int[] attempt;
    
    //Field with the result of the checkCode method for the latest attempt
    private final int[] currentCorrectness = {0,0};
    public int[] getCurrentCorrectness(){
        return currentCorrectness;
    }
    
    public boolean makeCode(int[]c){
        if(possibilities != null && possibilities.length==c.length){
            for(int i=0; i<c.length; i++){
                if(c[i]<0 || c[i]>=possibilities.length){
                    return false;
                }
            }
            code = c;
            attempt = null;
            return true;
        }
        return false;
    }
    
    public boolean makeAttempt(int[] a){
        if(code != null && code.length==a.length){
            for(int i=0; i<a.length; i++){
                if(a[i]<0 || a[i]>=possibilities.length){
                    return false;
                }
            }
            attempt = a;
            return true;
        }
        return false;
    }
    
    public boolean makeQuestion(){
        if(possibilities != null){
            Random rd = new Random();
            int[] temp = new int[possibilities.length];
            for(int i=0; i<temp.length; i++){
                temp[i] = rd.nextInt(temp.length);
            }
            code = temp;
            attempt = null;
            return true;
        }
        return false;
    }
    
    public boolean makePossibilities(int k){
        if(k>=MIN_POSS && k<=MAX_POSS){
            int[] poss = new int[k];
            for(int i=0; i<poss.length; i++){
                poss[i] = i;
            }
            possibilities = poss;
            return true;
        }
        return false;
    }
    
    /**
     * @return array containing the 2 elements. The first element gives the number of elements with the correct color on the correct position.
     * The second element shows the number of elements with the correct color but not on the correct position.
     */
    public int[] checkCode(){
        int[] result = {0,0};
        if(attempt != null && attempt.length == code.length){
            List<Integer> codeList = new ArrayList<>();
            List<Integer> attemptList = new ArrayList<>();
            //check for correct place and number
            for(int i=0; i<code.length; i++){
                if(code[i]==attempt[i]){
                    result[0]++;
                }
                else{
                    codeList.add(code[i]);
                    attemptList.add(attempt[i]);
                }
            }
            //check for correct number on incorrect place. If there are duplicate numbers in the guess, 
            //they cannot all be awarded a key peg unless they correspond to the same number of duplicate colours in the hidden code
            for (Integer attemptList1 : attemptList) {
                if (codeList.contains(attemptList1)) {
                    result[1]++;
                    codeList.remove(attemptList1);
                }
            }
        }
        return result;
    }
    
    public boolean checkCodeCorrectness(){
        if(code != null){
            return checkCode()[0] == code.length;
        }
        return false;
    }   
}
