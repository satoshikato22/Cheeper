CREATE TABLE T_CHEEP_TO_USERS
(
    ID NUMBER(10,0) GENERATED BY DEFAULT AS IDENTITY NOT NULL
  , CHEEP_ID NUMBER(10,0) NOT NULL
  , TO_USER_ID VARCHAR2(20) NOT NULL
  , CREATED_AT DATE DEFAULT SYSDATE NOT NULL
  , UPDATED_AT DATE DEFAULT SYSDATE NOT NULL
  , PRIMARY KEY (ID)
);
COMMENT ON TABLE T_CHEEP_TO_USERS IS 'チープ送り先ユーザテーブル';
COMMENT ON COLUMN T_CHEEP_TO_USERS.ID IS '連番';
COMMENT ON COLUMN T_CHEEP_TO_USERS.CHEEP_ID IS 'チープID';
COMMENT ON COLUMN T_CHEEP_TO_USERS.TO_USER_ID IS '送り先ユーザID';
COMMENT ON COLUMN T_CHEEP_TO_USERS.CREATED_AT IS '作成日時';
COMMENT ON COLUMN T_CHEEP_TO_USERS.UPDATED_AT IS '更新日時';
