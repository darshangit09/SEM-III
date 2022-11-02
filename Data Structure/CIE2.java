// INSERT 72 27 36 24 63 81 92 101 M=10 C1 1 C2 3

class CIE2 {

	static void printArray(int arr[])
	{

		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i] + " ");
		}
	}

	static void hashing(int table[], int tsize, int arr[],	int N)
	{

		for (int i = 0; i <N; i++) 
		{
        	int hv = arr[i] % 10;
         	if (table[hv] == -1)
			table[hv] = arr[i];
			else 
			{
             	for (int j = 0; j < tsize; j++) 
             	{
					int t = (hv + 3 * j * j + j) % 10;
					if (table[t] == -1) 
					{

						table[t] = arr[i];
						break;
					}
				}
			}
		}

		printArray(table);
	}

	public static void main(String args[])
	{
		int arr[] = { 72, 27, 36, 24, 63, 81, 92, 101};
		int N = 8;

		// Size of the hash table
		int L = 10;
		int hash_table[] = new int[L];

		// Initializing the hash table
		for (int i = 0; i < L; i++) {
			hash_table[i] = -1;
		}

		// Function call
		hashing(hash_table, L, arr, N);
 		
	}
}

