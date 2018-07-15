package com.cdk.standaloneprograms.threadprograms;

import java.util.stream.IntStream;

//In-line declaration of run method. 2 threads performing a single task
public class ThreadDemo4 {
    public static void main(String[] args) throws InterruptedException {
	Runnable task1 = new Runnable() {

	    @Override
	    public void run() {
		IntStream.range(1, 6).forEach(n -> {
		    System.out.println(Thread.currentThread().getName() + ": " + n);
		});

	    }
	};
	Thread t1 = new Thread(task1);
	t1.start();
	Thread.sleep(100);
	Thread t2 = new Thread(task1);
	t2.start();

    }
}
