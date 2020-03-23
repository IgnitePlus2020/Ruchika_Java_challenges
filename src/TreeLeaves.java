import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by user on 3/24/2020.
 */

class TreeNode {
    String val;
    TreeNode left;
    TreeNode right;
    TreeNode(String x) { val = x; }
}

class Wrapper {

    public static TreeNode stringToTreeNode(String input) {
        input = input.substring(0, input.length());
        if (input.length() == 0) {
            return null;
        }

        String[] parts = input.split(",");
        String item = parts[0];
        TreeNode root = new TreeNode(item);
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);

        int index = 1;
        while (!nodeQueue.isEmpty()) {
            TreeNode node = nodeQueue.remove();

            if (index == parts.length) {
                break;
            }

            item = parts[index++];
            if (!item.equals("null")) {
                String leftNumber = item;
                node.left = new TreeNode(leftNumber);
                nodeQueue.add(node.left);
            }

            if (index == parts.length) {
                break;
            }

            item = parts[index++];
            if (!item.equals("null")) {
                String rightNumber = item;
                node.right = new TreeNode(rightNumber);
                nodeQueue.add(node.right);
            }
        }
        return root;
    }
}
class TreeLeaves {
    public static void main(String args[])throws IOException{
        // 2,4,5,null,3 for the tree
        //                         2
        /*                        / \
                                 4   5
                                  \
                                   3

         */
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the nodes in comma separated level order and representing no node as null: ");
        String input;
        input = in.nextLine();
        TreeNode root = Wrapper.stringToTreeNode(input);
        ArrayList<String>res = new ArrayList<String>();
        System.out.println("The leaves are:");
        dfs(root,res);
        for(String a : res )
            System.out.println(a);
    }
    static void dfs(TreeNode root,ArrayList<String> res){
        if(root == null)
            return;
        if(root.left == null && root.right == null)
            res.add(root.val);
        dfs(root.left,res);
        dfs(root.right,res);
    }
}

/* Output
Enter the nodes in comma separated level order and representing no node as null :
A,B,F,C,E,G,H,D,null,null,null,null,null,null,K
The leaves are:
D
E
G
K
 */