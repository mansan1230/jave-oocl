package inher;


class animals {
	int age;
	int weight;
	String running;
	String eating;
	String sounds;
	public void setanimals(int a, int w,String r,String e) {
		 
		 age = a;
		 weight = w;
		 running = r;
		 eating = e;		 
	 }
	public void getanimals() 
	 {
		 System.out.println(age+ " " + weight + " " + running + " " + eating); 
	 }
	public void felidae() {
		// TODO Auto-generated method stub
		
	}
}
  
class felidae  extends animals {
	void felidae_sound(){
        sounds = "meowing meowing";
        System.out.println(sounds);
        
    }
}



// Driver class
public class Main  {
    public static void main(String[] args) throws Exception {
    {
    	felidae tigher= new felidae();
    	tigher.setanimals(2 , 213 , "CanRunning" , "CanEating");
    	tigher.getanimals();
        tigher.felidae_sound();

    }
  }
}