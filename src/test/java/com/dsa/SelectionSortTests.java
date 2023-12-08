package com.dsa;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class SelectionSortTests {
    @Test
    public void deve_ordenar_os_dados() {
        // Arrange
        int[] data = new int[] { 64, 25, 12, 22, 11, 9 };

        // Act
        int[] result = SelectionSort.run(data);

        // Assert
        assertThat(result).isEqualTo(new int[] { 9, 11, 12, 22, 25, 64 });
    }
}
