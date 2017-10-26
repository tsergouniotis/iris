package com.tns.ml.iris.ds;

import com.tns.ml.iris.domain.Iris;

public class IrisArrayConverter {

	enum Attributes {
		sepal_length, sepal_width, petal_length, petal_width;
	}

	public double[] to(Iris t) {
		double[] result = new double[4];
		result[Attributes.sepal_length.ordinal()] = t.getSepalLength();
		result[Attributes.sepal_width.ordinal()] = t.getSepalWidth();
		result[Attributes.petal_length.ordinal()] = t.getPetalLength();
		result[Attributes.sepal_width.ordinal()] = t.getPetalWidth();
		return result;
	}

	public Iris from(double[] array) {
		Iris iris = new Iris();
		iris.setSepalLength(array[Attributes.sepal_length.ordinal()]);
		iris.setSepalWidth(array[Attributes.sepal_width.ordinal()]);
		iris.setPetalLength(array[Attributes.petal_length.ordinal()]);
		iris.setPetalWidth(array[Attributes.petal_width.ordinal()]);
		iris.setCategory(null);
		return iris;
	}

}
