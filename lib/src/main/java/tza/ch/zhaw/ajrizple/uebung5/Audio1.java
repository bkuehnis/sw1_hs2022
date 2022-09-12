package tza.ch.zhaw.ajrizple.uebung5;

import ch.zhaw.lib.ZhawWavLib;

public class Audio1 {

	public static void main(String[] args) {
		// read and play original wav file
		double[] signal = ZhawWavLib.read("Guitar.wav");
		ZhawWavLib.play("Guitar.wav");

		// mirror the audio signal
		double[] mirroredSignal = mirror(signal);

		// write and play modified wav file
		ZhawWavLib.write(mirroredSignal,"Guitar-mirrored.wav");
		ZhawWavLib.play("Guitar-mirrored.wav");
	}
	
	static double[] mirror(double[] signal) {
		double[] newSignal = new double[signal.length];
		for (int i=0; i<signal.length; i++) {
			int index = signal.length-1-i;
			newSignal[index] = signal[i];
		}
		return newSignal;
	}
}