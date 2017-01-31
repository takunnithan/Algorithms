import main.trees.GeneralTree;
import main.trees.binarytree.LinkedBinaryTree;
import main.trees.position.Position;
import sun.awt.image.ImageWatched;

/**
 * Created by takunnithan on 25-01-2017.
 */
public class TreeGenerator {

    public static void main(String[] args) {

        // General Tree traversal

        GeneralTree<String> generalTree = new GeneralTree<>();
        Position<String> root = generalTree.addRoot("Cars");
        Position<String> bmw = generalTree.createNode("BMW",root);
        Position<String> mcLaren = generalTree.createNode("McLaren",null);
        Position<String> m3 = generalTree.createNode("M3", bmw);
        Position<String> m4 = generalTree.createNode("M4", bmw);
        Position<String> p1 = generalTree.createNode("P1", mcLaren);
        generalTree.addChildren(root, bmw);
        generalTree.addChildren(root, mcLaren);
        generalTree.addChildren(bmw,m3);
        generalTree.addChildren(bmw,m4);
        generalTree.addChildren(mcLaren,p1);

        // Post Order Traversal
        System.out.println("------------------POST-ORDER-TRAVERSAL-----------------------");
        for(Position<String> p:generalTree.postorder()){
            System.out.println(p.getElement());
        }

        // Pre order traversal
        System.out.println("---------------------PRE-ORDER-TRAVERSAL--------------------");
        for(Position<String> p:generalTree.preorder()){
            System.out.println(p.getElement());
        }

        // Breadth First traversal
        System.out.println("---------------------BREADTH-FIRST-TRAVERSAL--------------------");
        for(Position<String> p:generalTree.breadthFirst()){
            System.out.println(p.getElement());
        }


        // Binary Tree Traversal

        LinkedBinaryTree<String> binaryTree = new LinkedBinaryTree<>();
        Position<String> binaryRoot = binaryTree.addRoot("Cars");
        Position<String> binaryBmw = binaryTree.addLeft(binaryRoot, "BMW");
        Position<String> binaryMcLaren = binaryTree.addRight(binaryRoot, "McLaren");
        binaryTree.addLeft(binaryBmw, "M3");
        binaryTree.addRight(binaryBmw, "M4");
        binaryTree.addLeft(binaryMcLaren, "P1");

        // In order traversal
        System.out.println("---------------------In-Order-TRAVERSAL--------------------");
        for(Position<String> p:binaryTree.inorderTraversal()){
            System.out.println(p.getElement());
        }

    }
}
