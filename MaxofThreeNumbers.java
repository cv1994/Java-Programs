public class MaxofThreeNumbers {
public static void main(String[] args) {
 int num1=10, num2= 20, num3= 15, max;
 
if (num1 >= num2 && num1 >= num3) {
max= num1;
} else if (num2 >= num1 && num2 >= num3) {
max = num2;
} else {
max = num3;
}
System.out.println("The maximum number is: " +max) ;
  }
}
