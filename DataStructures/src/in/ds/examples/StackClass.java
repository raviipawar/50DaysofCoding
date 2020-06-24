package in.ds.examples;

import java.util.Stack;

public class StackClass {
    static void stack_push(Stack<Integer> stack){
        for(int i = 0 ; i< 10; i++){
            stack.push(i);
        }
        System.out.println(stack);
    }

    static void stack_pop(Stack<Integer> stack){
        for(int i =0; i< 5; i++){
            Integer y = (Integer) stack.pop();
            System.out.println(stack);
        }
    }
    static void stack_top(Stack<Integer> stack){
        Integer element = (Integer) stack.peek();
        System.out.println(element);
    }
    static void stack_search(Stack<Integer> stack, int element){
        Integer pos = (Integer) stack.search(element);

        if(pos == -1){
            System.out.println("Element not present");
        }
        else
            System.out.println("Element is present at" +pos);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 0 ; i< 10; i++){
            stack.push(i);
        }
        stack_pop(stack);
        stack_push(stack);
        stack_search(stack, 3);
        stack_top(stack);
        stack_search(stack, 2);
        stack_search(stack, 6);
    }
}
