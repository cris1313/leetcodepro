package algorithm.search.twothreefive;

import com.cris.algorithm.search.twothreefive.SolutionOne;
import node.TreeNode;
import util.operation.tree.BST;

/**
 * Created by owen on 2017/4/16.
 */
public class TestSolutionOne {
    public static void main(String[] args) {

        TreeNode root = BST.getBST(10);
        TreeNode p = BST.getRandomNode(root);
        TreeNode q = BST.getRandomNode(root);
        System.out.println(root.val);
        System.out.println(p.val);
        System.out.println(q.val);
        SolutionOne solutionOne = new SolutionOne();
        TreeNode lowest = solutionOne.lowestCommonAncestor(root, p, q);
        System.out.println(lowest.val);


    }
}
