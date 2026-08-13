class Solution {
    public String reverseVowels(String s) {

        char[] arr = s.toCharArray();

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {

            if (isVowel(arr[i])) {

                if (isVowel(arr[j])) {

                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    i++;
                    j--;

                } else {
                    j--;
                }

            } else {
                i++;
            }
        }

        return new String(arr);
    }

    boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' ||
               c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' ||
               c == 'O' || c == 'U';
    }
}