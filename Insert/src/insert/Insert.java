package insert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Insert 
{
    static BigInteger[] facts = new BigInteger[101];
    
    public static class Node
    {
        private int leftChildren;
        private int rightChildren;
        private Node left;
        private Node right;
        final private int value;
        
        public Node(int val)
        {
            value = val;
            leftChildren = 0;
            rightChildren = 0;
            left = null;
            right = null;
        }
        
        public void insert(Node node)
        {
            if(node.value < value)
            {
                leftChildren++;
                
                if(left != null)
                {
                    left.insert(node);
                }else
                {
                    left = node;
                }
            }else
            {
                rightChildren++;
                
                if(right != null)
                {
                    right.insert(node);
                }else
                {
                    right = node;
                }
            }
        }
    }
    
    public static BigInteger solve(Node root)
    {
        if(root == null)
            return new BigInteger("1");
                
        BigInteger comb = facts[root.leftChildren + root.rightChildren].divide(facts[root.leftChildren].multiply(facts[root.rightChildren]));
        BigInteger left = solve(root.left);
        comb = comb.multiply(solve(root.left));
        comb = comb.multiply(solve(root.right));
              
        return comb;
    }     
   
    public static void main(String[] args) throws IOException 
    {
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       
       facts[0] = new BigInteger("1");
       
       for(int i = 1; i <= 100; i++)
       {
           facts[i] = facts[i - 1].multiply(new BigInteger(Integer.toString(i)));
       }
       
       while(true)
       {
           
           int treeSize = Integer.parseInt(input.readLine());
           
           if(treeSize == 0)
               break;
           
           String[] values = input.readLine().split(" ");
           
           Node root = new Node(Integer.parseInt(values[0]));
           
           for(int i = 1; i < treeSize; i++)
           {
               root.insert(new Node(Integer.parseInt(values[i])));
           }
           
           BigInteger solution = solve(root);
           System.out.println(solution);
       }
    }
}
