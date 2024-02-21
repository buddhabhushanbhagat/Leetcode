package com.multithreading;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumer {
	
	public static List<Integer> list = new ArrayList<>(5);
	
	synchronized void produce() {
		// TODO Auto-generated method stub
		
		list.add(5);
		list.add(25);
		list.add(10);
		
		list.notify();
	}
	
	synchronized void consume() {
		// TODO Auto-generated method stub
		if(list.isEmpty()) {
			try {
				System.out.println("list is empty and calling wait()");
				list.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			System.out.println("Printing list elements");
			list.forEach(e->System.out.println(e));
		}
		
	}
}
