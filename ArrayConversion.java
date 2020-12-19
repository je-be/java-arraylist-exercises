package jeffbernsen.arraylistexercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayConversion {

  public ArrayConversion() {
    
  }
  
  public ArrayList< String > arrayToArrayList( String[] strArr ) {
    
    ArrayList< String > newArrList = new ArrayList<>();
//    newArrList.addAll(Arrays.asList(strArr));
    for ( int i = 0; i < strArr.length; i++ ) {
      newArrList.add( strArr[ i ] );
    }
    return newArrList;
  }
  
  public ArrayList< String > arrayListArrayToArrayList( ArrayList< String[] > strArrList ) {
    
    ArrayList< String > newArrList = new ArrayList<>();
    for (String[] array : strArrList ) {
      newArrList.addAll( Arrays.asList( array ) );
    }
    return newArrList;
  }
  
}
