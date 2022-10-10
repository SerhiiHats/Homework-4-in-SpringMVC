package testcase.services.servisImpl;

import org.springframework.stereotype.Service;
import testcase.models.Comment;
import testcase.repositories.ComentRepository;
import testcase.services.ComentService;

import java.util.List;
@Service
public class ComentServiceImpl implements ComentService {

   private final ComentRepository comentRepository;

    public ComentServiceImpl(ComentRepository comentRepository) {
        this.comentRepository = comentRepository;

    }

    @Override
    public int addComments(Comment comment) {
        return comentRepository.addComments(comment);
    }

    @Override
    public List<Comment> getAllComments() {
        return comentRepository.getAllComments();
    }

    @Override
    public int getAmountComments() {
        return comentRepository.getAmountComments();
    }
}
