package sorting;

public class MinCost {
    /* Returns the best obtainable price for
a rod of length n and price[] as prices
of different pieces */
    public static int minCost(int cost[], int n)
    {
        int dp[] = new int[n + 1];
        dp[0] = 0;

        // Build the table val[] in bottom up
        // manner and return the last entry
        // from the table
        for (int i = 1; i <= n; i++)
        {
            int min_cost = Integer.MAX_VALUE;
            for (int j = 0; j < i; j++)
                if(j < cost.length && cost[j]!=-1) {
                    min_cost = Math.min(min_cost, cost[j] + dp[i - (j + 1)]);
                }
            dp[i] = min_cost;
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int cost[] = {10,-1,-1,-1,-1};
        int W = cost.length;
        System.out.println("===============");
        System.out.print(minCost(cost, W));
    }
}
