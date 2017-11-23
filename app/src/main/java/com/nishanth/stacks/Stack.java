package com.nishanth.stacks;

/**
 * Created by Nishanth on 06-09-2017.
 */

public class Stack {
     int top=-1;
    static int maxSize =5;
    public static int[] arr = new int[maxSize];
     int size=0;

    void push(int n){
        if(top == maxSize-1){
            resize();

        }
        {
            top = top + 1;
            arr[top]=n;
            size++;
        }

    }
    int peek(){
        if(top==-1){
            return Integer.MIN_VALUE;

        }
        return arr[top];
    }
    int pop(){
        if(top==-1){
            return Integer.MIN_VALUE;

        }
        size--;
        return arr[top--];
    }
    public int getSize(){
        return this.size;
    }
    public int getTop(){
        return this.top;
    }



    void resize(){
        maxSize = maxSize +5;
        int[] ns = new int[maxSize];
        for(int i=0;i<arr.length;i++){
            ns[i]=arr[i];

        }
        arr=ns;


    }

}
