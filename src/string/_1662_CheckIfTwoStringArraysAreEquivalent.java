package string;

// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/

public class _1662_CheckIfTwoStringArraysAreEquivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        for(String substr : word1)
            str1.append(substr);
        for(String substr : word2)
            str2.append(substr);

        return str1.toString().equals(str2.toString());
    }
}
