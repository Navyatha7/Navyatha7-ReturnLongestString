public class ReturnLongestString {
    public String longest(String[] arr) {
        String longest = "";
        for (String str : arr) {
            if (str.length() > longest.length()) {
                longest = str;
            }
        }
        return longest;
    }
}
