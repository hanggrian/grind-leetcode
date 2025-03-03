export function floorKey(dictionary: object, target: number) {
  let keys =
    Object
      .keys(dictionary)
      .map(key => +key)
      .sort((a, b) => a < b ? -1 : a > b ? 1 : 0);
  let index = _bisectRight(keys, target);
  return index > 0
    ? keys[index - 1]
    : undefined;
}

function _bisectRight(arr: number[], target: number) {
  let lo = 0;
  let hi = arr.length;
  while (lo < hi) {
    let mid = Math.floor((lo + hi) / 2);
    if (arr[mid] <= target) {
      lo = mid + 1;
    } else {
      hi = mid;
    }
  }
  return lo;
}
