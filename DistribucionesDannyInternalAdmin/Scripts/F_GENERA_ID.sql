USE `distdanny`;
DROP function IF EXISTS `F_GENERA_ID`;

DELIMITER $$
USE `distdanny`$$
create function F_GENERA_ID (NM_TABLA varchar(50))
returns varchar(20)
begin
	 DECLARE V_LlaveGenarada varchar(20);
	 DECLARE v_siguiente INT;

	SELECT secuencia + 1
	INTO v_siguiente FROM dist_secuencias WHERE NOMBRE_TABLA = NM_TABLA FOR UPDATE;
    
	UPDATE dist_secuencias SET  secuencia = v_siguiente
	WHERE NOMBRE_TABLA = NM_TABLA;

	set V_LlaveGenarada = CONCAT('DIST',V_SIGUIENTE);
    return(V_LlaveGenarada);
     
end$$

DELIMITER ;
