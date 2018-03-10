package leetcode;

import java.util.Scanner;

/**
 * 就是添加一行数据在一个树 就是一个前序遍历，然后记录深度deep，
 * 等于深度的时候 判断是否是叶子节点 是叶子就添加，不是叶子节点 就添加后指向下一个
 * 注意边界 在root节点上面添加， 在叶子节点上添加
 */
 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class AddOneRowtoTree_623 {

    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if(d==1){
            TreeNode treenode=new TreeNode(v);
            treenode.left=root;
            return treenode;

        }
        return nodeFind(root,1,v,d);
    }

    public TreeNode nodeFind(TreeNode root,int deep,int v,int d){
        if(root==null)return null;
        deep++;
        if(deep==d){
            if(root.left!=null){
                TreeNode treenode=new TreeNode(v);
                treenode.left=root.left;
                treenode.right=null;
                root.left=treenode;
            }else{
                TreeNode treenode=new TreeNode(v);
                root.left=treenode;
            }
            if(root.right!=null){
                TreeNode treenode=new TreeNode(v);
                treenode.right=root.right;
                treenode.left=null;
                root.right=treenode;
            }else {
                TreeNode treenode=new TreeNode(v);
                root.right=treenode;
            }
            return root;
        }
        else if(deep<d){
            nodeFind(root.left,deep,v,d);
            nodeFind(root.right,deep,v,d);
        }
        return root;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){

        }
    }
}
