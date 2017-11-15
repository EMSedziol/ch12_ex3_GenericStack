public class GenericStackApp {

    public static void main(String[] args) {
    	GenericStack<String> s = new GenericStack<>();
    	
    	s.push("Apples");
    	System.out.println("push Apples");
    	s.push("Bannana");
    	System.out.println("push bannana");
    	s.push("Orange");
    	System.out.println("The stack contains " + s.size() + " items\n");
    	
    	System.out.println("Peek: " + s.peel());
    	System.out.println("The Stack contains " + s.size() + " items\n");
    	
    	System.out.println("Pop: " + s.pop());
    	System.out.println("Pop: " + s.pop());
    	System.out.println("Pop: " + s.pop());
    	System.out.println("The stack contains " + s.size() + " items\n" );

    }
    
}
