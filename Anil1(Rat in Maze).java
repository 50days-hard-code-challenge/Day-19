
public class Solution {

	public static boolean ratInAMaze(int maze[][]){

		/*Your class should be named Solution. 
		*Don't write main().
	 	*Don't take input, it is passed as function argument.
	 	*Don't print output.
	 	*Taking input and printing output is handled automatically.
		*/ 
		int n = maze.length;
      int[][] path = new int[n][n];
	  return solvemaze(maze,0,0,path);
	}
	public static boolean solvemaze(int[][] maze,int i, int j, int[][] path){
		// Check if i,j cell is valid or not 
		// if cell is blocked i.e maze[i][j] == 0 then just return false
		// if path is the part then path[i][j] = 1 then just return false
		int n = maze.length;
		if(i<0 || i>=n || j<0 || j>=n || maze[i][j] == 0 || path[i][j] == 1 ){
			return false;
		}
		// Include the cell in current path
		path[i][j] = 1;
		// Destination cell
		if(i == n-1 && j == n-1){
			return true;
		}

		// Explore further in all direction
		//top
		if(solvemaze(maze, i-1, j, path)){
			return true;
		}
		// right 
		if(solvemaze(maze, i, j+1, path)){
			return true;
		}
		// Down
		if(solvemaze(maze, i+1, j, path)){
			return true;
		}
		// Left
		if(solvemaze(maze, i, j-1, path)){
			return true;
		}
		return false;
	}
}
