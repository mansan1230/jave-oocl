package poly;

class WuHuntoBeiJing {
	int cost;
    public void method() {
        
    }
	public void method(int cost) {
		// TODO Auto-generated method stub
		
	}
}

class car extends WuHuntoBeiJing {
	
    public void method(int cost) {
        if (cost >= 500) {
        	System.out.println("Can Choose Driving A Car");
        }
        else {
        	System.out.println("Cant Choose Driving A Car...");
        }
        	
    }
}

class bus extends WuHuntoBeiJing {
    @Override
    public void method(int cost) {
        if (cost >= 300) {
        	System.out.println("Can Choose Taking Bus");
        }
        else {
        	System.out.println("Cant Choose Taking Bus...");
        }
    }
    
} 
class train extends WuHuntoBeiJing {
    @Override
    public void method(int cost) {
        if (cost >= 400) {
        	System.out.println("Can Choose Taking Train");
        }
        else {
        	System.out.println("Cant Choose Taking Train");
        }
    }
    
} 
class plane extends WuHuntoBeiJing {
    @Override
    public void method(int cost) {
        if (cost >= 1000) {
        	System.out.println("Can Choose Taking Plane");
        }
        else {
        	System.out.println("Cant Choose Taking Plane...");
        }
    }
}



public class Main{
	public static void main(String[] args) {
		WuHuntoBeiJing Xiaoming;
		Xiaoming  = new car();
		Xiaoming .method(500);
		Xiaoming  = new bus();
		Xiaoming .method(500);
		Xiaoming  = new train();
		Xiaoming .method(500);
		Xiaoming  = new plane();
		Xiaoming .method(500);
		
    }
}
