create table flowers (
    DATABASE_ID numeric(11) not null,
    petal_length numeric(11) not null,
    petal_width numeric(11) not null,
    sepal_length numeric(11) not null,
    sepal_width numeric(11) not null,
    class text not null
);

alter table flowers add constraint fl_pk_constraint primary key ( database_id );
create sequence flowerseq increment by 50 minvalue 1 start with 1;