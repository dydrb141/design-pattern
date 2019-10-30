package com.dimond;

import java.io.File;
import java.io.FileFilter;

public class Ex {
	public static void main(String[] args) {
		File[] hiddenFiles = new File(".").listFiles(new FileFilter() {
			public boolean accept(File file) {
				return file.isHidden();
			}
		});
	}

	File[] hiddenFiles = new File(".").listFiles(File::canRead);
}
