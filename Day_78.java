// User function Template for Java

class Solution {
    // Function to find a solved Sudoku.
    public static boolean isSafe(int mat[][],int i,int j, int num, int rows[], int cols[], int boxes[]){
       int boxIdx=(i/3)*3+(j/3);
       boolean rowHash=  (rows[i] & (1<<num))!=0;
       boolean colHash=  (cols[j] & (1<<num))!=0;
       boolean boxHash= (boxes [boxIdx] & (1<<num))!=0;
        return !rowHash && !colHash && !boxHash; 
    }
    static boolean solve(int [][] board, int row, int col, int rows[],int cols[], int boxes[]){
        int n= board.length;
        if(row==n-1 && col==n)
        return true;
        if(col==n){
            row++;
        col=0;
    }
    if(board[row][col]!=0){
        return solve(board, row, col+1, rows, cols, boxes);
    }
    for(int num=1;num<=n; num++){
        if(isSafe (board, row, col, num, rows, cols, boxes)) {
            int boxIdx= (row/3)*3+ col/3;
        
        board[row][col]=num;
        rows[row]|= (1<<num);
        cols[col]|=  (1<< num);
        boxes[boxIdx]|= (1<<num);
        
        if(solve(board,row,col+1,rows, cols, boxes)) return true;
        board[row][col]=0;
        rows[row]&= ~(1<<num);
        cols[col]&= ~ (1<< num);
        boxes[boxIdx]&= ~(1<<num);
         }
      }
    return false;
    }
    
     public static void solveSudoku(int[][] mat) {
        int n=mat.length;
        int rows[]= new int[n];
        int cols[]= new int[n];
        int boxes[]= new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int val =mat[i][j];
                if(val!=0){
                    int boxIdx= (i/3)*3+(j/3);
                    if(val!=0){
                        rows[i]|= (1<<val);
                        cols[j]|= (1<<val);
                        boxes[boxIdx]|=(1<<val);
                    }
                }
            }
        }
            solve (mat,0,0,rows, cols, boxes);
        }
     }
