CREATE TABLE T_USER_FOLLOWS
(
    ID NUMBER(10,0) GENERATED BY DEFAULT AS IDENTITY NOT NULL
  , FOLLOWED_USER_ID VARCHAR2(20) NOT NULL
  , FOLLOW_USER_ID VARCHAR2(20) NOT NULL
  , IS_DELETED CHAR(1) DEFAULT '0' NOT NULL
  , CREATED_AT DATE DEFAULT SYSDATE NOT NULL
  , UPDATED_AT DATE DEFAULT SYSDATE NOT NULL
  , PRIMARY KEY (ID)
);
COMMENT ON TABLE T_USER_FOLLOWS IS 'ユーザフォローテーブル';
COMMENT ON COLUMN T_USER_FOLLOWS.ID IS '連番';
COMMENT ON COLUMN T_USER_FOLLOWS.FOLLOWED_USER_ID IS 'フォローしたユーザID';
COMMENT ON COLUMN T_USER_FOLLOWS.FOLLOW_USER_ID IS 'フォローするユーザID';
COMMENT ON COLUMN T_USER_FOLLOWS.IS_DELETED IS '削除フラグ';
COMMENT ON COLUMN T_USER_FOLLOWS.CREATED_AT IS '作成日時';
COMMENT ON COLUMN T_USER_FOLLOWS.UPDATED_AT IS '更新日時';
