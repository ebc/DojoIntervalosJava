package intervalos;

import java.util.Arrays;

public class Intervalos {
	
	int[] numeros;
	private int[][] intervalos;
	
	public Intervalos(int[] numeros){
		this.numeros = numeros;
		Arrays.sort(this.numeros);
		intervalos = new int[numeros.length][];
	}

	public int[] getNumeros() {
		return numeros; 
	}

	public int[][] getIntervalos() {
		int indiceIntervalo = 0;
		int[] intervaloCorrente = new int[]{numeros[0], numeros[0]};
		intervalos[0] = intervaloCorrente;
		for(int i = 1; i < numeros.length; i++){
			int numero = numeros[i];
			
			if(numero-1 == numeros[i-1]){
				intervalos[indiceIntervalo][1] = numeros[i];
			}
			else{
				indiceIntervalo++;
				intervalos[indiceIntervalo] = new int[]{numeros[i], numeros[i]};
			}
		}
		return Arrays.copyOf(intervalos, indiceIntervalo+1);
	}

}
