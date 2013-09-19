public class snakeDraft {


	public static void main(String[] args) {
		int c = 2;
		int r = 3;
		int[] a = {1, 2, 3, 4, 5, 6};
		
		rectang(a, 2, 3);
	}
	
	

	public static void print(int[][] a) {
		for (int r=0; r<a.length; r++) {
			for (int c=0; c<a[r].length; c++) {
				System.out.print(a[r][c] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] snake(int players, int rounds) {
		int player = 1;
		int[][] draft = new int[players][rounds];
		for (int r=0; r<draft.length; r++) {
			if (r%2==0) {
				for (int c=0; c<draft[r].length; c++) {
					draft[r][c] = r*draft[r].length + c + 1;
					player++;
				}
				} else {
				
				for (int c=0; c<draft[r].length; c++) {
					draft[r][c] = r*draft[r].length*2 - c;
					player ++;
				}			 
				}
			
		
	}
		
		return draft;
	}
	
	public static int[][] rectang(int[] a, int rows, int cols) {
		int[][] rectang = new int[rows][cols];
		int pos = 0;
		for (int r=0; r<rectang.length; r++) {
			for (int c=0; c<rectang[r].length; c++) {
				rectang[r][c] = a[pos];
				pos++;
				System.out.print(rectang[r][c] + " ");
			}
			
			System.out.println();
		}
		
		return rectang; 
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
