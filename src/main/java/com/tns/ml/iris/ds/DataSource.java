package com.tns.ml.iris.ds;

import java.util.Set;

public interface DataSource<T> {

	Set<T> read();

}
