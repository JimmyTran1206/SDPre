public class Objective8Lab3 {
  public static void main(String[] args) {
    int counter = 1;
    for(; counter<=20; counter++){
      if(counter%2==0){
        System.out.printf("%d is even %n",counter);
      }else{
        System.out.printf("%d is odd %n",counter);
      }
    }
  }
}