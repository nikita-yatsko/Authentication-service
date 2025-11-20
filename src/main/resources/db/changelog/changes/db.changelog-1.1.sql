--liquibase formatted sql

--changeset nyatska:2
INSERT INTO auth_users (user_id, username, password, role)
VALUES (4 ,'admin', '$2a$10$ixyUizBVZiooVBSnwMmC4e4sa0/dI0X6S.jFs2k1hL3sAkJAsgS0K', 'ADMIN');
