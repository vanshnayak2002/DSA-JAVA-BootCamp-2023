/*package BinaryTrees;

public class MAX_MIN {

    public static int findMax(Node root) {
            if (root == null)
                return Integer.MIN_VALUE;
            int res = root.data;
            int rres = findMax(root.right);
            int lres = findMax(root.left);
            if (lres > res)
                res = lres;
            if (rres > res)
                res = rres;

            return res;
        }

        public static int findMin(Node root) {
            if (root == null)
                return Integer.MAX_VALUE;
            int res = root.data;
            int rres = findMin(root.right);
            int lres = findMin(root.left);
            if (rres < res)
                res = rres;
            if (res > lres)
                res = lres;

            return res;
        }
    }
*/