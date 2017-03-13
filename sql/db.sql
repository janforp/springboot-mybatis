CREATE TABLE `teach_book` (
  `book_id` int(11) NOT NULL auto_increment,
  `book_name` varchar(255) default NULL,
  `publisher` varchar(255) default NULL,
  PRIMARY KEY  (`book_id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;