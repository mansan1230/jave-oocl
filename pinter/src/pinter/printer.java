package pinter;

//override
class override {
     public void print(){
       System.out.println("function is printing");
  }
}

class colorprinter extends override{
	   public void print(){
	      System.out.println("different colors are used to paper");
	   }
	}
class blackandwhiteprinter extends override{
	   public void print(){
	      System.out.println("only the black color is used to paper.");
	   }
	}


public class printer{
	   public static void main(String args[]){
		   override a = new colorprinter(); // Animal 对象
		   override b = new blackandwhiteprinter(); // Dog 对象
	 
	      a.print();
	 
	      b.print();
	   }
	}


