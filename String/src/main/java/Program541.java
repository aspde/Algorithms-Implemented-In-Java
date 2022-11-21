
/**
 * 反转字符串 II
 */
public class Program541 {

    public String reverseStr(String s, int k) {

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i += 2 * k) {

            int start = i;
            int end = Math.min(i + k - 1, chars.length - 1);

            while (start < end) {
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                start++;
                end--;
            }
        }

        return new String(chars);
    }
}
