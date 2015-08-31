package mastermind;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;

/**
 *
 * @author Jeroen De Meyer
 */
public class Model implements Observable{
    
    private static final int MIN_POSS = 6;
    private static final int MAX_POSS = 11;
    
    private int codeLength = 4;
    public int getCodeLength(){
        return codeLength;
    }
    //The codeLength depends on MIN_POSS en MAX_POSS.
    //Returns true if a valid k is given, false otherwise.
    public boolean setCodeLength(int k){
        if(k>=MIN_POSS-2 && k<=MAX_POSS-2){
            codeLength = k;
            return true;
        }
        else{
            return false;
        }
    }
    
    private int[][] attempts;
    
    private int[] possibilities;
    public int[] getPossibilities(){
        return possibilities;
    }
    
    private int[] code;
    
    //private int[] attempt;
    
    private int step;
    public int getStep(){
        return step;
    }
    
    private boolean playerWins;
    public boolean getPlayerWins(){
        return playerWins;
    }
    
    private boolean computerWins;
    public boolean getComputerWins(){
        return computerWins;
    }
    
    public void newGame(int k){
        makePossibilities(k);
        makeQuestion();
        step = 0;
        playerWins = false;
        computerWins = false;
        fireInvalidationEvent();
    }
    
    //Field with the result of the checkCode method for the latest attempt
    private int[] currentCorrectness;
    public int[] getCurrentCorrectness(){
        return currentCorrectness;
    }
    
    public boolean makeCode(int[]c){
        if(possibilities != null && codeLength==c.length){
            for(int i=0; i<c.length; i++){
                if(c[i]<0 || c[i]>=possibilities.length){
                    return false;
                }
            }
            step = 0;
            code = c;
            attempts = new int[codeLength][];
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
            attempts[step] = a;
            return true;
        }
        return false;
    }
    
    public boolean makeQuestion(){
        if(possibilities != null){
            Random rd = new Random();
            int[] temp = new int[codeLength];
            for(int i=0; i<temp.length; i++){
                temp[i] = rd.nextInt(temp.length);
            }
            code = temp;
            attempts = new int[codeLength][];
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
        if(attempts[step] != null && attempts[step].length == code.length){
            List<Integer> codeList = new ArrayList<>();
            List<Integer> attemptList = new ArrayList<>();
            //check for correct place and number
            for(int i=0; i<code.length; i++){
                if(code[i]==attempts[step][i]){
                    result[0]++;
                }
                else{
                    codeList.add(code[i]);
                    attemptList.add(attempts[step][i]);
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
        currentCorrectness = result;
        return result;
    }
    
    public boolean checkCodeCorrectness(){
        if(code != null){
            return currentCorrectness[0] == code.length;
        }
        return false;
    }   
    
    //Returns 0 if the game is not over yet, 1 if the computer wins and 2 if the player wins.
    public void step(){
        checkCode();
        step++;
        if(step==codeLength*3 && !checkCodeCorrectness()){
            computerWins = true;
        }
        if(step<codeLength*3 && checkCodeCorrectness()){
            playerWins = true;
        }
        fireInvalidationEvent();
    }
    
    //Code concerning the listeners
    private final List<InvalidationListener> listenerList = new ArrayList<>();
    @Override
    public void addListener(InvalidationListener listener){
        listenerList.add(listener);
    }
    @Override
    public void removeListener(InvalidationListener listener){
        listenerList.add(listener);
    }

    public void fireInvalidationEvent(){
        for(InvalidationListener listener: listenerList){
            listener.invalidated(this);
        }
    }
}
