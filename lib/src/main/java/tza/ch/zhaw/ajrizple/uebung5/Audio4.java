package tza.ch.zhaw.ajrizple.uebung5;

import ch.zhaw.lib.ZhawWavLib;

public class Audio4 {

	public static void main(String[] args) {
		// read and play original wav file
		double[] signal = ZhawWavLib.read("Guitar-noisy.wav");
		ZhawWavLib.play("Guitar-noisy.wav");

		// apply lowpass filter
		// TODO: Call method lowpassFilter. Select window length
		double[] lowpassSignal = lowpassFilter(signal, 3);

		// write and play modified wav file
		ZhawWavLib.write(lowpassSignal,"Guitar-lowpass.wav");
		ZhawWavLib.play("Guitar-lowpass.wav");
	}
	
	static double[] lowpassFilter(double[] signal, int windowLength) {
		double[] newSignal = new double[signal.length];
		for (int i=0; i<signal.length; i++) {
			try{
				newSignal[i] = (signal[i] + signal[i+1] + signal[i+2] )/ windowLength;
			}catch (Exception e){

			}

		}
		return newSignal;
	}}//TODO Besprechen mit Dozent. Deine Lösung kompilierte nicht.