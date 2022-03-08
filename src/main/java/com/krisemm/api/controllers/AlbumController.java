/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.krisemm.api.controllers;

import com.krisemm.api.models.Album;
import com.krisemm.api.services.AlbumService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author kristian
 */
@RestController
@RequestMapping("/api")
public class AlbumController {
    
    @Autowired
    private AlbumService albumService;
    
    @GetMapping("/albums")
    public List<Album> handleGetAlbums(){
        return albumService.searchAll();
    }
    
    @PostMapping("/albums")
    public Album handleSaveAlbum(@RequestBody Album album){
        albumService.persist(album);
        return album;
    }
    
    @PutMapping("/albums")
    public Album handleUpdateAlbum(@RequestBody Album album){
        albumService.update(album);
        return album;
    }
    
    @DeleteMapping("/albums/{id}")
    public void handleDeleteAlbum(@PathVariable Integer id){
        albumService.delete(id);
    }
}
