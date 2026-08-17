class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1; 
        Set<Character> vowels = new HashSet<>(Arrays.asList(
            'a','e','i','o','u','A','E','I','O','U'));
        while (left <= right) {
            char leftch = s.charAt(left);
            char rightch = s.charAt(right);

            if (!vowels.contains(leftch)) {
                left++;
            } else if (!vowels.contains(rightch)) {
                right--;
            } else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }
}