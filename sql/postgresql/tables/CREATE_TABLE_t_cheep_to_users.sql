CREATE TABLE t_cheep_to_users
(
    id SERIAL NOT NULL
  , cheep_id NUMERIC(10,0) NOT NULL
  , to_user_id VARCHAR(20) NOT NULL
  , created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
  , updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
  , PRIMARY KEY (id)
);
COMMENT ON TABLE t_cheep_to_users IS 'チープ送り先ユーザテーブル';
COMMENT ON COLUMN t_cheep_to_users.id IS '連番';
COMMENT ON COLUMN t_cheep_to_users.cheep_id IS 'チープID';
COMMENT ON COLUMN t_cheep_to_users.to_user_id IS '送り先ユーザID';
COMMENT ON COLUMN t_cheep_to_users.created_at IS '作成日時';
COMMENT ON COLUMN t_cheep_to_users.updated_at IS '更新日時';
