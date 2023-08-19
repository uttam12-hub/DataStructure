package org.datastructure.generalcode;

public class TwoThread {
int count=1;
	public static void main(String[] args) {
		
		TwoThread twoThread=new TwoThread();
		Thread t1=new Thread(new Runnable() {
			public void run() {
				
				twoThread.oddNumber();
			}
		},"Thread1");
		
		Thread t2=new Thread(new Runnable() {
			
			public void run() {
				twoThread.evenNumber();
			}
		},"Thread2");

		t1.start();
		t2.start();
	}
	
	public void oddNumber() {
		synchronized (this) {
			while(count<20) {
				if(count%2==0) {
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("Thread-1 "+count);
				count++;
				notify();
			}
		}
		
	}
	public void evenNumber() {
		synchronized (this) {
			while(count>0) {
				if(count%2!=0) {
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("Thread-2 "+count);
				count++;
				notify();
			}
		}
	}

}
