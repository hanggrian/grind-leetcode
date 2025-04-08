class FirstBadVersion:
    def __init__(self, bad_version: int):
        self.bad_version: int = bad_version

    def is_bad_version(self, bad_version: int) -> bool:
        return self.bad_version == bad_version

    def first_bad_version(self, n: int) -> int:
        start_index: int = 1
        end_index: int = n
        while start_index <= end_index:
            mid_index: int = start_index + (end_index - start_index) // 2
            if self.is_bad_version(mid_index):
                end_index = mid_index - 1
            else:
                start_index = mid_index + 1
        return start_index
