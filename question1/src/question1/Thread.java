package question1;

import java.util.ArrayList;

public class Thread  implements Runnable{

	ArrayList<Integer> sayiList= new ArrayList <Integer>();
	ArrayList <Integer> ciftList;
	ArrayList <Integer> tekList;
	Object Lock =new Object();
	public Thread(ArrayList<Integer> sayiList,ArrayList <Integer> ciftList , ArrayList <Integer> tekList) {
		this.sayiList=sayiList;
		this.ciftList=ciftList;
		this.tekList=tekList;
	}
	
	
	@Override
	public void run() {
		
			
			synchronized (Lock) {
				
				try {
					
					for (Integer item : sayiList) {
						if(item%2==0) {
							ciftList.add(item);
						}
						else {
							tekList.add(item);
			
						}
						
					}				
									
					
				}catch(Exception e) {
					System.out.println("cath Hatası");
				}	
				}
			}
		
		
		
			
	}


