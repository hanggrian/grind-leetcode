import fs from 'fs';
import {resolve, dirname} from 'path';
import {fileURLToPath} from 'url';

export default function getSamples(file_name) {
  let parts = _getCallerFile().split('/');
  let filename = parts[parts.length - 1];
  parts = filename.split('.');
  file_name = `${parts[0]}.json`;

  let samples =
    JSON.parse(
      fs.readFileSync(
        resolve(
          dirname(fileURLToPath(import.meta.url)),
          `../../../res/src/main/resources/${file_name}`,
        ),
        'utf8',
      ),
    );
  for (let sample of samples) {
    sample.explanation = sample.explanation.join('\n');
  }
  return samples;
}

/**
 * @see {@link https://stackoverflow.com/questions/16697791/nodejs-get-filename-of-caller-function}
 */
function _getCallerFile() {
  let filename;
  let _pst = Error.prepareStackTrace;
  Error.prepareStackTrace =
    function(err, stack) {
      return stack;
    };
  try {
    let err = new Error();
    let callerfile;
    let currentfile;
    currentfile = err.stack.shift().getFileName();
    while (err.stack.length) {
      callerfile = err.stack.shift().getFileName();
      if (currentfile !== callerfile) {
        filename = callerfile;
        break;
      }
    }
  } catch (e) {
  }
  Error.prepareStackTrace = _pst;
  return filename;
}
