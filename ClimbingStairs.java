class ClimbingStairs {
    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        int prev1 = 2, prev2 = 1;
        for (int i = 3; i <= n; i++) {
            int current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 5; 
        System.out.println("Number of ways to climb " + n + " stairs: " + solution.climbStairs(n));
    }
}
