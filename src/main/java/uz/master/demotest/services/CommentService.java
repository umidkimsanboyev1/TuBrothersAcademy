package uz.master.demotest.services;

import org.springframework.stereotype.Service;
import uz.master.demotest.entity.home.Comments;
import uz.master.demotest.repositories.CommentRepository;

import java.util.List;

@Service
public class CommentService {
    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public List<Comments> getCommentsByOrderNumber() {
        return commentRepository.findCommentsByDeletedFalseOrderByOrderNumber();
    }
}
