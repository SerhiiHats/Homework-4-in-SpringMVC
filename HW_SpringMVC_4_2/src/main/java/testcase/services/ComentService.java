package testcase.services;
import testcase.models.Comment;
import java.util.List;

public interface ComentService {
    int addComments(Comment comment);
    List<Comment> getAllComments();
    int getAmountComments();
}
