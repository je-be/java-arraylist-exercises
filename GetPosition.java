package jeffbernsen.arraylistexercises;

import java.util.ArrayList;
import java.util.Arrays;

public class GetPosition {
  
  private String character;
  private ArrayList< String[] > arrayListOfArrays;
  
  public GetPosition() {
    this.arrayListOfArrays = arrayListOfArrays;
  }
  
  /**
   * Pass an ArrayList of String Arrays and a character (as a String) to this method
   * and return the position of the element in the array.
   */
  public Integer getElementPosition( ArrayList< String[] > arrayListOfArrays, String character ) {
    
    for ( String[] strArr : arrayListOfArrays ) {
      for (int i = 0; i < strArr.length; i++ ) {
          if ( strArr[ i ].equals(character) ) {
             return i;
          }
        }
      }
      return -1;
    } 

  /** 
   * Pass an ArrayList of Strings and a character (as a String) to this method
   * and return the position of the array in the arrayList that contains the character. 
   */
  public Integer getArrayPosition( ArrayList< String[] > arrayListOfArrays, String character ) {
    
    for ( String[] strArr : arrayListOfArrays ) {
      for ( String element : strArr ) {
        if ( element.equals( character ) ) {
          return arrayListOfArrays.indexOf( strArr );
         } 
      }
    } return -1;
  } 
  
  public void positionsInArray( ArrayList< String[] > arrayListOfArrays, String word ) {
    
    ArrayBuilder inputWord = new ArrayBuilder();
    ArrayList< Integer > letterPositionsArray = new ArrayList<>();
    
    String[] wordArray = inputWord.newArray( word );
    for ( String letter : wordArray) {
      letterPositionsArray.add( getElementPosition( arrayListOfArrays, letter) );
      letterPositionsArray.add( getArrayPosition( arrayListOfArrays, letter) );
      } 
    
    System.out.println( Arrays.asList( letterPositionsArray ) );

  } 
}
