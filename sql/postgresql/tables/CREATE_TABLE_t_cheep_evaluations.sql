CREATE TABLE t_cheep_evaluations
(
    id SERIAL NOT NULL
  , cheep_id NUMERIC(10,0) NOT NULL
  , user_id VARCHAR(20) NOT NULL
  , evaluation_status CHAR(1) DEFAULT '0' NOT NULL
  , is_deleted CHAR(1) DEFAULT '0' NOT NULL
  , created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
  , updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
  , PRIMARY KEY (id)
);
COMMENT ON TABLE t_cheep_evaluations IS 'チープ評価テーブル';
COMMENT ON COLUMN t_cheep_evaluations.id IS '連番';
COMMENT ON COLUMN t_cheep_evaluations.cheep_id IS 'チープID';
COMMENT ON COLUMN t_cheep_evaluations.user_id IS 'ユーザID';
COMMENT ON COLUMN t_cheep_evaluations.evaluation_status IS '評価ステータス';
COMMENT ON COLUMN t_cheep_evaluations.is_deleted IS '削除フラグ';
COMMENT ON COLUMN t_cheep_evaluations.created_at IS '作成日時';
COMMENT ON COLUMN t_cheep_evaluations.updated_at IS '更新日時';
