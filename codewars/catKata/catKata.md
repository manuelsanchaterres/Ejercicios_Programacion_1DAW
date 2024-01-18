<!-- In this, the first and simplest of a planned trilogy of cat katas :-), all you have to do is determine whether the distances between any visiting cats are large enough to make for a peaceful afternoon, or whether there is about to be an altercation someone will need to deal with by carrying one of them into the house or squirting them with water or what have you.

As input your function will receive a list of strings representing the yard as a grid, and an integer representing the minimum distance needed to prevent problems (considering the cats' current states of sleepiness). A point with no cat in it will be represented by a "-" dash. Lou, Mustache Cat, and Raoul will be represented by an upper case L, M, and R respectively. At any particular time all three cats may be in the yard, or maybe two, one, or even none.

If the number of cats in the yard is one or none, or if the distances between all cats are at least the minimum distance, your function should return True/true/TRUE (depending on what language you're using), but if there are two or three cats, and the distance between at least two of them is smaller than the minimum distance, your function should return False/false/FALSE.-->

<!-- https://www.codewars.com/kata/5869848f2d52095be20001d1/train/java -->

Función peacefulYard(String[] yard, int minDistance):

    int numberCats = 0;
    BÚSQUEDA NÚMERO DE GATOS EN EL JARDÍN

    Para i desde 0 hasta longitud de yard - 1:

        Para j desde 0 hasta longitud de yard[i] - 1:

            Si yard[i][j] es igual a "L","M","R":
                Incrementar variable numberCats en 1


    Si numberCats es igual a 1:
        devolver true
    
    

    devolver numberCats

Fin Función

