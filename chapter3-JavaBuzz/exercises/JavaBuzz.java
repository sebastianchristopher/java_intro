public class JavaBuzz {

  public static void main(String[] args){
    for(int i = 1; i <= 100; i++){
      System.out.println(fizzBuzz(i));
    }
  }
  public static String fizzBuzz(int i){
    if(i % 3 == 0 && i % 5 == 0){
      return "JavaBuzz";
    } else if(i % 3 == 0){
      return "Java";
    } else if(i % 5 == 0){
      return "Buzz";
    } else {
      return Integer.toString(i);
    }
  }
}
