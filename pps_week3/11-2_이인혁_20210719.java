package week3;

// 11_2
/*
public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int[][] visited = new int[image.length][image[0].length];
    	
	     Stack<Integer> stack = new Stack<>();
	     int preColor = image[sr][sc];
	     stack.push(sr);
	     stack.push(sc);
	     while(!stack.isEmpty()) {
	    	 int y = stack.pop();
	    	 int x = stack.pop();
	    	 
	    	 // 상 
	    	 if(x-1>=0 && visited[x-1][y] == 0 && image[x-1][y] == preColor) {
	    		 stack.push(x-1);
	    		 stack.push(y);
	    		 visited[x-1][y] = 1;
	    	 }
	    	 // 우
	    	 if(y+1<image[0].length && visited[x][y+1] == 0 && image[x][y+1] == preColor) {
	    		 stack.push(x);
	    		 stack.push(y+1);
	    		 visited[x][y+1] = 1;
	    	 }
	    	 // 하
	    	 if(x+1<image.length && visited[x+1][y] == 0 &&image[x+1][y] == preColor) {
	    		 stack.push(x+1);
	    		 stack.push(y);
	    		 visited[x+1][y] = 1;
	    	 }
	    	 // 좌
	    	 if(y-1>=0 && visited[x][y-1] == 0 && image[x][y-1] == preColor) {
	    		 stack.push(x);
	    		 stack.push(y-1);
	    		 visited[x][y-1]= 1;
	    	 }
	    	 
	    	 //현재 값 newColor 값으로 변경 
	    	 image[x][y] = newColor;
	     }
	     return image;
    }
}*/