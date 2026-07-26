class Solution(object):
    def findMaxConsecutiveOnes(self, nums):
        ans=0
        counter=0
        for i in nums:
            if i==1:
                counter+=1
                ans=max(ans,counter)
            else:
                counter=0
        return ans
                