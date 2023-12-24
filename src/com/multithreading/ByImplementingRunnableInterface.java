package com.multithreading;

public class ByImplementingRunnableInterface implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = new ByImplementingRunnableInterface();
		Thread t1 = new Thread(r);
		t1.start();
		
		for(int i=0; i< 10; i++) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("main thread");
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i< 10; i++) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("child thread");
		}
	}

}
