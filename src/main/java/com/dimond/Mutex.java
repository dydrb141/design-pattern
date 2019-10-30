package com.dimond;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

public class Mutex {
	public static void main(String[] args) {
		Map<String, String> map = new ConcurrentHashMap<>();
		map.put("test", "test");
		BlockingQueue queue = new ArrayBlockingQueue(10);


		final List<String> list = Collections.synchronizedList(new ArrayList<String>());

		final int nThreads = 2;

		ExecutorService es = Executors.newFixedThreadPool(nThreads);

		for (int i = 0; i < nThreads; i++) {

			es.execute(new Runnable() {

				public void run() {

					while(true) {

						try {

							list.clear();

							list.add("888");

							list.remove(0);

						} catch(IndexOutOfBoundsException ioobe) {
							ioobe.printStackTrace();

						}
					}
				}
			});
		}
	}
}
