INSERT INTO t_cheeps
(
    user_id
  , cheeped_text
  , cheeped_application_name
  , parent_cheep_id
  , is_deleted
  , created_at
  , updated_at
)
VALUES
(
    ?
  , ?
  , ?
  , ?
  , '0'
  , CURRENT_TIMESTAMP
  , CURRENT_TIMESTAMP
)
;
