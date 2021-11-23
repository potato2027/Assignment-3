import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.Vector;

public class input1 extends Thread {

	public input1(BST bst) {
		// TODO Auto-generated constructor stub
		run(bst);
	}

	Vector<String> v = new Vector<String>();
	Vector<String> v2 = new Vector<String>();
	Map<String,Integer> map = new TreeMap<String, Integer>();
	
	String str;

	public void run(BST bst2) {

		
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\faiza\\Desktop\\file1.txt"));    
			
			try {
				while((str = br.readLine()) != null)
				{  
					v.add(str);  

					StringTokenizer temp = new StringTokenizer(str, " ");
					
					while(temp.hasMoreTokens()) 
					{
						v2.add(temp.nextToken());
					}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		for (int i=0;i<v2.size();i++)
		{
			String a="";
			a=v2.elementAt(i);
			if(bst2.search(a))
			{
			
				if(map.containsKey(a))
					map.put(a, map.get(a)+1);
				else
					map.put(a,1);
			}
		}
		
		for(Map.Entry<String,Integer> entry:
            map.entrySet())
		{
			System.out.println(entry.getKey()+
            " - "+entry.getValue());
		}
				
	}

	public void display() {
		
		System.out.println(v2);

	}
	public void displaymap()
	{
		for(Map.Entry<String,Integer> entry:
            map.entrySet())
		{
			System.out.println(entry.getKey()+
            " - "+entry.getValue());
		}
	}
	public boolean search(String a)
	{
		if(v2.contains(a))
			return true;
		return false;
	}
	
}
