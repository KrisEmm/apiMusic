/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.krisemm.api.services.persistence;

import com.krisemm.api.models.Album;
import com.krisemm.api.repositories.AlbumRepository;
import com.krisemm.api.services.AlbumService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author kristian
 */
@Service
public class InMysqlServiceAlbum implements AlbumService {
    
    @Autowired
    private AlbumRepository repository;
    
    @Override
    public List<Album> searchAll() {
        return repository.findAll();
    }

    @Override
    public void persist(Album album) {
        repository.save(album);
    }

    @Override
    public void update(Album album) {
        if(repository.existsById(album.getId())) repository.save(album);
    }

    @Override
    public void delete(Integer id) {
        if(repository.existsById(id)) repository.deleteById(id);
    }
    
}
