
class HuffManNode{
	
	int data;                      // structure of a huffman tree
	char character;
	HuffManNode right;
	HuffManNode left;  }


class NewComparator implements Comparator<HuffManNode>{ // A comparator to compare the frequency values 
	
	public int compare (HuffManNode a, HuffManNode b) {
	
		return a.data - b.data; } }



public class HuffmanCoding {
	
	
	public static void printCode(HuffManNode root, String str) {
		
	if(root.left == null && root.right== null && Character.isLetter(root.character)) {
	System.out.println(root.character +": "+ str);	
	return;  }  // if a leaf node is encountered , print its character and code
	
	
	printCode(root.left, str+ "0");  // all left node will have 0
	printCode(root.right, str+ "1");	} // all right node will have 1
	

public static void main(String[] args) {

	int size = 3;
	char[] letters= {'a','b','c'};
	int frequency []= {5, 6, 2};
	
	PriorityQueue<HuffManNode> queue = new PriorityQueue<>(size, new NewComparator());  // a min heap
		
		
	for (int i = 0; i < size; i++) {
		HuffManNode node= new HuffManNode();  // a new node created at each traversal
		node.character = letters[i];  // a individual character is assigned
		node.data= frequency[i];  // with its frequency
		
	
		node.left= null;   // at first, both are null
		node.right = null;
		
	   queue.add(node);  }  // adding everything in min heap
		
	HuffManNode root= null;
	
	while(queue.size()>1) {
		
		HuffManNode a= queue.poll();  // poll two elements at a time
		HuffManNode b= queue.poll();
		
		HuffManNode sum= new HuffManNode();
		sum.data = a.data+ b.data;   // add their data to create a parent node
		
		
		sum.left = a;   // assign polled elements to root's left and right
		sum.right = b;
		
		
		root= sum;		
		queue.add(sum);  }  // add sum node in the min heap
		
		
	printCode(root, "");	}}  // print values