import {floorKey} from '../util/dicts';

class Problem {
  intToRoman(num) {
    throw new Error(`Not implemented (${num}).`);
  }
}

class Default extends Problem {
  ROMANS = {
    1000: 'M',
    900: 'CM',
    500: 'D',
    400: 'CD',
    100: 'C',
    90: 'XC',
    50: 'L',
    40: 'XL',
    10: 'X',
    9: 'IX',
    5: 'V',
    4: 'IV',
    1: 'I',
  };

  intToRoman(num) {
    return this.recurse(this.ROMANS, num);
  }

  recurse(romans, num) {
    const floor = floorKey(romans, num);
    if (num === floor) {
      return romans[num];
    }
    return romans[floor] + this.recurse(romans, num - floor);
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
