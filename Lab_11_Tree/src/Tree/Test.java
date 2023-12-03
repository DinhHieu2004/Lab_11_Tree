package Tree;

public class Test {
	public static void main(String[] args) {
		BST<Integer> b = new BST<Integer>();
		b.add(6);
		b.add(7);
		b.add(1);
		b.add(2);
		b.add(8);
		b.add(4);
		//b.remove(1);
	
		//b.print();
		
		//System.out.println(b.findMin());
//		System.out.println();
//		for (Integer i : b.descendants(6)) {
//			System.out.print(i+"  ");
//		}
		//b.inorder();
		//System.out.println(b.size());
		//b.preoder();
	    b.postoder();
		
		
		  
	
	}
	

}
