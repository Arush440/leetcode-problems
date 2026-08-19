class Solution(object):
    def rotate(self, nums, k):
       if k == 0:
            return
       size = len(nums)
       k = k if k <= size else k % size
       nums[k:], nums[:k] = nums[:size - k], nums[size - k:]
        
        