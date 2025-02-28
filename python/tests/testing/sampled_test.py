import inspect

import pathlib
from abc import ABC
from json import load
from unittest import TestCase


class SampledTest(ABC, TestCase):
    def get_samples(self):
        file_name: str = \
            inspect \
                .getmodule(inspect.stack()[1][0]) \
                .__file__ \
                .split('/test_')[-1] \
                .split('.py')[0] + \
            '.json'

        root_dir: str = 'samples'
        if pathlib.Path().resolve().name.startswith('problems'):  # ran locally
            root_dir = '../../../java'
        with open(
            f'{root_dir}/src/main/resources/{file_name}',
            'r',
            encoding='UTF-8',
        ) as json:
            samples = load(json)
            for sample in samples:
                sample['explanation'] = '\n'.join(sample['explanation'])
            return samples
