import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TreeNode {
	
	private Map<String, TreeNode> childNodes = new HashMap<String, TreeNode>();
	private String text;
	private Scanner input = new Scanner(System.in);
	
	// Constructor
	public TreeNode(String text) {
		this.text = text;
	}
	
	// Add child Nodes
	public void addChildNode(String answer, TreeNode node) {
		childNodes.put(answer, node);
	}
	
	// Talk to
	public void talkTo() {
		System.out.println(this.text);
		
		//Store all the possible responses in an ArrayList : 
		ArrayList<String> keys = new ArrayList<>();
		for(String key : childNodes.keySet()) {
			keys.add(key);
		}
		
		//If there are no responses, Exit : 
		if (keys.size() == 0)
			return;
		
		// Print all possible responses : 
		for (int j = 0; j < keys.size(); j++) {
			System.out.println(j + " : " + keys.get(j));
		}
		
		// Get response from player : 
		int answer = input.nextInt();
		
		// Go to next Node:
		childNodes.get(keys.get(answer)).talkTo();
	}

}
