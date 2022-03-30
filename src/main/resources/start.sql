CREATE TABLE USER_INFO (ID bigint not null, MAIL varchar(60) not null, PASSWORD varchar(60) not null,
                        NAME varchar(30));

CREATE TABLE MEASUREMENT
(ID bigint not null, NAME varchar(60) not null, LENGTH bigint, HEIGHT varchar(100) not null,WIDTH varchar(100) not null,WEIGHT varchar(100) not null,DATE varchar(100) not null,DIM_UNIT,LEN_UNIT,USER_DEFINED_TYPE_NAME
 primary key (ID));