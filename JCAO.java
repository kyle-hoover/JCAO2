import java.lang.Math;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
}

class Calculator {
  public int addition(int num1, int num2){
    return num1 + num2;
  }

  public int subtraction(int num1, int num2){
    return num1 - num2;
  }

  public int multiplication(int num1, int num2){
    return num1 * num2;
  }

  public int division(int num1, int num2){
    return num1 / num2;
  }

  public int square(int num1, int num2){  
    return Math.pow(num1, num2);
  }
}

class MagicCalculator {
  public int squareRoot(int num1){
    return Math.sqrt(num1);
  }

  public int sin(int num1){
    return Math.sin(num1);
  }

  public int cos(int num1){
    return Math.cos(num1);
  }

  public int tan(int num1){
    return Math.tan(num1);
  }

  public int factorial(int num1){
    int factorial = 1;
    for (int i = 1; i < num1.length; i++){
      factorial *= (i-1);
    }
    return factorial;
  }
}
