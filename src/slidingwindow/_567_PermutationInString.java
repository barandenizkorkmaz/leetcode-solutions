package slidingwindow;

public class _567_PermutationInString {
    private boolean isEqualArrays(int[] arr1, int[] arr2){
        if(arr1.length != arr2.length)return false;
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] != arr2[i])return false;
        }
        return true;
    }

    public boolean checkInclusion(String s1, String s2) {
        if(s2.length() < s1.length())return false;

        int[] original = new int[26];
        int[] current = new int[26];

        for(int i = 0; i < s1.length(); i++){
            original[s1.charAt(i) - 'a'] += 1;
            current[s2.charAt(i) - 'a'] += 1;
        }

        if(isEqualArrays(original, current))return true;

        for(int i = s1.length(); i < s2.length(); i++){
            current[s2.charAt(i) - 'a'] += 1;
            current[s2.charAt(i - s1.length()) - 'a'] -= 1;
            if(isEqualArrays(original, current))return true;
        }

        return false;

    }
}
