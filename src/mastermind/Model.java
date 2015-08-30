package mastermind;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author Jeroen De Meyer
 */
public class Model {
    
    private int[] possibilities;
    public int[] getPossibilities(){
        return possibilities;
    }
    
    private int[] code;
    public int[] getCode(){
        return code;
    }
    
    private int[] attempt;
    public int [] getAttempt(){
        return attempt;
    }
    
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
        int[] poss = new int[k];
        for(int i=0; i<poss.length; i++){
            poss[i] = i;
        }
        possibilities = poss;
        return true;
    }
    
    /**
     * @return array containing the 2 elements. The first element gives the number of elements with the correct color on the correct position.
     * The second element shows the number of elements with the correct color but not on the correct position.
     */
    public int[] checkCode(){
        if(attempt != null && attempt.length == code.length){
            int first = 0;
            int second = 0;
            List<Integer> codeList = new ArrayList<>();
            List<Integer> attemptList = new ArrayList<>();
            //check for correct place and number
            for(int i=0; i<code.length; i++){
                if(code[i]==attempt[i]){
                    first++;
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
                    second++;
                    codeList.remove(attemptList1);
                }
            }
            return new int[]{first, second}; 
        }
        return new int[]{-1,-1};
    }
    
    private Set<Integer> deleteDuplicates(int[] a){
        Set<Integer> result = new HashSet<>();
        for(int i=0; i< a.length; i++){
            result.add(a[i]);
        }
        //int[] array = result.stream().toArray(int[]::new);
        //int[] temp = result.toArray(new int[result.size()]);
        return result;
    }
    
    public boolean checkCodeCorrectness(){
        if(code != null){
            return currentCorrectness[0] == code.length;
        }
        return false;
    }
    
    
    
}
