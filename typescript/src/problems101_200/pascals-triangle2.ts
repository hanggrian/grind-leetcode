class Problem {
  getRow(rowIndex: number): number[] {
    throw new Error(`Not implemented (${rowIndex}).`);
  }
}

class Default extends Problem {
  getRow(rowIndex: number): number[] {
    const numRows = rowIndex + 1;

    const rows = new Array<number[]>(numRows);
    rows[0] = [1];
    for (let i = 1; i < numRows; i++) {
      const numColumns = i + 1;
      const columns = new Array<number>(numColumns);
      for (let j = 0; j < numColumns; j++) {
        if (j === 0 || j === numColumns - 1) {
          columns[j] = 1;
          continue;
        }
        const prevColumns = rows[i - 1];
        columns[j] = prevColumns[j - 1] + prevColumns[j];
      }
      rows[i] = columns;
    }
    return rows[rows.length - 1];
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
