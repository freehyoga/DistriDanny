DROP TRIGGER IF EXISTS tr_dist_material_insert;
DELIMITER $$

CREATE TRIGGER tr_dist_material_insert
BEFORE INSERT ON dist_material 
FOR EACH ROW
BEGIN 
	if(new.ID = '0') THEN 
		SET new.ID = F_GENERA_ID('dist_material');
	end if;
END;$$
DELIMITER ;