package buychicken;

import buychicken.buya;
import buychicken.cock;
import buychicken.hen;


class buy {
	int cost;
	public void method(int cost) {
		// TODO Auto-generated method stub
		
	}
}

class cock  extends buy {
	
    public void method(int cost) {
        if (cost/5 > 100) {
        	System.out.println("You Should buy cock");
        }
        else {
        	System.out.println("You cant buy cock...");
        }
        	
    }
}

class hen  extends buy {
    @Override
    public void method(int cost) {
        if (cost/3 > 100) {
        	System.out.println("You Should buy hen");
        }
        else {
        	System.out.println("You cant buy hen...");
        }
    }
    
} 
class chicken extends buy {
    @Override
    public void method(int cost) {
        if (cost/0.3 > 100) {
        	System.out.println("You Should buy chicken");
        }
        else {
        	System.out.println("You cant buy chicken...");
        }
    }
    
} 



public class buya{
	public static void main(String[] args) {
		buy you;
		you  = new cock();
		you .method(100);
		you  = new hen();
		you .method(100);
		you  = new chicken();
		you .method(100);

		
    }
}
