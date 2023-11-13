class testing{

   static int bin(int n,int k)
    {
        int[][] b=new int[n+1][k+1];
        
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=Math.min(i,k);j++)
            {
              if(j==0 || j==i)  b[i][j]=1;
              else  b[i][j] = b[i-1][j-1] + b[i-1][j];
            }
        }
        return b[n][k];
    }

    public static int calculateBinomialCoefficient(int n, int k) {
        if (k < 0 || k > n)
            return 0;

        int[] dp = new int[k + 1];
        dp[0] = 1; // Base case: C(n, 0) = 1

        for (int i = 1; i <= n; i++) {
            for (int j = Math.min(i, k); j > 0; j--) {
                dp[j] = dp[j] + dp[j - 1];
            }
        }

        return dp[k];
    }

   

    public static void main(String[] args) {
        int ans=calculateBinomialCoefficient(4, 4);
        System.out.println("Ans is : "+ans);
    }
}