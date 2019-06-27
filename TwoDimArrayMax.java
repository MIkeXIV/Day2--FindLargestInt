
public class TwoDimArrayMax {

	public static int[][] generateArray(int len, int height)
	{
		int[][] board = new int[len][height];
		return board;
	}
	
	public static void findMax(int[][] board)
	{
		int maxSoFar = board[0][0];
		int[] highestIndex;
		highestIndex = new int [2];
		highestIndex[0] = 0;
		highestIndex[1] = 0;
		for (int row=0; row < board.length; row++)
		{
			for (int column=0; column < board[row].length; column++)  
			{
				int num = board[row][column];
				if (num > maxSoFar)
				{
					maxSoFar = num;
					highestIndex[0] = row;
					highestIndex[1] = column;
					
				}
			}
		}
        System.out.println(maxSoFar);
        System.out.print(highestIndex[0]);
        System.out.print(highestIndex[1]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] temp = generateArray(5,5);
		findMax(temp);		
	}

}
