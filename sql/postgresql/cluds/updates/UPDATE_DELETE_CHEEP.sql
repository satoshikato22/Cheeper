UPDATE t_cheeps
SET is_deleted = '1'
  , updated_at = CURRENT_TIMESTAMP
WHERE cheep_id = ?
;
