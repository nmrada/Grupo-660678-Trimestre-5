-- CREA UNA FUNCION
create function tiendaenlinea.text6(s varchar(20))
returns char(50)
return concat('Hola ',s, '!');

-- ELIMINAR UNA FUNCION
drop function tiendaenlinea.text6;

-- MUESTRA EL CONTENIDO DE LA FUNCION O PROCEDIMIENTO
show create function tiendaenlinea.text6;

-- EJECUCION FUNCION
select tiendaenlinea.text6('Nicolas');

create function tiendaenlinea.iva (iva float,valor float)
returns float
return valor/100*iva;

select tiendaenlinea.iva(16,1000);