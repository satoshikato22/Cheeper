INSERT INTO t_cheep_evaluations
(
    cheep_id
  , user_id
  , evaluation_status
  , is_deleted
  , created_at
  , updated_at
)
VALUES
(
    ?
  , ?
  , ?
  , '0'
  , CURRENT_TIMESTAMP
  , CURRENT_TIMESTAMP
)
;
