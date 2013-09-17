public class Multi {
	//sumRow(n)
	//sumCol
	//sum total
	//reversrow
	//revorse col
	//determinte

	public static void main(String[] args) {
		int n = 3;
		int[][] a = {	{1,2,3,4,5},
						{6,7,8,9,10},
						{11,12,13,14,15} };

	}

	public void print(int[][] a) {
		for (int r=0; r<a.length; r++) {
			for (int c=0; c<a[r].length; c++) {
				System.out.print(a[r][c] + " ");
			}
			System.out.println();
		}
	}

	public static int[] snakeDraft(int players, int rounds) {
		int[][] draft = new int[players[rounds]];
		for (int r=0; r<players; r++) {
			for (int c=0; ; ) {
				
			}
		}
	}

	public static int sumRow(int[][] a, int n) {
		int sum=0;
		if (n>a.length) {
			System.out.println("Please enter a valid value");
		} else {
			for (int c=0; c<a[n].length; c++) {
				sum += a[n][c];
			}
			System.out.println(sum);
		}

		return sum;
	}

	public static int sumCol(int[][] a, int r) {
		int sum=0;
		for (int i=0; i<a.length; i++) {
			sum += a[i][r];
		}
		System.out.println(sum);
		return sum;
	}

	public static int sumTot(int[][] a){
		int sum=0;
		for (int r=0; r<a.length; r++) {
			for (int c=0; c<a[r].length; c++) {
				sum += a[r][c];
			}
		}

		System.out.println(sum);
		return sum;
	}

	public static int[] revRow(int[][] a,int r) {
		int[] rev = new int[a[r].length];
		for (int i=a[r].length; i>-1; i--) {
			rev[a[r].length-i] = a[r][i];
			System.out.println(a[r][i]);
		}

		return rev;
	}
}






























