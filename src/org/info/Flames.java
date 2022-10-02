package org.info;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Flames {
	
	public static void main(String[] args) {
		
		String s1 = "ananthavel";
		String s2 = "samantha";
		String s3 = "flames";
		List li = new ArrayList();
		List li2 = new ArrayList();
		List li3 = new ArrayList();
		List li4 = new ArrayList();
		List<Character> li5 = new ArrayList();

		for (int i = 0; i < s1.length(); i++) {
			
		
			
		    li.add(s1.charAt(i));
		    System.out.println(li);
		    
		    
		    
		}
		System.out.println(li);


		for (int i = 0; i < s2.length(); i++) {
		
		    li2.add(s2.charAt(i));
		    
		    		
		}
		System.out.println(li2);
		
		for (int i = 0; i < s3.length(); i++) {
			s3.charAt(i);
		    li5.add(s3.charAt(i));
		    
		    		
		}
		System.out.println(li5);

		
		int liSize = li.size();
		int liSize1 = li2.size();
		

		
		for (int i = 0; i < liSize;i++) {
			
			for (int j = 0; j < liSize1; j++) {
				
					if(li.get(i) == li2.get(j)) {
						
						li.remove(i);
						li2.remove(j);
						liSize1--;
						liSize--;

						
						
					}

						
				}

			
				

		}
		

		System.out.println(li);
		System.out.println(li2);
		
		li3 = li;
		li4 = li2;
		int liSize3 = li3.size();
		int liSize4 = li4.size();
		

		
		for (int i = 0; i < liSize3;i++) {
			
			for (int j = 0; j < liSize4; j++) {
				
					if(li3.get(i) == li4.get(j)) {
						
						li3.remove(i);
						li4.remove(j);
						liSize4--;
						liSize3--;

						
						
					}

						
				}

			
				

		}
		

		System.out.println(li3);
		System.out.println(li4);
		
		int comm1 = li3.size();
		int comm2 = li4.size();
		
		int comm3 = comm1 + comm2;
		System.out.println(comm3);
		
		int liSize5 = li5.size();
		
		
		String f = "FLAMES";
		
		while(f.length()!=1) {
			
			int cut = 0;
			
			for (int k = 1; k <= comm3; k++) {
				
				if(cut>=f.length())
					
					cut=0;
					++cut;
					
					
					
			}
				f=f.substring(0,cut-1)+f.substring(cut);
				
				f=f.trim();
			}
			
		

				
//		while (z>1) {
//			
//			for (int i = 0; i < liSize5; i++) {
//
//				if (liSize5 >= comm3 - 1) 
//				{
//										
//					if (i==comm3-1) { 
//						System.out.println(li5);
//						li5.remove(i);
//						
//						li5.
//						liSize5--;
//						System.out.println("Deep In"+li5);
//
//					}
//					
//					if (i>comm3-1) {
//						
//						li5.add(0, li5.get(i));
//						System.out.println(li5);
//						li5.remove(i);
//						liSize5--;
//						
//
//							
//					}			
//
//				}
//			
//			} 
//			
//			z--;
//			
//
//		}

		System.out.println(f);	

	}
}
	
	
			
		
			

	
		
		
	
	

		
	
	


		
	
	
	
	

	
	


