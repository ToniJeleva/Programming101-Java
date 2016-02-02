package imageIO;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageResizer {

	private static final int IMG_WIDTH = 150;
	private static final int IMG_HEIGHT = 150;

	public static void resizingImage(File src, File dest) throws IOException {
		BufferedImage originalImage = ImageIO.read(new File(src.getAbsolutePath()));
		int type = originalImage.getType() == 0 ? BufferedImage.TYPE_INT_ARGB : originalImage.getType();

		BufferedImage resizedImage = new BufferedImage(IMG_WIDTH, IMG_HEIGHT, type);
		Graphics2D g = resizedImage.createGraphics();
		g.drawImage(originalImage, 0, 0, IMG_WIDTH, IMG_HEIGHT, null);
		g.dispose();
		ImageIO.write(resizedImage, "jpg", new File(dest.getAbsolutePath() + ".jpg"));

	}

}
