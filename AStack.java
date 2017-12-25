package astack;

public class AStack {

    private int[] stk = new int[10];
    private int sp = 10;
    private int pushcount;
    private int popcount;
    
    public void push(int v) {
        if (sp == 0) {
            System.out.println("Stack Overflow");
        } else {
            sp = sp - 1;
            stk[sp] = v;
        }
        pushcount++;
    }

    public int pop() {
        int temp = -1;
        if (sp == 10) {
            System.out.println("Stack Underflow");
        } else {
            temp = stk[sp];
            sp = sp + 1;
        }
        popcount++;
        return temp;
    }

    public int getPushcount() {
        return pushcount;
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
    
    public int getPopcount() {
        return popcount;
    }

    public int peek(){
    	int temp = pop();
      	push(temp);
      	return temp;    	
    }
 }
