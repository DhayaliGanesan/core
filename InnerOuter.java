package com.ksr.org;

public class InnerOuter {
	public static void main(String args[]){
   Dharani:   for( int i=0;i<10;i++){
   Devi:  	  for( int k=0;k<5;k++){
    		if(k == 2){
    			continue Devi;
    		}
    	    if(i == 5){	
    	    	continue Dharani;
    	    }
    	    System.out.println("i = "+i+" k="+k);	
    	    }
    		}
}
}

      
      
      

