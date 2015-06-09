package com.oliver;

public class Main {

    public static void main(String[] args) {

        BinaryTree<String> A = new BinaryTree<String>("A");
        BinaryTree<String> B = new BinaryTree<String>("B");
        BinaryTree<String> C = new BinaryTree<String>("C");
        BinaryTree<String> D = new BinaryTree<String>("D");
        BinaryTree<String> E = new BinaryTree<String>("E");
        BinaryTree<String> F = new BinaryTree<String>("F");
        BinaryTree<String> G = new BinaryTree<String>("G");
        BinaryTree<String> H = new BinaryTree<String>("H");
        BinaryTree<String> I = new BinaryTree<String>("I");
        BinaryTree<String> J = new BinaryTree<String>("J");
        BinaryTree<String> K = new BinaryTree<String>("K");
        BinaryTree<String> L = new BinaryTree<String>("L");
        BinaryTree<String> M = new BinaryTree<String>("M");
        BinaryTree<String> N = new BinaryTree<String>("N");
        //BinaryTree<String> O = new BinaryTree<String>("O");
        A.setLeft(B);
        A.setRight(K);
        B.setLeft(C);
        B.setRight(H);
        C.setLeft(D);
        C.setRight(G);
        D.setLeft(E);
        D.setRight(F);
        H.setLeft(I);
        H.setRight(J);
        K.setLeft(L);
        //K.setRight(O);
        L.setLeft(M);
        L.setRight(N);

        BalanceDetector detect = new BalanceDetector();
        System.out.println("The tree is balanced: " + detect.isTreeBalanced(A));
    }
}
