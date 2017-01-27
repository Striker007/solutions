package main


func hammingDistance(x int, y int) int {
	xor:= x ^ y
	count := 0
	var j uint
	for j=0;  j< 32; j++ {
		count+=(xor >> j) & 1
	}
	return count
}


func main() {

}
