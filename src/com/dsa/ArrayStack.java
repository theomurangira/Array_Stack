package com.dsa;

public class ArrayStack {
    int[] items;
    int maxsize;
    int size;
    int top;


    public void Push(int item)
    {
        if(!isFull())
            items[++top]=item;
        size++;
    }
    public int Pop()
    {
        if(!isEmpty())
        {
            size--;
            return items[top--];
        }
        else
            return 99999;

    }
    public boolean isFull()
    {
        return size==maxsize;
    }
    public boolean isEmpty()
    {
        return top==-1;
    }

    public ArrayStack(int b)
    {
        this.maxsize=b;
        items=new int[maxsize];
        top=-1;
        size=0;
    }
    public void printStack()
    {
        while(!isEmpty())
            System.out.print(this.Pop()+"\t");
        System.out.print("\n");
    }

}
