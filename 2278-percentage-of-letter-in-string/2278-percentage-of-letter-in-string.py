class Solution(object):
    def percentageLetter(self, s, letter):
         y=s.count(letter)
         z=len(s)
         return y*100//z
        