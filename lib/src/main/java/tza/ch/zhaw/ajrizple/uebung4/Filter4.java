package tza.ch.zhaw.ajrizple.uebung4;

import ch.zhaw.lib.ZhawImgLib;

public class Filter4 {

	public static void main(String[] args) {
		int[][] bild = ZhawImgLib.readImage("eiffel.jpg");
		ZhawImgLib.showImage("eiffel.jpg");

		// create array for new image
		int[][] gray = new int[bild.length][bild[0].length];

		for (int h = 0; h < bild.length; h++) {
			for (int w = 0; w < bild[0].length; w++) {
				// System.out.println("Color: " + (bild[h][w] & 0xFF0000));
				int red = (bild[h][w] & 0xFF0000) >> 16;
				int green = (bild[h][w] & 0x00FF00) >> 8;
				int blue = (bild[h][w] & 0x0000FF) >> 0;

				int average = (red + green + blue) / 3;

				int color = ZhawImgLib.rgbToArgb(average, average, average);

				gray[h][w] = color;
			}
		}

		// show result
		ZhawImgLib.writeImage("gray.jpg", gray);
		ZhawImgLib.showImage("gray.jpg");
	}
}
