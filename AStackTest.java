package testpackage;

import java.util.EmptyStackException;

import astack.AStack;

import org.junit.Assert;
import org.junit.Test;

public class AStackTest {
	
    AStack aStk;
    int sp;
    private int[] stk = new int[10];
    
    @Test
    public void testPush(){
    	aStk = new AStack();
        aStk.push(10);
        aStk.push(20);
        System.out.println(aStk.getPushcount());
        int expected = 20;
        int actual = aStk.peek();
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
        aStk.pop();
        int expectedPop = aStk.peek();
        int actualPop = aStk.pop();
        System.out.println(aStk.getPopcount());
        Assert.assertNotNull("Total Pushcount : " + aStk.getPushcount());
        Assert.assertNotNull("Total Popcount : " + aStk.getPopcount());
        Assert.assertEquals(expectedPop, actualPop);
        
    }
    
    
    
    @Test(expected = EmptyStackException.class)
    public void testPopEmptyStack() {
        aStk = new AStack();
        aStk.pop();
    }
    
    @Test
    public void testPushPopPeek(){
    	aStk = new AStack();
    	int value = 10;
    	for (int i =0 ; i < 10; i++){
    		//stk[i] = value;
    		int expected = value;
    		aStk.push(value ++);
    		int actual = aStk.peek();
    		Assert.assertEquals(expected, actual);    
    		Assert.assertNotNull(aStk.getPushcount());
    		
    		System.out.println("Expected PushPeek : " + expected + " Actual PushPeek : " + actual + " when i is : "+ i);
    	
    	}
    	
    	for(int i=0; i<10 ; i++){
    		int expected = aStk.peek();
    		int actual = aStk.pop();
    		Assert.assertEquals(expected, actual);
    		Assert.assertNotNull(aStk.getPopcount());
    		System.out.println("Expected PeekPop : " + expected + " Actual PeekPop : " + actual + " when i is : "+ i);    
    	}
    }
}
