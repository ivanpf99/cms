/*UPDATE perro SET id_raza = 3 WHERE id = 5;
UPDATE perro SET nombre = "pulgoso", historia = "no se lava mucho" WHERE id = 5;
*/
/*SELECT 
p.id,
p.nombre,
p.historia,
r.nombre as raza
 FROM perro AS p INNER JOIN raza AS r ON p.id_raza = r.id*/
 
 SELECT 
p.id,
p.nombre,
p.historia,
r.nombre as raza,
vacunaciones.id_vacuna
 FROM perro AS p INNER JOIN raza AS r ON p.id_raza = r.id
LEFT JOIN vacunaciones on p.id = vacunaciones.id_perro
LEFT JOIN vacuna as v on vacunaciones.id_vacuna = v.id;
