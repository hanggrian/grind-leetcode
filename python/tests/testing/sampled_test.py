import pathlib
from abc import ABC, abstractmethod
from json import load
from unittest import TestCase


class SampledTest(ABC, TestCase):
    @abstractmethod
    def get_file_name(self) -> str:
        pass

    def get_samples(self):
        root_dir: str = 'java'
        if pathlib.Path().resolve().name.startswith('problems'):  # ran locally
            root_dir = '../../../java'
        with open(
            f'{root_dir}/src/test/resources/{self.get_file_name()}',
            'r',
            encoding='UTF-8',
        ) as json:
            samples = load(json)
            for sample in samples:
                sample['explanation'] = '\n'.join(sample['explanation'])
            return samples
