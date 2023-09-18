

class Node{
	
	Node left, right;
     int  data;

public Node(int data) {
	 this.data= data;  }
}
class BinaryTree{
	static Node root;

static void add(int data) {

	Node newNode= new Node(data);
	
	if(root== null) {
		root= newNode;  }
	
	else {
		Node focusNode= root;
		Node parent;
		
		while(true) {
			parent= focusNode;
			
			if(data< focusNode.data) { //  smaller data will be at left side
				focusNode= focusNode.left;  // changing focus to left side
				if(focusNode== null) {
					parent.left= newNode;
					return;   }}
				
				else {
					focusNode= focusNode.right;  // changing focus to right side
					if(focusNode== null) {
						parent.right= newNode;
						return;  }}
		
	
}}}}


public void PostOrder(Node focusNode) {
	if(focusNode == null) {
		return;}
	PostOrder(focusNode.left);
	PostOrder(focusNode.right);
	System.out.print(focusNode.data+" , ");}




public class PostOrder {
public static void main(String[] args) {
BinaryTree tree= new BinaryTree()	;

tree.root=new Node(4);
tree.root.left = new Node(7);
tree.root.right= new Node(9);
tree.root.left.left = new Node(13);
tree.root.left.right= new Node(20);
tree.root.right.left= new Node(23);
tree.root.right.right= new Node(70);


System.out.println("Post-order Transversal: ");
tree.PostOrder(tree.root);



}}