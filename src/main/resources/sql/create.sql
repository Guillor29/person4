DROP
    TABLE
        IF EXISTS PERSON,RENCONTRE;

CREATE
    TABLE
        PERSON(
            id INT NOT NULL AUTO_INCREMENT,
            nom VARCHAR(100) NOT NULL,
            prenom VARCHAR(100) NOT NULL,
            anneeNaissance number(4),
            nationalite varchar(12),
            PRIMARY KEY(id)
        );

INSERT INTO PERSON (nom,prenom,anneeNaissance,nationalite) VALUES
('MARTINEZ', 'Conchita', 1972, 'Espagne'),
('NAVRATILOVA', 'Martina', 1957, 'Etats-Unis'),
('GRAF', 'Steffi', 1969, 'Allemagne'),
('HALARD', 'Julie', 1970, 'France'),
('PIERCE', 'Mary', 1975, 'France'),
('EDBERG', 'Stephan', 1966, 'Suede'),
('LARSSON', 'Magnus', 1970, 'Suede'),
('LECONTE', 'Henri', 1963, 'France'),
('FORGET', 'Guy', 1965, 'France'),
('FLEURIAN', 'Jean-Philippe', 1965, 'France'),
('WILANDER', 'Mats', 1964, 'Suede'),
('CONNORS', 'Jimmy', 1952, 'Etats-Unis'),
('McENROE', 'John', 1959, 'Etats-Unis'),
('SAMPRAS', 'Pete', 1972, 'Etats-Unis');

CREATE
    TABLE RENCONTRE(
        NuGAGNANT number(8),
        NuPERDANT number(8),
        LIEUTOURNOI varchar(15),
        ANNEE number(8)
    );

insert into RENCONTRE
values (13, 9, 'Roland Garros', 1990);
insert into RENCONTRE
values (11, 12, 'Roland Garros', 1990);
insert into RENCONTRE
values (13, 11, 'Roland Garros', 1990);
insert into RENCONTRE
values (2, 3, 'Roland Garros', 1990);
insert into RENCONTRE
values (13, 12, 'Roland Garros', 1992);
insert into RENCONTRE
values (6, 14, 'Roland Garros', 1992);
insert into RENCONTRE
values (11, 9, 'Roland Garros', 1992);
insert into RENCONTRE
values (8, 7, 'Roland Garros', 1992);
insert into RENCONTRE
values (13, 8, 'Roland Garros', 1992);
insert into RENCONTRE
values (6, 11, 'Roland Garros', 1992);
insert into RENCONTRE
values (13, 6, 'Roland Garros', 1992);
insert into RENCONTRE
values (2, 3, 'Roland Garros', 1992);
insert into RENCONTRE
values (14, 10, 'Roland Garros', 1994);
insert into RENCONTRE
values (8, 9, 'Roland Garros', 1994);
insert into RENCONTRE
values (14, 8, 'Roland Garros', 1994);
insert into RENCONTRE
values (2, 4, 'Roland Garros', 1994);
insert into RENCONTRE
values (1, 3, 'Roland Garros', 1994);
insert into RENCONTRE
values (2, 1, 'Roland Garros', 1994);
insert into RENCONTRE
values (11, 8, 'Wimbledon', 1989);
insert into RENCONTRE
values (12, 13, 'Wimbledon', 1989);
insert into RENCONTRE
values (11, 12, 'Wimbledon', 1989);
insert into RENCONTRE
values (3, 2, 'Wimbledon', 1989);
insert into RENCONTRE
values (14, 13, 'Wimbledon', 1992);
insert into RENCONTRE
values (6, 9, 'Wimbledon', 1992);
insert into RENCONTRE
values (6, 14, 'Wimbledon', 1992);
insert into RENCONTRE
values (3, 5, 'Wimbledon', 1992);
insert into RENCONTRE
values (2, 4, 'Wimbledon', 1992);
insert into RENCONTRE
values (3, 2, 'Wimbledon', 1992);
insert into RENCONTRE
values (14, 10, 'Wimbledon', 1993);
insert into RENCONTRE
values (7, 9, 'Wimbledon', 1993);
insert into RENCONTRE
values (14, 7, 'Wimbledon', 1993);
insert into RENCONTRE
values (1, 5, 'Wimbledon', 1993);
insert into RENCONTRE
values (2, 4, 'Wimbledon', 1993);
insert into RENCONTRE
values (1, 2, 'Wimbledon', 1993);
insert into RENCONTRE
values (12, 9, 'Flushing Meadow', 1989);
insert into RENCONTRE
values (2, 3, 'Flushing Meadow', 1989);
insert into RENCONTRE
values (12, 7, 'Flushing Meadow', 1991);

COMMIT;
