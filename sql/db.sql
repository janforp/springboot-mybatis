CREATE TABLE `teach_book` (
  `book_id` int(11) NOT NULL auto_increment,
  `book_name` varchar(255) default NULL,
  `book_no` varchar(50) NOT NULL UNIQUE ,
  `publisher` varchar(255) default NULL,
  PRIMARY KEY  (`book_id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8