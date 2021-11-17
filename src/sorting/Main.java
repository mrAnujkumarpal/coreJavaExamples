package sorting;

import java.util.*;
class Main
{
    // cost[] initial cost array including
    // unavailable packet W capacity of bag
    public static int MinimumCost(int cost[], int n,
                                  int W)
    {
        // val[] and wt[] arrays
        // val[] array to store cost of 'i' kg
        // packet of orange wt[] array weight of
        // packet of orange
        Vector<Integer> val = new Vector<Integer>();
        Vector<Integer> wt = new Vector<Integer>();

        // traverse the original cost[] array and skip
        // unavailable packets and make val[] and wt[]
        // array. size variable tells the available
        // number of distinct weighted packets
        int size = 0;
        for (int i = 0; i < n; i++)
        {
            if (cost[i] != -1)
            {
                val.add(cost[i]);
                wt.add(i + 1);
                size++;
            }
        }

        n = size;
        int min_cost[][] = new int[n+1][W+1];

        // fill 0th row with infinity
        for (int i = 0; i <= W; i++)
            min_cost[0][i] = Integer.MAX_VALUE;

        // fill 0'th column with 0
        for (int i = 1; i <= n; i++)
            min_cost[i][0] = 0;

        // now check for each weight one by one and
        // fill the matrix according to the condition
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= W; j++)
            {
                // wt[i-1]>j means capacity of bag is
                // less then weight of item
                if (wt.get(i-1) > j)
                    min_cost[i][j] = min_cost[i-1][j];

                    // here we check we get minimum cost
                    // either by including it or excluding
                    // it
                else
                    min_cost[i][j] = Math.min(min_cost[i-1][j],
                            min_cost[i][j-wt.get(i-1)] +
                                    val.get(i-1));
            }
        }

        // exactly weight W can not be made by
        // given weights
        return (min_cost[n][W] == Integer.MAX_VALUE)? -1:
                min_cost[n][W];
    }

    /* Driver program to test above function */
    public static void main(String[] args)
    {
        int cost[] = {1, 3, 5}, W = 10;
        int n = cost.length;

        System.out.println(MinimumCost(cost, n, W));

        int cost1[] = {4,6,8,9}, W1 = 14;
        int n1 = cost.length;

        System.out.println(MinimumCost(cost1, n1, W1));
    }
}