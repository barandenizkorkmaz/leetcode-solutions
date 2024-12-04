package graph;

import java.util.*;

public class _695_MaxAreaOfIsland {
    class Point{
        int x;
        int y;

        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public int maxAreaOfIsland(int[][] grid) {
        int numRows = grid.length;
        int numCols = grid[0].length;
        boolean[][] visited = new boolean[numRows][numCols];
        int maxArea = 0;
        for(int i = 0; i < numRows; i++){
            for(int j = 0; j < numCols; j++){
                if(!visited[i][j] && grid[i][j] == 1){
                    visited[i][j] = true;
                    int currentArea = bfs(grid, visited, i, j, numRows, numCols);
                    maxArea = Math.max(maxArea, currentArea);
                }
            }
        }
        return maxArea;
    }

    private int bfs(int[][] grid, boolean[][] visited, int i, int j, int numRows, int numCols){
        int area = 0;
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(i, j));
        area++;
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};

        while(!queue.isEmpty()){
            Point current = queue.poll();
            for(int k = 0; k < 4; k++){
                int newX = current.x + dx[k];
                int newY = current.y + dy[k];
                if(newX >= 0 && newX < numRows && newY >= 0 && newY < numCols && !visited[newX][newY] && grid[newX][newY] == 1){
                    area++;
                    visited[newX][newY] = true;
                    queue.add(new Point(newX, newY));
                }
            }
        }
        return area;
    }
}
