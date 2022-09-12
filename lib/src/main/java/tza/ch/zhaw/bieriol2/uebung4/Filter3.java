package tza.ch.zhaw.bieriol2.uebung4;

import ch.zhaw.lib.ZhawImgLib;

public class Filter3 {

	public static void main(String[] args) {
		int [][] bild = ZhawImgLib.readImage("eiffel.jpg");
		ZhawImgLib.showImage("eiffel.jpg");
		
		// settings
		int blue = 0x6495ED; // rgb(100,149,237)
		int frameWidth = 10;
		
		// create array for new image
		int height = bild.length;
		int width = bild[0].length;
		int [][] frame = new int[height+frameWidth*2][width+frameWidth*2];
		
		// TODO: add frame of size frameWidth (pixels)
		for (int i = 0; i < frame.length; i++) {
			for (int j = 0; j < frame[i].length;j++) {
				if ((i < 10) || (i > width + 10)) {
					frame[i][j] = blue;
				}
				else if (i < width + 10) {
					if (j < 10 || j >= width + 10 || i >= height + 10) {
						frame[i][j] = blue;
					}
					else{
						frame[i][j] = bild[i-10][j-10];
					}
					
				}
				
			}
		}
		
		// show result
		ZhawImgLib.writeImage("frame.jpg", frame);
		ZhawImgLib.showImage("frame.jpg");
	}
}
