package de.hska.iwi.ads.solution.tree;

import de.hska.iwi.ads.dictionary.AbstractBinaryTree;

public class BinarySearchTree<K extends Comparable<K>, V> extends AbstractBinaryTree<K, V> {

	@Override
	public V get(Object o) {
		@SuppressWarnings("unchecked")
		K key = (K) o;
		final AbstractBinaryTree<K, V>.Node foundNode = binaryTreeSearch(root, key);
		return foundNode != null ? foundNode.entry.getValue() : null;
	}

	@Override
	public V put(K key, V value) {
		Node nodeToInsert = new Node(key, value);
		Node parentNode = null;
		Node current = root;

		while (current != null) {
			if (nodeToInsert.entry.getKey() == current.entry.getKey()) { // key already exists, replace the value
				V previousValue = current.entry.getValue();
				current.entry.setValue(nodeToInsert.entry.getValue());
				return previousValue;
			}
			parentNode = current;
			if (nodeToInsert.entry.getKey().compareTo(current.entry.getKey()) < 0) {
				current = current.left;
			} else {
				current = current.right;
			}
		}

		if (parentNode == null) {
			root = nodeToInsert;
		} else if (nodeToInsert.entry.getKey().compareTo(parentNode.entry.getKey()) < 0) {
			parentNode.left = nodeToInsert;
		} else {
			parentNode.right = nodeToInsert;
		}
		size++;
		return null;
	}

	private Node binaryTreeSearch(Node node, K key) {
		if (node == null || node.entry.getKey() == key) {
			return node;
		} else if (key.compareTo(node.entry.getKey()) < 0) {
			return binaryTreeSearch(node.left, key);
		} else {
			return binaryTreeSearch(node.right, key);
		}
	}

	@Override
	public V remove(Object key) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean remove(Object key, Object value) {
		throw new UnsupportedOperationException();
	}
}
