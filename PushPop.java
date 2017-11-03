package myPack;//created package as myPack

import java.util.Scanner;//import keyword is used to import built-in and user defined package into our java source file. So that our class can refer a class that is in another package by directly 
//using it's name. It aLLows you to specify classes from other packages that can be referenced without qualify them with their package.
//java.util contains the collection of framework,legacy collection classes event model,data and time facilities,internationalization and miscellaneous utility classes
//Scanner is a simple text scanner which can parse primitive types ans string using regular expressions

/**To put an object on the top of the stack, call push(). To remove and return the top element, call pop()
 * Stack is a subclass of Vector that implements a standard last-in, first-out stack. 
 * Stack only defines the default constructor, which creates an empty stack.**/

public class PushPop {//created class name as PushPop
	// main method

		public static void main(String[] args) {//Here public is a access modifier which defines who can access this method
			//Here static a keyword which identifies class related thing
			//void is used to define return type of the method,void means method wont return any value
			//main is name of method
			//declares method String[]
			//String[]args means arguments will be passed into main method and says that main() as a parameter
			// scanner for input
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please enter the Size of the stack");
			int size = scanner.nextInt();
			// new object creation
			FixedStack fixedStack = new FixedStack(size);
			VariableStack stack = new VariableStack(size);
			// while loop
			while (true) {
				System.out.println("Enter A to implement FixedStack and B to implement VariableStack");
				char ch = scanner.next().toCharArray()[0];
				switch (ch) {
				case 'A':
					while (true) {
						System.out.println("Enter 1 to push");//system is used to return code
				           //out is a static member
			         	//Println is used to print text  and gives output 
						System.out.println("Enter 2 to pop");
						System.out.println("Enter 3 to close");
						System.out.println("Please Enter your choice");
						int choice = scanner.nextInt();

						switch (choice) {
						case 1:
							System.out.println("Please enter a integer to push into stack");//system is used to return code
					           //out is a static member
				         	//Println is used to print text  and gives output 
							int push = scanner.nextInt();
							fixedStack.push(push);//fixedstack
							break;
						case 2:
							int item = fixedStack.pop();
							System.out.println("popped item is :" + item);
							break;//breaks

						case 3:
							scanner.close();

						}
					}
				case 'B':
					while (true) {
						System.out.println("Enter 1 to push"); //system is used to return code
				           //out is a static member
			         	//Println is used to print text  and gives output 
						System.out.println("Enter 2 to pop"); //system is used to return code
				           //out is a static member
			         	//Println is used to print text  and gives output 
						System.out.println("Enter 3 to close");
						System.out.println("Please Enter your choice");
						int choice = scanner.nextInt();

						switch (choice) {//A switch statement allows a variable to be tested for equality against a list of values.
						case 1:
							System.out.println("Please enter a integer to push into stack");
							int push = scanner.nextInt();
							stack.push(push);//stack push

							break;//breaks
						case 2:
							int item = stack.pop();
							System.out.println("popped item is :" + item);//system is used to return code
					           //out is a static member
				         	//Println is used to print text  and gives output 
							break;

						case 3:
							scanner.close();//closes

						}
					}
				default:
					scanner.close();

				}
			}
		}

	}

	interface Stack {//reference type

		void push(int i);//void is used to define return type of the method,void means method wont return any value

		int pop();//initializing pop
	}

	class FixedStack implements Stack {//FixedStack implementing stack

		int top = -1;
		static int size;

		int[] stackItems;//initialize stackItems

		public FixedStack(int size) {//Here public is a access modifier which defines who can access this method
			FixedStack.size = size;
			stackItems = new int[size];
		}

		@Override
		public void push(int i) {//Here public is a access modifier which defines who can access this method
			//void is used to define return type of the method,void means method wont return any value
			// TODO Auto-generated method stub
			if (top < size) {

				top = top + 1;
				stackItems[top] = i;
				System.out.println("top value" + top);
				System.out.println("size value" + size);
				System.out.println("Item saved " + stackItems[top] + "\n");
			} else {
				System.out.println("STACK OVERFLOW" + "\n"); //system is used to return code
		           //out is a static member
		         	//Println is used to print text  and gives output 

			}

		}

		@Override
		public int pop() {//Here public is a access modifier which defines who can access this method

			int item;
			if (top < 0) {
				System.out.println("There is no item to be popped out" + "\n");//system is used to return code
		           //out is a static member
	         	//Println is used to print text  and gives output 
				return 0;

			} else {

				item = stackItems[top];
				top = top - 1;
				return item;//return item
			}

		}

	}

	class VariableStack implements Stack {//new class VariableStack implements stack

		int top = -1;
		static int size;

		int[] stackItems;//initialize stackItems//system is used to return code
        //out is a static member
  	//Println is used to print text  and gives output 

		public VariableStack(int size) {//Here public is a access modifier which defines who can access this method
			// TODO Auto-generated constructor stub
			this.size = size;
			stackItems = new int[size];
		}

		@Override
		public void push(int i) {//Here public is a access modifier which defines who can access this method
			//void is used to define return type of the method,void means method wont return any value

			if (top < size) {

				top = top + 1;
				stackItems[top] = i;
				System.out.println("top value" + top);
				System.out.println("size value" + size);
				System.out.println("Item saved " + stackItems[top] + "\n");
			} else if (top >= size) {

				stackItems = new int[size * 2];
				top = top + 1;
				stackItems[top] = i;
				System.out.println("top value" + top);
				System.out.println("size value" + size);
				System.out.println("Item saved " + stackItems[top] + "\n");//system is used to return code
		           //out is a static member
	         	//Println is used to print text  and gives output 

			}

		}

		@Override
		public int pop() {
			//Here public is a access modifier which defines who can access this method

			int item;
			if (top < 0) {
				System.out.println("There is no item to be popped out" + "\n");//system is used to return code
		           //out is a static member
	         	//Println is used to print text  and gives output 
				return 0;

			} else {

				item = stackItems[top];//stackItems
				top = top - 1;
				return item;//return
			}

		}
}