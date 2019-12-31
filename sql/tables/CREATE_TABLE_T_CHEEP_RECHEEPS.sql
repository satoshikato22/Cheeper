CREATE TABLE T_CHEEP_RECHEEPS
(
    ID NUMBER(10,0) GENERATED BY DEFAULT AS IDENTITY NOT NULL
  , CHEEP_ID NUMBER(10,0) NOT NULL
  , USER_ID VARCHAR2(20) NOT NULL
  , IS_DELETED CHAR(1) DEFAULT '0' NOT NULL
  , CREATED_AT DATE DEFAULT SYSDATE NOT NULL
  , UPDATED_AT DATE DEFAULT SYSDATE NOT NULL
  , PRIMARY KEY (ID)
);
COMMENT ON TABLE T_CHEEP_RECHEEPS IS 'チープリチープテーブル';
COMMENT ON COLUMN T_CHEEP_RECHEEPS.ID IS '連番';
COMMENT ON COLUMN T_CHEEP_RECHEEPS.CHEEP_ID IS 'チープID';
COMMENT ON COLUMN T_CHEEP_RECHEEPS.USER_ID IS 'ユーザID';
COMMENT ON COLUMN T_CHEEP_RECHEEPS.IS_DELETED IS '削除フラグ';
COMMENT ON COLUMN T_CHEEP_RECHEEPS.CREATED_AT IS '作成日時';
COMMENT ON COLUMN T_CHEEP_RECHEEPS.UPDATED_AT IS '更新日時';
