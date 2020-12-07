import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start,end,current;
  public Range(int start,  int end){
    if (start > end){
      throw new IndexOutOfBoundsException("start is greater than end");
    }
    this.start = start;
    this.end = end;
    current = start;
  }
  public void reset(){
    this.start = 0;
    this.end = 0;
    current = 0;
  }
  public int length(){
    int diff = Math.abs(Math.abs(end) - Math.abs(start));
  //  if(diff == 1) return diff+1;
    if(diff == 0) return 1;
    return diff+1;
  }
  public boolean hasNext(){
    return(current != end);
  }

  //@throws NoSuchElementException
  public int next()throws NoSuchElementException{
   if (hasNext()) current++;
   return current;
  }

}
