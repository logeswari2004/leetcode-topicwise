class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();
        for (int i = 0, k, len; i < words.length; i += k) {
            for (k = len = 0; i + k < words.length && len + words[i + k].length() + k <= maxWidth; k++)
                len += words[i + k].length();
            StringBuilder line = new StringBuilder(words[i]);
            for (int j = 0; j < k - 1; j++)
                line.append(i + k >= words.length ? " " : " ".repeat((maxWidth - len) / (k - 1) + (j < (maxWidth - len) % (k - 1) ? 1 : 0))).append(words[i + j + 1]);
            res.add(line.append(" ".repeat(maxWidth - line.length())).toString());
        }
        return res;
    }
}