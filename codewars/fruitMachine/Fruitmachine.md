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
	
	// INICIALIZACIAMOS CONTADOR COINCIDENCIAS AL VALOR RETORNA POR SU FUNCION
	
	int contadorElementosReelsCoincidentes = Funcion contarNumeroCoincidencias(spins);
	int puntuacionTotal;
	// UTILIZAREMOS ESTOS DOS BOOLEANOS PARA DESPUÉS CONDICIONAR EL CÁLCULO DE PUNTUACIÓN FINAL
	boolean dosIguales = false
	boolean tresIguales = false;
	//
	
	Devolver puntuacionTotal
	
Fin Función

Función contarNumeroCoincidencias(final int[] spins):
	
	// INICIALIZAMOS EN 1 YA QUE UN ITEM CONSIGO MISMO ES COINCIDENCIA
	int contadorCoincidencias = 1;
	Para i desde 0 hasta longitud spins - 1:
		
		si i es diferente de 0:
		
			si elemento i de spins es igual a elemento 0 de spins:
			
				incrementamos en 1 el número de coincidencias
				
			Fin si
			
		Fin si
		
	Fin Para	
	
	Devolver contadorCoincidencias
	
Fin Función

