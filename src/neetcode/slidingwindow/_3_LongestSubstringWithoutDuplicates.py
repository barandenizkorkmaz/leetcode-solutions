class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        maxLength = 0
        current = set()
        for i in range(len(s)):
            for j in range(i, len(s)):
                if s[j] in current:
                    maxLength = max(maxLength, len(current))
                    current = set()
                    break
                else:
                    current.add(s[j])
        return max(maxLength, len(current))