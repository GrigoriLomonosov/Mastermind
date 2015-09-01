package mastermind;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.scene.paint.Color;

/**
 *
 * @author Jeroen De Meyer
 */
public class Model implements Observable{
    
    private static final int MIN_POSS = 6;
    private static final int MAX_POSS = 11;
    
    private int codeLength = MIN_POSS-2;
    public int getCodeLength(){
        return codeLength;
    }
    //The codeLength depends on MIN_POSS en MAX_POSS.
    //Returns true if a valid k is given, false otherwise.
    public boolean setCodeLength(int k){
        if(k>=MIN_POSS-2 && k<=MAX_POSS-2 && possibilities!=null){
            codeLength = k;
            return possibilities.length > codeLength;
        }
        else{
            return false;
        }
    }
    
    public int[][] attempts;
    
    private int[] possibilities;
    public int[] getPossibilities(){
        return possibilities;
    }
    
    private int[] code;
    public int[] getCode(){
        return code;
    }
    
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
    
    public boolean newGame(int poss, int len){
        boolean correctPoss = makePossibilities(poss);
        boolean correctLen = setCodeLength(len);
        boolean correctQuestion = makeQuestion();
        System.out.println(correctPoss);
        System.out.println(correctPoss);
        System.out.println(correctPoss);
        correctness = new int[getMaxSteps()][2];        
        if(correctPoss && correctLen && correctQuestion){
            step = 0;
            playerWins = false;
            computerWins = false;
            fireInvalidationEvent();
            return true;
        }
        else{
            possibilities = null;
            code = null;
            codeLength = MIN_POSS-2;
            correctness = new int[getMaxSteps()][2];
            return false;
        }
    }
    
    //Field with the results of the checkCode method for the attempts
    private int[][] correctness = new int[getMaxSteps()][2];
    public int[][] getCorrectness(){
        return correctness;
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
            attempts = new int[getMaxSteps()][];
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
            attempts = new int[getMaxSteps()][];
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
        correctness[step] = result;
        return result;
    }
    
    public boolean checkCodeCorrectness(){
        if(code != null){
            return correctness[step][0] == code.length;
        }
        return false;
    }   
    
    //Returns 0 if the game is not over yet, 1 if the computer wins and 2 if the player wins.
    public void step(){
        checkCode();      
        if(step==getMaxSteps()-1 && !checkCodeCorrectness()){
            computerWins = true;
        }
        if(checkCodeCorrectness()){
            playerWins = true;
        }
        step++;
        fireInvalidationEvent();
        
    }
    
    public int getMaxSteps(){
        return codeLength*3;
    }
    
    public int getNumberPossibilities(){
        if(possibilities!=null){
            return possibilities.length;
        }
        return -1;
    }
    
    public int[] getLatestAttempt(){
        return attempts[step-1];
    }
    
    /**
     * @return a array consisting of the colors that represent the correctness of the guess.
     * @param guess the step of which the correctness should be returned.
     */
    public Color[] getResultConfiguration(int guess){
        Color[] result = new Color[codeLength];
        for(int i=0; i<codeLength; i++){
            if(i<correctness[guess][0]){
                result[i] = Color.BLACK;
            }
            else{
                if(i<correctness[guess][0]+correctness[guess][1]){
                    result[i] = Color.WHITE;
                }
                else{
                    result[i] = Color.TRANSPARENT;
                }
            }
        }
        return result;
    }
    
    public Color getCircleColor(int row, int place){
        if(row<getMaxSteps() && place<getCodeLength()){
            return getResultConfiguration(row)[place];
        }
        return Color.TRANSPARENT;
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
