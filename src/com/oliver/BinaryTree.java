package com.oliver;

public class BinaryTree<T> {

    private T data;
    private BinaryTree<T> left;
    private BinaryTree<T> right;

    public BinaryTree(T data) {

        this.data = data;
        left = right = null;
    }

    public BinaryTree(T data, BinaryTree<T> left) {

        this.data = data;
        this.left = left;
        right = null;
    }

    public BinaryTree(T data, BinaryTree<T> left, BinaryTree<T> right) {

        this.data = data;
        this.left = left;
        this.right = right;
    }

    public T getData() {

        return data;
    }

    public void setData(T data) {

        this.data = data;
    }

    public BinaryTree<T> getLeft() {

        return left;
    }

    public void setLeft(BinaryTree<T> left) {

        this.left = left;
    }

    public BinaryTree<T> getRight() {

        return right;
    }

    public void setRight(BinaryTree<T> right) {

        this.right = right;
    }
}