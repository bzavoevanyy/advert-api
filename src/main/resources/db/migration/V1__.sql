CREATE TABLE advert
(
    id                 UUID NOT NULL,
    header             VARCHAR(255),
    content            VARCHAR(4096),
    user_name          VARCHAR(255),
    phone_number       VARCHAR(255),
    created_date       TIMESTAMP WITHOUT TIME ZONE,
    last_modified_date TIMESTAMP WITHOUT TIME ZONE,
    CONSTRAINT pk_advert PRIMARY KEY (id)
);