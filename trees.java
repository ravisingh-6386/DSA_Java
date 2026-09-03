//import java.util.*;
/*public class trees {
    // node class
    static class Node{
        int data;
        Node left;
        Node right;

        //Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;

        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
         if(nodes[idx]==-1){
            return null;
         }  
        Node newNode=new Node(nodes[idx]); 
        newNode.left=buildTree(nodes);
        newNode.right=buildTree(nodes);
        return newNode;

        }
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.println(root.data); 

    }
}*/

// Preorder traversal.
//  public class trees {
//     // node class
//     static class Node{
//         int data;
//         Node left;
//         Node right;

//         Node(int data){
//             this.data=data;
//             this.left=null;
//             this.right=null;

//         }
//     }
//     static class BinaryTree{
//         static int idx=-1;
//         public static Node buildTree(int nodes[]){
//             idx++;
//          if(nodes[idx]==-1){
//             return null;
//         // }  
//         Node newNode=new Node(nodes[idx]); 
//         newNode.left=buildTree(nodes);
//         newNode.right=buildTree(nodes);
//         return newNode;

//         }
//     }
//     public static void preorder(Node root){
//         if(root==null){
//             return;
//         }
//       System.out.print(root.data+" ");
//       preorder(root.left);
//       preorder(root.right);  
//     }
//     public static void main(String[] args) {
//         int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//         BinaryTree tree=new BinaryTree();
//         Node root=tree.buildTree(nodes);
//         System.out.println(root.data); 
//         preorder(root);

//     }
// }

//Both traversal.
/*import java.util.*;
 public class trees {
    // node class
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;

        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
         if(nodes[idx]==-1){
            return null;
         }  
        Node newNode=new Node(nodes[idx]); 
        newNode.left=buildTree(nodes);
        newNode.right=buildTree(nodes);
        return newNode;

        }
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
      System.out.print(root.data+" ");
      preorder(root.left);
      preorder(root.right);  
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
     inorder(root.left);
     System.out.print(root.data+" ");
     inorder(root.right);

    }
    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    // level order.
    public static void  levelOrder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");;
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
    }
    //count of node.
    public static int countOfNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftNodes=countOfNodes(root.left);
        int rightNodes=countOfNodes(root.right);
        return leftNodes+rightNodes+1;

    }
    // sum of nodes.
    public static int sumOfNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftSum=sumOfNodes(root.left);
        int rightSum=sumOfNodes(root.right);
        return leftSum+rightSum+root.data;
    }

    //height of tree.
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        return Math.max(leftHeight,rightHeight)+1;
    }
    //diameter of tree. O(n^2)
    public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int leftDiameter=diameter(root.left);
        int rightDiameter=diameter(root.right);
        int dia=height(root.left)+height(root.right)+1;
        return Math.max(dia,Math.max(leftDiameter,rightDiameter));

    }
    //diameter of tree O(n).
    static class Info{
        int ht;
        int dia;
        Info(int ht,int dia){
            this.ht=ht;
            this.dia=dia;
        }
        public static Info diameter2(Node root){
            if(root==null){
                return new Info(0,0);
            }
            Info leftInfo=diameter2(root.left);
            Info rightInfo=diameter2(root.right);

           int myHeight=Math.max(leftInfo.ht,rightInfo.ht)+1;
           int diam1=leftInfo.dia;
           int diam2=rightInfo.dia;
           int diam3=leftInfo.ht+rightInfo.ht+1;
           int mydiam=Math.max(Math.max(diam1,diam2),diam3);
           Info myInfo=new Info(myHeight,mydiam);
           return myInfo;

        }
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.println(root.data);
        
        System.out.print("Inorder traversal:");
        inorder(root);
        System.out.println();

        System.out.print("Preorder traversal:");
        preorder(root);
        System.out.println();

        System.out.print("Postorder traversal:"); 
        postorder(root);
        System.out.println();

        System.out.println("level order traversal:");
        levelOrder(root);
       // System.out.println();

        System.out.print("count of nodes:");
       System.out.println(countOfNodes(root));

       System.out.print("sum of nodes:");
       System.out.println(sumOfNodes(root));

       System.out.print("Height of tree:");
       System.out.println(height(root));

       System.out.print("Diameter of tree:");
       System.out.println(diameter(root));

         System.out.print("Diameter of tree:");
         System.out.println(Info.diameter2(root).dia);
         
    }
} */
//build binary tree.
/*public class trees{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;  
        }
        if(root.data>val){
            root.left=insert(root.left,val);
        }else{
            root.right=insert(root.right,val);
        }
        return root;
    } 
    public static void inorder(Node root){
        if(root==null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static boolean search(Node root,int key){ // O(H)
        if(root==null){
            return false;
        }
        if(root.data>key){
            return search(root.left, key);
        }
        if(root.data<key){
            return search(root.right,key);
        }
        return true;
    }

    /// delete node
    public static Node delete(Node root,int val){
     if(root==null){
        return null;
     }   
        if(root.data>val){
            root.left=delete(root.left,val);        
        }else if(root.data<val){
            root.right=delete(root.right,val);  
        }else{
            //case 1.
            if(root.left==null && root.right==null){
                return null;
            }
            //case 2.
            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }
            //case 3.
            Node IS=root.right;
            while(IS.left!=null){
                IS=IS.left;
            }
            root.data=IS.data;
            root.right=delete(root.right,IS.data);
        }
        return root;
    }

    //print in range x=6 to y=10. O(h)
    public static void printInRange(Node root,int x,int y){
        if(root==null){
            return;
        }
        if(root.data>=x && root.data<=y){
            printInRange(root.left,x,y);
            System.out.print(root.data+" ");
            printInRange(root.right,x,y); 
        }else{
            if(root.data>=y){
                printInRange(root.left,x,y);
            }
            else{
                printInRange(root.right,x,y);
            }
        }
    }

    /// root to leaf paths.
    public static void pathPath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println();
    }
    public static void printRoot2Leaf(Node root,ArrayList<Integer> path){
        if(root==null){
            return;
        }
        path.add(root.data);

        if(root.left==null && root.right==null){
            pathPath(path);
        }else{
            printRoot2Leaf(root.left,path);
            printRoot2Leaf(root.right,path);
        }
        path.remove(path.size()-1);

    }
public static void main(String[] args) {
    int values[]={8,5,3,1,4,6,10,11,14};
   Node root=null;
   for(int i=0;i<values.length;i++){
    root=insert(root,values[i]);
   }

   inorder(root);
   System.out.println();

//    if(search(root, 1)){
//     System.out.print("found");
//    }else{
//     System.out.print("not found");
//    }
    // root=delete(root,3);
    // inorder(root);
    System.out.print("range 6 to 10:"+"");
    printInRange(root,6,10);

    printRoot2Leaf(root, new ArrayList<>());
}
}*/

