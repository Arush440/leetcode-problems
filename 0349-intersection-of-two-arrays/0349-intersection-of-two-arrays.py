class Solution(object):
    def intersection(self, nums1, nums2):
        hashmap={}
        result = set()
        for num in nums1:
            hashmap[num]=1
        for num in nums2:
            if num in hashmap:
                result.add(num)
        return list(result)