/**
 * A grid.
 */
const Grid = {
  /**
   * Create a new grid.
   * @return the grid
   */
  create: function () {
    // Create an object with cells, empty and newCells attributes
    // cells is an array of 4 rows of 4 cells containing a zero
    // empty is the number of empty cells (16 by default)
    // newCells is a set with the new cells
    // Add 2 values at random in the grid
    // Return grid
  },

  /**
   * Create a copy of the grid.
   * @param grid the grid to copy
   * @return the copy
   */
  copy: function (grid) {},

  /**
   * Add a new value in the grid.
   * @param grid the grid
   */
  addValue: function (grid) {
    if (grid.empty > 0) {
      // Found an empty random cell
      // Fill the cell with a 2 or 4
      // Update newCells and empty
    }
  },

  /**
   * Check if there are identical cells side by side in the grid.
   * @param grid the grid
   * @return true if there are identical cells side by side
   */
  check: function (grid) {
    let found = false;

    return found;
  },

  /**
   * Move all values to the right of the grid. If there are identical cells, they are merged.
   * @param grid the grid
   * @return true if a cell has been modified
   */
  pushRight: function (grid) {
    let move = false;

    return move;
  },

  /**
   * Transpose the grid.
   * @param grid the grid
   */
  transpose: function (grid) {},

  /**
   * Construct the grid mirror.
   * @param grid the grid
   */
  miror: function (grid) {},

  /**
   * Move the values of the grid in function of the key.
   * @param grid the grid
   * @param key the key
   * @return true if a move has occurred
   */
  move: function (grid, key) {
    let move = false;

    switch (key) {
      case "ArrowRight":
        break;
      case "ArrowLeft":
        break;
      case "ArrowUp":
        break;
      case "ArrowDown":
        break;
    }

    return move;
  },
};

export default Grid;