// import java.util.*;

// // Class definition for binary tree node
// class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;

//     // Constructor
//     TreeNode(int val) {
//         this.val = val;
//         this.left = null;
//         this.right = null;
//     }
// }

// // Class containing the method
// class Solution {
//     // Function to find the maximum width of binary tree
//     public int widthOfBinaryTree(TreeNode root) {

//         // If the root is null, return 0
//         if (root == null)
//             return 0;

//         // Initialize max width
//         int maxWidth = 0;

//         // Queue to store node and its index
//         Queue<Pair<TreeNode, Integer>> q = new LinkedList<>();

//         // Push root with index 0
//         q.offer(new Pair<>(root, 0));

//         // BFS traversal
//         while (!q.isEmpty()) {

//             // Get size of current level
//             int size = q.size();

//             // Get the minimum index at this level
//             int minIndex = q.peek().getValue();

//             // Variables to store first and last index
//             int first = 0, last = 0;

//             // Traverse all nodes in this level
//             for (int i = 0; i < size; i++) {

//                 // Get current node and index
//                 Pair<TreeNode, Integer> p = q.poll();
//                 TreeNode node = p.getKey();
//                 int currIndex = p.getValue() - minIndex;

//                 // Update first index
//                 if (i == 0)
//                     first = currIndex;

//                 // Update last index
//                 if (i == size - 1)
//                     last = currIndex;

//                 // Push left child if exists
//                 if (node.left != null)
//                     q.offer(new Pair<>(node.left, 
//                         2 * currIndex + 1));

//                 // Push right child if exists
//                 if (node.right != null)
//                     q.offer(new Pair<>(node.right, 
//                         2 * currIndex + 2));
//             }

