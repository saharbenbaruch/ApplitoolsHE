package com.Tester;

public class MyThread extends Thread {
    int k;
    public MyThread(int k){
        this.k=k;
    }
    public int getK(){ return k;}
}
