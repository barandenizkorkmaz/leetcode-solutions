package general;

// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/

public class _28_FindTheIndexOfTheFirstOccurenceInAString {
    public int strStr(String haystack, String needle) {
        int hLen = haystack.length();
        int nLen = needle.length();

        int pointerIndex = 0;

        for(int i = 0; i<hLen; i++){
            if(haystack.charAt(i) == needle.charAt(pointerIndex)){
                pointerIndex++;
            }
            else{
                i -= pointerIndex;
                pointerIndex = 0;
            }

            if(pointerIndex == nLen)return i-pointerIndex + 1;
        }

        return -1;
    }
}
