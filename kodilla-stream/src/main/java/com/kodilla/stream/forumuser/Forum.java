package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum(){

        forumUserList.add(new ForumUser(10, "Asia",'F', LocalDate.of(1995, Month.APRIL,13), 11));
        forumUserList.add(new ForumUser(11,"Kris",'M',LocalDate.of(2000,Month.AUGUST,16), 10));
        forumUserList.add(new ForumUser(2, "Zosia", 'F', LocalDate.of(2002, Month.FEBRUARY, 14), 7));
        forumUserList.add(new ForumUser(5, "Tosia", 'F', LocalDate.of(2009, Month.JULY, 21),18));
        forumUserList.add(new ForumUser(6,"Kamil",'M', LocalDate.of(2001, Month.MARCH,18), 43));
        forumUserList.add(new ForumUser(9, "Daniel", 'M', LocalDate.of(1990, Month.MARCH, 14), 19));
        forumUserList.add(new ForumUser(15, "Kamila", 'F', LocalDate.of(2000, Month.MARCH,16),99));
        forumUserList.add(new ForumUser(12, "Piotrek", 'M', LocalDate.of(1999, Month.AUGUST, 23),54));
        forumUserList.add(new ForumUser(16, "Ania", 'F', LocalDate.of(2002, Month.FEBRUARY, 22), 20));
        forumUserList.add(new ForumUser(23, "Kasia", 'F', LocalDate.of(2003, Month.JANUARY, 26), 13));
    }

    public List<ForumUser> getForumUserList() {
        return forumUserList;
    }
}
