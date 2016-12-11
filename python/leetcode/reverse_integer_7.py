class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        if x < 0:
            return int(str(x)[1:][::-1])*-1
        # convert number to string, reverse the string, then convert it back to integer
        else:
            return int(str(x)[::-1])


if __name__ == '__main__':
    solution = Solution()
    print(solution.reverse(-123))