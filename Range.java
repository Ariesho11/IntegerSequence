import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start,end,current;
  public Range(int start,  int end){
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
    int diff = Math.abs(end - start);
    if(diff == 1) return diff+2;
    if(diff == 0) return 0;
    return diff+1;
  }
  public boolean hasNext(){
    return(current!=end);;
  }

  //@throws NoSuchElementException
  public int next(){
    return 0;
  }

}
