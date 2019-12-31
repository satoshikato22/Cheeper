CREATE OR REPLACE VIEW v_cheeps
(
    cheep_id
  , user_id
  , cheeped_text
  , cheeped_application_name
  , parent_cheep_id
  , likes_number
  , dislikes_number
  , recheeps_number
  , is_deleted
  , created_at
  , updated_at
) AS SELECT
    che.cheep_id
  , che.user_id
  , che.cheeped_text
  , che.cheeped_application_name
  , che.parent_cheep_id
  , CASE WHEN agg_eva.likes_number IS NOT NULL
    THEN agg_eva.likes_number
    ELSE 0
    END
  , CASE WHEN agg_eva.dislikes_number IS NOT NULL
    THEN agg_eva.dislikes_number
    ELSE 0
    END
  , CASE WHEN agg_rch.recheeps_number IS NOT NULL
    THEN agg_rch.recheeps_number
    ELSE 0
    END
  , che.is_deleted
  , che.created_at
  , che.updated_at
FROM t_cheeps che
LEFT JOIN (
            SELECT
                eva.cheep_id
              , SUM(
                    CASE WHEN eva.evaluation_status = '0'
                    THEN 1
                    ELSE 0
                    END
                ) likes_number
              , SUM(
                    CASE WHEN eva.evaluation_status = '1'
                    THEN 1
                    ELSE 0
                    END
                ) dislikes_number
            FROM t_cheep_evaluations eva
            WHERE eva.is_deleted = '0'
            GROUP BY eva.cheep_id
          ) agg_eva
 ON che.cheep_id = agg_eva.cheep_id
LEFT JOIN (
            SELECT
                rch.cheep_id
              , COUNT(rch.user_id) recheeps_number
            FROM t_cheep_recheeps rch
            WHERE rch.is_deleted = '0'
            GROUP BY rch.cheep_id
          ) agg_rch
 ON che.cheep_id = agg_rch.cheep_id
;
COMMENT ON VIEW v_cheeps IS 'チープビュー';
COMMENT ON COLUMN v_cheeps.cheep_id IS 'チープID';
COMMENT ON COLUMN v_cheeps.user_id IS 'ユーザID';
COMMENT ON COLUMN v_cheeps.cheeped_text IS 'チープ本文';
COMMENT ON COLUMN v_cheeps.cheeped_application_name IS 'チープアプリ名';
COMMENT ON COLUMN v_cheeps.parent_cheep_id IS '親チープID';
COMMENT ON COLUMN v_cheeps.likes_number IS 'いいね数';
COMMENT ON COLUMN v_cheeps.dislikes_number IS 'よくないね数';
COMMENT ON COLUMN v_cheeps.recheeps_number IS 'リチープ数';
COMMENT ON COLUMN v_cheeps.is_deleted IS '削除フラグ';
COMMENT ON COLUMN v_cheeps.created_at IS 'チープ日時';
COMMENT ON COLUMN v_cheeps.updated_at IS '更新日時';
