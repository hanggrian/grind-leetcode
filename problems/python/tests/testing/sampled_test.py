import pathlib
from abc import ABC, abstractmethod
from json import load
from unittest import TestCase


class SampledTest(ABC, TestCase):
    @abstractmethod
    def get_file_name(self) -> str:
        pass

    def get_samples(self):
        root_dir: str = 'problems'
        if pathlib.Path().resolve().name == 'tests':  # ran locally
            root_dir = '../..'
        with open(
            f'{root_dir}/src/test/resources/{self.get_file_name()}',
            'r',
            encoding='UTF-8',
        ) as json:
            return load(json)
