DROP TABLE IF EXISTS countries;

CREATE TABLE countries
(
    id   VARCHAR(36)  NOT NULL,
    name VARCHAR(128) NOT NULL,
    PRIMARY KEY (id)
);