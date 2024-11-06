import java.util.Scanner;

public class Problem500A {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int cells = input.nextInt();
		int goal = input.nextInt() - 1;
		int[] connections = new int[cells - 1];
		for (int i = 0; i < connections.length; i++)
			connections[i] = input.nextInt() + i;
		int position = 0;
		while (position < goal)
			position = connections[position];
		System.out.println((position == goal) ? "YES" : "NO");
	}

}
