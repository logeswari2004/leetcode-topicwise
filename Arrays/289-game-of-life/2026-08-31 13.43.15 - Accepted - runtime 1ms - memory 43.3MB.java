class Solution {

    public void gameOfLife(int[][] board) {

        int m = board.length;
        int n = board[0].length;

        int[][] dirs = {
            {-1,-1}, {-1,0}, {-1,1},
            {0,-1},          {0,1},
            {1,-1},  {1,0},  {1,1}
        };

        // First pass: mark transitions
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {

                int liveNeighbors = 0;

                for (int[] dir : dirs) {

                    int nr = row + dir[0];
                    int nc = col + dir[1];

                    if (nr >= 0 && nr < m &&
                        nc >= 0 && nc < n &&
                        Math.abs(board[nr][nc]) == 1) {
                        liveNeighbors++;
                    }
                }

                if (board[row][col] == 1) {

                    if (liveNeighbors < 2 ||
                        liveNeighbors > 3) {
                        board[row][col] = -1;
                    }

                } else {

                    if (liveNeighbors == 3) {
                        board[row][col] = 2;
                    }
                }
            }
        }

        // Second pass: finalize states
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {

                if (board[row][col] > 0) {
                    board[row][col] = 1;
                } else {
                    board[row][col] = 0;
                }
            }
        }
    }
}