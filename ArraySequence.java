import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  int currentIndex;
  int []data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int[] other){
    data = other;
    currentIndex = 0;
  }
  public ArraySequence(IntegerSequence otherseq){

  }
  public void reset(){
    currentIndex = 0;
    data = null;
  }
  public int length(){
    return 0;
  }
  public int next(){
    if (data.length > currentIndex){
      currentIndex++;
      if(currentIndex == 0) return data[currentIndex-1];
    }
    return data[currentIndex];
  }
  public boolean hasNext(){
    return(currentIndex < data.length);
  }
}
