package com.dsa;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class StackTests {
    @Test
    public void deve_adicionar_os_dados_na_pilha() {
        // Arrange
        Stack stack = new Stack(6);

        // Act
        stack.push(64);
        stack.push(25);
        stack.push(12);
        stack.push(22);
        stack.push(11);
        stack.push(9);

        // Assert
        assertThat(stack.isFull()).isTrue();
        assertThat(stack.peek()).isEqualTo(9);

        assertThat(stack.pop()).isEqualTo(9);
        assertThat(stack.pop()).isEqualTo(11);
        assertThat(stack.pop()).isEqualTo(22);
        assertThat(stack.pop()).isEqualTo(12);
        assertThat(stack.pop()).isEqualTo(25);
        assertThat(stack.pop()).isEqualTo(64);

        assertThat(stack.isEmpty()).isTrue();
    }
}
