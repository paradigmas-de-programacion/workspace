package edu.unlam.paradigmas.iterator;

import java.util.Iterator;

public class MatrixIterator<T> implements Iterator<T> {

	private Matrix<T> matrix;
	private int i, j;

	public MatrixIterator(Matrix<T> matrix) {
		this.matrix = matrix;
	}

	@Override
	public boolean hasNext() {
		return i < matrix.data.length && j < matrix.data[0].length;
	}

	@Override
	public T next() {
		T elemento = matrix.data[i][j];
		j++;
		if (j == matrix.data[0].length) {
			i++;
			j = 0;
		}
		return elemento;
	}

}
