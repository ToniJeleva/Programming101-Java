package imageIO;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ImagesInDirectory {

	public static void resizeImagesFromDirectory(File src, boolean toBeRecursive) throws IOException {
		if (toBeRecursive) {
			resizeImagesRecursively(src, src.getName());
		} else {
			ArrayList<File> images = new ArrayList<>();
			File destination = new File(src.getParentFile() + "/" + "thumbnails");
			resizeImages(addImagesFromDirectoryToList(src, images), destination);
		}
	}

	private static void resizeImagesRecursively(File src, String folderName) throws IOException {
		File[] files = src.listFiles();
		ArrayList<File> images = new ArrayList<>();
		for (File file : files) {
			if (file.getName().endsWith(".jpg")) {
				images.add(file);
				String result = makeNeededDirs(file, folderName);
				String fileName = file.getName().replaceAll(".jpg", "");
				File dest = new File(result + "/" + fileName + "thumbnails");
				ImageResizer.resizingImage(file, dest);
			} else if (file.isDirectory()) {
				resizeImagesRecursively(file, folderName);
			}

		}

	}

	private static String makeNeededDirs(File file, String folderName) {
		String parent = file.getParent();
		int index = parent.indexOf(folderName);
		String previous = parent.substring(0, index);
		String renamed = parent.substring(index);
		renamed = renamed.replaceAll("/", "thumbnails/");
		String result = previous + renamed + "thumbnails";
		new File(result).mkdirs();

		return result;
	}

	private static List<File> addImagesFromDirectoryToList(File src, List<File> images) {
		if (src.isDirectory()) {
			File[] files = src.listFiles();
			for (File file : files) {
				addImagesFromDirectoryToList(new File(src, file.getName()), images);
			}
		} else if (src.getName().endsWith(".jpg")) {
			images.add(src);
		}
		return images;
	}

	private static void resizeImages(List<File> images, File dest) throws IOException {
		dest.mkdir();
		for (File file : images) {
			String nameNoExtention = file.getName().replace(".jpg", "");
			File destination = new File(dest + "/" + nameNoExtention);
			ImageResizer.resizingImage(file, destination);
		}

	}

}
