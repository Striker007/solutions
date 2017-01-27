class Solution(object):
    def fizzBuzz(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        ret = []
        i = 1
        while i <= n:
            if i % 3 == 0 and i % 5 == 0:
                ret.append("FizzBuzz")
                i+=1
            elif i % 3 == 0:
                ret.append("Fizz")
                i+=1
            elif i % 5 == 0:
                ret.append("Buzz")
                i+=1
            else:
                ret.append(str(i))
                i+=1
        return ret

if __name__ == '__main__':
    solution = Solution()
    print(solution.fizzBuzz(1))

