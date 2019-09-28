package CodilityTasks.Dominator;

import java.util.Arrays;

class GFG {

    static int mostFrequent(int arr[], int n)
    {

        // Sort the array
        Arrays.sort(arr);

        // find the max frequency using linear
        // traversal
        int max_count = 1, res = arr[0];
        int curr_count = 1;

        for (int i = 1; i < n; i++)
        {
            if (arr[i] == arr[i - 1])
                curr_count++;
            else
            {
                if (curr_count > max_count)
                {
                    max_count = curr_count;
                    res = arr[i - 1];
                }
                curr_count = 1;
            }
        }

        // If last element is most frequent
        if (curr_count > max_count)
        {
            max_count = curr_count;
            res = arr[n - 1];
        }

        return res;
    }

    // Driver program
    public static void main (String[] args) {

        int arr[] =  {3, 4, 3, 2, 3, -1, 3, 3};
        int n = arr.length;

        System.out.println(mostFrequent(arr,n));

    }
}