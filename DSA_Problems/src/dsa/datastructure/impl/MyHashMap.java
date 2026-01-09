package dsa.datastructure.impl;

public class MyHashMap<K, V> {

	private int size = 16;
	private Node myNode[];
	private int leg = 0;
	
	public MyHashMap() {
		myNode = new Node[size];
	}
	
	private int getIndex(K key) {
		return Math.abs(key.hashCode()) % size;
	}
	
	public void put(K key, V value) {
		int index = getIndex(key);
		
		Node<K, V> headNode = myNode[index];
		
		Node<K, V> currNode = headNode;
		
		while(currNode != null) {
			if(currNode.key.equals(key)) {
				currNode.value = value;
				return;
			}
			currNode = currNode.next;
		}
		
		Node<K, V> node = new Node(key, value);
		node.next = headNode;
		myNode[index] = node;
	}
	
	public V get(K key) {
		int index = getIndex(key);
		
		Node<K, V> headNode = myNode[index];
		
		Node<K, V> currNode = headNode;
		
		while(currNode != null) {
			if(currNode.key.equals(key)) {
				return currNode.value;
			}
			currNode = currNode.next;
		}
		
		return null;
	}
	
	public void delete(K key) {
		int index = getIndex(key);
		
		Node<K, V> currNode = myNode[index];
		
		Node<K, V> prevNode = null;
		
		while(currNode != null) {
			if(currNode.key.equals(key)) {
				if(prevNode == null) {
					myNode[index] = currNode.next;
				} else {
					prevNode.next = currNode.next;
				}
			}
			prevNode = currNode;
			currNode = currNode.next;
		}
	}
	
}
