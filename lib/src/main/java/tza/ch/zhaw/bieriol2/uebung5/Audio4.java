package tza.ch.zhaw.bieriol2.uebung5;

import ch.zhaw.lib.ZhawWavLib;

public class Audio4 {

	public static void main(String[] args) {
		// read and play original wav file
		double[] signal = ZhawWavLib.read("Guitar-noisy.wav");
		ZhawWavLib.play("Guitar-noisy.wav");

		// apply lowpass filter
		// TODO: Call method lowpassFilter. Select window length
		double[] lowpassSignal = lowpassFilter(signal, 20);

		// write and play modified wav file
		ZhawWavLib.write(lowpassSignal, "Guitar-lowpass.wav");
		ZhawWavLib.play("Guitar-lowpass.wav");
	}

	static double[] lowpassFilter(double[] signal, int windowLength) {

		// TODO: implement a lowpass filter with the given window length
		double[] newSignal = new double[signal.length];
		for (int i = 0; i < newSignal.length; i++) {
			double sumSignal = 0;
			double averageSignal = 0;
			int averageWindowLength = windowLength / 2;
			int windowLengthStart = averageWindowLength;
			int windowLengthEnd = averageWindowLength + 1;
			int xStart = i - windowLengthStart;
			if (averageWindowLength%2!=0) {
				windowLengthEnd -= 1; 
			}
			int xEnd = i + windowLengthEnd + 1;
			int xDiffStart = windowLengthStart;
			int xDiffEnd = 0;
			if (xStart < 0) {
				xDiffStart = xStart + windowLengthStart;
			} else if (xEnd > signal.length - 1) {
				xDiffEnd = xEnd - signal.length;
				xEnd = xEnd - xDiffEnd;
			}
			int xAverage = windowLengthEnd + 1 + xDiffStart - xDiffEnd;
			int x = i - xDiffStart;
			while (x < xEnd) {
				sumSignal += signal[x];
				x++;
			}
			averageSignal = sumSignal / xAverage;
			newSignal[i] = averageSignal;
		}
		return newSignal;
	}
}
