package io.sukhomud.coursera.algorithms.weeks.first;

/**
 * @author Yevhen Sukhomud
 */
public class WeightedQuickUnion {

    private int[] id;
    private int[] sizes;

    public WeightedQuickUnion(int n) {
        id = new int[n];
        sizes = new int[n];
        for (int i = 0; i < id.length; i++)
            id[i] = i;
    }

    public void union(int p, int q) {
        int pRoot = root(p);
        int qRoot = root(q);
        if (pRoot != qRoot) {
            if (sizes[pRoot] < sizes[qRoot]) {
                id[pRoot] = qRoot;
                sizes[qRoot] =+ sizes[pRoot];
            } else {
                id[qRoot] = pRoot;
                sizes[pRoot] =+ sizes[qRoot];
            }
        }
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    private int root(int i) {
        while (id[i] != i) {
            i = id[i];
        }
        return i;
    }

}
