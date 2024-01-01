from typing import List

# https://leetcode.com/problems/build-array-from-permutation/

class _1920_BuildArray_From_Permutation:
    def buildArray(self, nums: List[int]) -> List[int]:
        return [nums[num] for num in nums]