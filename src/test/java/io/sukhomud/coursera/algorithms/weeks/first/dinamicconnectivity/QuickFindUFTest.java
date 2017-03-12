package io.sukhomud.coursera.algorithms.weeks.first.dinamicconnectivity;

import io.sukhomud.coursera.algorithms.weeks.first.QuickFindUF;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @author Yevhen Sukhomud
 */
public class QuickFindUFTest {

    @Test
    public void union() throws Exception {
        // given
        QuickFindUF quickFindUf = new QuickFindUF(10);
        // when
        quickFindUf.union(1, 2);
        quickFindUf.union(3, 4);
        quickFindUf.union(5, 6);
        quickFindUf.union(7, 8);
        quickFindUf.union(7, 9);
        quickFindUf.union(2, 8);
        quickFindUf.union(0, 5);
        quickFindUf.union(1, 9);
        // than
        assertTrue(quickFindUf.connected(0, 5));
        assertTrue(quickFindUf.connected(0, 6));
        assertTrue(quickFindUf.connected(1, 2));
        assertTrue(quickFindUf.connected(1, 7));
        assertTrue(quickFindUf.connected(1, 8));
        assertTrue(quickFindUf.connected(1, 9));
        assertTrue(quickFindUf.connected(3, 4));
    }

}