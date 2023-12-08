package com.dsa;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class QueueTests {
    @Test
    public void deve_adicionar_os_dados_na_fila() {
        // Arrange
        Queue queue = new Queue(6);

        // Act
        queue.enqueue(64);
        queue.enqueue(25);
        queue.enqueue(12);
        queue.enqueue(22);
        queue.enqueue(11);
        queue.enqueue(9);

        // Assert
        assertThat(queue.isFull()).isTrue();

        assertThat(queue.dequeue()).isEqualTo(64);
        assertThat(queue.dequeue()).isEqualTo(25);
        assertThat(queue.dequeue()).isEqualTo(12);
        assertThat(queue.dequeue()).isEqualTo(22);
        assertThat(queue.dequeue()).isEqualTo(11);
        assertThat(queue.dequeue()).isEqualTo(9);

        assertThat(queue.isEmpty()).isTrue();
    }
}
