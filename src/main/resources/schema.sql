CREATE TABLE todo
(
    id            BIGINT       NOT NULL,
    description   VARCHAR(255) NOT NULL,
    status        INT          NOT NULL,
    priority      INT          NOT NULL,
    is_completed  BIT(1)       NOT NULL,
    created_date  datetime     NOT NULL,
    modified_date datetime     NOT NULL,
    end_date      datetime     NOT NULL,
    time_left     VARCHAR(255) NOT NULL,
    CONSTRAINT pk_todo PRIMARY KEY (id)
);