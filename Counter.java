/**
 *
 * @author Your Name
 */
package coe318.lab3;
public class Counter {
    private int mod;
    private int dig;
    private Counter left1;
   
    public Counter(int modulus, Counter left) {
        mod = modulus;
        left1 = left;
        
    }


    /**
     * @return the modulus
     */
    public int getModulus() {
        return mod;
    }

    /**
     * Returns the Counter to the left attached to this
     * Counter.  Returns null if there is no Counter
     * to the left.
     * @return the left
     */
    public Counter getLeft() {
        if(left1!=null){
            return left1;
        }
        else{
            
        }
        return null;
    }

    /**
     * @return the digit
     */
    public int getDigit() {
        return dig;
    }

    /**
     * @param digit the digit to set
     */
    public void setDigit(int digit) {
        dig = digit;
    }

    /**
     * Increment this counter.  If it rolls over,
     * its left Counter is also incremented if it
     * exists.
     */
    public void increment() {
  
     
     dig ++;
  if(dig==mod){
      dig=0;
      if(left1!=null){
             left1.increment();
      
      }
  }
  
    }

    /** Return the count of this Counter combined
     * with any Counter to its left.
     *
     * @return the count
     */
    public int getCount() {
        
       if(left1!=null){
           return (dig+(mod*(left1.getCount())));
       } 
       else {
           
           return (dig);
          
       }
        
        
 
    }

    /** Returns a String representation of the Counter's
     * total count (including its left neighbour).
     * @return the String representation
     */
    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        return "" + getCount();
    }

}
