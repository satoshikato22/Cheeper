CREATE TABLE m_users
(
    id SERIAL NOT NULL
  , user_id VARCHAR(20) NOT NULL
  , user_name VARCHAR(50) NOT NULL
  , password VARCHAR(20) NOT NULL
  , email_address VARCHAR(50)
  , tel_no VARCHAR(11)
  , birthed_on TIMESTAMP
  , location VARCHAR(30)
  , website VARCHAR(100)
  , self_introduction VARCHAR(160)
  , country_code CHAR(2) DEFAULT 'JP' NOT NULL
  , display_language CHAR(2) DEFAULT 'JP' NOT NULL
  , is_deleted CHAR(1) DEFAULT '0' NOT NULL
  , created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
  , updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
  , PRIMARY KEY (user_id)
);
COMMENT ON TABLE m_users IS 'ユーザマスタ';
COMMENT ON COLUMN m_users.id IS '連番';
COMMENT ON COLUMN m_users.user_id IS 'ユーザID';
COMMENT ON COLUMN m_users.user_name IS 'ユーザ名';
COMMENT ON COLUMN m_users.password IS 'パスワード';
COMMENT ON COLUMN m_users.email_address IS 'メールアドレス';
COMMENT ON COLUMN m_users.tel_no IS '電話番号';
COMMENT ON COLUMN m_users.birthed_on IS '誕生日';
COMMENT ON COLUMN m_users.location IS '場所';
COMMENT ON COLUMN m_users.website IS 'ウェブサイト';
COMMENT ON COLUMN m_users.self_introduction IS '自己紹介';
COMMENT ON COLUMN m_users.country_code IS '国コード';
COMMENT ON COLUMN m_users.display_language IS '表示言語';
COMMENT ON COLUMN m_users.is_deleted IS '削除フラグ';
COMMENT ON COLUMN m_users.created_at IS '作成日時';
COMMENT ON COLUMN m_users.updated_at IS '更新日時';
