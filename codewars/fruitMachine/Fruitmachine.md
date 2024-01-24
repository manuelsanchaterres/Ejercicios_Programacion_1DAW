<!-- 
1. There are always exactly three reels

2. Each reel has 10 different items.

3. The three reel inputs may be different.

4. The spin array represents the index of where the reels finish.

5. The three spin inputs may be different

6. Three of the same is worth more than two of the same

7. Two of the same plus one "Wild" is double the score.

8. No matching items returns 0. 

LINK: https://www.codewars.com/kata/590adadea658017d90000039/train/java -->

Función fruit(final String[][] reels, final int[] spins):
	
	ArrayList<String> itemsReelCapturados = capturarItemsReel(reels, spins)
	int totalPuntos = 0;
	int indiceTabla = -1;
	int totalCoincidencias = compararItems(itemsReelCapturados);
	
	si totalCoincidencias es igual a 1 entonces:
		Devolver totalPuntos
	sino si totalCoincidencias es igual a 2 entonces:
	
	sino si totalCoincidencias es igual a 3 entonces:
	
Fin Función

Función capturarItemsReel(final String[][] reels, final int[] spins):
	
	ArrayList <String> itemsReelCapturados;
	String reelItemCapturado;
	Para i desde 0 a longitud de reels menos 1:
		
		ACCEDEMOS A CADA String ARRAY DE REELS Y DESPUÉS CAPTURAMOS EL VALOR DE LA POSICIÓN I DE SPINS, QUE SERÁ EL INDICE DEL STRING A CAPTURAR EN REELS Y LO ASIGNAMOS A VARIABLE STRING reelItemCapturado
		AÑADIMOS ITEM CAPTURADO A ARRAYLIST itemsReelCapturados
		
		
	Devolver itemsReelCapturados
	
Fin Función

Función compararItems(ArrayList <String> itemsReelCapturados):
	
	int numeroCoincidencias = 1;

	Para i desde 1 hasta longitud itemsReelCapturados - 1:
	
		si itemsReelCapturados[i] es igual a itemsReelCapturados[0] entonces:
		
			incrementamos numeroCoincidencias en 1 unidad
			
	Devolver numeroCoincidencias
			
Fin Función
