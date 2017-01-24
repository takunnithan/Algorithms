import javafx.geometry.Pos;
import main.trees.GeneralTree;
import main.trees.position.Position;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by takunnithan on 25-01-2017.
 */
public class TreeGenerator {

    public static void main(String[] args) {
        GeneralTree<String> generalTree = new GeneralTree<>();
        Position<String> root = generalTree.addRoot("Cars");
        Position<String> first = generalTree.createNode("BMW",root);
        Position<String> second = generalTree.createNode("Mclaren",null);
        generalTree.addChildren(root, first);
        generalTree.addChildren(root, second);

        System.out.println(generalTree.numChildren(root));
        System.out.println(generalTree.root().getElement());
        for(Position<String> child: generalTree.children(root)){
            System.out.println(generalTree.getElement(child));
        }

        System.out.println(generalTree.parent(first).getElement());

    }
}
