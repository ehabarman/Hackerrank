//Date 10-7-2018
package Java_Proficiency.easy;

public class JavaSingletonPattern {

	public static void main(String[] args) {
		
		Singleton s = Singleton.getSingleInstance();
		System.out.print(s.toString());
	}
}
//-----------------------
//class Singleton is the solution
class Singleton  {

	private final static Singleton  singleton= new Singleton ();
    public String str ="Hello I am a singleton! Let me say hello world to you";
    private Singleton (){}

    public static Singleton  getSingleInstance(){
        return singleton;
    }
    
    @Override
    public String toString(){
        return str;
    }
}