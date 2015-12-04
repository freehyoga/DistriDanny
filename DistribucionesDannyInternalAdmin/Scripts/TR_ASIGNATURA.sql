DROP TRIGGER IF EXISTS tr_dist_asignatura_insert;
DELIMITER $$

CREATE DEFINER=`root`@`localhost` TRIGGER tr_dist_asignatura_insert
BEFORE INSERT ON `dist_asignatura` 
FOR EACH ROW
BEGIN 
	if(new.ID = '0') THEN 
		SET new.ID = F_GENERA_ID('dist_asignatura');
	end if;
END;$$
DELIMITER ;