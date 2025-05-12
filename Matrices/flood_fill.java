class Pair {
    int row, col;
    Pair(int row, int col) {
        this.row = row;
        this.col = col;
    }
}

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
       int row = image.length, col = image[0].length;
       boolean[][] bool = new boolean[row][col];
       if (image[sr][sc] == color) return image;
       bfs(bool, image, row, col, sr, sc, color, image[sr][sc]);
       return image;
    }

    public void bfs(boolean[][] bool, int[][] image, int m, int n, int sr, int sc, int color, int value) {
        Queue<Pair> queue = new LinkedList<>();

        queue.add(new Pair(sr, sc));

        while(!queue.isEmpty()) {
            int size = queue.size();

            for(int i=0;i<size;i++) {
                Pair pair = queue.poll();
                sr = pair.row;
                sc = pair.col;
                image[sr][sc] = color;
                bool[sr][sc] = true;
                if((sr-1 > -1) && !bool[sr-1][sc] && image[sr-1][sc]==value) queue.add(new Pair(sr-1, sc));
                if((sc-1 > -1) && !bool[sr][sc-1] && image[sr][sc-1]==value) queue.add(new Pair(sr, sc-1));
                if((sr+1 < m) && !bool[sr+1][sc]  && image[sr+1][sc]==value) queue.add(new Pair(sr+1, sc));
                if((sc+1 < n) && !bool[sr][sc+1]  && image[sr][sc+1]==value) queue.add(new Pair(sr, sc+1));
            }
        }
    }

    public void dfs(boolean[][] bool, int[][] image, int m, int n, int sr, int sc, int color, int value) {
        if(sr<0 || sc < 0 || sr >= m || sc >= n || bool[sr][sc]) return;

        if(image[sr][sc] == value) {
          image[sr][sc] = color;
          bool[sr][sc] = true;

          dfs(bool, image, m, n, sr-1, sc, color, value);
          dfs(bool, image, m, n, sr, sc-1, color, value);
          dfs(bool, image, m, n, sr+1, sc, color, value);
          dfs(bool, image, m, n, sr, sc+1, color, value);
        }
    }
}


