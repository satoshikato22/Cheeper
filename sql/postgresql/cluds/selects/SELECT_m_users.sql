SELECT
    usr.id
  , usr.user_id
  , usr.user_name
  , usr.password
  , usr.email_address
  , usr.tel_no
  , usr.birthed_on
  , usr.location
  , usr.website
  , usr.self_introduction
  , usr.country_code
  , usr.display_language
  , usr.is_deleted
  , usr.created_at
  , usr.updated_at
FROM m_users usr
WHERE usr.user_id = ?
;
