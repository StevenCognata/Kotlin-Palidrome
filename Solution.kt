class Solution {
    fun isPalindrome(x: Int): Boolean {
        var s = x.toString()
        var left = 0
        var right = s.length - 1

        while (left < right) {
            if (s[left] != s[right]) {
                return false
            }
            left++
            right--
        }
        return true
    }
}
