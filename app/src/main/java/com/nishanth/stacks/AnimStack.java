package com.nishanth.stacks;

/**
 * Created by Nishanth on 10-11-2017.
 */

public class AnimStack {

    int top=-1;
    static int maxSize =5;
    public static int[] arr = new int[maxSize];
    int size=0;

    void push(int n){


            top = top + 1;
            arr[top]=n;
            size++;



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





}
