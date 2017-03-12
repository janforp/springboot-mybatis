CREATE TABLE `member` (
  `id` varchar(50) NOT NULL,
  `password` varchar(32) NOT NULL,
  `member_name` varchar(10) default NULL,
  `telephone` varchar(15) default NULL,
  `email` varchar(20) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;


CREATE TABLE `teach_book` (
  `book_id` int(11) NOT NULL auto_increment,
  `book_name` varchar(255) default NULL,
  `publisher` varchar(255) default NULL,
  PRIMARY KEY  (`book_id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;


CREATE TABLE `user` (
  `user_id` varchar(255) NOT NULL,
  `user_name` varchar(255) default NULL,
  `age` int(11) default NULL,
  PRIMARY KEY  (`user_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;