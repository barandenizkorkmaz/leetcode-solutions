from _collections import defaultdict
from typing import *

# https://leetcode.com/problems/group-anagrams/

class _49_GroupAnagrams:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res = defaultdict(list)
        for word in strs:
            sorted_word = ''.join(sorted(word))
            res[sorted_word].append(word)
        return list(res.values())