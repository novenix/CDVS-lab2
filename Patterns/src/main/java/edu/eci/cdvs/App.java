package edu.eci.cvds.patterns;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        String name="";
		for( String param : args) {
			name+=param+" ";
		}
        System.out.println( "Hello world!" );
        System.out.println( "Hello Pepito!" );
        System.out.println( "Hello " + name );
    }
}
