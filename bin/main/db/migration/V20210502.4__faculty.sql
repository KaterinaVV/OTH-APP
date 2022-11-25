create table FACULTY
(
    ID           INT PRIMARY KEY,
    IDENTIFIER   VARCHAR(3)   not null
        unique,
    NAME         VARCHAR(100) not null,
    COLOR        VARCHAR(6),
    WEBUNTIS_ID  INT,
    JOBMARKET_ID INT
);

create unique index FACULTY_WEBUNTIS_ID_IDX
    on FACULTY (WEBUNTIS_ID);

INSERT INTO FACULTY (ID, IDENTIFIER, NAME, COLOR, WEBUNTIS_ID, JOBMARKET_ID) VALUES (1, 'ANK', 'Angewandte Natur- und Kulturwissenschaften', 'CCCC99', 8, 45);
INSERT INTO FACULTY (ID, IDENTIFIER, NAME, COLOR, WEBUNTIS_ID, JOBMARKET_ID) VALUES (2, 'ARC', 'Architektur', 'F0D700', 4, 46);
INSERT INTO FACULTY (ID, IDENTIFIER, NAME, COLOR, WEBUNTIS_ID, JOBMARKET_ID) VALUES (3, 'BAU', 'Bauingenieurwesen', 'F37623', 5, 47);
INSERT INTO FACULTY (ID, IDENTIFIER, NAME, COLOR, WEBUNTIS_ID, JOBMARKET_ID) VALUES (4, 'BW', 'Betriebswirtschaft', 'D13D3D', 2, 48);
INSERT INTO FACULTY (ID, IDENTIFIER, NAME, COLOR, WEBUNTIS_ID, JOBMARKET_ID) VALUES (5, 'EI', 'Elektro- und Informationstechnik', '660066', 6, 49);
INSERT INTO FACULTY (ID, IDENTIFIER, NAME, COLOR, WEBUNTIS_ID, JOBMARKET_ID) VALUES (6, 'MB', 'Maschinenbau', '45A9A9', 3, 51);
INSERT INTO FACULTY (ID, IDENTIFIER, NAME, COLOR, WEBUNTIS_ID, JOBMARKET_ID) VALUES (7, 'ASG', 'Angewandte Sozial- und Gesundheitswissenschaften', '006633', 1, 52);
INSERT INTO FACULTY (ID, IDENTIFIER, NAME, COLOR, WEBUNTIS_ID, JOBMARKET_ID) VALUES (8, 'IM', 'Informatik und Mathematik', '4A78D3', 7, 50);
INSERT INTO FACULTY (ID, IDENTIFIER, NAME, COLOR, WEBUNTIS_ID, JOBMARKET_ID) VALUES (9, 'AL', 'Alumni', null, 17, null);