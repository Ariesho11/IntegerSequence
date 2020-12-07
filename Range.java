import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start,end,current;
  public Range(int start,  int end){
    this.start = start;
    this.end = end;
    current = start;
  }
  public void reset(){
  }
  public int length(){
    return 0;
  }
  public boolean hasNext(){
    return true;
  }

  //@throws NoSuchElementException
  public int next(){
    return 0;
  }

}
