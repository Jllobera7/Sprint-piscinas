este es mi pseudocodigo para la realizacion de los calculos del ejercicio de las piscinas


INICIO

#1. Definir dimensiones de las piscinas

piscina1_largo = 300
piscina1_ancho = 150
piscina1_profundidad = 20	

piscina2_largo = 300
piscina2_ancho = 80
piscina2_profundidad = 35

#2. Calcular área de cada piscina
	

area_piscina2 = piscina2_ancho * piscina2_largo

#3. Calcular volumen de cada piscina
	

volumen_piscina2 = area_piscina2 * piscina2_profundidad	

#4.Calcular espacio total cuando están juntas
		espacio_ancho_total = piscina1_ancho + piscina2_ancho 
		espacio_largo_total = piscina1_largo	

#5.Calcular área total de ambas piscina
		area_total = espacio_ancho_total * espacio_largo_total

#6. Calcular volumen total de ambas piscinas
		volumen_total = volumen_pisicna1 + volumen_piscina2

#7. Intercambiamos la profundidad de las piscinas y volvemos a calcular el volumen de cada una
		piscina1_profundidad := piscina2_profundidad
		piscina2_profundidad := piscina1_profundidad


FIN
