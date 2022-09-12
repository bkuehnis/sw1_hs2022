package tza.ch.zhaw.bieriol2.uebung5;

import ch.zhaw.lib.ZhawWavLib;

public class Audio3 {

	public static void main(String[] args) {
		// read and play original wav file
		double[] signal = ZhawWavLib.read("Guitar.wav");
		ZhawWavLib.play("Guitar.wav");

		// transpose signal
		double[] signalQuinte = quinte(signal);
		double[] signalOktave = oktave(signal);

		// write and play modified wav file
		ZhawWavLib.write(signalQuinte, "Guitar-quinte.wav");
		ZhawWavLib.play("Guitar-quinte.wav");
		ZhawWavLib.write(signalOktave, "Guitar-oktave.wav");
		ZhawWavLib.play("Guitar-oktave.wav");
	}

	// TODO: add methods quinte and oktave
	static double[] quinte(double[] signal) {
		double[] newSignal = new double[signal.length * 2 / 3];
		int x = 0;
		for (int i = 0; i < newSignal.length; i++) {
			if (i == 0) {
				newSignal[i] = signal[x];
				x++;
			} else if (i % 2 == 0) {
				x++;
				newSignal[i] = signal[x];
				x++;
			} else {
				newSignal[i] = signal[x];
				x++;
			}
		}
		return newSignal;
	}

	static double[] oktave(double[] signal) {
		double[] newSignal = new double[signal.length / 2];
		for (int i = 0; i < newSignal.length; i++) {
			newSignal[i] = signal[i * 2];
		}
		return newSignal;

	}

}
