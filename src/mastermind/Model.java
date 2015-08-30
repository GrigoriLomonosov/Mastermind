package mastermind;

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
    
    public boolean makeCode(int[]code){
        //TO DO
        return true;
    }
    
    public boolean makeAttempt(int[] attempt){
        //TO DO
        return true;
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
     * 
     * @return array containing the 2 elements. The first element gives the number of elements with the correct color on the correct position.
     * The second element shows the number of elements with the correct color but not on the correct position.
     */
    public int[] checkCode(){
        // TO DO
        return new int[]{1,2};
    }
    
    public boolean checkCodeCorrectness(){
        if(code != null){
            return currentCorrectness[0] == code.length;
        }
        return false;
    }
    
    
    
}
