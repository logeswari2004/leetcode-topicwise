class Solution {
    public String lexGreaterPermutation(String s, String target) {

        int n = s.length();
        int[] count = new int[26];

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        char[] ans = new char[n];

        for (int i = 0; i < n; i++) {

            int targetChar = target.charAt(i) - 'a';

            // Try to make this position equal to target
            if (count[targetChar] > 0) {
                ans[i] = target.charAt(i);
                count[targetChar]--;
                continue;
            }

            // Cannot match target[i].
            // First, try making THIS position greater.
            for (int c = targetChar + 1; c < 26; c++) {

                if (count[c] > 0) {
                    return buildResult(ans, i, count, c);
                }
            }

            // No greater character at current position.
            // Backtrack to previous positions.
            for (int j = i - 1; j >= 0; j--) {

                // Restore character used at position j
                count[ans[j] - 'a']++;

                int targetCharAtJ = target.charAt(j) - 'a';

                // Find smallest character greater than target[j]
                for (int c = targetCharAtJ + 1; c < 26; c++) {

                    if (count[c] > 0) {
                        return buildResult(ans, j, count, c);
                    }
                }
            }

            return "";
        }

        // We matched target exactly.
        // Need strictly greater, so backtrack.
        for (int j = n - 1; j >= 0; j--) {

            count[ans[j] - 'a']++;

            int targetChar = target.charAt(j) - 'a';

            for (int c = targetChar + 1; c < 26; c++) {

                if (count[c] > 0) {
                    return buildResult(ans, j, count, c);
                }
            }
        }

        return "";
    }

    private String buildResult(
            char[] ans,
            int pos,
            int[] count,
            int greaterChar) {

        StringBuilder result = new StringBuilder();

        // Prefix remains the same
        for (int i = 0; i < pos; i++) {
            result.append(ans[i]);
        }

        // Make the string greater here
        result.append((char) ('a' + greaterChar));
        count[greaterChar]--;

        // Smallest possible suffix
        for (int c = 0; c < 26; c++) {
            while (count[c] > 0) {
                result.append((char) ('a' + c));
                count[c]--;
            }
        }

        return result.toString();
    }
}