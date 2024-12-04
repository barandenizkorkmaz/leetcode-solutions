package graph;

import java.util.*;

public class _200_NumberOfIslands {
    static class Point{
        int x;
        int y;

        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public int numIslands(char[][] grid) {
        int numRows = grid.length, numCols = grid[0].length;
        boolean[][] visited = new boolean[numRows][numCols];
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        int numIslands = 0;
        for(int i = 0; i < numRows; i++){
            for(int j = 0; j < numCols; j++){
                if(!visited[i][j] && grid[i][j] == '1'){ // Now we would like to visit all neighbors as visited!
                    numIslands++;
                    bfs(grid, visited, directions, i, j, numRows, numCols);
                }
            }
        }
        return numIslands;
    }

    private void bfs(char[][] grid, boolean[][] visited, int[][] directions, int i, int j, int numRows, int numCols){
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(i, j));
        visited[i][j] = true;
        while(!q.isEmpty()){
            Point p = q.poll();
            for(int[] direction : directions){
                int dx = direction[0], dy = direction[1];
                int newX = p.x + dx;
                int newY = p.y + dy;
                if(newX >= 0 && newX < numRows && newY >= 0 && newY < numCols && grid[newX][newY] == '1' && !visited[newX][newY]){
                    q.add(new Point(newX, newY));
                    visited[newX][newY] = true;
                }

            }
        }
    }
}
