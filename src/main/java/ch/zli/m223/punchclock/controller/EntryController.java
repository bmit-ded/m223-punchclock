package ch.zli.m223.punchclock.controller;

import ch.zli.m223.punchclock.domain.Entry;
import ch.zli.m223.punchclock.service.EntryService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/entries")
public class EntryController {
    private EntryService entryService;

    public EntryController(EntryService entryService) {
        this.entryService = entryService;
    }
    //sends all entries from database to client
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Entry> getAllEntries() {
        return entryService.findAll();
    }
    //creates entry
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Entry createEntry(@Valid @RequestBody Entry entry) {
        return entryService.createEntry(entry);
    }
    //deletes entry by id if exist
    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteEntry(@PathVariable Long id){
        entryService.deleteEntry(id);
    }

    //edits entry if exist
    @PutMapping("{id")
    @ResponseStatus(HttpStatus.OK)
    public void updateEntry(@PathVariable Long id){

    }
}
