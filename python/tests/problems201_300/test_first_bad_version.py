from unittest import main

from src.problems201_300.first_bad_version import FirstBadVersion
from tests.sample.sampled_test import SampledTest


class TestFirstBadVersion(SampledTest):
    def test(self):
        for sample in self.get_samples():
            self.assertEqual(
                sample['output'],
                FirstBadVersion(sample['input']['bad']) \
                    .first_bad_version(sample['input']['n']),
            )


if __name__ == '__main__':
    main()
