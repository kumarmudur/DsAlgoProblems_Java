package leetcode.easy.tree;

import java.util.HashSet;

public class FindTarget {

    static boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set = new HashSet<>();
        return find(root, k, set);
    }

    static boolean find(TreeNode root, int k, HashSet<Integer> set) {
        System.out.println("HashSet " + root);
        if (root == null) return false;
        if (set.contains(k - root.val)) return true;
        set.add(root.val);
        return find(root.left, k, set) || find(root.right, k, set);
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode();
        node.root = new TreeNode(5);
        node.root.left = new TreeNode(3);
        node.root.right = new TreeNode(6);
        node.root.left.left = new TreeNode(2);
        node.root.left.right = new TreeNode(4);
        node.root.right.left = new TreeNode();
        node.root.right.right = new TreeNode(7);

        System.out.println(findTarget(node, 9));
    }
}
