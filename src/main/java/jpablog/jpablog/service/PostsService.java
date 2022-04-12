package jpablog.jpablog.service;

import jpablog.jpablog.dto.PostsSaveRequestDto;
import jpablog.jpablog.repository.PostsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostsService {

    private final PostsRepository postsRepository;

    public Long save(PostsSaveRequestDto requestDto) {
        return postsRepository.save(requestDto.toEntity()).getId();
    }
    /*
    게시글 내용을 담은 dto를 받아와 엔티티화 시켜 save하고 게시글 id 반환환
    */

}
