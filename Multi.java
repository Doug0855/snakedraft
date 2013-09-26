public class Multi {


	public static void main(String[] args) {
		int c = 2;
		int r = 3;
		int[] a = {1, 2, 3, 4, 5, 6};

		print(snake(5, 3));
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
		int[][] draft = new int[rounds][players];
		for (int r=0; r<draft.length; r++) {
			if (r%2==0) {
				for (int c=0; c<draft[r].length; c++) {
					draft[r][c] = r*draft[r].length + c + 1;
					player++;
				}
				} else {

				for (int c=0; c<draft[r].length; c++) {
					draft[r][c] = r*draft[r].length*2 - c;
					player++;
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
}
