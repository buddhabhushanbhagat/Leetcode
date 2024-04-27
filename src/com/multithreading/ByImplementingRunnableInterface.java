package com.multithreading;

public class ByImplementingRunnableInterface implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer a= 10;
		Integer b= 10;
		System.out.println(a==b);
		
		
		ByImplementingRunnableInterface r = new ByImplementingRunnableInterface();
		Thread t1 = new Thread(r);

		t1.start();
	
		System.out.println("is de"+t1.isDaemon());
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
