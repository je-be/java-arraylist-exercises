package jeffbernsen.arraylistexercises;

import java.util.ArrayList;
import java.util.Scanner;

public class QueryParameter {

  public QueryParameter() {
    // empty constructor
  }
  
  public String wordForQuery () {
    Scanner input = new Scanner( System.in );
    System.out.println( "Enter a word to find the position of its letters in the ArrayList" );
    String word = input.nextLine();
    return word;
  }
  
  //Exercise should call queryParameter
  public void wordQuery( ArrayList< String[] > arrayListOfArrays, String word ) {
  
    ArrayBuilder inputWord = new ArrayBuilder();
    String[] wordArray = inputWord.newArray( word );
    
    GetPosition lettersOfWord = new GetPosition();
    for (String letter : wordArray ) {
      System.out.println( "The letter " + letter + " is element " + 
              ( lettersOfWord.getElementPosition( arrayListOfArrays, letter ) + 1 ) + " of array " + 
              ( lettersOfWord.getArrayPosition( arrayListOfArrays, letter ) +  1 ) + " in the " +
              " list of arrays. " );
    }
  }
 
}
