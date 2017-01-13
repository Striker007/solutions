package main

import (
	"fmt"
)

// running time : O(n^2)
func twoSum(nums []int, target int) []int {
	var res []int
	for i := 0; i < len(nums); i++ {
		for j := i + 1; j < len(nums); j++ {
			if target-nums[i] == nums[j] {
				res = append(res, i)
				res = append(res, j)
				return res
			}
		}
	}
	return res
}

func main() {
	var av = []int{1,5,2,3,7}
	fmt.Println(av)
	fmt.Println(twoSum(av, 7))
}
