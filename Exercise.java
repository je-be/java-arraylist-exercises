package jeffbernsen.arraylistexercises;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.lang.Iterable;
import java.io.*;


public class Exercise {
  
//  protected ArrayList< String[] > baseList;
  
  public Exercise() {
    // optional constructor that is empty    
  }
  
  public static void main( String[] args ){
    
    // Demonstrate ArrayBuilder newArray() method
//    /*    
    ArrayList< String[] > baseArrayList = new ArrayList<>();
    
    ArrayBuilder strArrOne = new ArrayBuilder();
    ArrayBuilder strArrTwo = new ArrayBuilder();
    ArrayBuilder strArrThr = new ArrayBuilder();
    ArrayBuilder strArrFou = new ArrayBuilder();
    ArrayBuilder strArrFiv = new ArrayBuilder();
    ArrayBuilder strArrSix = new ArrayBuilder();
    ArrayBuilder strArrSev = new ArrayBuilder();
    
    //From the BuildArray class, call newArray() to create arrays for the baseArrayList.
    String[] one = strArrOne.newArray( "ABCD" );
    String[] two = strArrTwo.newArray( "EFGH" );
    String[] thr = strArrThr.newArray( "IJKL" );
    String[] fou = strArrFou.newArray( "MNOP" );
    String[] fiv = strArrFiv.newArray( "QRST" );
    String[] six = strArrSix.newArray( "UVWX" );
    String[] sev = strArrSev.newArray( "YZ.'");
    
    // Call the addAll{} method from java.util.ArrayList class
    baseArrayList.addAll( Arrays.asList( one, two, thr, fou, fiv, six, sev) );
//    */
    
    /*
    System.out.println( baseArrayList.size() );
    
    for ( String[] array : baseArrayList ) {
        System.out.println( Arrays.toString( array ) );
    }
    */
    
    // Demonstrate GetPosition getElementPosition() and getArrayPosition() methods
//    /*
    GetPosition elementPosition = new GetPosition();
    System.out.println( elementPosition.getElementPosition( baseArrayList, "D" ) );
    GetPosition arrayPosition = new GetPosition();
    System.out.println( arrayPosition.getArrayPosition( baseArrayList, "t" ) );
//    */
    
    // Demonstrate GetPosition positionsInArray() method
    /*
    GetPosition elementsPositionsInArray = new GetPosition();
    String word = "FUN";
    elementsPositionsInArray.positionsInArray( baseArrayList, word);
    */
    
    //  Demonstrate QueryParemeter wordQuery() and wordForQuery() methods
    /* 
    String word;
    QueryParameter newQuery = new QueryParameter();
    word = newQuery.wordForQuery();
    newQuery.wordQuery( baseArrayList, word );
    */
    
    // Demonstrate ArrayBuilder addArray() method
    /* 
    
    ArrayList< String[] > basePlusArrayList = new ArrayList<>();
    
    ArrayBuilder newStrArrOne = new ArrayBuilder();
    ArrayBuilder newStrArrTwo = new ArrayBuilder();
    ArrayBuilder newStrArrThr = new ArrayBuilder();
    ArrayBuilder newStrArrFou = new ArrayBuilder();
    ArrayBuilder newStrArrFiv = new ArrayBuilder();
    ArrayBuilder newStrArrSix = new ArrayBuilder();
    ArrayBuilder newStrArrSev = new ArrayBuilder();
    ArrayBuilder strArrEig = new ArrayBuilder();
    
    String[] oneAdd = newStrArrOne.newArray( "abcd" );
    String[] twoAdd = newStrArrTwo.newArray( "efgh" );
    String[] thrAdd = newStrArrThr.newArray( "ijkl" );
    String[] fouAdd = newStrArrFou.newArray( "mnop" );
    String[] fivAdd = newStrArrFiv.newArray( "qrst" );
    String[] sixAdd = newStrArrSix.newArray( "uvxw" );
    String[] sevAdd = newStrArrSev.newArray( "yz-@");
    String[] eig = strArrEig.newArray( "_ +,#&!" );
    
    oneAdd = newStrArrOne.addArray( baseArrayList.get(0), oneAdd );
    twoAdd = newStrArrTwo.addArray( baseArrayList.get(1), twoAdd );  
    thrAdd = newStrArrThr.addArray( baseArrayList.get(2), thrAdd );
    fouAdd = newStrArrFou.addArray( baseArrayList.get(3), fouAdd );
    fivAdd = newStrArrFiv.addArray( baseArrayList.get(4), fivAdd );
    sixAdd = newStrArrSix.addArray( baseArrayList.get(5), sixAdd );
    sevAdd = newStrArrSev.addArray( baseArrayList.get(6), sevAdd );
    
    basePlusArrayList.addAll( Arrays.asList( oneAdd, twoAdd, thrAdd, fouAdd, fivAdd, sixAdd, 
            sevAdd, eig ) );
    
    System.out.println( basePlusArrayList.size() );

    for ( String[] array : basePlusArrayList ) {
        System.out.println( Arrays.toString( array ) );
    }
  */
    
//  /*
    // Get the first array from the arrayList and then second element from the returned array
    System.out.println( baseArrayList.get( 0 )[ 1 ] );
    
//  */

    // Demonstrate ArrayConversion class method arrayToArrayList() 
//    /*
    ArrayConversion arrToArrList = new ArrayConversion();
    ArrayList< String > newBaseArrayList = new ArrayList<>();
    newBaseArrayList = arrToArrList.arrayToArrayList( baseArrayList.get( 0 ) );
    System.out.println( newBaseArrayList );
//    */
    
  }
}
