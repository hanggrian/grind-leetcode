class ReverseString:
    @staticmethod
    def is_palindrome(x: int) -> bool:
        return str(x) == str(x)[::-1]


class CompareHalfString:
    @staticmethod
    def is_palindrome(x: int) -> bool:
        s = str(x)
        start = 0
        end = len(s) - 1
        while start < end:
            if s[start] != s[end]:
                return False
            start += 1
            end -= 1
        return True
