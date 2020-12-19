package jeffbernsen.arraylistexercises;

import java.util.Arrays;

public class ArrayBuilder {

  private String characters; // The string that gets passed to be entered as an Array
  
  public ArrayBuilder() {
    // empty constructor
  }
  
  // convert a String of Char to an array of char
  protected String[] newArray( String characters ) {
    this.characters = characters;
    String[] charForArray;
    charForArray = characters.split("");
      return charForArray;
  } 
  
  public String[] addArray( String[] oldArr, String[] addArr ) {
    
    // determine the length of the new array
    int newArrLength = oldArr.length + addArr.length;
    // concatenate the two arrays into a new array called newArr.
    // First, copy the oldArr input into the new array but use the newArrLength. 
    // Elements without input values will have placeholders.
    String[] newArr = Arrays.copyOf(oldArr, newArrLength);
    // Second, copy the addArr into the new array
    System.arraycopy( addArr, 0, newArr, oldArr.length, addArr.length ); 
    // Sort the elements in the new array
    Arrays.sort( newArr );
    return newArr;
  }
  
  // Stub test for addArray method
  /*
  public static void main( String[] args ) {
    
    ArrayBuilder arr1 = new ArrayBuilder();
    String arrOld[] = new String[] { "A", "B", "C", "D" };
    String arrAdd[] = new String[] { "a", "b", "c", "d" };
    System.out.println( Arrays.toString( arr1.addArray( arrOld, arrAdd) ) );
  
  }
  */
  
}
