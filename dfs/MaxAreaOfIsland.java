class Solution {
    boolean[][] visited;
    public int area(int[][]grid, int row, int col) {
        if(row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || visited[row][col]
          || grid[row][col] == 0)
            return 0;
        visited[row][col] = true;
        return (1 + area(grid,row-1,col) + area(grid,row+1,col) + area(grid,row,col-1) + area(grid,row,col+1));
    }
    public int maxAreaOfIsland(int[][] grid) {
        int ans = 0;
        int row = grid.length;
        int col = grid[0].length;
        visited = new boolean[row][col];
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                visited[i][j] = false;
            }
        }
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                ans = Math.max(ans, area(grid, i, j));
            }
        }
        return ans;
    }
}