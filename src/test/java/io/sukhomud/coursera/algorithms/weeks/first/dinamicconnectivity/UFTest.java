package io.sukhomud.coursera.algorithms.weeks.first.dinamicconnectivity;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @author Yevhen Sukhomud
 */
public class UFTest {

    @Test
    public void union() throws Exception {
        // given
        UF uf = new UF(10);
        // when
        uf.union(1, 2);
        uf.union(3, 4);
        uf.union(5, 6);
        uf.union(7, 8);
        uf.union(7, 9);
        uf.union(2, 8);
        uf.union(0, 5);
        uf.union(1, 9);
        // than
        assertTrue(uf.connected(0, 5));
        assertTrue(uf.connected(0, 6));
        assertTrue(uf.connected(1, 2));
        assertTrue(uf.connected(1, 7));
        assertTrue(uf.connected(1, 8));
        assertTrue(uf.connected(1, 9));
        assertTrue(uf.connected(3, 4));
    }

}