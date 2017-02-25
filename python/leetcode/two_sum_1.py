class Solution(object):
    def twoSum(self, arr, targ):
        # create empty dictionary
        look_for = {}

        for n, x in enumerate(arr):
            print(arr)
            print(look_for)
            try:
                return look_for[x], n
            except KeyError: # is raised if key is not found
                look_for.setdefault(targ - x, n)

if __name__ == '__main__':
    solution = Solution()
    nums = [2, 7, 11, 15]
    print(solution.twoSum(nums,9))
