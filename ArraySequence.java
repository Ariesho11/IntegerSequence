import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  int currentIndex;
  int []data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int[] other){
    data = new int[other.length];
    for(int i = 0; i < other.length; i++){
      data[i] = other[i];
    }
    currentIndex = 0;
  }

  public ArraySequence(IntegerSequence otherseq){
    data = new int[otherseq.length()];
    for(int i = 0;i < otherseq.length(); i++){
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
    if(!hasNext()){
      throw new NoSuchElementException("there is no next element");
        }
    currentIndex++;
    return data[currentIndex-1];
  }

  public boolean hasNext(){
    return(currentIndex < length());
  }
}
