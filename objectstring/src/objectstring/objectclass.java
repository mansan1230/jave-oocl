package objectstring;

public class objectclass {
    static int testing = 100;
 
    // Constructor
    objectclass()
    {
    	test

    }
 
    // Overriding hashCode()
    @Override public int hashCode() { return roll_no; }
 
    // Driver code
    public static void main(String args[])
    {
    	objectclass s = new objectclass();
 
        System.out.println(s);
        System.out.println(s.toString());
        
        Object obj = new String("Test");
        Class c = obj.getClass();
        System.out.println("Class of Object obj is : "
                           + c.getName());
    }
}