package com.EPAM.app;



public class Remove {

	public String remove(String string) {
			String s="";
			for(int i=0;i<string.length();i++) {
				if(i>2) 
					s+=string.charAt(i);
				else {
					if(string.charAt(i)!='A') 
						s+=string.charAt(i);
					}
				}
			
			return(s);
			}
		
	}

	


