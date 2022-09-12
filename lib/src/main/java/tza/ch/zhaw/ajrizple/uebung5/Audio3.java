package tza.ch.zhaw.ajrizple.uebung5;

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
		ZhawWavLib.write(signalQuinte,"Guitar-quinte.wav");
		ZhawWavLib.play("Guitar-quinte.wav");
		ZhawWavLib.write(signalOktave,"Guitar-oktave.wav");
		ZhawWavLib.play("Guitar-oktave.wav");

	}

	static double[] quinte(double[] signal) {
		double[] newSignal = new double[signal.length];
		for (int i=0; i<signal.length; i++) {
			newSignal[i] = signal[i] * 1.33;
		}
		return newSignal;
	}

	static double[] oktave(double[] signal) {
		double[] newSignal = new double[signal.length];
		for (int i=0; i<signal.length; i = i+2) {
			newSignal[i] = signal[i] * 0.5;
		}
		return newSignal;
	}


}

