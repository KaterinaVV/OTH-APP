CREATE TABLE election_candidate
(
    id    serial PRIMARY KEY,
    info  json  NOT NULL,
    image bytea NULL
);

CREATE TABLE election_info
(
    id   serial PRIMARY KEY,
    info json NOT NULL
);