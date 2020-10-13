//5.- Cuales son los elementos unicos de la lista Lista(1,3,3,4,6,7,3,7) utilice conversion a conjuntos
val lista2 = Set(1,3,3,4,6,7,3,7)
val lista2 = collection.mutable.Set(1,3,4,6,7)

//6.-Crea una mapa mutable llamado nombres que contenga los siguiente
//     "Jose", 20, "Luis", 24, "Ana", 23, "Susana", "27"
val mapa = collection.mutable.Map(("Jose", 20), ("Luis", 24), ("Ana", 23), ("Susana", 27))

//6 a.- Imprime todas la llaves del mapa
mapa.keys

//7 b.- Agrega el siguiente valor al mapa("Miguel", 23)
mapa += ("Miguel" -> 23)