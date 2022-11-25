create table FEED
(
    ID      INT PRIMARY KEY,
    RSS     VARCHAR(200) not null,
    FACULTY INT          not null,
    constraint FK_FEED_FACULTY
        foreign key (FACULTY) references FACULTY (ID)
);

INSERT INTO FEED (ID, RSS, FACULTY) VALUES (1, 'https://www.oth-regensburg.de/fakultaeten/angewandte-natur-und-kulturwissenschaften/schwarzes-brett/rss.xml', 1);
INSERT INTO FEED (ID, RSS, FACULTY) VALUES (2, 'https://www.oth-regensburg.de/fakultaeten/architektur/schwarzes-brett/rss.xml', 2);
INSERT INTO FEED (ID, RSS, FACULTY) VALUES (3, 'https://www.oth-regensburg.de/fakultaeten/betriebswirtschaft/schwarzes-brett/rss.xml', 4);
INSERT INTO FEED (ID, RSS, FACULTY) VALUES (4, 'https://www.oth-regensburg.de/fakultaeten/elektro-und-informationstechnik/schwarzes-brett/rss.xml', 5);
INSERT INTO FEED (ID, RSS, FACULTY) VALUES (5, 'https://info.fkm-r.de/?feed=rss2', 6);
INSERT INTO FEED (ID, RSS, FACULTY) VALUES (6, 'https://www.oth-regensburg.de/fakultaeten/informatik-und-mathematik/schwarzes-brett/rss.xml', 8);
INSERT INTO FEED (ID, RSS, FACULTY) VALUES (7, 'https://www.oth-regensburg.de/hochschule/einrichtungen/alumni/nachrichten/rss.xml', 9);
INSERT INTO FEED (ID, RSS, FACULTY) VALUES (8, 'https://www.oth-regensburg.de/fakultaeten/betriebswirtschaft/termine-aktuelles/rss.xml', 4);
INSERT INTO FEED (ID, RSS, FACULTY) VALUES (9, 'https://www.oth-regensburg.de/fakultaeten/betriebswirtschaft/terminaenderungen/rss.xml', 4);
INSERT INTO FEED (ID, RSS, FACULTY) VALUES (10, 'https://www.oth-regensburg.de/fakultaeten/bauingenieurwesen/schwarzes-brett/rss.xml', 3);
INSERT INTO FEED (ID, RSS, FACULTY) VALUES (11, 'https://www.oth-regensburg.de/fakultaeten/angewandte-sozial-und-gesundheitswissenschaften/termine-aktuelles/rss.xml', 7);