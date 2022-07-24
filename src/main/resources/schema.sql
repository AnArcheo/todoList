CREATE TABLE todo
(
    id            INTEGER AUTO_INCREMENT,
    description   VARCHAR(255),
    status        VARCHAR(9),
    priority      VARCHAR(12),
    is_completed  BOOLEAN,
    created_date  TIMESTAMP,
    modified_date TIMESTAMP,
    PRIMARY KEY (id)
);

CREATE TABLE users
(
    id       INTEGER AUTO_INCREMENT,
    username VARCHAR(255),
    passwords VARCHAR(255),

);