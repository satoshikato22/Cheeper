UPDATE m_users
SET is_deleted = '1'
  , updated_at = CURRENT_TIMESTAMP
WHERE user_id = ?
;
