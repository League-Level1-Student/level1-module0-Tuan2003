package extra;

public class Methods {

	public static void main(String[] args) {

//On the whiteboard (or on paper) write the following methods:


//1. Write a method to support the code below, that prints "The League rocks" when it is called.


weRock(); //prints "The League rocks"


//2. Write a method to support the code below, that takes a name as a parameter and prints that they rock.


rocker("Bob"); //prints "Bob rocks"


//3. Write a method to support the code below, that takes a name as a parameter and adds " is awesome" if the name is your favorite singer, but " is annoying " if it is someone else.


truth("Rob Thomas"); //prints "Rob Thomas is awesome"
truth("Justin Bieber"); //prints "Justin Bieber is annoying"


//4. Write a method to support the code below, that takes a word as a parameter and prints it twice.


echo("hello"); //prints "hello hello"


//5. Write a method to support the code below, that takes a word and a number as parameters and prints the word a number of times.


repeat("mayday", 8); //prints "mayday mayday mayday mayday"


//6. Write a method to support the code below that returns the name of the best programmer.


String theBest = getTheBestCoder();
System.out.println(theBest);


//7. Write a method to support the code below that adds 2 whole numbers and returns the result.


int sum = add(2,2);
System.out.println(sum); //prints 4


//8. Write a method that works out whether a given number is odd or not.
 System.out.println(oddOrNot(5));
	}
	
	public static void weRock() {
	System.out.println("The League rocks");
	}
	public static void rocker(String name) {
	System.out.println(name + " rocks");
	}
	public static void truth(String name) {
	if(name.equalsIgnoreCase("Justin Bieber")) {
	System.out.println(name + " is annoying.");
	}else {
	System.out.println(name + " is awesome");
	}
	}
	public static void echo(String word){
	System.out.println(word + " " + word);
	}
	public static void repeat(String word, int times) {
		for (int i = 0; i < times; i++) {
			System.out.print(word + " ");
		}
		System.out.println(" ");
	}
	public static String getTheBestCoder() {
		return "Tuan is the best coder";
	}
	public static int add(int a ,int l ) {
		return a+l;
	}
	public static String oddOrNot(int num) {
		if(num%2==1) {
			return "odd"; 
		}
		return "even";
	}
	
}

