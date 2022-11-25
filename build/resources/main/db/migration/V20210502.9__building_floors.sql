create table BUILDING_FLOORS
(
    FLOOR    INT not null,
    BUILDING INT not null,
    PLAN     VARCHAR(500),
    constraint FK_BFLOOR_BUILDING
        foreign key (BUILDING) references BUILDING (ID)
);

INSERT INTO BUILDING_FLOORS (FLOOR, BUILDING, PLAN) VALUES (0, 1, 'https://www.oth-regensburg.de/fileadmin/media/lageplaene/Galgenbergstrasse_EG.pdf');
INSERT INTO BUILDING_FLOORS (FLOOR, BUILDING, PLAN) VALUES (1, 1, 'https://www.oth-regensburg.de/fileadmin/media/lageplaene/Galgenbergstrasse_1OG.pdf');
INSERT INTO BUILDING_FLOORS (FLOOR, BUILDING, PLAN) VALUES (2, 1, 'https://www.oth-regensburg.de/fileadmin/media/lageplaene/Galgenbergstrasse_2OG.pdf');
INSERT INTO BUILDING_FLOORS (FLOOR, BUILDING, PLAN) VALUES (0, 2, 'https://www.oth-regensburg.de/fileadmin/media/lageplaene/Galgenbergstrasse_EG.pdf');
INSERT INTO BUILDING_FLOORS (FLOOR, BUILDING, PLAN) VALUES (1, 2, 'https://www.oth-regensburg.de/fileadmin/media/lageplaene/Galgenbergstrasse_1OG.pdf');
INSERT INTO BUILDING_FLOORS (FLOOR, BUILDING, PLAN) VALUES (2, 2, 'https://www.oth-regensburg.de/fileadmin/media/lageplaene/Galgenbergstrasse_2OG.pdf');
INSERT INTO BUILDING_FLOORS (FLOOR, BUILDING, PLAN) VALUES (-1, 3, 'https://www.oth-regensburg.de/fileadmin/media/lageplaene/Galgenbergstrasse_UG.pdf');
INSERT INTO BUILDING_FLOORS (FLOOR, BUILDING, PLAN) VALUES (0, 3, 'https://www.oth-regensburg.de/fileadmin/media/lageplaene/Galgenbergstrasse_EG.pdf');
INSERT INTO BUILDING_FLOORS (FLOOR, BUILDING, PLAN) VALUES (1, 3, 'https://www.oth-regensburg.de/fileadmin/media/lageplaene/Galgenbergstrasse_1OG.pdf');
INSERT INTO BUILDING_FLOORS (FLOOR, BUILDING, PLAN) VALUES (2, 3, 'https://www.oth-regensburg.de/fileadmin/media/lageplaene/Galgenbergstrasse_2OG.pdf');
INSERT INTO BUILDING_FLOORS (FLOOR, BUILDING, PLAN) VALUES (0, 4, 'https://www.oth-regensburg.de/fileadmin/media/lageplaene/Galgenbergstrasse_EG.pdf');
INSERT INTO BUILDING_FLOORS (FLOOR, BUILDING, PLAN) VALUES (1, 4, 'https://www.oth-regensburg.de/fileadmin/media/lageplaene/Galgenbergstrasse_1OG.pdf');
INSERT INTO BUILDING_FLOORS (FLOOR, BUILDING, PLAN) VALUES (2, 4, 'https://www.oth-regensburg.de/fileadmin/media/lageplaene/Galgenbergstrasse_2OG.pdf');
INSERT INTO BUILDING_FLOORS (FLOOR, BUILDING, PLAN) VALUES (0, 5, 'https://www.oth-regensburg.de/fileadmin/media/lageplaene/Galgenbergstrasse_EG.pdf');
INSERT INTO BUILDING_FLOORS (FLOOR, BUILDING, PLAN) VALUES (1, 5, 'https://www.oth-regensburg.de/fileadmin/media/lageplaene/Galgenbergstrasse_1OG.pdf');
INSERT INTO BUILDING_FLOORS (FLOOR, BUILDING, PLAN) VALUES (2, 5, 'https://www.oth-regensburg.de/fileadmin/media/lageplaene/Galgenbergstrasse_2OG.pdf');
INSERT INTO BUILDING_FLOORS (FLOOR, BUILDING, PLAN) VALUES (0, 6, 'https://www.oth-regensburg.de/fileadmin/media/header-menue/kontakt/pdf/Haus_der_Technik_EG.pdf');
INSERT INTO BUILDING_FLOORS (FLOOR, BUILDING, PLAN) VALUES (1, 6, 'https://www.oth-regensburg.de/fileadmin/media/header-menue/kontakt/pdf/Haus_der_Technik_OG1.pdf');
INSERT INTO BUILDING_FLOORS (FLOOR, BUILDING, PLAN) VALUES (2, 6, 'https://www.oth-regensburg.de/fileadmin/media/header-menue/kontakt/pdf/Haus_der_Technik_OG2.pdf');
INSERT INTO BUILDING_FLOORS (FLOOR, BUILDING, PLAN) VALUES (0, 7, 'https://www.oth-regensburg.de/fileadmin/media/header-menue/kontakt/pdf/Haus_der_Technik_EG.pdf');
INSERT INTO BUILDING_FLOORS (FLOOR, BUILDING, PLAN) VALUES (1, 7, 'https://www.oth-regensburg.de/fileadmin/media/header-menue/kontakt/pdf/Haus_der_Technik_OG1.pdf');
INSERT INTO BUILDING_FLOORS (FLOOR, BUILDING, PLAN) VALUES (2, 7, 'https://www.oth-regensburg.de/fileadmin/media/header-menue/kontakt/pdf/Haus_der_Technik_OG2.pdf');
INSERT INTO BUILDING_FLOORS (FLOOR, BUILDING, PLAN) VALUES (0, 8, 'https://www.oth-regensburg.de/fileadmin/media/header-menue/kontakt/pdf/Haus_der_Technik_EG.pdf');
INSERT INTO BUILDING_FLOORS (FLOOR, BUILDING, PLAN) VALUES (1, 8, 'https://www.oth-regensburg.de/fileadmin/media/header-menue/kontakt/pdf/Haus_der_Technik_OG1.pdf');
INSERT INTO BUILDING_FLOORS (FLOOR, BUILDING, PLAN) VALUES (2, 8, 'https://www.oth-regensburg.de/fileadmin/media/header-menue/kontakt/pdf/Haus_der_Technik_OG2.pdf');
INSERT INTO BUILDING_FLOORS (FLOOR, BUILDING, PLAN) VALUES (0, 9, 'https://www.oth-regensburg.de/fileadmin/media/header-menue/kontakt/pdf/Haus_der_Technik_EG.pdf');
INSERT INTO BUILDING_FLOORS (FLOOR, BUILDING, PLAN) VALUES (1, 9, 'https://www.oth-regensburg.de/fileadmin/media/header-menue/kontakt/pdf/Haus_der_Technik_OG1.pdf');
INSERT INTO BUILDING_FLOORS (FLOOR, BUILDING, PLAN) VALUES (2, 9, 'https://www.oth-regensburg.de/fileadmin/media/header-menue/kontakt/pdf/Haus_der_Technik_OG2.pdf');
INSERT INTO BUILDING_FLOORS (FLOOR, BUILDING, PLAN) VALUES (0, 10, 'https://www.oth-regensburg.de/fileadmin/media/lageplaene/Galgenbergstr_32_K_EG_.pdf');
INSERT INTO BUILDING_FLOORS (FLOOR, BUILDING, PLAN) VALUES (1, 10, 'https://www.oth-regensburg.de/fileadmin/media/lageplaene/Galgenbergstr_32_K_OG1.pdf');
INSERT INTO BUILDING_FLOORS (FLOOR, BUILDING, PLAN) VALUES (2, 10, 'https://www.oth-regensburg.de/fileadmin/media/lageplaene/Galgenbergstr_32_K_OG2.pdf');
INSERT INTO BUILDING_FLOORS (FLOOR, BUILDING, PLAN) VALUES (-1, 11, 'https://www.oth-regensburg.de/fileadmin/media/lageplaene/Pruefening_UG.pdf');
INSERT INTO BUILDING_FLOORS (FLOOR, BUILDING, PLAN) VALUES (0, 11, 'https://www.oth-regensburg.de/fileadmin/media/lageplaene/Pruefening_EG.pdf');
INSERT INTO BUILDING_FLOORS (FLOOR, BUILDING, PLAN) VALUES (1, 11, 'https://www.oth-regensburg.de/fileadmin/media/lageplaene/Pruefening_OG1.pdf');
INSERT INTO BUILDING_FLOORS (FLOOR, BUILDING, PLAN) VALUES (2, 11, 'https://www.oth-regensburg.de/fileadmin/media/lageplaene/Pruefening_OG2.pdf');
INSERT INTO BUILDING_FLOORS (FLOOR, BUILDING, PLAN) VALUES (-1, 12, 'https://www.oth-regensburg.de/fileadmin/media/lageplaene/Seyboth_UG.pdf');
INSERT INTO BUILDING_FLOORS (FLOOR, BUILDING, PLAN) VALUES (0, 12, 'https://www.oth-regensburg.de/fileadmin/media/lageplaene/Seyboth_EG.pdf');
INSERT INTO BUILDING_FLOORS (FLOOR, BUILDING, PLAN) VALUES (1, 12, 'https://www.oth-regensburg.de/fileadmin/media/lageplaene/Seyboth_OG1.pdf');
INSERT INTO BUILDING_FLOORS (FLOOR, BUILDING, PLAN) VALUES (2, 12, 'https://www.oth-regensburg.de/fileadmin/media/lageplaene/Seyboth_OG2.pdf');
INSERT INTO BUILDING_FLOORS (FLOOR, BUILDING, PLAN) VALUES (-1, 13, 'https://www.oth-regensburg.de/fileadmin/media/lageplaene/Seyboth_UG.pdf');
INSERT INTO BUILDING_FLOORS (FLOOR, BUILDING, PLAN) VALUES (0, 13, 'https://www.oth-regensburg.de/fileadmin/media/lageplaene/Seyboth_EG.pdf');
INSERT INTO BUILDING_FLOORS (FLOOR, BUILDING, PLAN) VALUES (1, 13, 'https://www.oth-regensburg.de/fileadmin/media/lageplaene/Seyboth_OG1.pdf');
INSERT INTO BUILDING_FLOORS (FLOOR, BUILDING, PLAN) VALUES (2, 13, 'https://www.oth-regensburg.de/fileadmin/media/lageplaene/Seyboth_OG2.pdf');
INSERT INTO BUILDING_FLOORS (FLOOR, BUILDING, PLAN) VALUES (0, 14, 'https://www.oth-regensburg.de/fileadmin/media/header-menue/kontakt/pdf/RUWG_D_00.pdf');