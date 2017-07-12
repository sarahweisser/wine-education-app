package weisser.sarah.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import weisser.sarah.model.Wine;
import weisser.sarah.repository.WineRepository;

import java.util.List;

/**
 * Created by sarahweisser on 7/9/17.
 */

@RestController
@RequestMapping("/")
public class WineController {

    @Autowired
    private WineRepository wineRepository;

    @RequestMapping(value = "wines", method = RequestMethod.GET)
    public List<Wine> list() {
        return wineRepository.findAll();
    }

    @RequestMapping(value = "wines", method = RequestMethod.POST)
    public Wine create(@RequestBody Wine wine) {
        return wineRepository.saveAndFlush(wine);
    }

    @RequestMapping(value = "wines/{id}", method = RequestMethod.GET)
    public Wine get(@PathVariable Long id) {
        return wineRepository.findOne(id);
    }

    @RequestMapping(value = "wines/{id}", method = RequestMethod.PUT)
    public Wine update(@PathVariable Long id, @RequestBody Wine wine) {
        Wine existingWine = wineRepository.findOne(id);
        BeanUtils.copyProperties(wine, existingWine);
        return wineRepository.saveAndFlush(existingWine);
    }

    @RequestMapping(value = "wines/{id}", method = RequestMethod.DELETE)
    public Wine delete(@PathVariable Long id) {
        Wine existingWine = wineRepository.findOne(id);
        wineRepository.delete(existingWine);
        return existingWine;
    }

}
