CREATE TABLE t_cheep_images
(
    id SERIAL NOT NULL
  , cheep_id NUMERIC(10,0) NOT NULL
  , display_order NUMERIC(1,0) DEFAULT 1 NOT NULL
  , image_path VARCHAR(100) NOT NULL
  , created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
  , updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
  , PRIMARY KEY (cheep_id, display_order)
);
COMMENT ON TABLE t_cheep_images IS 'チープ画像テーブル';
COMMENT ON COLUMN t_cheep_images.id IS '連番';
COMMENT ON COLUMN t_cheep_images.cheep_id IS 'チープID';
COMMENT ON COLUMN t_cheep_images.display_order IS '表示順';
COMMENT ON COLUMN t_cheep_images.image_path IS '画像パス';
COMMENT ON COLUMN t_cheep_images.created_at IS '作成日時';
COMMENT ON COLUMN t_cheep_images.updated_at IS '更新日時';
