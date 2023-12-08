package com.dsa;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class BinaryTreeAddTests {
    @Test
    public void a_arvore_deve_iniciar_vazia() {
        // Arrange / Act
        BinaryTree tree = new BinaryTree();

        // Assert
        assertThat(tree.root).isNull();
    }

    @Test
    public void deve_adicionar_um_numero_na_arvore() {
        // Arrange
        BinaryTree tree = new BinaryTree();

        // Act
        tree.add(0);

        // Assert
        assertThat(tree.root.value).isEqualTo(0);
    }

    @Test
    public void deve_adicionar_dois_numeros_na_arvore() {
        // Arrange
        BinaryTree tree = new BinaryTree();

        // Act
        tree.add(0);
        tree.add(1);

        // Assert
        assertThat(tree.root.value).isEqualTo(0);
        assertThat(tree.root.right.value).isEqualTo(1);
    }

    @Test
    public void deve_adicionar_tres_numeros_na_arvore() {
        // Arrange
        BinaryTree tree = new BinaryTree();

        // Act
        tree.add(2);
        tree.add(1);
        tree.add(3);

        // Assert
        assertThat(tree.root.value).isEqualTo(2);
        assertThat(tree.root.left.value).isEqualTo(1);
        assertThat(tree.root.right.value).isEqualTo(3);
    }

    @Test
    public void deve_adicionar_quatro_numeros_na_arvore() {
        // Arrange
        BinaryTree tree = new BinaryTree();

        // Act
        tree.add(2);
        tree.add(1);
        tree.add(3);
        tree.add(0);

        // Assert
        assertThat(tree.root.value).isEqualTo(2);
        assertThat(tree.root.left.value).isEqualTo(1);
        assertThat(tree.root.right.value).isEqualTo(3);
        assertThat(tree.root.left.left.value).isEqualTo(0);
    }
}
