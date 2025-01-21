package crud.curd.controller;

import crud.curd.dto.BoardRequestDto;
import crud.curd.dto.BoardResponseDto;
import crud.curd.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/boards")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @PostMapping
    public BoardResponseDto create(@RequestBody BoardRequestDto requestDto) {
        return boardService.create(requestDto);
    }

    @GetMapping
    public List<BoardResponseDto> getAll() {
        return boardService.getAll();
    }

    @PutMapping("/{id}")
    public BoardResponseDto update(@PathVariable Long id, @RequestBody BoardRequestDto requestDto) {
        return boardService.update(id, requestDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        boardService.delete(id);
    }
}
