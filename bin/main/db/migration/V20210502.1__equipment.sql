create table EQUIPMENT
(
    ID   INT PRIMARY KEY,
    INFO VARCHAR(500) not null,
    NAME VARCHAR(100) not null
        unique
);

INSERT INTO EQUIPMENT (ID, INFO, NAME) VALUES (1, '4 Cent / Seite', 'A4 Drucker Schwarz/Weiß');
INSERT INTO EQUIPMENT (ID, INFO, NAME) VALUES (2, '15 Cent / Seite', 'A4 Drucker Farbig');
INSERT INTO EQUIPMENT (ID, INFO, NAME) VALUES (3, '8 Cent / Seite', 'A3 Drucker Schwarz/Weiß');
INSERT INTO EQUIPMENT (ID, INFO, NAME) VALUES (4, '30 Cent  /Seite', 'A3 Drucker Farbig');
INSERT INTO EQUIPMENT (ID, INFO, NAME) VALUES (5, '2 Euro / qm', 'Plotter');