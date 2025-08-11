class Solution {
    public int[] productQueries(int n, int[][] queries) {
        int MOD = 1_000_000_007;

        // Step 1: Get powers of 2 from binary representation (ascending order)
        List<Integer> powers = new ArrayList<>();
        for (int i = 0; i < 31; i++) {
            if ((n & (1 << i)) != 0) {
                powers.add(1 << i);
            }
        }

        // Step 2: Precompute prefix products
        long[] prefix = new long[powers.size() + 1];
        prefix[0] = 1;
        for (int i = 0; i < powers.size(); i++) {
            prefix[i + 1] = (prefix[i] * powers.get(i)) % MOD;
        }

        // Step 3: Answer queries using modular inverse
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            long numerator = prefix[right + 1];
            long denominator = prefix[left];
            ans[i] = (int)((numerator * modPow(denominator, MOD - 2, MOD)) % MOD);
        }

        return ans;
    }

    private long modPow(long base, long exp, int mod) {
        long result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) result = (result * base) % mod;
            base = (base * base) % mod;
            exp >>= 1;
        }
        return result;
    }
}
