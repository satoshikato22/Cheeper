CREATE TABLE t_user_follows
(
    id SERIAL NOT NULL
  , followed_user_id VARCHAR(20) NOT NULL
  , follow_user_id VARCHAR(20) NOT NULL
  , is_deleted CHAR(1) DEFAULT '0' NOT NULL
  , created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
  , updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
  , PRIMARY KEY (id)
);
COMMENT ON TABLE t_user_follows IS 'ユーザフォローテーブル';
COMMENT ON COLUMN t_user_follows.id IS '連番';
COMMENT ON COLUMN t_user_follows.followed_user_id IS 'フォローしたユーザID';
COMMENT ON COLUMN t_user_follows.follow_user_id IS 'フォローするユーザID';
COMMENT ON COLUMN t_user_follows.is_deleted IS '削除フラグ';
COMMENT ON COLUMN t_user_follows.created_at IS '作成日時';
COMMENT ON COLUMN t_user_follows.updated_at IS '更新日時';
