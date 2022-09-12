package tza.ch.zhaw.ajrizple.uebung5;

import ch.zhaw.lib.ZhawWavLib;

public class Audio2 {

	public static void main(String[] args) {
		// read and play original wav file
		double[] signal = ZhawWavLib.read("Guitar.wav");
		ZhawWavLib.play("Guitar.wav");

		// change the volume
		double[] lowSignal = changeVolume(signal, 0.5);
		double[] highSignal = changeVolume(signal, 1.5);

		// write and play modified wav file
		ZhawWavLib.write(lowSignal,"Guitar-lowvolume.wav");
		ZhawWavLib.play("Guitar-lowvolume.wav");
		ZhawWavLib.write(highSignal,"Guitar-highvolume.wav");
		ZhawWavLib.play("Guitar-highvolume.wav");
	}
	
	
	// TODO: add method changeVolume.
	// changes the volume by the given factor and return the new signal
	// limit the signal to +/-1.0
	static double[] changeVolume(double[] signal, double volume) {
		double[] newSignal = new double[signal.length];
		for (int i=0; i<signal.length; i++) {
			newSignal[i] = signal[i] * volume;
		}
		return newSignal;
	}

}
