class NQueen{
        static int N=4;
        static boolean isSafe(int board[][],int r,int c) {
                for(int i=0;i<c;i++)
                        if(board[r][i]==1) return false;
                for(int i=r,j=c;i>=0 && j>=0;i--,j--)
                        if(board[i][j]==1) return false;
                for (int i=r,j=c;i<N && j>=0;i++,j--)
                        if (board [i][j]==1) return false;
                return true;


        }
        static boolean solve (int board[][],int col) {
                if (col==N) return true;
                for (int i=0;i<N;i++) {
                         if (isSafe(board,i,col)) {
                                        board[i][col] =1;
                                        if(solve(board,col+1))
                                                return true;
                                        board[i][col]=0;

                                }
                        }
                        return false;
                }
                public static void main(String[] args) {
                        int board[][] =new int [N][N];
                        if (solve (board,0)) {
                                for (int i=0;i<N;i++) {
                                        for(int j=0;j<N;j++)
                                                System.out.println(board[i][j]+ "");
                                        System.out.println();

                                }
                        } else {
                                System.out.println("No Solution");
                        }
                }
        }

