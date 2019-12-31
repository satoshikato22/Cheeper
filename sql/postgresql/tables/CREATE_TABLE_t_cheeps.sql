CREATE TABLE t_cheeps
(
    cheep_id SERIAL NOT NULL
  , user_id VARCHAR(20) NOT NULL
  , cheeped_text VARCHAR(140) NOT NULL
  , cheeped_application_name VARCHAR(20)
  , parent_cheep_id NUMERIC(10,0)
  , is_deleted CHAR(1) DEFAULT '0' NOT NULL
  , created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
  , updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
  , PRIMARY KEY (cheep_id)
);
COMMENT ON TABLE t_cheeps IS 'チープテーブル';
COMMENT ON COLUMN t_cheeps.cheep_id IS 'チープID';
COMMENT ON COLUMN t_cheeps.user_id IS 'ユーザID';
COMMENT ON COLUMN t_cheeps.cheeped_text IS 'チープ本文';
COMMENT ON COLUMN t_cheeps.cheeped_application_name IS 'チープアプリ名';
COMMENT ON COLUMN t_cheeps.parent_cheep_id IS '親チープID';
COMMENT ON COLUMN t_cheeps.is_deleted IS '削除フラグ';
COMMENT ON COLUMN t_cheeps.created_at IS 'チープ日時';
COMMENT ON COLUMN t_cheeps.updated_at IS '更新日時';
