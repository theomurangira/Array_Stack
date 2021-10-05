package com.dsa;

public class Main {

    public static void main(String[] args) {
        ArrayStack stack=new ArrayStack(20);
        stack.Push(7);
        stack.Push(6);
        stack.Push(9);
        stack.printStack();//9  6  7
        stack.Pop();
        stack.Pop();
        stack.printStack();//
	// write your code here
    }
}
