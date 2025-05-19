public class SwapNames{
public static void main(String[] args){

String name1="Vayu";
String name2="Veda";

System.out.println("Before Swapping:");
System.out.println("name1= "+name1);
System.out.println("name2= "+name2);

String temp = name1;
name1 = name2;
name2= temp;

System.out.println("After Swapping:");
System.out.println("name1 = "+name1);
System.out.println("name2 = "+name2);
   }
}