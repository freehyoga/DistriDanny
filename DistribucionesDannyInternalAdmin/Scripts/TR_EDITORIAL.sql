DROP TRIGGER IF EXISTS tr_dist_editorial_insert;
DELIMITER $$

CREATE TRIGGER tr_dist_editorial_insert
BEFORE INSERT ON `dist_editorial` 
FOR EACH ROW
BEGIN 
	if(new.ID = '0') THEN 
		SET new.ID = F_GENERA_ID('dist_editorial');
	end if;
END;$$
DELIMITER ;