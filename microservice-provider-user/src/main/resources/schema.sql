DROP TABLE USER if EXISTS ;
CREATE TABLE USER (
    id bigint generated BY DEFAULT as IDENTITY ,
    username VARCHAR (40),
    NAME VARCHAR (20),
    age INT (3),
    balance DECIMAL (10,2),
    PRIMARY KEY (id)
  );