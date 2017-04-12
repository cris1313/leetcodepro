package util.operation.tree;

import node.TreeNode;

import java.util.Stack;

/**
 * Created by owen on 2017/4/12.
 */

/**
 * 二叉查找树的各种操作
 */
public final class BST  {

    //中序遍历
    public static void inOrder(TreeNode x){
        int []a = new int[100];
        inOrder(x,a);
    }
    private static void inOrder(TreeNode x,int []a){
        if(x == null)
            return ;
        inOrder(x.left,a);
        System.out.println(x.val);
        inOrder(x.right,a);
    }

    //先序遍历
    public static void preOrder(TreeNode x){
        if(x == null) return;
        System.out.println(x.val);
        preOrder(x.left);
        preOrder(x.right);
    }

    //后序遍历
    public static void postOrder(TreeNode x){
        if(x == null) return;
        postOrder(x.left);
        postOrder(x.right);
        System.out.println(x.val);
    }
    //先序遍历非递归实现
    public static void preOrderNonRecursive(TreeNode x){
        Stack<TreeNode> stack = new Stack<>();
        while(!stack.isEmpty()||x!=null){
            if(x!=null) {
                System.out.println(x.val);
                stack.push(x);
                x = x.left;
            }
            while(x == null&&!stack.isEmpty()){
                x = stack.pop();
                x = x.right;
            }
        }
    }

    //中序遍历非递归实现
    public static void inOrderNonRecursive(TreeNode x){
        Stack<TreeNode> stack = new Stack<>();
        while (x!=null||!stack.isEmpty()){
            while (x!=null){
                stack.push(x);
                x = x.left;
            }
            x = stack.pop();
            System.out.println(x.val);
            x = x.right;
        }
    }

}


