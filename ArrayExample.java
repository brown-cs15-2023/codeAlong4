package debuggingWorkshop;

public class ArrayExample {

  private int[] numbers;

  public ArrayExample(){
    this.numbers = new int[10];
    this.populateArray();
  }

  private void populateArray() {
    for(int i = 0; i < 10; i++) {
      this.numbers[i] = i;
    }
  }

  public void printArray() {
    for(int i = 0; i <= 10; i++) {
      System.out.println("numbers[" + i + "] is " + this.numbers[i]);
    }
  }

}
