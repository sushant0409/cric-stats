INSERT INTO Category (role_id, role_name, in_active) VALUES (2001, 'Batsman', 'Y');
INSERT INTO Category (role_id, role_name, in_active) VALUES (2002, 'Bowler', 'Y');
INSERT INTO Category (role_id, role_name, in_active) VALUES (2003, 'Wicket Keeper', 'Y');
INSERT INTO Category (role_id, role_name, in_active) VALUES (2004, 'All Rounder', 'Y');

INSERT INTO Teams (team_id, team_name, in_active) VALUES (101, 'India', 'Y');
INSERT INTO Teams (team_id, team_name, in_active) VALUES (102, 'Pakistan', 'Y');
INSERT INTO Teams (team_id, team_name, in_active) VALUES (103, 'Australia', 'Y');
INSERT INTO Teams (team_id, team_name, in_active) VALUES (104, 'England', 'Y');
INSERT INTO Teams (team_id, team_name, in_active) VALUES (105, 'West Indies', 'Y');
INSERT INTO Teams (team_id, team_name, in_active) VALUES (106, 'South Africa', 'Y');
INSERT INTO Teams (team_id, team_name, in_active) VALUES (107, 'New Zealand', 'Y');
INSERT INTO Teams (team_id, team_name, in_active) VALUES (108, 'Sri Lanka', 'Y');
INSERT INTO Teams (team_id, team_name, in_active) VALUES (109, 'Bangladesh', 'Y');
INSERT INTO Teams (team_id, team_name, in_active) VALUES (110, 'Afghanistan', 'Y');
INSERT INTO Teams (team_id, team_name, in_active) VALUES (111, 'Scotland', 'Y');
INSERT INTO Teams (team_id, team_name, in_active) VALUES (112, 'Ireland', 'Y');

INSERT INTO players (player_id, player_name, team_id, country_cd, role_id, in_active) VALUES (10001, 'Sachin Tendulkar', 101, 'IND', 2001, 'Y');
INSERT INTO players (player_id, player_name, team_id, country_cd, role_id, in_active) VALUES (10002, 'Brian Lara', 105, 'WI', 2001, 'Y');
INSERT INTO players (player_id, player_name, team_id, country_cd, role_id, in_active) VALUES (10003, 'Ricky Ponting', 103, 'AUS', 2001, 'Y');
INSERT INTO players (player_id, player_name, team_id, country_cd, role_id, in_active) VALUES (10004, 'Wasim Akram', 102, 'PAK', 2002, 'Y');
INSERT INTO players (player_id, player_name, team_id, country_cd, role_id, in_active) VALUES (10005, 'Glenn McGrath', 103, 'AUS', 2002, 'Y');
INSERT INTO players (player_id, player_name, team_id, country_cd, role_id, in_active) VALUES (10006, 'MS Dhoni', 101, 'IND', 2003, 'Y');
INSERT INTO players (player_id, player_name, team_id, country_cd, role_id, in_active) VALUES (10007, 'Jacques Kallis', 106, 'SA', 2004, 'Y');