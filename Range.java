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
