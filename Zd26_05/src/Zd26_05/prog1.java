
package Zd26_05;

import java.util.Iterator;

public class prog1 implements Iterable<Integer> {
    private int[][] matrix;
    private int rows;
    private int cols;

    public prog1(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        matrix = new int[rows][cols];
    }

    public void setValueAt(int i, int j, int value) {
        matrix[i][j] = value;
    }

    public int getValueAt(int i, int j) {
        return matrix[i][j];
    }

    public void multiplyByScalar(int scalar) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] *= scalar;
            }
        }
    }

    public void add(prog1 m) {
        if (rows != m.rows || cols != m.cols) {
            throw new IllegalArgumentException("Matrices must have the same dimensions.");
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] += m.getValueAt(i, j);
            }
        }
    }

    public void transpose() {
        int[][] transposed = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        matrix = transposed;
        int temp = rows;
        rows = cols;
        cols = temp;
    }

    public Iterator<Integer> iterator() {
        return new MatrixIterator();
    }

    private class MatrixIterator implements Iterator<Integer> {
        private int rowIndex;
        private int colIndex;

        public MatrixIterator() {
            rowIndex = 0;
            colIndex = 0;
        }

        public boolean hasNext() {
            return rowIndex < rows && colIndex < cols;
        }

        public Integer next() {
            int value = matrix[rowIndex][colIndex];
            colIndex++;
            if (colIndex == cols) {
                colIndex = 0;
                rowIndex++;
            }
            return value;
        }
    }

    public static prog1 addMatrices(prog1 a, prog1 b) {
        prog1 result = new prog1(a.rows, a.cols);
        for (int i = 0; i < a.rows; i++) {
            for (int j = 0; j < a.cols; j++) {
                result.setValueAt(i, j, a.getValueAt(i, j) + b.getValueAt(i, j));
            }
        }
        return result;
    }

    public static prog1 multiplyByScalar(prog1 matrix, int scalar) {
        prog1 result = new prog1(matrix.rows, matrix.cols);
        for (int i = 0; i < matrix.rows; i++) {
            for (int j = 0; j < matrix.cols; j++) {
                result.setValueAt(i, j, matrix.getValueAt(i, j) * scalar);
            }
        }
        return result;
    }

    public static int countIslands(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }

        return count;
    }

    private static void dfs(int[][] grid, int row, int col) {
        int rows = grid.length;
        int cols = grid[0].length;

        if (row < 0 || row >= rows || col < 0 || col >= cols || grid[row][col] != 1) {
            return;
        }

        grid[row][col] = -1; 

    
        dfs(grid, row - 1, col); 
        dfs(grid, row + 1, col); 
        dfs(grid, row, col - 1); 
        dfs(grid, row, col + 1); 
    }

    public static int findCelebrity(int[][] matrix) {
        int n = matrix.length;

        int candidate = 0;
        for (int i = 1; i < n; i++) {
            if (knows(candidate, i, matrix)) {
                candidate = i;
            }
        }

        if (isCelebrity(candidate, matrix)) {
            return candidate;
        }

        return -1; 
    }

    private static boolean knows(int a, int b, int[][] matrix) {
        return matrix[a][b] == 1;
    }

    private static boolean isCelebrity(int person, int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            if (i != person && (knows(person, i, matrix) || !knows(i, person, matrix))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
 
        prog1 matrix1 = new prog1(2, 2);
        matrix1.setValueAt(0, 0, 1);
        matrix1.setValueAt(0, 1, 2);
        matrix1.setValueAt(1, 0, 3);
        matrix1.setValueAt(1, 1, 4);

        prog1 matrix2 = new prog1(2, 2);
        matrix2.setValueAt(0, 0, 5);
        matrix2.setValueAt(0, 1, 6);
        matrix2.setValueAt(1, 0, 7);
        matrix2.setValueAt(1, 1, 8);

        matrix1.add(matrix2);
        matrix1.transpose();

        for (int element : matrix1) {
            System.out.println(element);
        }

    
        int[][] grid = {
            {1, 1, 0, 0, 0},
            {1, 1, 0, 0, 0},
            {0, 0, 1, 0, 0},
            {0, 0, 0, 1, 1}
        };
        int islandCount = countIslands(grid);
        System.out.println("Количество островов: " + islandCount);

       
        int[][] relationMatrix = {
            {0, 0, 1, 0},
            {0, 0, 1, 0},
            {0, 0, 0, 0},
            {0, 0, 1, 0}
        };
        int celebrity = findCelebrity(relationMatrix);
        if (celebrity != -1) {
            System.out.println("Найденная знаменитость: " + celebrity);
        } else {
            System.out.println("No celebrity found.");
        }
    }
}