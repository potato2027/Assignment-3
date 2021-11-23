import java.io.*;
import java.util.Vector;

public class vocabulary extends Thread {

	
	Vector<String> v = new Vector<String>();
	
	public vocabulary(BST bst) {
		// TODO Auto-generated constructor stub
		run(bst);
	}

	public void run(BST bst2) {
		
		String str;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\faiza\\Desktop\\vocabulary.txt"));    
			
			try {
				while((str = br.readLine()) != null)
				{  
					bst2.addNode(str);
					v.add(str);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 		
		
		} catch (FileNotFoundException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void display(BST bst2) {
		
		bst2.preorder();
	}
	
	public boolean search(String a)
	{
		if(v.contains(a))
			return true;
		return false;
	}
	
}

