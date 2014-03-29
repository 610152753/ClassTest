package collection;

public class NodeTest1
{
	public static void main(String[] args)
	{
		Node1 node1 = new Node1("node1");
		Node1 node2 = new Node1("node2");
		Node1 node3 = new Node1("node3");
		
		node1.next = node2;
		node2.previous = node1;
		
		node2.next = node3;
		node3.previous  = node2;
		
		node3.next = node1;
		node1.previous = node3;
		
		System.out.println(node1.next.next.data);
		
		System.out.println("-------------");
		
		Node1 node4 = new Node1("node4");
		
		node1.next = node4;
		node4.previous = node1;
		node4.next = node2;
		node2.previous = node4;
		
		System.out.println(node1.next.next.next.data);
		
		node1.next = node2;
		node2.previous = node1;
		
		node4.next = null;
		node4.previous = null;
		
		System.out.println(node1.next.next.data);
		
		System.out.println(node1.next + "node1:" + node1 );
		System.out.println(node2.next );
		System.out.println(node3.next);
		System.out.println(node4.next);
		
		Node1 node5 = new Node1("node5");
		node5.next.previous = node5;
		
		node5.previous.next = node5;
		
		System.out.println(node1.next.next.data);
	}
}
