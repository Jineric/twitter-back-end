delete user;
delete tweet;

insert into user (id, twitter_name, full_name, password, email) values (1, 'Kenji', 'Eric Baek', 'password', 'eric.baek@emailwhere.com');
insert into user (id, twitter_name, full_name, password, email) values (2, 'Misery', 'Jane Doe', 'password', 'jane.doe@emailwhere.com');

insert into tweet (id, message, date, user_id) values (1, 'First tweet!','2017-12-15 20:01:55', 1);
insert into tweet (id, message, date, user_id) values (2, 'Snowboarding trip in Boston!','2018-02-9 11:00:15', 1);
insert into tweet (id, message, date, user_id) values (3, 'Started a new project today; wish me luck!','2017-12-20 08:15:01', 1);
insert into tweet (id, message, date, user_id) values (4, 'Home made pizza is delicious~ YUM!','2018-02-24 19:33:05',2);
insert into tweet (id, message, date, user_id) values (5, 'Got a new job! Time to celebrate!','2018-02-01 12:01:35',2);
insert into tweet (id, message, date, user_id) values (6, 'First episode of My Hero Academia airs today!','2018-01-10 08:08:14',2);