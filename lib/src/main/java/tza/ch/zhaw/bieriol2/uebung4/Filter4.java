package tza.ch.zhaw.bieriol2.uebung4;

import ch.zhaw.lib.ZhawImgLib;

public class Filter4 {

	public static void main(String[] args) {
		int[][] bild = ZhawImgLib.readImage("eiffel.jpg");
		ZhawImgLib.showImage("eiffel.jpg");

		// create array for new image
		int[][] gray = new int[bild.length][bild[0].length];

		// TODO: calculate gray-values for all pixels
		for (int i = 0; i < bild.length; i++) {
			for (int j = 0; j < bild[i].length; j++) {
				String hexPixel = String.format("%06X", bild[i][j]);
				String hexRot = hexPixel.substring(0, 2);
				String hexGrün  = hexPixel.substring(2, 4);
				String hexBlau  = hexPixel.substring(4);
				
				int Rot = Integer.parseInt(hexRot, 16);
				int Grün = Integer.parseInt(hexGrün, 16);
				int Blau = Integer.parseInt(hexBlau, 16);
				int durchschnitt = (Rot + Grün + Blau)/3;
				String hexDurchschnitt = String.format("%02X", durchschnitt);
				String hexGray = hexDurchschnitt + hexDurchschnitt + hexDurchschnitt;
				int GrayColour = Integer.valueOf(hexGray, 16);
				
				gray[i][j] = GrayColour;
			
			}
		}

		// show result
		ZhawImgLib.writeImage("gray.jpg", gray);
		ZhawImgLib.showImage("gray.jpg");
	}
}