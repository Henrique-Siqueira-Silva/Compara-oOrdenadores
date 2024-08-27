package view;

import controller.ordenar;

public class main {

	public static void main(String[] args) {
		ordenar m = new ordenar();
		int[] vet = new int[1500];
		
//		bubble
		
		vet = carregaVet(vet);
		
		double TempoInicio = System.nanoTime();
		vet = m.Bublle(vet);
		double totaltime = (System.nanoTime() - TempoInicio);
		totaltime = (totaltime / Math.pow(10, 9));
		System.out.println("Bubble " +totaltime);
		
//		Merge
		
		vet = carregaVet(vet);
		
		double TempoInicio1 = System.nanoTime();
		vet = m.Merge(vet);
		double totaltime1 = (System.nanoTime() - TempoInicio1);
		totaltime1 = (totaltime1 / Math.pow(10, 9));
		System.out.println("merge " +totaltime1);
		
//		Quick
		
		vet = carregaVet(vet);
		
		double TempoInicio2 = System.nanoTime();
		vet = m.Quick(vet);
		double totaltime2 = (System.nanoTime() - TempoInicio2);
		totaltime2 = (totaltime2 / Math.pow(10, 9));
		System.out.println("quick " +totaltime2);




	}

	public static int[] carregaVet(int[] vet) {
		for (int i = 0 ; i < 1500; i++) {
			vet[i] = (int) (Math.random() *1000 +1);
			
		}
		return vet;
	}

}
