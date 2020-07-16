package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    private int userNumber;
    private int postsNumber;
    private  int commentsNumber;
    private  double postsAvgPerUser;
    private  double commentsAvgPerUser;
    private  double avgCommentsPerPost;


    public int getUserNumber() {
        return userNumber;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    public int getCommentsNumber() {
        return commentsNumber;
    }

    public double getPostsAvgPerUser() {
        return postsAvgPerUser;
    }

    public double getCommentsAvgPerUser() {
        return commentsAvgPerUser;
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        userNumber = statistics.usersNames().size();
        postsNumber = statistics.postsCount();
        commentsNumber = statistics.commentsCount();
        postsAvgPerUser = calculatePostsAvgPerUser();
        commentsAvgPerUser = calculateCommentsAvgPerUser();
        avgCommentsPerPost = calculateAvgCommentsPerPost();

    }

    private double calculatePostsAvgPerUser() {
        if (userNumber > 0) {
            return (double) postsNumber / userNumber;
        } else {
            return 0;
        }
    }

    private double calculateCommentsAvgPerUser() {
        if (userNumber > 0) {
            return (double) commentsNumber / userNumber;
        } else {
            return 0;
        }
    }

    private double calculateAvgCommentsPerPost() {
        if (postsNumber > 0) {
            return (double) commentsNumber / postsNumber;
        } else {
            return 0;
        }
    }

    public void showStatistics() {
        System.out.println("Forum statistics");
        System.out.println("Number of users" + userNumber);
        System.out.println("Posts number: " + postsNumber);
        System.out.println("Comments number: " + commentsNumber);
        System.out.println("Average post per user:" + postsAvgPerUser);
        System.out.println("Average comments per user: " + commentsAvgPerUser);
        System.out.println("Average comments per post: " + avgCommentsPerPost);
    }
}

