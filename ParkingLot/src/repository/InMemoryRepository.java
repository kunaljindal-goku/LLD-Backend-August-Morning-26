package repository;

import model.BaseEntity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class InMemoryRepository <T extends BaseEntity>{

    private final List<T> items = new ArrayList<>();
    private Integer id = 0;

    public  T save(T item) {
        if(item.getId()==null) {
            item.setId(++id);
            item.setCreatedAt(new Date());
        }
        item.setUpdatedAt(new Date());
        items.add(item);
        return item;
    }

    public Optional<T> findById(Integer id) {
        return items.stream()
                .filter(item -> item.getId().equals(id))
                .findFirst();
    }

    public List<T> findAll() {
        return new ArrayList<>(items);
    }
}
