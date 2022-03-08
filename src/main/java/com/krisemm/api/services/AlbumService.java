/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.krisemm.api.services;

import com.krisemm.api.models.Album;
import java.util.List;

/**
 *
 * @author kristian
 */
public interface AlbumService {
    void persist(Album album);
    void update(Album album);
    void delete(Integer id);
    List<Album> searchAll();
}
