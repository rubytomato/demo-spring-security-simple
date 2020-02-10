INSERT INTO user (name, email, password, roles, enable_flag) VALUES ('test', 'test@example.com', '{bcrypt}$2a$10$uhuqnvtjTayBhSjs7ezeB.2DG5GlIERAawzRoCROyTxWpzwKy7T.e', 'ROLE_USER,ROLE_ADMIN', 1);
INSERT INTO user (name, email, password, roles, enable_flag) VALUES ('test2', 'test2@example.com', '{bcrypt}$2a$10$EQyVZTFajqzPEHVtmFXW2O7tq.czJbKO/Jf1EMYWziD26CaGzthTi', 'ROLE_USER', 1);
INSERT INTO user (name, email, password, roles, enable_flag) VALUES ('test3', 'test3@example.com', '{bcrypt}$2a$10$YdUoo9YFRgpvswA2wVslE.yJoWsq0NPKL3cRM0DjPUpkVBaYSkoWa', 'ROLE_ADMIN', 1);
INSERT INTO user (name, email, password, roles, enable_flag) VALUES ('test4', 'test4@example.com', '{bcrypt}$2a$10$z6AnFPpurI6.SthxWBp0t.KhhKO4cGqfSLxSXzXfJfWKSXWa8nbx6', null, 1);
INSERT INTO user (name, email, password, roles, enable_flag) VALUES ('test5', 'test5@example.com', '{bcrypt}$2a$10$FL28wRiBHtE4nD1oVX91UOrQBWCPWor69gmA4sOtwAvOrgvuACQYS', 'ROLE_USER', 0);
