package copyFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CopyDirectoryWithThreadPool {

	public static void main(String[] args) {
		File srcFolder = new File("/home/toni/Test2");
		File destFolder = new File("/home/toni/Test2-new");

		long start_time = System.nanoTime();

		try {
			copyFolder(srcFolder, destFolder);
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
			// error, just exit
			System.exit(0);
		}

		System.out.println("Done");
		long end_time = System.nanoTime();
		double difference = (end_time - start_time) / 1e6;
		System.out.println(difference);
	}

	private static ExecutorService executor = Executors.newFixedThreadPool(4);

	public static void copyFolder(File src, File dest) throws IOException, InterruptedException {

		if (src.isDirectory()) {

			if (!dest.exists()) {
				dest.mkdir();
				System.out.println("Directory copied from " + src + "  to " + dest);
			}

			// list all the directory contents
			File files[] = src.listFiles();
			CopyOnWriteArrayList<File> simpleFiles = new CopyOnWriteArrayList<>();
			ArrayList<File> directories = new ArrayList<>();

			for (File file : files) {
				if (file.isDirectory()) {
					directories.add(file);
				} else {
					simpleFiles.add(file);
				}

			}

			if (simpleFiles.size() > 4) {
				for (int i = 0; i < 2; i++) {
					executor.execute(new Runnable() {

						@Override
						public void run() {

							try {
								copyAllFilesFromCollection(simpleFiles, src, dest);
							} catch (IOException e) {
								e.printStackTrace();
							}

						}

					});
				}
			}

			for (int i = 0; i < directories.size(); i++) {
				File srcFile = new File(src, directories.get(i).getName());
				File destFile = new File(dest, directories.get(i).getName());

				copyFolder(srcFile, destFile);
			}

		} else {
			copyFile(src, dest);
		}
	}

	public static void copyFile(File src, File dest) throws IOException {
		InputStream in = new FileInputStream(src);
		OutputStream out = new FileOutputStream(dest);

		byte[] buffer = new byte[1024];

		int length;
		while ((length = in.read(buffer)) > 0) {
			out.write(buffer, 0, length);
		}

		in.close();
		out.close();
		System.out.println("File copied from " + src + " to " + dest + Thread.currentThread().getName());
	}

	public static void copyAllFilesFromCollection(List<File> files, File src, File dest) throws IOException {
		for (int i = 0; i < files.size(); i++) {
			File srcFile = new File(src, files.get(i).getName());
			File destFile = new File(dest, files.get(i).getName());
			copyFile(srcFile, destFile);
		}
	}

}
