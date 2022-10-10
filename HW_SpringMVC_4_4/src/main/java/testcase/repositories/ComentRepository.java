package testcase.repositories;

import testcase.models.Comment;

import java.util.List;

public interface ComentRepository {
    int addComments(Comment comment);
    List<Comment> getAllComments();
    int getAmountComments();

}
