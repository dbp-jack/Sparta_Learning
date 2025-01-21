package crud.curd.service;

import crud.curd.domain.Board;
import crud.curd.dto.BoardRequestDto;
import crud.curd.dto.BoardResponseDto;
import crud.curd.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    @Transactional
    public BoardResponseDto create(BoardRequestDto requestDto) {
        Board board = new Board(requestDto.getTitle(), requestDto.getContent());
        boardRepository.save(board);
        return new BoardResponseDto(board);
    }

    @Transactional(readOnly = true)
    public List<BoardResponseDto> getAll() {
        return boardRepository.findAll().stream()
                .map(BoardResponseDto::new)
                .collect(Collectors.toList());
    }

    @Transactional
    public BoardResponseDto update(Long id, BoardRequestDto requestDto) {
        Board board = boardRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("No such board with id: " + id));
        board.update(requestDto.getTitle(), requestDto.getContent());
        return new BoardResponseDto(board);
    }

    @Transactional
    public void delete(Long id) {
        boardRepository.deleteById(id);
    }
}
