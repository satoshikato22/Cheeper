CREATE TABLE t_cheep_recheeps
(
    id SERIAL NOT NULL
  , cheep_id NUMERIC(10,0) NOT NULL
  , user_id VARCHAR(20) NOT NULL
  , is_deleted CHAR(1) DEFAULT '0' NOT NULL
  , created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
  , updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
  , PRIMARY KEY (id)
);
COMMENT ON TABLE t_cheep_recheeps IS 'チープリチープテーブル';
COMMENT ON COLUMN t_cheep_recheeps.id IS '連番';
COMMENT ON COLUMN t_cheep_recheeps.cheep_id IS 'チープID';
COMMENT ON COLUMN t_cheep_recheeps.user_id IS 'ユーザID';
COMMENT ON COLUMN t_cheep_recheeps.is_deleted IS '削除フラグ';
COMMENT ON COLUMN t_cheep_recheeps.created_at IS '作成日時';
COMMENT ON COLUMN t_cheep_recheeps.updated_at IS '更新日時';
