package com.dsa;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class BinaryTreeActivityTests {
    @Test
    public void deve_retornar_a_profundidade_da_arvore() {
        // Arrange
        BinaryTree tree = new BinaryTree();
        tree.add(200);
        tree.add(450);
        tree.add(123);
        tree.add(52);
        tree.add(133);
        tree.add(321);
        tree.add(422);
        tree.add(523);
        tree.add(36);
        tree.add(64);

        // Act
        int result = tree.maxDepth();

        // Assert
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void deve_retornar_os_nos_folha_da_arvore() {
        // Arrange
        BinaryTree tree = new BinaryTree();
        tree.add(200);
        tree.add(450);
        tree.add(123);
        tree.add(52);
        tree.add(133);
        tree.add(321);
        tree.add(422);
        tree.add(523);
        tree.add(36);
        tree.add(64);

        // Act
        String result = tree.leafNodes();

        // Assert
        assertThat(result).isEqualTo("36 64 133 422 523");
    }
}
