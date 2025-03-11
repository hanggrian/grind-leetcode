from abc import ABC
from curses.ascii import isupper
from inspect import currentframe
from json import load
from pathlib import Path
from unittest import TestCase


class SampledTest(ABC, TestCase):
    def get_sample_filename(self) -> str:
        cls_name = \
            currentframe(). \
                f_back. \
                f_locals['self']. \
                __class__. \
                __name__
        cls_name = cls_name[cls_name.index('Test') + len('Test'):]

        s = ''
        for c in cls_name:
            if len(s) != 0 and isupper(c):
                s += '-'
            s += c.lower()
        return f'{s}.json'

    def get_samples(self):
        root_dir: str = 'testing'
        if Path().resolve().name.startswith('problems'):  # ran locally
            root_dir = '../../../testing'
        with open(
            f'{root_dir}/res/src/main/resources/{self.get_sample_filename()}',
            'r',
            encoding='UTF-8',
        ) as json:
            samples = load(json)
            for sample in samples:
                sample['explanation'] = '\n'.join(sample['explanation'])
            return samples
