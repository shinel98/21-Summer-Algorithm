package week2;

import java.util.Stack;

/*
 * 6-3
 */

class MyQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    /** Initialize your data structure here. */
    public MyQueue() {
        /*
        stack1 만들어주기 
        */
        stack1 = new Stack<>(); // stack 1 생성 
        stack2 = new Stack<>(); // stack 2 생성   
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        /*
        stack1에 넣어주기
        */
        stack1.push(x); // stack1 에 모두 넣는다  
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        /*
        stack1에 있는 내용들을 stack2에 넣어주고 stack2에 맨위의 것을 pop
        다시 stack2 에서 stack1으로 이동시켜주기
        */
        int iter1 = stack1.size();    
        for(int i=0; i<iter1; i++)   
            stack2.push(stack1.pop());  // stack1 의 모든 요소들을 stack2에 넣어준다 -> First In First Out을 위해  
        int num = stack2.pop(); // stack2 맨위에 있는 요소(stack1 에 제일 먼저 들어간 요소)를 pop 해준다  
        int iter2 = stack2.size();
        for(int i=0; i<iter2; i++)
            stack1.push(stack2.pop()); // stack2를 다시 stack1으로 모두 이동  
        return num;
    }
    
    /** Get the front element. */
    public int peek() {  // pop과 마찬가지의 알고리즘  
        /*
        stack1 요소의 개수만큼 peek 해주기
        */
        int iter1 = stack1.size();
        for(int i=0; i<iter1; i++)
            stack2.push(stack1.pop());   
        int num = stack2.peek();
        int iter2 = stack2.size();
        for(int i=0; i<iter2; i++)
            stack1.push(stack2.pop());
        return num;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        /*
        stack이 empty 인지 여부 출력
        */
        return stack1.empty();  // stack1이 비어있으면 list의 요소에 없음을 의미 
            
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */