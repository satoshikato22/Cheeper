INSERT INTO t_cheeps
(
    user_id
  , user_name
  , password
  , email_address
  , tel_no
  , birthed_on
  , location
  , website
  , self_introduction
  , country_code
  , display_language
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
  , ?
  , ?
  , ?
  , ?
  , ?
  , ?
  , ?
  , '0'
  , CURRENT_TIMESTAMP
  , CURRENT_TIMESTAMP
)
;
