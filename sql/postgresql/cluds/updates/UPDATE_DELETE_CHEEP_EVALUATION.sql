UPDATE t_cheep_evaluations
SET is_deleted = '1'
  , updated_at = CURRENT_TIMESTAMP
WHERE cheep_id = ?
  AND user_id = ?
  AND evaluation_status = ?
;
