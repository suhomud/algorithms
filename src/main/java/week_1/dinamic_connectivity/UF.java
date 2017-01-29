package week_1.dinamic_connectivity;

/**
 * @author Yevhen Sukhomud
 */
public class UF {

    public int[] id;

    public UF(int n) {
        id = new int[n];
        for (int i = 0; i < id.length; i++) {
            id[i] = i;
        }
    }

    public void union(int p, int q) {
        int from = id[p];
        int to = id[q];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == from) {
                id[i] = to;
            }
        }
    }


    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

}
