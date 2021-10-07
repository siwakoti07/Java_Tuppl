package com.pack.multithreading;

class MyThread extends Thread {
	public void run() {
		Thread.currentThread().setName("haha_Thread");
		for(int i = 0; i < 10; i++) {
		System.out.println("This is from "+ Thread.currentThread().getName());
		}
		
		Runnable th = new Runnable() {
			@Override
			public void run() {
				try {
					Thread.currentThread().setName("haha thread");
					for (int i = 0; i < 10; i++) {
						System.out.println("This is " + Thread.currentThread().getName());
						Thread.sleep(1000);
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

		Thread t2 = new Thread(th);
		t2.start();
//		t2.interrupt();
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	}
}

public class PracticeThread {

	public static void main(String[] args) {

		MyThread t1 = new MyThread();
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("This is " + Thread.currentThread().getName());
		}

	}
}
