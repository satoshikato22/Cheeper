SELECT DISTINCT
    tl.cheep_id
  , tl.user_id
  , tl.cheeped_text
  , tl.cheeped_application_name
  , tl.parent_cheep_id
  , tl.likes_number
  , tl.dislikes_number
  , tl.recheeps_number
  , tl.is_recheep
  , tl.is_deleted
  , tl.created_at
  , tl.updated_at
  , tl.order_at
FROM
(
    SELECT DISTINCT
        vche.cheep_id
      , vche.user_id
      , vche.cheeped_text
      , vche.cheeped_application_name
      , vche.parent_cheep_id
      , vche.likes_number
      , vche.dislikes_number
      , vche.recheeps_number
      , CASE WHEN rch.id IS NOT NULL
        THEN '1'
        ELSE
            CASE WHEN fol.id IS NOT NULL
            THEN '0'
            ELSE NULL
            END
        END is_recheep
      , vche.is_deleted
      , vche.created_at
      , vche.updated_at
      , CASE WHEN rch.id IS NOT NULL
        THEN rch.created_at
        ELSE
            CASE WHEN fol.id IS NOT NULL
            THEN vche.created_at
            ELSE NULL
            END
        END order_at
    FROM v_cheeps vche
    LEFT JOIN t_user_follows fol
     ON fol.is_deleted = '0'
    AND vche.user_id = fol.follow_user_id
    AND (
            vche.user_id = ?
         OR fol.followed_user_id = ?
        )
    LEFT JOIN t_cheep_recheeps rch
     ON rch.is_deleted = '0'
    AND vche.cheep_id = rch.cheep_id
    AND rch.user_id = ?
    WHERE vche.is_deleted = '0'
) tl
WHERE tl.is_recheep IS NOT NULL
ORDER BY tl.order_at DESC
;
