package in.ds.examples;

import java.util.Stack;

public class LIFOExample {

    static void stack_push(Stack<Integer> stack){
        for (int i = 0 ; i <10 ; i++){
            stack.push(i);
        }
    }

    static void stack_pop(Stack<Integer> stack){
        System.out.println("Pop :");
        for(int i = 0 ; i< 10 ;i++){
            Integer y = stack.pop();
            System.out.println(y);
        }
    }
    static void stack_peek(Stack<Integer> stack){
        Integer element = stack.peek();
        System.out.println("Element on top :"+element);
    }

    static void stack_search(Stack<Integer> stack, int element){
        Integer position= stack.search(element);
        if(position==-1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at position :"+position);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        stack_push(stack);
        stack_pop(stack);
        stack_push(stack);
        stack_peek(stack);
        stack_search(stack, 2);
        stack_search(stack, 6);
    }
}
