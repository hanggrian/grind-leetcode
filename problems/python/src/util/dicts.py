from bisect import bisect_right
from typing import TypeVar, Any

T = TypeVar('T')


def floor_key(dictionary: dict[T, Any], target: T) -> T | None:
    keys = sorted(dictionary.keys())
    index = bisect_right(keys, target)
    if index > 0:
        return keys[index - 1]
    return None
