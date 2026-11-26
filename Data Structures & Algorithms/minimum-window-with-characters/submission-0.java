

class Solution {
    public String minWindow(String s, String t) {

        if (t.length() > s.length()) {
            return "";
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int countRequired = t.length();
        int i = 0, j = 0;

        int minWindowSize = Integer.MAX_VALUE;
        int start_i = 0;

        while (j < s.length()) {

            char ch = s.charAt(j);

            if (map.containsKey(ch) && map.get(ch) > 0) {
                countRequired--;
            }

            map.put(ch, map.getOrDefault(ch, 0) - 1);

            while (countRequired == 0) {

                if (j - i + 1 < minWindowSize) {
                    minWindowSize = j - i + 1;
                    start_i = i;
                }

                char leftChar = s.charAt(i);

                map.put(leftChar, map.get(leftChar) + 1);

                if (map.get(leftChar) > 0) {
                    countRequired++;
                }

                i++;
            }

            j++;
        }

        if (minWindowSize == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start_i, start_i + minWindowSize);
    }
}