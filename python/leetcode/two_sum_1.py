def twoSum(arr, targ):
    # build dictionary of values on as-needed basis
    look_for = {}
    # nested for loop
    for n,x in enumerate(arr):
        try:
            return look_for[x], n
        except KeyError:
            look_for.setdefault(targ - x,n)


if __name__ == '__main__':
    nums = [2, 7, 11, 15]
    print(twoSum(nums,9))