//             // Update maximum width
//             maxWidth = Math.max(maxWidth, last - first + 1);
//         }

//         // Return the final result
//         return maxWidth;
//     }
// }

// // Driver class
// public class trees {
//     public static void main(String[] args) {

//         // Create the tree
//         TreeNode root = new TreeNode(1);
//         root.left = new TreeNode(3);
//         root.right = new TreeNode(2);
//         root.left.left = new TreeNode(5);
//         root.left.right = new TreeNode(3);
//         root.right.right = new TreeNode(9);

//         // Create solution object
//         Solution sol = new Solution();

//         // Call the function and print result
//         System.out.println("Maximum width: " + 
//             sol.widthOfBinaryTree(root));
//     }
// }

// public class trees{
//     void printTT(int n,int[] a,int i){
//         if(i>=n){
//             printArray(a,n);
//             return;
//         }
//         a[i]=0
//         printTT(n,a,i+1);
//         a[i]=1;
//         printTT(n,a,i+1);
//     }
//     public static void main(String[] args){
//         // for(int i=0;i<=1;i++){
//         //     for(int j=0;j<=1;j++){
//         //         System.out.println(i+" "+j);
//         //     }
//         // }
//     }
// }

/*235. Lowest Common Ancestor of a Binary
Search Tree */
/*import java.util.*;
public class trees{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node LCA(Node root,int n1,int n2){
        if(root==null){
            return null;
        }
        if(root.data>n1 && root.data>n2){
            return LCA(root.left,n1,n2);
        }
        if(root.data<n1 && root.data<n2){
            return LCA(root.right,n1,n2);
        }
        return root;
    }
}*/
/*1008. Construct Binary Search Tree from
Preorder Traversal */
/*import java.util.*;
public class trees{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
        public static Node buildBST(int[] preorder, int start, int end) {
            if (start > end) {
                return null;
            }

            Node root = new Node(preorder[start]);
            int i;
            for (i = start + 1; i <= end; i++) {
                if (preorder[i] > root.data) {
                    break;
                }
            }

            root.left = buildBST(preorder, start + 1, i - 1);
            root.right = buildBST(preorder, i, end);

            return root;
        }
        public static Node bstFromPreorder(int[] preorder) {
            if (preorder == null || preorder.length == 0) {
                return null;
            }
            return buildBST(preorder, 0, preorder.length - 1);
        }
    }
}*/
/*1373. Maximum Sum BST in Binary Tree */
/*public class trees{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }

    }
    public static class Info {
        int min;
        int max;
        int sum;
        boolean isBST;

        Info(int min, int max, int sum, boolean isBST) {
            this.min = min;
            this.max = max;
            this.sum = sum;
            this.isBST = isBST;
        }
    }
    public static Info maxSumHelper(Node root, int[] maxSum) {
        if (root == null) {
            return new Info(Integer.MAX_VALUE, Integer.MIN_VALUE, 0, true);
        }

        Info leftInfo = maxSumHelper(root.left, maxSum);
        Info rightInfo = maxSumHelper(root.right, maxSum);

        if (leftInfo.isBST && rightInfo.isBST && root.data > leftInfo.max && root.data < rightInfo.min) {
            int sum = leftInfo.sum + rightInfo.sum + root.data;
            maxSum[0] = Math.max(maxSum[0], sum);
            return new Info(Math.min(root.data, leftInfo.min), Math.max(root.data, rightInfo.max), sum, true);
        } else {
            return new Info(0, 0, 0, false);
        }
    }

    public static int maxSumBST(Node root) {
        int[] maxSum = new int[1]; // Array to store the maximum sum
        maxSumHelper(root, maxSum);
        return maxSum[0];
    }
}*/

/*173. Binary Search Tree Iterator */
import java.util.*;
public class trees{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static class BSTIterator {
        private Stack<Node> stack;

        public BSTIterator(Node root) {
            stack = new Stack<>();
            pushLeft(root);
        }

        private void pushLeft(Node node) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
        }

        public int next() {
            Node nextNode = stack.pop();
            pushLeft(nextNode.right);
            return nextNode.data;
        }

        public boolean hasNext() {
            return !stack.isEmpty();
        }
    }
}