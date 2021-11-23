import java.util.Scanner;

public class main {

	public static void main(String args[]) throws InterruptedException {
		
		BST bst = new BST();
		
		vocabulary t1 = new vocabulary(bst);
		t1.start();
		t1.join();
		
		input1 t2 = new input1(bst);
		t2.start();
		t2.join();
		
		input2 t3 = new input2(bst);
		t3.start();
		t3.join();
	
		Scanner kb=new Scanner(System.in);
		int choice=0;
		
		do {
			System.out.println( "\nPress 1 to Display the BST from Vocablary"
							+ "\nPress 2 to Display the Vectors from Input Files 1 and 2"
							+ "\nPress 3 to view matches and frequency"
							+ "\nPress 4 to search"
							+ "\nPress 5 to Exit\n"
							);
			
		choice=kb.nextInt();
		
		switch(choice)
		{
		
		case 1:
			
			t1.display(bst);
			break;
			
		case 2:
			
			t2.display();
			t3.display();
			break;
			
		case 3:
			
			t2.displaymap();
			t3.displaymap();
			break;
			
		case 4:
			
			String str="";
			System.out.println("\nEnter the Word you want to search...\n");
			str += kb.next();
			boolean check = true;
			
			if(t1.search(str))
			{
				System.out.println("\nFound in Vocabulary file\n");	
				check = false;
			}
			
			if(t2.search(str))
			{
				System.out.println("\nFound in Input File 1\n");
				check = false;
			}
			
			if(t3.search(str))
			{
				System.out.println("\nFound in Input File 2\n");
				check = false;
			}
			
			if(check == true)
				System.out.println("\nNot found in any files\n");

			break;
			
		case 5:
				
			return;
		
		}
	} while (choice!=5);
		
	}
	
}
