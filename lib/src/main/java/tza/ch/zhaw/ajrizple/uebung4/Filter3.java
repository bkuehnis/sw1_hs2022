package tza.ch.zhaw.ajrizple.uebung4;

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
		
for(int h=0; h<frame.length;h++) {
	for (int w=0; w<frame[0].length;w++) {
		if((h<10||h>frame.length-10) ||(w<10||w>frame[0].length-10)){
			frame[h][w]=blue;
			
		}else if(!(h>=bild.length+10||w>=bild[0].length+10)) {
			frame[h][w]=bild[h-10][w-10];
		}
	}
}
		
		// show result
		ZhawImgLib.writeImage("frame.jpg", frame);
		ZhawImgLib.showImage("frame.jpg");
	}
}
