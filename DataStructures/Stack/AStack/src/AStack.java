package com.rajeshpatkar.components.datastructures.stack;
public class AStack {

    private int[] stk = new int[10];
    private int sp = 10;

    public void push(int v) {
        if (sp == 0) {
            System.out.println("Stack Overflow");
        } else {
            sp = sp - 1;
            stk[sp] = v;
        }
    }

    public int pop() {
        int temp = -1;
        if (sp == 10) {
            System.out.println("Stack Underflow");
        } else {
            temp = stk[sp];
            sp = sp + 1;
        }
        return temp;
    }

    public void print() {
        System.out.println("Printing AStack");
        if (sp == 10) {
            System.out.println("Stack is Empty");
            return;
        }
        for (int i = sp; i < 10; i++) {
            System.out.println(stk[i]);
        }
    }
}
