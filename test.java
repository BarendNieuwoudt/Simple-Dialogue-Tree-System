public class test {
	
	public static void main(String[] args) {
		
    // Example taken from
    // https://en.wikipedia.org/wiki/Dialogue_tree
    
		// Create Nodes :
		TreeNode t1 = new TreeNode("You don't look like you're from around here.");
		TreeNode t2 = new TreeNode("Oh really? Then you must know Mr. Bowler.");
		TreeNode t3 = new TreeNode("Newton eh? I heard there's trouble brewing down there.");
		TreeNode t4 = new TreeNode("You Liar! there aint no Mr. Bowler, I made him up!");
		TreeNode t5 = new TreeNode("Don't worry about it. Say, do you have something to eat? I'm starving");
		
		// Link nodes with Responses : 
		t1.addChildNode("I've lived here all my life!", t2);
		t1.addChildNode("I came here from Newton", t3);
		t2.addChildNode("Mr. Bowler is a good friend of mine!", t4);
		t2.addChildNode("Who?", t5);
		t3.addChildNode("I haven't heard about any trouble.", t5);
		t3.addChildNode("Did I say Newton? I'm actually from Springville.", t2);
		
		// Start Dialogue : 
		t1.talkTo();
		
	}

}
