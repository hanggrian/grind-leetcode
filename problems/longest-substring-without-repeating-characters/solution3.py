def length_of_longest_substring(s: str) -> int:
    if not s:
        return 0
    # unique characters
    chars = set()
    start = end = 0
    max_length = float('-inf')
    while end < len(s):
        if s[end] not in chars:
            chars.add(s[end])
            end += 1
            max_length = max(max_length, len(chars))
        else:
            chars.remove(s[start])
            start += 1
    return max_length
