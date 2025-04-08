class Problem {
  generate(numRows: number): number[][] {
    throw new Error(`Not implemented (${numRows}).`);
  }
}

class Default extends Problem {
  generate(numRows: number): number[][] {
    const rows: number[][] = new Array(numRows);
    rows[0] = [1];
    for (let i = 1; i < numRows; i++) {
      const numColumns: number = i + 1;
      const columns: number[] = new Array(numColumns);
      for (let j = 0; j < numColumns; j++) {
        if (j === 0 || j === numColumns - 1) {
          columns[j] = 1;
          continue;
        }
        const prevColumns: number[] = rows[i - 1];
        columns[j] = prevColumns[j - 1] + prevColumns[j];
      }
      rows[i] = columns;
    }
    return rows;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
