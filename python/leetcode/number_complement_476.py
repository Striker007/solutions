class Solution(object):
    def findComplement(self, num):
        i = 1
        while num >= i:
            num ^= i # is same as num = num ^ i
            i <<= 1
        return num

if __name__ == '__main__':
    solution = Solution()
    print(solution.findComplement(5))

