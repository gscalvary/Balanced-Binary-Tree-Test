package com.oliver;

// O(h) space complexity where h is the height of the tree with a maximum of O(n) time complexity where n is the number
// of nodes in the tree.
public class BalanceDetector {

    class Result {

        private boolean isBalanced;
        private int height;

        public Result() {

            isBalanced = false;
            height = 0;
        }

        public Result(boolean isBalanced, int height) {

            this.isBalanced = isBalanced;
            this.height = height;
        }

        public boolean isBalanced() {

            return isBalanced;
        }

        public void setIsBalanced(boolean isBalanced) {

            this.isBalanced = isBalanced;
        }

        public int getHeight() {

            return height;
        }

        public void setHeight(int height) {

            this.height = height;
        }
    }

    public boolean isTreeBalanced(BinaryTree tree) {

        return checkBalance(tree).isBalanced();
    }

    private Result checkBalance(BinaryTree tree) {

        if (tree == null) return new Result(true, -1);

        Result leftResult = checkBalance(tree.getLeft());
        if (!leftResult.isBalanced) return new Result(false, 0);

        Result rightResult = checkBalance(tree.getRight());
        if (!rightResult.isBalanced) return new Result(false, 0);

        boolean isBalanced = Math.abs(leftResult.getHeight() - rightResult.getHeight()) <= 1;
        int height = Math.max(leftResult.getHeight(), rightResult.getHeight()) + 1;
        return new Result(isBalanced, height);
    }
}
