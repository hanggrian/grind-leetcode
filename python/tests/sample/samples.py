import inspect

import pathlib
from json import load


def get_samples():
    file_name: str = \
        inspect \
            .getmodule(inspect.stack()[1][0]) \
            .__file__ \
            .split('/test_')[-1] \
            .replace('_', '-') \
            .split('.py')[0] + \
        '.json'

    root_dir: str = 'testing'
    if pathlib.Path().resolve().name.startswith('problems'):  # ran locally
        root_dir = '../../../testing'
    with open(
        f'{root_dir}/res/src/main/resources/{file_name}',
        'r',
        encoding='UTF-8',
    ) as json:
        samples = load(json)
        for sample in samples:
            sample['explanation'] = '\n'.join(sample['explanation'])
        return samples
