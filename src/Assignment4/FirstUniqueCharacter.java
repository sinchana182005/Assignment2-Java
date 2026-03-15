package Assignment4;

public class FirstUniqueCharacter {
        public static int firstUniqChar(String s) {

            int[] count = new int[26];

            // Count frequency of each character
            for (int i = 0; i < s.length(); i++) {
                count[s.charAt(i) - 'a']++;
            }

            // Find first character with frequency 1
            for (int i = 0; i < s.length(); i++) {
                if (count[s.charAt(i) - 'a'] == 1) {
                    return i;
                }
            }

            return -1;
        }

        public static void main(String[] args) {

            String s = "leetcode";

            int result = firstUniqChar(s);

            System.out.println("First Unique Character Index: " + result);
        }
    }

