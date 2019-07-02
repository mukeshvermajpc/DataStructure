import java.util.Stack;

public class StackExample {
  public static void main(String args[])
  {
	  Stack<Integer>stack=new Stack<>();
	  stack.push(12);
	  stack.push(14);
      System.out.println(stack);
      for(Integer st:stack) {
    	  System.out.println(st);
      }
  }
}
