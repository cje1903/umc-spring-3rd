package cje.umcAssignment.service;

import cje.umcAssignment.domain.PostRequestDto;
import cje.umcAssignment.domain.PostResponseDto;
import cje.umcAssignment.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PostServiceImpl implements PostService{

    private final PostRepository postRepository;

    @Autowired  // 의존성 주입
    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public PostResponseDto save(PostRequestDto postRequestDto) {
        return null;
    }

    @Override
    public Optional<PostResponseDto> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<PostResponseDto> findAll() {
        return null;
    }

    @Override
    public List<PostResponseDto> findByWriter(String writer) {
        return null;
    }

    @Override
    public List<PostResponseDto> findByCategory(String category) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public PostResponseDto updatePost(Long id, PostRequestDto postRequestDto) {
        return null;
    }
}
