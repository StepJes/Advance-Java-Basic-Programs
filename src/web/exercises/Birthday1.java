package web.exercises;

public class Birthday1 {
	public static void main(String[] args)

	{
//Reverse an Array
	/*	int arr[] = new int[] { 4, 7, 3, 6, 5, 8, 9, 5, 4, 5 };

		printArray(arr);
		reverseArray(arr);
		System.out.println();
		printArray(arr);

	}

	public static void reverseArray(int[] arr) {
		int l = arr.length - 1;
		int h = l / 2;
		for (int i = 0; i < h; i++) {
			int temp = arr[i];
			arr[i] = arr[l - i];
			arr[l - i] = temp;

		}
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		*/
		
		int CARDS_PER_PLAYER = 5;

        // number of players
        int PLAYERS = Integer.parseInt(args[0]);

        String[] SUITS = {
            "Clubs", "Diamonds", "Hearts", "Spades"
        };

        String[] RANKS = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King", "Ace"
        };

  	int n = SUITS.length * RANKS.length;

        if (CARDS_PER_PLAYER * PLAYERS > n)
            throw new RuntimeException("Too many players");


        // initialize deck
        String[] deck = new String[n];
        for (int i = 0; i < RANKS.length; i++) {
            for (int j = 0; j < SUITS.length; j++) {
                deck[SUITS.length*i + j] = RANKS[i] + " of " + SUITS[j];
            }
        }

        // shuffle
        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n-i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }

        // print shuffled deck
        for (int i = 0; i < PLAYERS * CARDS_PER_PLAYER; i++) {
            System.out.println(deck[i]);
            if (i % CARDS_PER_PLAYER == CARDS_PER_PLAYER - 1)
                System.out.println();
        }
		
		
		
	}
}
