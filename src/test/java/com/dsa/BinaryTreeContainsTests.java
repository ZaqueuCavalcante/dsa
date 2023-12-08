package com.dsa;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class BinaryTreeContainsTests {
    @Test
    public void deve_retornar_false_numa_arvore_vazia() {
        // Arrange / Act
        BinaryTree tree = new BinaryTree();

        // Assert
        assertThat(tree.contains(0)).isFalse();
    }

    @Test
    public void deve_retornar_true_numa_arvore_com_um_node() {
        // Arrange
        BinaryTree tree = new BinaryTree();
        tree.add(0);

        // Act
        boolean result = tree.contains(0);

        // Assert
        assertThat(result).isTrue();
    }

    @Test
    public void deve_retornar_false_numa_arvore_com_um_node() {
        // Arrange
        BinaryTree tree = new BinaryTree();
        tree.add(0);

        // Act
        boolean result = tree.contains(1);

        // Assert
        assertThat(result).isFalse();
    }

    @Test
    public void deve_retornar_true_numa_arvore_com_dois_nodes() {
        // Arrange
        BinaryTree tree = new BinaryTree();
        tree.add(2);
        tree.add(1);

        // Act
        boolean result = tree.contains(1);

        // Assert
        assertThat(result).isTrue();
    }

    @Test
    public void deve_retornar_false_numa_arvore_com_dois_nodes() {
        // Arrange
        BinaryTree tree = new BinaryTree();
        tree.add(2);
        tree.add(1);

        // Act
        boolean result = tree.contains(3);

        // Assert
        assertThat(result).isFalse();
    }

    @Test
    public void deve_retornar_true_numa_arvore_com_tres_nodes() {
        // Arrange
        BinaryTree tree = new BinaryTree();
        tree.add(2);
        tree.add(1);
        tree.add(3);

        // Act
        boolean result = tree.contains(3);

        // Assert
        assertThat(result).isTrue();
    }

    @Test
    public void deve_retornar_false_numa_arvore_com_tres_nodes() {
        // Arrange
        BinaryTree tree = new BinaryTree();
        tree.add(2);
        tree.add(1);
        tree.add(3);

        // Act
        boolean result = tree.contains(4);

        // Assert
        assertThat(result).isFalse();
    }

    @Test
    public void deve_retornar_true_numa_arvore_com_quatro_nodes() {
        // Arrange
        BinaryTree tree = new BinaryTree();
        tree.add(2);
        tree.add(1);
        tree.add(3);
        tree.add(0);

        // Act
        boolean result = tree.contains(0);

        // Assert
        assertThat(result).isTrue();
    }

    @Test
    public void deve_retornar_false_numa_arvore_com_quatro_nodes() {
        // Arrange
        BinaryTree tree = new BinaryTree();
        tree.add(2);
        tree.add(1);
        tree.add(3);
        tree.add(0);

        // Act
        boolean result = tree.contains(4);

        // Assert
        assertThat(result).isFalse();
    }
}
