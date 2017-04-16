package util.operation.tree;

import node.TreeNode;
import util.castUtil.CastUtil;

import java.util.ArrayList;
import java.util.List;
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
    //后序遍历非递归实现
    public static void postOrderNonRecursive(TreeNode x){
        // TODO: 2017/4/16
    }

    //构造有N个结点的二叉树
    public static TreeNode getBST(int n){
        int nums[] = new int[n];
        for (int i = 0;i<n;i++ ){
            nums[i] = i*2+1;
        }
        return buildBST(nums);
    }

    //从数组构造一棵二叉树

    public static TreeNode buildBST(int[] nums) {
        if(nums.length == 0) return null;
        TreeNode root = buildBST(nums,0,nums.length-1);
        return root;
    }
    private static TreeNode buildBST(int[] nums, int lo, int hi) {
        if(lo > hi) return null;
        int mid = (lo + hi)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = buildBST(nums,lo,mid-1);
        node.right = buildBST(nums,mid+1,hi);
        return node;
    }

    //从二叉树变回数组
    public static int[] toSortedArray(TreeNode root){
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode x = root;
        while (x!=null||!stack.isEmpty()){
            while (x!=null){
                stack.push(x);
                x = x.left;
            }
            x = stack.pop();
            list.add(x.val);
            x = x.right;
        }
        int []nums = new int[list.size()];
        for(int i = 0;i<list.size();i++){
            nums[i] = list.get(i);
        }
        return nums;
    }
    //任取树中的一结点
    public static TreeNode getRandomNode(TreeNode root){
        return get(root);
    }
    private static TreeNode get(TreeNode root){
        int nums[] = toSortedArray(root);
        int n = CastUtil.castInt(Math.floor(Math.random()*nums.length));
        int val=nums[n];
        return new TreeNode(val);
    }

}


