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
    data = new int[otherseq.length()];
    for(int i = 0; otherseq.hasNext(); i++){
      data[i] = otherseq.next();
    }
  }

  public void reset(){
    currentIndex = 0;
  }

  public int length(){
    return data.length;
  }

  public int next(){
    if (data.length > currentIndex){
      currentIndex++;
    }
    return data[currentIndex-1];
  }
  
  public boolean hasNext(){
    return(currentIndex < data.length);
  }
}
