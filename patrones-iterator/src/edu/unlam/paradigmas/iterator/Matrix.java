package edu.unlam.paradigmas.iterator;

import java.util.Iterator;

public class Matrix<T> implements Iterable<T>{

	T[][] data;

	public Matrix(T[][] data) {
		super();
		this.data = data;
	}

	@Override
	public Iterator<T> iterator() {
		return new MatrixIterator<T>(this);
	}
}
