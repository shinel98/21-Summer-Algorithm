package week3;

public class IslandPerimeter {

	public static void main11_1(String[] args) {
		int[][] arr =  {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
		int count;
		Solution4 sl = new Solution4();
		count = sl.islandPerimeter(arr);
		System.out.println(count);
	}

}
class Solution4 {
	
    public int islandPerimeter(int[][] grid) {
        /*
            주어진 grid 주변에 0을 다 넣어준다  
            cell 하나씩 접근하면서 만약 cell의 값이 1이면 좌, 우, 상, 하 체크 , 
            for(int i=0; i<grid[].length)
            좌우상하가 0이면 count++
        */
    	int count=0;
    	
    	
    	int row = grid.length;
    	int col = grid[0].length;
    	
    	int[][] new_grid = new int[row+2][col+2];
    	
    	int newrow = new_grid.length;
    	int newcol = new_grid[0].length;
    	
    	
    	for(int i=1; i<newrow-1; i++) {
    		for(int j=1; j<newcol-1; j++) {
    			new_grid[i][j] = grid[i-1][j-1];
    		}
    	}
  
    	for(int i=0; i<newrow; i++) {
    		for(int j=0; j<newcol; j++) {
    			if(new_grid[i][j] == 1) {
    				count += checkPerimeter(new_grid, i, j);
    			}
    		}
    	}
    	return count;
    	
    }

    public int checkPerimeter(int[][] grid, int i, int j) {
    	int count=0;
    	if(grid[i-1][j] == 0)
    		count++;
    	if(grid[i][j-1] == 0)
    		count++;
    	if(grid[i][j+1] == 0)
    		count++;
    	if(grid[i+1][j] == 0)
    		count++;
    	return count;
    }
}	



