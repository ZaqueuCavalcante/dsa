package com.dsa;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class BinaryTreeTraverseInOrderTests {
    @Test
    public void deve_retornar_vazio_pra_arvore_vazia() {
        // Arrange / Act
        BinaryTree tree = new BinaryTree();

        // Assert
        assertThat(tree.traverseInOrder()).isEqualTo("");
    }

    @Test
    public void deve_retornar_o_no_raiz() {
        // Arrange
        BinaryTree tree = new BinaryTree();
        tree.add(0);

        // Act
        String result = tree.traverseInOrder();

        // Assert
        assertThat(result).isEqualTo("0");
    }

    @Test
    public void deve_retornar_dois_nos() {
        // Arrange
        BinaryTree tree = new BinaryTree();
        tree.add(0);
        tree.add(1);

        // Act
        String result = tree.traverseInOrder();

        // Assert
        assertThat(result).isEqualTo("0 1");
    }

    @Test
    public void deve_retornar_tres_nos() {
        // Arrange
        BinaryTree tree = new BinaryTree();
        tree.add(2);
        tree.add(1);
        tree.add(3);

        // Act
        String result = tree.traverseInOrder();

        // Assert
        assertThat(result).isEqualTo("1 2 3");
    }

    @Test
    public void deve_retornar_quatro_nos() {
        // Arrange
        BinaryTree tree = new BinaryTree();
        tree.add(2);
        tree.add(1);
        tree.add(3);
        tree.add(0);

        // Act
        String result = tree.traverseInOrder();

        // Assert
        assertThat(result).isEqualTo("0 1 2 3");
    }

    @Test
    public void deve_retornar_sete_nos() {
        // Arrange
        BinaryTree tree = new BinaryTree();
        tree.add(6);
        tree.add(8);
        tree.add(4);
        tree.add(3);
        tree.add(2);
        tree.add(5);
        tree.add(7);

        // Act
        String result = tree.traverseInOrder();

        // Assert
        assertThat(result).isEqualTo("2 3 4 5 6 7 8");
    }
}
