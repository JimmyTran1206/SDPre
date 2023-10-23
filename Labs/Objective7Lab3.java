public class Objective7Lab3 {
  public static void main(String[] args) {
    int counter = 1;

    while (counter<=20){
      if (counter%2==0){
        System.out.printf("%d is even %n", counter);
      }else{
        System.out.printf("%d is odd %n",counter);
      }
      counter++;
    }

    
  }
}