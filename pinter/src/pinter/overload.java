//overload

package pinter;


public class overload {
    public void print(){
        System.out.println("function is printing");
    }
 
 
    public void print(int a ,String type){
    	System.out.println("different colors are used to paper");;
    }   
 
    //以下两个参数类型顺序不同
    public void print(String type ,int a){
    	System.out.println("only the black color is used to paper.");
    }   
 

    public static void main(String[] args){
        overload printer = new overload();
        printer.print();
        printer.print(1,"color printer");
        printer.print("black and white printer",1);
    }
}
