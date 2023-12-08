package com.dsa;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class BinaryTreeMaxDepthTests {
    @Test
    public void a_arvore_deve_iniciar_com_profundidade_zero() {
        // Arrange
        BinaryTree tree = new BinaryTree();

        // Act
        int result = tree.maxDepth();

        // Assert
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void deve_retornar_altura_0() {
        // Arrange
        BinaryTree tree = new BinaryTree();
        tree.add(0);

        // Act
        int result = tree.maxDepth();

        // Assert
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void deve_retornar_altura_1() {
        // Arrange
        BinaryTree tree = new BinaryTree();
        tree.add(0);
        tree.add(1);

        // Act
        int result = tree.maxDepth();

        // Assert
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void deve_retornar_altura_1_com_3_nos() {
        // Arrange
        BinaryTree tree = new BinaryTree();
        tree.add(2);
        tree.add(1);
        tree.add(3);

        // Act
        int result = tree.maxDepth();

        // Assert
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void deve_retornar_altura_2() {
        // Arrange
        BinaryTree tree = new BinaryTree();
        tree.add(2);
        tree.add(1);
        tree.add(3);
        tree.add(0);

        // Act
        int result = tree.maxDepth();

        // Assert
        assertThat(result).isEqualTo(2);
    }
}
