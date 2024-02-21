package com.multithreading;

public class ProducerConsumerExample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProducerConsumer producerConsumer = new ProducerConsumer();
		Runnable r1 = ()->{
			System.out.println("calling consume()");
			producerConsumer.consume();
		};
		
		Runnable r2 = ()->{
			System.out.println("calling produce()");

			producerConsumer.produce();
		};
		
		Thread t1 = new Thread(r1); 
		Thread t2 = new Thread(r2); 
		
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
	}

}
