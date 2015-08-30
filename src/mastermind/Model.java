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
    
    public boolean makeCode(int[]c){
        if(possibilities != null && possibilities.length==c.length){
            for(int i=0; i<c.length; i++){
                if(c[i]<0 || c[i]>=possibilities.length){
                    return false;
                }
            }
            code = c;
            return true;
        }
        return false;
    }
    
    public boolean makeAttempt(int[] a){
        if(code != null && code.length==a.length){
            for(int i=0; i<a.length; i++){
                if(a[i]<0 || a[i]>=possibilities.length){
                    System.out.println("false1");
                    return false;
                }
            }
            attempt = a;
            System.out.println("true");
            return true;
        }
        System.out.println(code);
        System.out.println("false2");
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
