package com.multithreading;

public class ByExtendingsThreadClass extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<10;i++) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("child thread");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ByExtendingsThreadClass thread1 = new ByExtendingsThreadClass();
		thread1.start();
		
		for(int i=0; i<10;i++) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Main thread");
		}
	}

}
